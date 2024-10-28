package service;

import java.util.Scanner;

import pojo.Task;
import repo.TaskRepo;

public class DeleteTask {

    public static void removeTask(Scanner scanner){
        System.out.println("Enter the task id that you would like to remove : ");
        int taskID = scanner.nextInt();
        scanner.nextLine();
        int removeIndex = -1;
        if(TaskRepo.taskList.size() > 0){
        System.out.println("Checking... if task exist..");
        for(Task task : TaskRepo.taskList){
            if(task.getTaskID() != taskID) {
                continue;
            } else {
                removeIndex = task.getTaskID() - 1;
                System.out.println("Task found...");
            }
        }
        if(removeIndex < 0){
            System.out.println("No Task exists under the ID : " + taskID);
        } else {
            TaskRepo.taskList.remove(removeIndex);
            System.out.println("The task has been removed successfully..");
        }
        } else {
        System.out.println("No Tasks found.. ");
        }
    }

}
