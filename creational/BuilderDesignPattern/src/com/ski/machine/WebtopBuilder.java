package com.ski.machine;

public class WebtopBuilder {

    private int ram;
    private int hdd;
    private String processor;
    private String graphics;

    // The below three arguments are optional. Hence these will be set vaia setters instead of passing via constructor arguments.
    private String bluetooth;
    private String mediaCard;
    private boolean touchScreenEnabled;

    protected int getRam() {
        return ram;
    }

    protected int getHdd() {
        return hdd;
    }

    protected String getProcessor() {
        return processor;
    }

    protected String getGraphics() {
        return graphics;
    }

    protected String getBluetooth() {
        return bluetooth;
    }

    protected String getMediaCard() {
        return mediaCard;
    }

    protected  boolean isTouchScreenEnabled() {
        return touchScreenEnabled;
    }

    public WebtopBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public WebtopBuilder setHdd(int hdd) {
        this.hdd = hdd;
        return this;
    }

    public WebtopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public WebtopBuilder setGraphics(String graphics) {
        this.graphics = graphics;
        return this;
    }

    public WebtopBuilder setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    public WebtopBuilder setMediaCard(String mediaCard) {
        this.mediaCard = mediaCard;
        return this;
    }

    public WebtopBuilder setTouchScreenEnabled(boolean touchScreenEnabled) {
        this.touchScreenEnabled = touchScreenEnabled;
        return this;
    }

    // To build a webtop the mandatory argumnets are ram, hdd, processor, graphics. So these argumenta are getting passed via constructor
    public WebtopBuilder(int ram, int hdd, String processor, String graphics) {
        this.ram = ram;
        this.hdd = hdd;
        this.processor = processor;
        this.graphics = graphics;
    }

    public Webtop build() {
        return new Webtop(this);
    }

}
