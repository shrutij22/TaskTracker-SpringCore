package org.example.tasktracker;

public class Task {
    int id;
    String title;
    String desc;
    boolean completed;
    Task(){
        System.out.println("New Task Obbject Created");
    }
    Task(int id, String desc, String title)
    {
        this.id=id;
        this.desc=desc;
        this.title=title;
        this.completed=false;
    }
    public int getId() { return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void display()
    {
        System.out.println(" "+id+" "+title+" "+desc+" "+completed);
    }
}
