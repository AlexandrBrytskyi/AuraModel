package model;


import java.util.List;

public class User {

    
    private int id;
    private Contacts contacts;
    private Department department;
//    private Position position;
    private List<PrivateItem> userItems;
    private List<UserCommonItemEvent> commonItemEvents;
    private UserCredentials credentials;
}
