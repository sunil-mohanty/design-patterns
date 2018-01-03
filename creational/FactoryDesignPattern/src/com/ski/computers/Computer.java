package com.ski.computers;

public abstract class Computer {

    public abstract int getRamsize();
    public abstract int getProcessor();
    public abstract String getGraphics();

    public String toString() {
        return "Ram : " + getRamsize() + "GB, Processor : " + getProcessor() + " GHZ, Graphics : " + getGraphics();
    }
}
