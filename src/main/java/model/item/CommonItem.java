package model.item;


import model.Department;
import model.events.UserCommonItemEvent;

import java.util.List;

/**
 * item which is property of department and used by users of that department
 * each usage is written in {@link UserCommonItemEvent}
 */
public class CommonItem extends Item {

    private Department departmentOwner;
    private List<UserCommonItemEvent> commonEvents;


}
