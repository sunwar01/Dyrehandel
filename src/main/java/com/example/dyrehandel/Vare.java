package com.example.dyrehandel;

public class Vare {
    private int getVareNr;
    private String getVareBeskrivelse;

    static int varenr = 1;

    public Vare(String varebeskrivelse){

        this.getVareNr = varenr;
        this.getVareBeskrivelse = varebeskrivelse;


    }

    public String toString(){
        return  getVareBeskrivelse;
    }


}

