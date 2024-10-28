package service;

import java.util.Scanner;

import util.Utils;

public class Options {

    public static void showOptions(){
        System.out.println();
        System.out.println(Utils.ANSI_BLUE + "Choose from the options" + Utils.ANSI_RESET);
        System.out.println("---------------------");
        System.out.println(Utils.ANSI_GREEN + "1. Add Task");
        System.out.println("2. List all Tasks");
        System.out.println("3. View Task");
        System.out.println("4. Update Task");
        System.out.println("5. Delete Task");
        System.out.println("6. Mark Task as complete");
        System.out.println("7. Exit" + Utils.ANSI_RESET);
    }

    public static void executeOptions(){
        showOptions();
        Scanner inp = new Scanner(System.in);
        byte options;
   
        while(true){
        try{  
        System.out.println();     
        System.out.print(Utils.ANSI_YELLOW + "Enter your option :" + Utils.ANSI_RESET);
        options = inp.nextByte();
        switch(options){
            case 1:
            AddTask.add(inp);
            break;
            case 2:
            ViewTasks.displayAllTasks();
            break;
            case 3:
            ViewTasks.displayTask(inp);
            break;
            case 4:
            UpdateTask.taskUpdate(inp);
            break;
            case 5:
            DeleteTask.removeTask(inp);
            break;
            case 6:
            UpdateTask.updateTaskCompletion(inp);
            break;
        }
        if(options == 7){
            break;
        }
        showOptions();
    } catch(Exception e){
        System.out.println("Enter input is invalid.. Please try again..");
        inp.nextLine();
        showOptions();
    }
    }
        inp.close();
    }

}
