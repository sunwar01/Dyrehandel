package com.example.dyrehandel;

import java.util.LinkedList;

public class Ordre {

    private int OrdreNr;
    private String KundeNavn;
    private int Dato;
    private LinkedList<Vare> ordreVareListe;


    public Ordre(int ordrenr, String kundenavn, int dato) {

        this.OrdreNr = ordrenr;
        this.KundeNavn = kundenavn;
        this.Dato = dato;

        this.ordreVareListe = new LinkedList<>();

    }





    public LinkedList<Vare> getOrdreVareListe() {
        return ordreVareListe;
    }



    public void addOrdreVareListe(Vare vare) {
        this.ordreVareListe.add(vare);
    }

    public void removeVareFromOrdre(Vare vare) {
        this.ordreVareListe.remove(vare);
    }

    public String toString(){
        return  "Ordrenr: " + OrdreNr + " - Navn: " + KundeNavn;
    }




}
