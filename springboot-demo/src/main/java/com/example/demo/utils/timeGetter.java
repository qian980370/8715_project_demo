package com.example.demo.utils;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class timeGetter {
    public static String getCurrenTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
