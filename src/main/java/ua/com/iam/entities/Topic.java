package ua.com.iam.entities;

public class Topic {
    private String name;
    private Integer id;
    private String description;
    private Boolean enabled;
    private User owner;

    public void info(){
        System.out.println("Topic: "+name+" id: "+id+" descr: "+description+" enabled: "+enabled);
        owner.info();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getName(){
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
