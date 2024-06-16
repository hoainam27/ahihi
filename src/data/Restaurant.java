/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author HOAI NAM
 */
public class Restaurant {
    private String name;
    private String location;
    private String openingHours;
    private int capacity;
    private String menu;

    public Restaurant(String name, String location, String openingHours, int capacity, String menu) {
        this.name = name;
        this.location = location;
        this.openingHours = openingHours;
        this.capacity = capacity;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant: " + name + "\nLocation: " + location + "\nOpening Hours: " + openingHours + "\nCapacity: " + capacity + "\nMenu: " + menu;
    }
}
