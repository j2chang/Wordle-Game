package edu.virginia.cs.gui;

import edu.virginia.cs.wordle.*;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class WordleController {
    @FXML
    private Label Label1;
    @FXML
    private Rectangle Rectangle1;
    @FXML
    private Label Label2;
    @FXML
    private Label Label3;
    @FXML
    private Label Label4;
    @FXML
    private Label Label5;
    @FXML
    private Label Label6;
    @FXML
    private Label Label7;
    @FXML
    private Label Label8;
    @FXML
    private Label Label9;
    @FXML
    private Label Label10;
    @FXML
    private Label Label11;
    @FXML
    private Label Label12;
    @FXML
    private Label Label13;
    @FXML
    private Label Label14;
    @FXML
    private Label Label15;
    @FXML
    private Label Label16;
    @FXML
    private Label Label17;
    @FXML
    private Label Label18;
    @FXML
    private Label Label19;
    @FXML
    private Label Label20;
    @FXML
    private Label Label21;
    @FXML
    private Label Label22;
    @FXML
    private Label Label23;
    @FXML
    private Label Label24;
    @FXML
    private Label Label25;
    @FXML
    private Button yButton;
    @FXML
    private Button nButton;
    @FXML
    private Label playAgain;
    @FXML
    private Label WorL;
    private int counter = 0;
    private int attempts = 0;
    private String characters = "";
    Wordle wordle = new WordleImplementation();
    @FXML
    protected void onButtonClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        String buttonText = button.getText();
        if (attempts == 0 && characters.length() <= 5) {
            if (characters.length() != 5){
                counter++;
            }
            switch (counter) {
                case 1:
                    Label1.setText(buttonText);
                    characters = characters.concat(Label1.getText());
                    break;
                case 2:
                    Label2.setText(buttonText);
                    characters = characters.concat(Label2.getText());
                    break;
                case 3:
                    Label3.setText(buttonText);
                    characters = characters.concat(Label3.getText());
                    break;
                case 4:
                    Label4.setText(buttonText);
                    characters = characters.concat(Label4.getText());
                    break;
                case 5:
                    Label5.setText(buttonText);
                    characters = characters.concat(Label5.getText());
                    break;
            }
        }
        if (attempts == 1 && characters.length() <= 5){
            if (characters.length() != 5){
                counter++;
            }
            switch (counter) {
                case 6:
                    Label6.setText(buttonText);
                    characters = characters.concat(Label6.getText());
                    break;
                case 7:
                    Label7.setText(buttonText);
                    characters = characters.concat(Label7.getText());
                    break;
                case 8:
                    Label8.setText(buttonText);
                    characters = characters.concat(Label8.getText());
                    break;
                case 9:
                    Label9.setText(buttonText);
                    characters = characters.concat(Label9.getText());
                    break;
                case 10:
                    Label10.setText(buttonText);
                    characters = characters.concat(Label10.getText());
                    break;
            }
        }
        if (attempts == 2 && characters.length() <= 5){
            if (characters.length() != 5){
                counter++;
            }
            switch (counter) {
                case 11:
                    Label11.setText(buttonText);
                    characters = characters.concat(Label11.getText());
                    break;
                case 12:
                    Label12.setText(buttonText);
                    characters = characters.concat(Label12.getText());
                    break;
                case 13:
                    Label13.setText(buttonText);
                    characters = characters.concat(Label13.getText());
                    break;
                case 14:
                    Label14.setText(buttonText);
                    characters = characters.concat(Label14.getText());
                    break;
                case 15:
                    Label15.setText(buttonText);
                    characters = characters.concat(Label15.getText());
                    break;
            }
        }
        if (attempts == 3 && characters.length() <= 5) {
            if (characters.length() != 5){
                counter++;
            }
            switch (counter) {
                case 16:
                    Label16.setText(buttonText);
                    characters = characters.concat(Label16.getText());
                    break;
                case 17:
                    Label17.setText(buttonText);
                    characters = characters.concat(Label17.getText());
                    break;
                case 18:
                    Label18.setText(buttonText);
                    characters = characters.concat(Label18.getText());
                    break;
                case 19:
                    Label19.setText(buttonText);
                    characters = characters.concat(Label19.getText());
                    break;
                case 20:
                    Label20.setText(buttonText);
                    characters = characters.concat(Label20.getText());
                    break;
            }
        }
        if (attempts == 4 && characters.length() <= 5) {
            if (characters.length() != 5){
                counter++;
            }
            switch (counter) {
                case 21:
                    Label21.setText(buttonText);
                    characters = characters.concat(Label21.getText());
                    break;
                case 22:
                    Label22.setText(buttonText);
                    characters = characters.concat(Label22.getText());
                    break;
                case 23:
                    Label23.setText(buttonText);
                    characters = characters.concat(Label23.getText());
                    break;
                case 24:
                    Label24.setText(buttonText);
                    characters = characters.concat(Label24.getText());
                    break;
                case 25:
                    Label25.setText(buttonText);
                    characters = characters.concat(Label25.getText());
                    break;
            }
        }
    }
    @FXML
    protected void backSpaceEvent(){
        if (attempts == 0 && characters.length() > 0){
            switch (counter) {
                case 1:
                    Label1.setText("");
                    break;
                case 2:
                    Label2.setText("");
                    break;
                case 3:
                    Label3.setText("");
                    break;
                case 4:
                    Label4.setText("");
                    break;
                case 5:
                    Label5.setText("");
                    break;
            }
            if (characters.length() != 0){
                counter--;
            }
        }
        if (attempts == 1 && characters.length() > 0){
            switch (counter) {
                case 6:
                    Label6.setText("");
                    break;
                case 7:
                    Label7.setText("");
                    break;
                case 8:
                    Label8.setText("");
                    break;
                case 9:
                    Label9.setText("");
                    break;
                case 10:
                    Label10.setText("");
                    break;
            }
            if (characters.length() != 0){
                counter--;
            }
        }
        if (attempts == 2 && characters.length() > 0){
            switch (counter) {
                case 11:
                    Label11.setText("");
                    break;
                case 12:
                    Label12.setText("");
                    break;
                case 13:
                    Label13.setText("");
                    break;
                case 14:
                    Label14.setText("");
                    break;
                case 15:
                    Label15.setText("");
                    break;
            }
            if (characters.length() != 0){
                counter--;
            }
        }
        if (attempts == 3 && characters.length() > 0) {
            switch (counter) {
                case 16:
                    Label16.setText("");
                    break;
                case 17:
                    Label17.setText("");
                    break;
                case 18:
                    Label18.setText("");
                    break;
                case 19:
                    Label19.setText("");
                    break;
                case 20:
                    Label20.setText("");
                    break;
            }
            if (characters.length() != 0){
                counter--;
            }
        }
        if (attempts == 4 && characters.length() > 0) {
            switch (counter) {
                case 21:
                    Label21.setText("");
                    break;
                case 22:
                    Label22.setText("");
                    break;
                case 23:
                    Label23.setText("");
                    break;
                case 24:
                    Label24.setText("");
                    break;
                case 25:
                    Label25.setText("");
                    break;
            }
            if (characters.length() != 0){
                counter--;
            }
        }
        if (characters.length() > 0){
            String newString = characters.substring(0, characters.length() - 1);
            characters = newString;
        }
    }
    @FXML
    protected void submit() {
        WordleDictionary wordledic = new WordleDictionary();
        String word = new String(characters.toString());
        try {
            if (wordledic.isLegalWordleWord(word) && word.length() == 5) {
                WorL.setVisible(false);
                LetterResult[] letters = wordle.submitGuess(word);
                for (int i = 0; i < 5; i++) {
                    int index = attempts * 5 + i + 1;
                    String fxId = "#Rectangle" + index;
                    Scene scene = Rectangle1.getScene();
                    Rectangle rect = (Rectangle) scene.lookup(fxId);
                    if (letters[i] == LetterResult.YELLOW) {
                        rect.setFill(Color.YELLOW);
                    } else if (letters[i] == LetterResult.GREEN) {
                        rect.setFill(Color.GREEN);
                    } else if (letters[i] == LetterResult.GRAY) {
                        rect.setFill(Color.GRAY);
                    }
                }
                characters = "";
                attempts++;
            }
        } catch (IllegalWordException e) {
                WorL.setText("Invalid Word");
                WorL.setVisible(true);
        }

        if (wordle.isWin()) {
            WorL.setText("YOU WON!");
            yButton.setVisible(true);
            nButton.setVisible(true);
            yButton.setDisable(false);
            nButton.setDisable(false);
            playAgain.setVisible(true);
            WorL.setVisible(true);
        }
        else if (wordle.isLoss() || attempts >= 5){
            WorL.setText("YOU LOST!");
            yButton.setVisible(true);
            nButton.setVisible(true);
            yButton.setDisable(false);
            nButton.setDisable(false);
            playAgain.setVisible(true);
            WorL.setVisible(true);
        }
    }
    @FXML
    protected void yes() {
        wordle = new WordleImplementation();
        counter = 0;
        attempts = 0;
        yButton.setVisible(false);
        nButton.setVisible(false);
        yButton.setDisable(true);
        nButton.setDisable(true);
        playAgain.setVisible(false);
        WorL.setVisible(false);
        for (int i = 1; i < 26; i++){
            String fxId = "#Label" + i;
            Scene scene = Label1.getScene();
            Label label = (Label) scene.lookup(fxId);
            label.setText("");
        }
        for (int i = 1; i < 26; i++){
            String fxId = "#Rectangle" + i;
            Scene scene = Rectangle1.getScene();
            Rectangle rect = (Rectangle) scene.lookup(fxId);
            rect.setFill(Color.TRANSPARENT);
        }
    }
    @FXML
    protected void no() {
        Platform.exit();
    }
}