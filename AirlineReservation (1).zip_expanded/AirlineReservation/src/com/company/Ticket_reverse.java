package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Ticket_reserve {
    public String Name;
    public int age;
    private static int count=100;
    private static String[] flightName={"SPICEJET","AIRINDIA","DECON","INDIGO","AIRLINES"};
    public Ticket_reserve(String name, int age) {
        this.Name = name;
        this.age = age;
    }

    public static void getFlightName() {
        for(String fn:flightName)
        {
            System.out.println("\t"+fn+"\n");
        }
//        return flightName;
    }

    public static void setFlightName(String[] flightName) {
        Ticket_reserve.flightName = flightName;
    }

    public void setCount() {
        count = count-1;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ticket_reserve() {
        return ;
    }

}

