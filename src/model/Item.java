package model;


import java.math.BigDecimal;
import java.util.List;

public class Item {

    protected int id;
    protected boolean isWorking;
    protected String manufacturer;
    protected String model;
//    protected String description;
    protected Resource resource;
    protected List<ItemLog> itemLogs;
    protected BigDecimal startPrice;
    protected BigDecimal currentPrice;
    protected BigDecimal usagePercentage;


}
