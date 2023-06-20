/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import view.FrmInternalNuevoCliente;

/**
 *
 * @author jcuel
 */
public class Cliente extends Lib.Database.Model{
    @Override
    protected String getTableName() {
        return "cliente";
    }
     
    private int idCli;
    private String nomCli;
    private String apeCli;
    private String dniCli;
    private String telCli;
    private String dirCli;
    private int stateCli;

    //Constructor
    public Cliente() {
        this.idCli = 0;
        this.nomCli = "";
        this.apeCli = "";
        this.dniCli = "";
        this.telCli = "";
        this.dirCli = "";
        this.stateCli = 0;
    }

    //Constructor Sobrecargado
    public Cliente(int idCli, String nomCli, String apeCli, String dniCli, String telCli, String dirCli, int stateCli) {
        this.idCli = idCli;
        this.nomCli = nomCli;
        this.apeCli = apeCli;
        this.dniCli = dniCli;
        this.telCli = telCli;
        this.dirCli = dirCli;
        this.stateCli = stateCli;
    }
    
    public boolean select(FrmInternalNuevoCliente objeto){
        boolean res = false; 
        
        
        
        return false; 
    } 
    
    
    //Metodos Get y Set
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public String getDniCli() {
        return dniCli;
    }

    public void setDniCli(String dniCli) {
        this.dniCli = dniCli;
    }

    public String getTelCli() {
        return telCli;
    }

    public void setTelCli(String telCli) {
        this.telCli = telCli;
    }

    public String getDirCli() {
        return dirCli;
    }

    public void setDirCli(String dirCli) {
        this.dirCli = dirCli;
    }

    public int getStateCli() {
        return stateCli;
    }

    public void setStateCli(int stateCli) {
        this.stateCli = stateCli;
    }
    
}
