package model.user;


import model.Contacts;
import model.Department;
import model.item.PrivateItem;

import java.util.List;


/**
 * represents user entity
 */
public class User {

    /**
     * PK
     */
    private int id;

    /**
     * do we need it?
     */
    private Contacts contacts;

    /**
     * department where user works
     */
    private Department department;

    /**
     * user can have {@link PrivateItem} which is used only by this user
     */
    private List<PrivateItem> userItems;

}
