package model;


import java.math.BigDecimal;


/**
 * describes usage of common item
 */
public class UserCommonItemEvent {

    private int id;
    private User user;
    private Item item;

    /**
     * percents which is used
     * after using it is addet to {@link Item#usagePercentage}
     */
    private BigDecimal usedPercents;

}
