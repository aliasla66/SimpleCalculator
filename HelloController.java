/**
 * Sample Skeleton for 'hello-view.fxml' Controller Class
 */

package com.example.calculator;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.List;

public class HelloController<integer> {
    @FXML
    String basee;

    @FXML
    String expp;
    @FXML
    String answer;

    @FXML // fx:id="abot"
    private Button abot; // Value injected by FXMLLoader

    @FXML // fx:id="anchor"
    private AnchorPane anchor; // Value injected by FXMLLoader

    @FXML // fx:id="bbot"
    private Button bbot; // Value injected by FXMLLoader

    @FXML // fx:id="bot0"
    private Button bot0; // Value injected by FXMLLoader

    @FXML // fx:id="bot1"
    private Button bot1; // Value injected by FXMLLoader

    @FXML // fx:id="bot2"
    private Button bot2; // Value injected by FXMLLoader

    @FXML // fx:id="bot3"
    private Button bot3; // Value injected by FXMLLoader

    @FXML // fx:id="bot4"
    private Button bot4; // Value injected by FXMLLoader

    @FXML // fx:id="bot5"
    private Button bot5; // Value injected by FXMLLoader

    @FXML // fx:id="bot6"
    private Button bot6; // Value injected by FXMLLoader

    @FXML // fx:id="bot7"
    private Button bot7; // Value injected by FXMLLoader

    @FXML // fx:id="bot8"
    private Button bot8; // Value injected by FXMLLoader

    @FXML // fx:id="bot9"
    private Button bot9; // Value injected by FXMLLoader

    @FXML // fx:id="botadd"
    private Button botadd; // Value injected by FXMLLoader

    @FXML // fx:id="botdiv"
    private Button botdiv; // Value injected by FXMLLoader

    @FXML // fx:id="boteq"
    private Button boteq; // Value injected by FXMLLoader

    @FXML // fx:id="botmin"
    private Button botmin; // Value injected by FXMLLoader

    @FXML // fx:id="botmul"
    private Button botmul; // Value injected by FXMLLoader

    @FXML // fx:id="cbot"
    private Button cbot; // Value injected by FXMLLoader

    @FXML // fx:id="cbox"
    private ComboBox<String> cbox; // Value injected by FXMLLoader


    @FXML // fx:id="clearbot"
    private Button clearbot; // Value injected by FXMLLoader

    @FXML // fx:id="dbot"
    private Button dbot; // Value injected by FXMLLoader

    @FXML // fx:id="ebot"
    private Button ebot; // Value injected by FXMLLoader

    @FXML // fx:id="fbot"
    private Button fbot; // Value injected by FXMLLoader

    @FXML // fx:id="field"
    private TextField field; // Value injected by FXMLLoader

    ObservableList<String> listt = FXCollections.observableArrayList("2","8","10","16");

    public void initialize() {

        cbox.setItems(listt);
    }
        @FXML
    void abota(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "A");
    }

    @FXML
    void bbota(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "B");
    }

    @FXML
    void bot0a(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "0");
    }

    @FXML
    void bot1a(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "1");
    }

    @FXML
    void bot2a(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "2");
    }

    @FXML
    void bot3a(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "3");
    }

    @FXML
    void bot4a(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "4");
    }

    @FXML
    void bot5a(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "5");
    }

    @FXML
    void bot6a(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "6");
    }

    @FXML
    void bot7a(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "7");
    }

    @FXML
    void bot8a(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "8");
    }

    @FXML
    void bot9a(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "9");
    }

    @FXML
    void botadda(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "+");
    }

    @FXML
    void botdiva(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "/");
    }

    @FXML
    void boteqa(ActionEvent event) {
       expp = field.getText();
     //  answer = calc(expp,basee);
       answer = "the base is :" + basee + "  the expression is :" + expp;
       field.setText(answer);
    }

    @FXML
    void botmina(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "-");
    }

    @FXML
    void botmula(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "*");
    }

    @FXML
    void cbota(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "C");
    }

    @FXML
    void dbota(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "D");
    }

    @FXML
    void ebota(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "E");
    }

    @FXML
    void fbota(ActionEvent event) {
        String temp = field.getText();
        field.setText(temp + "F");
    }

    @FXML
    void fieldtext(ActionEvent event) {

    }

    @FXML
    void cboxa(ActionEvent event) {
         basee = cbox.getValue();
        //field.setText(basee);
    }

    @FXML
    void clearbota(ActionEvent event) {
        basee = "";
        expp = "";
        answer = "";
        field.setText("");
    }
}
