package com.ski.factory;

import com.ski.computers.Computer;
import com.ski.computers.PC;
import com.ski.computers.Server;

public class ComputerFactory {

    public Computer getComputer(int ramsize, int processor, String graphics, String type){
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ramsize, processor, graphics);
        } else if("SERVER".equalsIgnoreCase(type)) {
            return new Server(ramsize, processor, graphics);
        }
        return null;
    }
}
