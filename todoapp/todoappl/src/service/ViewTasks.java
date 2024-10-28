package service;

import java.util.Scanner;

import pojo.Task;
import repo.TaskRepo;
import util.Utils;

public class ViewTasks {

    public static void displayTask(Scanner scanner){ 
      System.out.print("Please Enter the Task Id :");
      int taskID = scanner.nextInt();
      Task toDisplay = null;
      if(TaskRepo.taskList.size() > 0){
      for(Task task : TaskRepo.taskList){
            if(task.getTaskID() != taskID) {
                continue;
            } else {
                toDisplay = task;
            }
      }
      if(toDisplay != null){
        System.out.println("The task details are as below :");
        System.out.println(toDisplay);
      } else {
        System.out.println("No Task found under the ID : " + taskID);
      }  
    } else 
      System.out.println("No Tasks found");
      scanner.nextLine();
    }

    public static void displayAllTasks(){
        if(TaskRepo.taskList.size() > 0){
            System.out.println();
            System.out.printf( "%40s", Utils.ANSI_BLUE_BG + "All Tasks" + Utils.ANSI_RESET);
            System.out.println();
            System.out.println(Utils.ANSI_CYAN + "_________________________________________________________");
        for(Task task : TaskRepo.taskList){
            System.out.printf("| %-30s | %-20d |%n", "Task ID" ,task.getTaskID());
            //System.out.println(Utils.ANSI_CYAN + "|" + "Task ID : " + task.getTaskID() + "|");
            //System.out.println("_________________________________________________________");
            System.out.printf("| %-30s | %-20s |%n", "Task Description" ,task.getTaskDesc());
            //System.out.println("|" + "Task Description : " + task.getTaskDesc() + "|");
            //System.out.println("_________________________________________________________");
            System.out.printf("| %-30s | %-20s |%n", "Task Status" ,task.isCompletionStatus());
            //System.out.println("|" + "Task Status : " + task.isCompletionStatus()+ "|");
            //System.out.println("_________________________________________________________");
            System.out.printf("| %-30s | %-20s |%n", "Task Created" ,task.getDateTime()); 
            //System.out.println("|" + "Task Created : " + task.getDateTime() + "|" + Utils.ANSI_RESET);  
            System.out.println("_________________________________________________________");
        }
    } else {
            System.out.println("No Task to display");
    }

    }

}
