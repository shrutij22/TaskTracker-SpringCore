package org.example.tasktracker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext api=new ClassPathXmlApplicationContext("beans.xml");
        TaskService service = (TaskService) api.getBean("taskService");
        service.addTask("Finish DSA","MAKE A PROJECT SB");
        service.addTask("Spring XML", "Complete TaskTracker app");
        service.completeTask(1);
        service.showtasks();
    }
}
