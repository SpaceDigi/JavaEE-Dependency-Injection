package ua.com.iam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private UserTopicServiceImplementation userTopicService;

    private String name;
    private Integer id;

    public User(){}

    public User(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public void info(){
        System.out.println("User: "+name+" id: "+id);
    }

    public void addMeAsOwnerToTopic(Topic topic){
        System.out.println(userTopicService);
        userTopicService.addDeveloperToTopic(this,topic);
    }
}
