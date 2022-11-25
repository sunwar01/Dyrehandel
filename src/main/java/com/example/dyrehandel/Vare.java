package com.example.dyrehandel;

public class Vare {
    private int vareNr;
    private String vareBeskrivelse;

    static int runningVareNr = 1;

    public Vare(String varebeskrivelse){

        this.vareNr = runningVareNr;
        runningVareNr++;
        this.vareBeskrivelse = varebeskrivelse;


    }

    public String toString(){
        return  vareBeskrivelse;
    }


}

