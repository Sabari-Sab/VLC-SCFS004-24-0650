package service;

import java.util.Scanner;

import pojo.Task;
import repo.TaskRepo;

public class UpdateTask {

    public static void taskUpdate(Scanner scanner) {
        System.out.println("Enter the task id to perform the update : ");
        int taskID = scanner.nextInt();
        scanner.nextLine();
        Task toUpdate = null;
        if (TaskRepo.taskList.size() > 0) {
            System.out.println("Checking... if task exist..");
            for (Task task : TaskRepo.taskList) {
                if (task.getTaskID() != taskID) {
                    continue;
                } else {
                    toUpdate = task;
                    System.out.println("Task found.. Please proceed to update.");
                }
            }
            if (toUpdate == null) {
                System.out.println("No Task exists under the ID : " + taskID);
            }
        } else {
            System.out.println("No Tasks found.. ");
        }
        if (toUpdate != null) {
            System.out.println("Which field of task you would like to update? :");
            System.out.println("1. Task Desc");
            System.out.println("2. Task completion");
            System.out.print("Kindly enter the option to proceed for update: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.print("Enter the task desc you would like to update :");
                String taskDesc = scanner.nextLine();
                toUpdate.setTaskDesc(taskDesc);
            } else {
                System.out.println("The task completion will be set to true");
                toUpdate.setCompletionStatus(true);
            }
            System.out.println(toUpdate);
        }

    }

    public static void updateTaskCompletion(Scanner scanner) {

        System.out.print("Please enter the task ID to mark as complete :");
        int taskID = scanner.nextInt();
        Task toUpdate = null;
        if (TaskRepo.taskList.size() > 0) {
            System.out.println("Checking... if task exist..");
            for (Task task : TaskRepo.taskList) {
                if (task.getTaskID() != taskID) {
                    continue;
                } else {
                    toUpdate = task;
                    System.out.println("Task found.. Please proceed to update.");
                }
            }
            if (toUpdate == null) {
                System.out.println("No Task exists under the ID : " + taskID);
            }
        } else {
            System.out.println("No Tasks found.. ");
        }
        if (toUpdate != null) {
                System.out.println("The task completion will be mark as complete");
                toUpdate.setCompletionStatus(true);
                System.out.println(toUpdate);
            }
            scanner.nextLine();
        }
    }

