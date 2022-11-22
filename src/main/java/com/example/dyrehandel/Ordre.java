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

        this.ordreVareListe = new LinkedList<Vare>();

    }

    public int getOrdreNr() {
        return OrdreNr;
    }

    public void setOrdreNr(int ordreNr) {
        OrdreNr = ordreNr;
    }

    public String getKundeNavn() {
        return KundeNavn;
    }

    public void setKundeNavn(String kundeNavn) {
        KundeNavn = kundeNavn;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int dato) {
        Dato = dato;
    }

    public LinkedList<Vare> getOrdreVareListe() {
        return ordreVareListe;
    }

    public void setOrdreVareListe(LinkedList<Vare> ordreVareListe) {
        this.ordreVareListe = ordreVareListe;
    }

    public void addOrdreVareListe(Vare vare) {
        this.ordreVareListe.add(vare);
    }

    public String toString(){
        return  "Ordrenr: " + OrdreNr + " - Navn: " + KundeNavn;
    }




}
