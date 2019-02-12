package ua.com.iam.entities;

import java.util.List;
import java.util.Set;

public class CollectionUsers {
    private List docLists;

    public List getDocLists() {
        return docLists;
    }


    public void setDocLists(List docLists) {
        this.docLists = docLists;
    }
    public void info(){
        for(Object o:docLists)
            System.out.println(o);
    }
}
