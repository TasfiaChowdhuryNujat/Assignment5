package com.nujat.assignment5;

public class Item {
    private int mainImage;
    private String title;
    private String subtitle;
    private String description;
    private int iconImage;

    public Item(int mainImage, String title, String subtitle, String description, int iconImage) {
        this.mainImage = mainImage;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.iconImage = iconImage;
    }

    public int getMainImage() {
        return mainImage;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getDescription() {
        return description;
    }

    public int getIconImage() {
        return iconImage;
    }
}
