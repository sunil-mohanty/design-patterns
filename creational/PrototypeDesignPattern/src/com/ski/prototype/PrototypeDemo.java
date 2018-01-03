package com.ski.prototype;

import com.ski.veichle.Cars;

public class PrototypeDemo {

    public static void main(String args[]){
        try {
            Cars cars = new Cars();
            System.out.println("Cars :" + cars);
            Cars clonedCars = (Cars) cars.clone();
            System.out.println("clonedCars :" + clonedCars);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
