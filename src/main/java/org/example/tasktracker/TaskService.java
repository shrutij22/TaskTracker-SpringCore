package org.example.tasktracker;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    List<Task>  tasks=new ArrayList<>();
    int idcounter=1;
    TaskLogger taskLogger;

    public void setTaskLogger(TaskLogger taskLogger) {
        this.taskLogger = taskLogger;
    }

    void addTask(String title,String desc){
        Task task=new Task(idcounter++,desc,title);
        tasks.add(task);
        taskLogger.log("Task Added "+title);
    }

    void completeTask(int id){
        for(Task tt:tasks)
        {
            if(tt.getId()==id){
                tt.setCompleted(true);
                taskLogger.log("Task completed "+tt.getTitle());
                return;
            }
        }
        taskLogger.log("TaskID not found " +id);
    }

    void showtasks()
    {
        taskLogger.log("showing all tasks");
        for(Task tt:tasks){
            tt.display();
        }
    }
}
