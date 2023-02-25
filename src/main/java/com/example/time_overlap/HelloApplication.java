package com.example.time_overlap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {


        //launch();
        //source: https://wgu.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=f37d84e3-7537-47ed-bfb5-ab49011221f3
//Using static "Of" method to compare LocalDatetime Objects

        LocalDateTime startDT = LocalDateTime.of(2023,02,8,22,00);
        LocalDateTime endDT = LocalDateTime.of(2023,02,8,23,00);
        //LocalDateTime myDT = LocalDateTime.of(2023,02,8,22,45);
        LocalDateTime myDT = LocalDateTime.of(2024,02,8,23,00);
        //Check time overlap
        if(myDT.isAfter(startDT) && myDT.isBefore(endDT)){
            System.out.println(myDT+"is b/t \n"+startDT+" and \n"+endDT);
        }
        else if(myDT.equals(startDT) ||myDT.equals(endDT)){
            System.out.println("Your Date and time matches "+startDT+" or "+ endDT);
        }
        else{
            System.out.println("Your Date and Time does not overlap");
        }
        LocalDate testDT = LocalDate.now();
        LocalTime testTm = LocalTime.now();
        System.out.println("\n \n \n test:"+ testDT +" "+testTm);

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp timestamp = Timestamp.valueOf(formatter.format(date).toString());
        System.out.println("\n \n \n"+timestamp);





    }
}