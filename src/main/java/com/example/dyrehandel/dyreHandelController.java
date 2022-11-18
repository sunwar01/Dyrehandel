package com.example.dyrehandel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class dyreHandelController {
    @FXML
    private ListView<String>  listviewOrdre = new ListView();

    @FXML
    private ListView<String> listviewVare = new ListView();

    @FXML
    private ListView<String> listviewAlleVarer = new ListView();

    @FXML
    private Button sletVare;


    @FXML
    private Button tilføjVare;


    @FXML void sletVareActionEvent(ActionEvent event){

    }

    @FXML void tilføjVareActionEvent(ActionEvent event){

    }



    public void initialize() {


        Ordre ordre1 = new Ordre(1, "Alexander", 10_11_2022);
        Ordre ordre2 = new Ordre(2, "Lukas", 11_11_2022);
        Ordre ordre3 = new Ordre(3, "Sune", 12_11_2022);
        Ordre ordre4 = new Ordre(4, "Bent", 13_11_2022);
        Ordre ordre5 = new Ordre(5, "Peter", 14_11_2022);


        Vare vare1 = new Vare(1, "Bil");
        Vare vare2 = new Vare(2, "Sko");
        Vare vare3 = new Vare(3, "Skovl");
        Vare vare4 = new Vare(4, "Hus");
        Vare vare5 = new Vare(5, "Telefon");

        listviewOrdre.getItems().addAll(ordre1.toString(), ordre2.toString(), ordre3.toString(), ordre4.toString(), ordre5.toString());

        listviewVare.getItems();

        listviewAlleVarer.getItems().addAll(vare1.toString(), vare2.toString(), vare3.toString(), vare4.toString(), vare5.toString());



    }



    }





