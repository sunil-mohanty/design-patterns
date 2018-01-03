package com.ski.computers;

public class PC  extends Computer{
    private int ramsize;
    private int processor;
    private String graphics;

    public PC(int ramsize, int processor, String graphics) {
        this.ramsize = ramsize;
        this.processor = processor;
        this.graphics = graphics;
    }

    @Override
    public int getRamsize() {
        return this.ramsize;
    }

    @Override
    public int getProcessor() {
        return this.processor;
    }

    @Override
    public String getGraphics() {
        return this.graphics;
    }
}
