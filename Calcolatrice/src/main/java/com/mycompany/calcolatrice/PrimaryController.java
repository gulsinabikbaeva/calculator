package com.mycompany.calcolatrice;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button idAC;
    @FXML
    private Button id1;
    @FXML
    private Button id7;
    @FXML
    private Button id4;
    @FXML
    private Button id5;
    @FXML
    private Button id8;
    @FXML
    private Button id2;
    @FXML
    private Button idsin;
    @FXML
    private Button id6;
    @FXML
    private Button id9;
    @FXML
    private Button id3;
    @FXML
    private Button idcos;
    @FXML
    private Button iddiv;
    @FXML
    private Button id0;
    @FXML
    private Button idmultiply;
    @FXML
    private Button idtg;
    @FXML
    private Button idplus;
    @FXML
    private Button idminus;
    @FXML
    private Button idlog;
    @FXML
    private Button idbackslash;
    @FXML
    private Button id1x;
    @FXML
    private Button idx2;
    @FXML
    private Button idpercentage;
    @FXML
    private Button idequials;
    @FXML
    private TextField jTextField1;

    double num1, num2, result;
    String opr;

    @FXML
    private void actionAC(ActionEvent event) {
        jTextField1.setText("");
    }

    @FXML
    private void action1(ActionEvent event) {
        jTextField1.setText(jTextField1.getText()+"1");
    }

    @FXML
    private void action_7(ActionEvent event) {
        jTextField1.setText(jTextField1.getText()+"7");
    }

    @FXML
    private void action_4(ActionEvent event) {
        jTextField1.setText(jTextField1.getText()+"4");
    }

    @FXML
    private void action_5(ActionEvent event) {
        jTextField1.setText(jTextField1.getText()+"5");
    }

    @FXML
    private void action_8(ActionEvent event) {
        jTextField1.setText(jTextField1.getText()+"8");
    }

    @FXML
    private void action_2(ActionEvent event) {
        jTextField1.setText(jTextField1.getText()+"2");
    }

    @FXML
    private void action_sin(ActionEvent event) {
        double t=Math.sin(Double.parseDouble(jTextField1.getText()));
        jTextField1.setText("");
        jTextField1.setText(jTextField1.getText()+t);
    }

    @FXML
    private void action_6(ActionEvent event) {
        jTextField1.setText(jTextField1.getText()+"6");
    }

    @FXML
    private void action_9(ActionEvent event) {
        jTextField1.setText(jTextField1.getText()+"9");
    }

    @FXML
    private void action_3(ActionEvent event) {
        jTextField1.setText(jTextField1.getText()+"3");
    }

    @FXML
    private void action_cos(ActionEvent event) {
        double t=Math.cos(Double.parseDouble(jTextField1.getText()));
        jTextField1.setText("");
        jTextField1.setText(jTextField1.getText()+t);
    }

    @FXML
    private void action_div(ActionEvent event) {
        jTextField1.setText("");
        opr="/";
    }

    @FXML
    private void action_0(ActionEvent event) {
        jTextField1.setText(jTextField1.getText()+"0");
    }

    @FXML
    private void action_multiply(ActionEvent event) {
        jTextField1.setText("");
        opr="*";
    }

    @FXML
    private void action_tg(ActionEvent event) {
        double t=Math.tan(Double.parseDouble(jTextField1.getText()));
        jTextField1.setText("");
        jTextField1.setText(jTextField1.getText()+t);
    }

    @FXML
    private void action_plus(ActionEvent event) {
        num1=Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        opr="+";
    }

    @FXML
    private void action_minus(ActionEvent event) {
        jTextField1.setText("");
        opr="-";
    }

    @FXML
    private void action_log(ActionEvent event) {
        double t=Math.log(Double.parseDouble(jTextField1.getText()));
        jTextField1.setText("");
        jTextField1.setText(jTextField1.getText()+t);
    }

    @FXML
    private void action_backslash(ActionEvent event) {
        String backslash=null;
        if(jTextField1.getText().length()>0){
            StringBuilder s= new StringBuilder(jTextField1.getText());
            s.deleteCharAt(jTextField1.getText().length()-1);
            backslash=s.toString();
            jTextField1.setText(backslash);
        }
    }

    @FXML
    private void action_1x(ActionEvent event) {
        if(Double.parseDouble(jTextField1.getText()) !=0){
            double t=1/(Double.parseDouble(jTextField1.getText()));
        jTextField1.setText("");
        jTextField1.setText(jTextField1.getText()+t);
        } else jTextField1.setText("errore");
        
    }

    @FXML
    private void action_x2(ActionEvent event) {
        double t=Double.parseDouble(jTextField1.getText());
        t=t*t;
        jTextField1.setText("");
        jTextField1.setText(jTextField1.getText()+t);
    }

    @FXML
    private void action_percentage(ActionEvent event) {
        jTextField1.setText("");
        opr="%";
    }

    @FXML
    private void action_equals(ActionEvent event) {
        num2=Double.parseDouble(jTextField1.getText());     
        if(opr=="+"){
            result=num1+num2;
            jTextField1.setText(Double.toString(result));
        } else if(opr=="-"){
            result=num1-num2;
            jTextField1.setText(Double.toString(result));
        } else if(opr=="*"){
            result=num1*num2;
            jTextField1.setText(Double.toString(result));
        } else if(opr=="/"){
            result=(num1/num2);
            jTextField1.setText(Double.toString(result));
        } else if(opr=="%"){
           result=num1%num2;
            jTextField1.setText(Double.toString(result));
        } 
    }
}
