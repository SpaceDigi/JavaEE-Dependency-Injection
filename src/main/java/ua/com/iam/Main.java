package ua.com.iam;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import ua.com.iam.entities.CollectionUsers;
import ua.com.iam.entities.Topic;
import ua.com.iam.entities.User;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfiguration.xml");
        User user=(User)context.getBean("user");
        user.info();
        Topic topic = (Topic)context.getBean("topic");
        topic.info();
        CollectionUsers collectionUsers = (CollectionUsers)context.getBean("collection");
        collectionUsers.info();
    }
}
