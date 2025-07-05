package org.example.tasktracker;

public class TaskLogger {
    TaskLogger()
    {
        System.out.println("Task Logger Created!");
    }

    public void log(String msg){
        System.out.println("LOG : "+msg);
    }
}
