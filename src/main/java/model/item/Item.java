package model.item;


import model.events.ItemLog;
import model.item.resource.Resource;

import java.math.BigDecimal;
import java.util.List;


/**
 * abstract item which holds common fields of all available items
 */
public abstract class Item {

    /**
     * PK
     */
    protected int id;

    /**
     * indicates whether uitem is used now
     */
    protected boolean isWorking;

    protected String manufacturer;
    protected String model;

    /**
     * see {@link Resource}
     */
    protected Resource resource;

    /**
     * all operations related to item see {@link ItemEventType}
     */
    protected List<ItemLog> itemLogs;

    protected BigDecimal startPrice;

    /**
     * how exact do we need to count it:
     * every decade, year, or when user asks?
     */
    protected BigDecimal currentPrice;

    /**
     * percents is updated every time user used item
     * describes total item wear
     */
    protected BigDecimal usagePercentage;

    protected List<Item> components;

    protected Item parentItem;




}
