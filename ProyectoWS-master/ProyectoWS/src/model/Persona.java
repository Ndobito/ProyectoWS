/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class Persona extends Lib.Database.Model {
    @Override
    protected String getTableName() {
        return "personas";
    }
    
    public ArrayList<String> getNames() {
        
        
        
        return new ArrayList<>();
    }
}
