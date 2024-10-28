package myapp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import pojo.Task;
import util.Utils;

public class TestApp {

    public static void main(String[] args) throws Exception {
        Task t1 = new Task("Task 1");
        Task t2 = new Task("Task 2");

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(newDateTime);
        Utils.rightAlign("Hello");

}
}
