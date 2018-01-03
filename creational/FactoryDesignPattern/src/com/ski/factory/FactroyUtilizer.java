package com.ski.factory;

import com.ski.computers.PC;
import com.ski.computers.Server;

public class FactroyUtilizer {
    public static void main(String args[]){
        ComputerFactory computerFactory = new ComputerFactory();
        Server server = (Server) computerFactory.getComputer(100, 7,"intel ati core", "server");
        System.out.println(server);

        PC pc= (PC) computerFactory.getComputer(8, 2,"nvidia", "PC");
        System.out.println(pc);

    }
}
