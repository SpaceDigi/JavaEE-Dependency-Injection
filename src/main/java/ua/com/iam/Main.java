package ua.com.iam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");
        User user=(User)context.getBean("user");
        user.info();
        Topic topic = (Topic)context.getBean("topic");
        topic.info();
        CollectionUsers collectionUsers = (CollectionUsers)context.getBean("collection");
        collectionUsers.info();
        user.addMeAsOwnerToTopic(topic);
    }
}
