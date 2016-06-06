package model;

import interfaces.ItemInterface;
import java.io.Serializable;

public class Item implements Serializable{
    
    private String name, roomText, inspectText;
    private int value;
    private ItemInterface itemInterface;

    public Item(String name, String roomText, String inspectText, int value, ItemInterface itemType) {
        this.name = name;
        this.roomText = roomText;
        this.inspectText = inspectText;
        this.value = value;
        this.itemInterface = itemType;
    }

    public String getName() {
        return name;
    }

    public String getRoomText() {
        return roomText;
    }

    public String getInspectText() {
        return inspectText;
    }

    public int getValue() {
        return value;
    }

    public ItemInterface getItemInterface() {
        return itemInterface;
    }

}