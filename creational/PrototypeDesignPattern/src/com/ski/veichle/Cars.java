package com.ski.veichle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars implements Cloneable{

    private String type;
    private List<String> carList = new ArrayList<>();
    private StringBuffer  names = new StringBuffer();

    public Cars(){
        type = "Sedan";
        carList = new ArrayList<>(Arrays.asList(new String[]{"Mercedes-Benz", "PEUGEOT 508 sedan", "Rolls Royce Ghost", "Aston Martin rapide s"}));
    }

    public String toString() {
        carList.stream().forEach(this::getCarNames);
        return "Car types : " + type + "\nCars :" + names.toString();
    }

    private StringBuffer getCarNames(String name) {
        names.append(name).append(" ");
        return names;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        carList.remove(0);
        names = new StringBuffer();
        return this;
    }
}
