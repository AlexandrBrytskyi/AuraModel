package model.events;


import model.item.Item;
import model.item.ItemEventType;

import java.time.LocalDateTime;

/**
 * holds item and {@link ItemEventType} which is made on item
 */
public class ItemLog {

    private int id;
    private Item item;
    private LocalDateTime eventDate;
    private ItemEventType eventType;
    private String description;

}

