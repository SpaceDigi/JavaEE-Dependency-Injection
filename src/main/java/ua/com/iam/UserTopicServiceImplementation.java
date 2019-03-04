package ua.com.iam;

import org.springframework.stereotype.Component;

import java.util.*;

public class UserTopicServiceImplementation {

    private Map<User,List<Topic>> userTopicOwners;

    private Map<User,List<Topic>> userTopicDevelopers;

    public UserTopicServiceImplementation(){
        userTopicOwners = new HashMap<User, List<Topic>>();
        userTopicDevelopers = new HashMap<User, List<Topic>>();
    }

    public void addOwnerToTopic(User user, Topic topic){
        addUserToTopic(user,topic,userTopicOwners);
    }

    public void addDeveloperToTopic(User user, Topic topic){
        addUserToTopic(user,topic,userTopicDevelopers);
    }

    private void addUserToTopic(User user,Topic topic, Map<User,List<Topic>> map){
        if(map.get(user)==null){
            map.put(user,new LinkedList<Topic>());
        }
        map.get(user).add(topic);
    }

    public List<Topic> getTopicsByOwner(User user){
        return userTopicOwners.get(user);
    }

    public List<Topic> getTopicsByDeveloper(User user){
        return userTopicDevelopers.get(user);
    }

}
