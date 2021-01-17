import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    double discounted_amount, net_amount, ticket;
    System.out.println("SrNo\tName\tTicket Charges\tDiscount\tNet amount");
    for(int i = 1; i < 16; i++) {
      System.out.println("Enter your name: ");
      name = sc.next();
      System.out.println("Enter your ticket price: ");
      ticket = sc.nextDouble();
      if(ticket < 25001) {
        discounted_amount = ticket * 0.02;
        net_amount = ticket - discounted_amount;
      }
      else if(ticket >= 25001 && ticket <= 35000) {
        discounted_amount = ticket * 0.1;
        net_amount = ticket - discounted_amount;
      }
      else if(ticket >= 35001 && ticket <= 55000) {
        discounted_amount = ticket * 0.12;
        net_amount = ticket - discounted_amount;
      }
      else if(ticket >= 55001 && ticket <= 70000) {
        discounted_amount = ticket * 0.16;
        net_amount = ticket - discounted_amount;
      }
      else {
        discounted_amount = ticket * 0.18;
        net_amount = ticket - discounted_amount;
      }
      System.out.println(i + "\t" + name + "\t" + ticket + "\t" + discounted_amount + "\t" + net_amount);    
    }

  }
}