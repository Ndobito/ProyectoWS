/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lib.Database;

import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public abstract class Model {
    protected abstract String getTableName();
    protected String selectText = "*";
    protected String whereText = "";
    protected String limitText = "";
    protected ArrayList<String> whereArray = new ArrayList<>();
    
    public Model select (ArrayList<String> c) {
        selectText = "";
        c.forEach(e -> {
            selectText += e + ", ";
        });
        selectText = selectText.replaceAll(", $", "");
        return this;
    }
    
    public Model where(String key, String op, String value) {
        if (whereText.isEmpty()) whereText += " WHERE " + key + " " + op + " ?";
        else whereText += " AND " + key + " " + op + " ?";
        whereArray.add(value);
        return this;
    }
    
    public Model limit(int l) {
        limitText = " LIMIT " + l;
        return this;
    }
    
    public void get() {
        String query = "SELECT " + selectText + " FROM " + getTableName() + whereText + limitText;
        System.out.println(query);
        
    }
    
    public void delete() {
        String query = "DELETE FROM " + getTableName() + whereText + limitText;
        System.out.println(query);
    }
}
