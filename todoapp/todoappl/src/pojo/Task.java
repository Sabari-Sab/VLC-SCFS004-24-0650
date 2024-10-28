package pojo;

import java.time.LocalDateTime;

import util.Utils;

public class Task {

   private int taskID;
   private String taskDesc;
   private boolean completionStatus;
   private LocalDateTime timestamp;
   private String dateTime;

   public static int idSequence;

@SuppressWarnings("static-access")
public Task(String taskDesc) {
   // this.taskID = taskID;
    idSequence++;
    this.taskID = idSequence;
    this.taskDesc = taskDesc;
    this.dateTime = Utils.dataTimeFormatter(timestamp.now());
}


public Task() {
}

public int getTaskID() {
    return taskID;
}

public void setTaskID(int taskID) {
    this.taskID = taskID;
}

public String getTaskDesc() {
    return taskDesc;
}

public void setTaskDesc(String taskDesc) {
    this.taskDesc = taskDesc;
}

public boolean isCompletionStatus() {
    return completionStatus;
}

public void setCompletionStatus(boolean completionStatus) {
    this.completionStatus = completionStatus;
}

public String getDateTime() {
    return dateTime;
}


public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
}


@Override
public String toString() {
    return "Task [taskID=" + taskID + ", taskDesc=" + taskDesc + ", completionStatus=" + completionStatus
            + ", dateTime=" + dateTime + "]";
}




}
