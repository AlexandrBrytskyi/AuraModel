package model;


import java.util.List;

/**
 * item which is property of department and used by users of that department
 * each usage is written in {@link UserCommonItemEvent}
 */
public class CommonItem extends ComplexItem {

    private Department departmentOwner;
    private List<UserCommonItemEvent> commonEvents;


}
