package com.example.dyrehandel;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.util.LinkedList;

public class dyreHandelController {

    static LinkedList<Ordre> ordreListe = new LinkedList<>();

    static LinkedList<Vare> vareListe = new LinkedList<>();



    @FXML
    private ListView<String>  listviewOrdre = new ListView();

    @FXML
    private ListView<String> listviewVare = new ListView();

    @FXML
    private ListView<String> listviewAlleVarer = new ListView();

    public static void setListviewAlleVarer(LinkedList<Vare> nyListe) {
        //listviewVare.getItems().clear();
        for (Vare vare: nyListe) {
            //listviewVare.getItems().add(vare.toString());
        }
    }

    @FXML
    private Button sletVare;


    @FXML
    private Button tilføjVare;

    @FXML
    private Button tilføjVareTilOrdreKnap;

    @FXML void tilføjVareTilOrdre(){
        System.out.println(listviewOrdre.getSelectionModel().getSelectedIndices().toString());
        System.out.println(listviewAlleVarer.getSelectionModel().getSelectedIndices().toString());

        Ordre denneOrdre = ordreListe.get( listviewOrdre.getSelectionModel().getSelectedIndices().get(0));
        Vare denneVare = vareListe.get( listviewAlleVarer.getSelectionModel().getSelectedIndices().get(0));



        denneOrdre.getOrdreVareListe().add(denneVare);

        //LinkedList<Vare> ordreVare = ordreListe.get();
        listviewVare.getItems().clear();
        for (Vare vare: denneOrdre.getOrdreVareListe()) {
            listviewVare.getItems().add(vare.toString());
        }
    }

    @FXML void ordreValgt (){
        Ordre denneOrdre = ordreListe.get( listviewOrdre.getSelectionModel().getSelectedIndices().get(0));
        Vare denneVare = vareListe.get( listviewOrdre.getSelectionModel().getSelectedIndices().get(0));

        //denneOrdre.getOrdreVareListe().add(denneVare);

        listviewVare.getItems().clear();
        for (Vare vare: denneOrdre.getOrdreVareListe()) {
            listviewVare.getItems().add(vare.toString());
        }

    }

    @FXML void sletVareActionEvent(ActionEvent event){

        Ordre denneOrdre = ordreListe.get( listviewOrdre.getSelectionModel().getSelectedIndices().get(0));
        Vare denneVare = vareListe.get( listviewOrdre.getSelectionModel().getSelectedIndices().get(0));

        denneOrdre.getOrdreVareListe().remove(denneVare);

        listviewVare.getItems().clear();
        for (Vare vare: denneOrdre.getOrdreVareListe()) {
            listviewVare.getItems().add(vare.toString());
        }


    }

    @FXML void tilføjVareActionEvent(ActionEvent event){
        DialogVindue DV = new DialogVindue();
        DV.clickShow(event);
        listviewAlleVarer.getItems().clear();
        for (Vare vare: vareListe) {
            listviewAlleVarer.getItems().add(vare.toString());
        }

    }

    @FXML
    void updateAlleVareListe(){

        //listviewAlleVarer.getItems().clear();

        for (Ordre ordre: ordreListe) {
            listviewOrdre.getItems().add(ordre.toString());
        }

    }



@FXML
    public void initialize() {


    Vare vare1 = new Vare("Elefant");
    Vare vare2 = new Vare("Drage");
    Vare vare3 = new Vare("Lemur");
    Vare vare4 = new Vare("datamatiker");
    Vare vare5 = new Vare("Lars");

    vareListe.add(vare1);
    vareListe.add(vare2);
    vareListe.add(vare3);
    vareListe.add(vare4);
    vareListe.add(vare5);

    for (Vare vare:
            vareListe) {
        listviewAlleVarer.getItems().add(vare.toString());
    }

    Ordre ordre1 = new Ordre(1, "Alexander", 10_11_2022);
    ordre1.addOrdreVareListe(vare1);
    Ordre ordre2 = new Ordre(2, "Lukas", 11_11_2022);
    ordre2.addOrdreVareListe(vare2);
    ordre2.addOrdreVareListe(vare3);


    Ordre ordre3 = new Ordre(3, "Sune", 12_11_2022);
    ordre3.addOrdreVareListe(vare4);
    ordre3.addOrdreVareListe(vare3);


    Ordre ordre4 = new Ordre(4, "Bent", 13_11_2022);
    ordre4.addOrdreVareListe(vare1);
    ordre4.addOrdreVareListe(vare5);
    ordre4.addOrdreVareListe(vare2);

    Ordre ordre5 = new Ordre(5, "Peter", 14_11_2022);

    ordreListe.add(ordre1);
    ordreListe.add(ordre2);
    ordreListe.add(ordre3);
    ordreListe.add(ordre4);
    ordreListe.add(ordre5);



    for (Ordre ordre: ordreListe) {
        listviewOrdre.getItems().add(ordre.toString());
        }

    }


    }





