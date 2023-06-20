/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jcuel
 */
public class Usuario {

    private int idusu;
    private String nomusu;
    private String apeusu;
    private String nickusu;
    private String passusu;
    private String numtelusu;
    private int stateusu;

    //Constructor 
    public Usuario() {
        this.idusu = 0;
        this.nomusu = "";
        this.apeusu = "";
        this.nickusu = "";
        this.passusu = "";
        this.numtelusu = "";
        this.stateusu = 0;
    }

    // Metodos Get y Set
    public int getIdusu() {
        return idusu;
    }

    public void setIdusu(int idusu) {
        this.idusu = idusu;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public String getApeusu() {
        return apeusu;
    }

    public void setApeusu(String apeusu) {
        this.apeusu = apeusu;
    }

    public String getNickusu() {
        return nickusu;
    }

    public void setNickusu(String nickusu) {
        this.nickusu = nickusu;
    }

    public String getPassusu() {
        return passusu;
    }

    public void setPassusu(String passusu) {
        this.passusu = passusu;
    }

    public String getNumtelusu() {
        return numtelusu;
    }

    public void setNumtelusu(String numtelusu) {
        this.numtelusu = numtelusu;
    }

    public int getStateusu() {
        return stateusu;
    }

    public void setStateusu(int stateusu) {
        this.stateusu = stateusu;
    }
}
