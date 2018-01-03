package com.ski.machine;

public class Webtop {

    private int ram;
    private int hdd;
    private String processor;
    private String graphics;
    private String bluetooth;
    private String mediaCard;
    private boolean touchScreenEnabled;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getMediaCard() {
        return mediaCard;
    }

    public void setMediaCard(String mediaCard) {
        this.mediaCard = mediaCard;
    }

    public boolean isTouchScreenEnabled() {
        return touchScreenEnabled;
    }

    public void setTouchScreenEnabled(boolean touchScreenEnabled) {
        this.touchScreenEnabled = touchScreenEnabled;
    }

    protected Webtop(WebtopBuilder webtopBuilder) {
        this.ram = webtopBuilder.getRam();
        this.hdd = webtopBuilder.getHdd();
        this.processor = webtopBuilder.getProcessor();
        this.graphics = webtopBuilder.getGraphics();
        this.bluetooth = webtopBuilder.getBluetooth();
        this.mediaCard = webtopBuilder.getMediaCard();
        this.touchScreenEnabled = webtopBuilder.isTouchScreenEnabled();
    }

    public String toString() {
        return "Ram : " + this.ram + "\nhdd : " + this.hdd + "\nprocessor :"
                +processor+ "\ngraphics : " + graphics +"\nBluetooth :"+bluetooth
                    + "\nMediaCard :" +mediaCard+ "\nTouchScreenEnabled :" + touchScreenEnabled;
    }
}
