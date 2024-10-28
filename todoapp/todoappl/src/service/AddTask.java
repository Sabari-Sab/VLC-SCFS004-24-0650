package service;

import java.util.Scanner;

import pojo.Task;
import repo.TaskRepo;

public class AddTask {

    public static void add(Scanner scanner){
      scanner.nextLine();
      System.out.print("Please Enter the Task Description :");
      String taskDesc = scanner.nextLine();
      TaskRepo.save(new Task(taskDesc));
    }

}
