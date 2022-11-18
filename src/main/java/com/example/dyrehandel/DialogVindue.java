package com.example.dyrehandel;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.util.Pair;

import java.util.Objects;
import java.util.Optional;

public class DialogVindue {



    void clickShow(ActionEvent event) {

        // Create the custom dialog.
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setTitle("Tilføj vare vindue");
        dialog.setHeaderText("Tilføj Vare");


// Set the button types.
        ButtonType loginButtonType = new ButtonType("Tilføj", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);

// Create the username and varebeskrivelse labels and fields.
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));

        TextField username = new TextField();
        username.setPromptText("varenr");
        TextField varebeskrivelse = new TextField();
        varebeskrivelse.setPromptText("varebeskrivelse");

        grid.add(new Label("varenr:"), 0, 0);
        grid.add(username, 1, 0);
        grid.add(new Label("varebeskrivelse:"), 0, 1);
        grid.add(varebeskrivelse, 1, 1);

// Enable/Disable login button depending on whether a username was entered.
        Node loginButton = dialog.getDialogPane().lookupButton(loginButtonType);
        loginButton.setDisable(true);

// Do some validation (using the Java 8 lambda syntax).
        username.textProperty().addListener((observable, oldValue, newValue) -> {
            loginButton.setDisable(newValue.trim().isEmpty());
        });

        dialog.getDialogPane().setContent(grid);

// Request focus on the username field by default.
        Platform.runLater(() -> username.requestFocus());

// Convert the result to a username-varebeskrivelse-pair when the login button is clicked.
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == loginButtonType) {
                return new Pair<>(username.getText(), varebeskrivelse.getText());
            }
            return null;
        });

        Optional<Pair<String, String>> result = dialog.showAndWait();

        result.ifPresent(usernamevarebeskrivelse -> {
            System.out.println("Username=" + usernamevarebeskrivelse.getKey() + ", varebeskrivelse=" + usernamevarebeskrivelse.getValue());
        });
    }
}
