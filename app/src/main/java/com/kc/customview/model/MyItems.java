package com.kc.customview.model;

public class MyItems {

    private int image;
    private String text;
    private boolean showChevron;
    private int foregroundColor;

    public MyItems(int image, String text, boolean showChevron, int foregroundColor) {
        this.image = image;
        this.text = text;
        this.showChevron = showChevron;
        this.foregroundColor = foregroundColor;
    }

    public MyItems() {

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isShowChevron() {
        return showChevron;
    }

    public void setShowChevron(boolean showChevron) {
        this.showChevron = showChevron;
    }

    public int getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(int foregroundColor) {
        this.foregroundColor = foregroundColor;
    }
}
