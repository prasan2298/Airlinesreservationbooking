package com.company;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Ticket_reserve tr=new Ticket_reserve();
        Scanner scanner = new Scanner(System.in);
        Ticket_reserve ticket_reserve [];
        System.out.println("WELCOME TO AIRLINES TICKET BOOKING\n");
        
        System.out.println("  Available Flights are....");
        tr.getFlightName();
        System.out.println("Enter The Flight Name:");
        String flightName=scanner.nextLine();
        System.out.println("Available Flight Tickets Are:\n"+tr.getCount());
        System.out.print("Enter The Age Above 18:\n");
        int age = scanner.nextInt();
        if(checkage(age)) {
            System.out.print("Enter Number Of Tickets :\n ");
            int ticketCount;
            ticketCount=scanner.nextInt();
            ticket_reserve=new Ticket_reserve[ticketCount];
            if(checkTicket(ticketCount)){
                String name;
                int UserAge;
                for(int i=0;i<ticketCount;i++){
                    ticket_reserve[i]=new Ticket_reserve();
                    System.out.print("Enter Name of the User "+(i+1)+" :\n");
                    scanner.nextLine();
                    name=scanner.nextLine();
                    System.out.print("Enter Age of the User "+(i+1)+" :\n");
                    UserAge = scanner.nextInt();
                    ticket_reserve[i].setName(name);
                    ticket_reserve[i].setAge(UserAge);
                    ticket_reserve[i].setCount();
                }
                //System.out.println(".....Thank You For Booking.....");
                System.out.println("\nYour Tickets Booked Successfully !!!");
                System.out.println("Remaining Ticket available :"+tr.getCount());
                System.out.println("\nThe User details are ....");
                for(int i=0;i<ticketCount;i++){
                    System.out.println( "Name : "+ticket_reserve[i].getName());
                    System.out.println("Age : "+ticket_reserve[i].getAge());
                }
                System.out.println(".....Thank You For Booking.....");
            }else
                System.out.println("Tickets not available");
        }
    }

    private static boolean checkTicket(int ticketCount) {
        Ticket_reserve tr=new Ticket_reserve();
        if(ticketCount <= tr.getCount()){
            return true;
        }else
            return false;
    }


    private static boolean checkage(int age) {
        if(age<18){
            System.out.println("Your age is "+age+",your not qualified to book ticket");
            return false;
        }
        else
            return true;
    }
}