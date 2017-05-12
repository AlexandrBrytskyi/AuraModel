package model;


import java.util.List;

public class Item {

    protected int id;
    protected boolean isWorking;
    protected String manufacturer;
    protected String model;
    protected String description;
    protected int resourceInHours;
    protected int workedTime;
    protected List<ItemLog> itemLogs;

}
