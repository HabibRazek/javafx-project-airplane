package com.airplane.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button btncreateaccount;

    @FXML
    private Button btnlogin;

    @FXML
    private TextField email;

    @FXML
    private PasswordField password;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void login(ActionEvent event) {
        PreparedStatement st=null;
        ResultSet rs=null;
        Connection con = Connexion.getConnexion();
        try{
            String sql="SELECT * FROM `personne` WHERE `email`=? AND `password`=?";
            st=con.prepareStatement(sql);
            st.setString(1, email.getText());
            st.setString(2, password.getText());
            rs=st.executeQuery();
            if (rs.next()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Login successful");
                alert.showAndWait();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home.fxml"));
                Parent home = fxmlLoader.load();
                Scene homeScene = new Scene(home, 695, 430);

                Stage currentStage = (Stage) btnlogin.getScene().getWindow();
                currentStage.setTitle("Home");
                currentStage.setScene(homeScene);
                currentStage.show();
            }
            else{
                System.out.println("login failed");
            }
        }
        catch(Exception e){
            System.out.println("error");
        }


    }
}