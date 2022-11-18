package com.example.dyrehandel;

public class Vare {
    private int getVareNr;
    private String getVareBeskrivelse;



    public Vare(int varenr, String varebeskrivelse){

        this.getVareNr = varenr;
        this.getVareBeskrivelse = varebeskrivelse;


    }

    public String toString(){
        return  getVareBeskrivelse;
    }


}

