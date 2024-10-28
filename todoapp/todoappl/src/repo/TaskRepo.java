package repo;

import java.util.ArrayList;

import pojo.Task;

public class TaskRepo {
 
     public static ArrayList<Task> taskList = new ArrayList<>();

     public static void save(Task task){
        taskList.add(task);
        System.out.println("Task added successfully");
        System.out.println("Number of tasks added :" + taskList.size());
     }
}
