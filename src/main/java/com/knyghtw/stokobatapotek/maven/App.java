package com.knyghtw.stokobatapotek.maven;

import com.knyghtw.stokobatapotek.maven.view.tabel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import com.knyghtw.stokobatapotek.maven.koneksi.koneksi;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Login");
        stage.setWidth(400);
        stage.setHeight(300);

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        Scene scene = new Scene(grid, 500, 500);

        Label userName = new Label();
        userName.setText("Username");
        grid.add(userName, 0, 0);
        TextField userNameInput = new TextField();
        grid.add(userNameInput, 0, 1);

        Label passWord = new Label();
        passWord.setText("Password");
        grid.add(passWord, 0, 2);
        PasswordField passWordInput = new PasswordField();
        grid.add(passWordInput, 0, 3);

        Button login = new Button("Login");
        login.setOnAction((ActionEvent et) -> {
            String usr = userNameInput.getText();
            String pwd = passWordInput.getText();

            try {
                String sql = "SELECT * FROM admin WHERE username == '" + usr + "' AND password = '" + pwd + "'";
                Connection conn = koneksi.koneksiDB();
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()) {
                    Alert s = new Alert(Alert.AlertType.INFORMATION);
                    s.setTitle("Berhasil");
                    s.setHeaderText("Login Berhasil");
                    s.showAndWait();                    
                    
                    Stage curStage = (Stage) login.getScene().getWindow();
                    curStage.close();
                    
                    tabel tabelStage = new tabel();
                    tabelStage.start(new Stage());
                } else {
                    Alert s = new Alert(Alert.AlertType.ERROR);
                    s.setTitle("Gagal");
                    s.setHeaderText("Login Gagal");
                    s.show();                    
                }                               
            } catch (SQLException ex) {
                System.out.println(ex);
                Alert s = new Alert(Alert.AlertType.ERROR);
                s.setTitle("ERROR");
                s.setHeaderText("Error: " + ex);
                s.show();
            }
        });
        grid.add(login, 0, 4);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}