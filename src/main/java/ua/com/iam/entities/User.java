package ua.com.iam.entities;

public class User {

    private String name;
    private Integer id;

    public User(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public void info(){
        System.out.println("User: "+name+" id: "+id);
    }
}
