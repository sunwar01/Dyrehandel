package com.example.dyrehandel;

import java.util.LinkedList;

public class Ordre {

    private int getOrdreNr;
    private String getKundeNavn;
    private int getDato;



    public Ordre(int ordrenr, String kundenavn, int dato) {

        this.getOrdreNr = ordrenr;
        this.getKundeNavn = kundenavn;
        this.getDato = dato;

    }


    public String toString(){
        return  "Ordrenr: " + getOrdreNr + " - Navn: " + getKundeNavn;
    }











}
