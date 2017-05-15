package model.item;


import model.item.Item;
import model.user.User;

/**
 * item which is used only by one user which is owner
 */
public class PrivateItem extends Item {

    private User owner;


}
