package Projects;

import java.util.Scanner;

public class Showroom implements Utility{

    String Showroom_name;

    String Showroom_address;

    int total_employees;

    int total_cars_instock = 0;

    String mananger_name;

@Override
 public void get_details(){
    System.out.println("Showroom_name:" + Showroom_name);
    System.out.println("Showroon_address: " + Showroom_address);
    System.out.println("Total_employess:" + total_employees);
    System.out.println("Total_cars_instock: " +total_cars_instock);
    System.out.println("Mananger_name:" + mananger_name);
 }

 @Override
 public void set_details(){
    Scanner sc =  new Scanner(System.in);
    System.out.println("********************** Enter Showroom Details: ************************ ");
    System.out.println();
    System.out.println("SHOWROOM NAME: ");
    Showroom_name = sc.nextLine();
    System.out.println("SHOWROOM ADDRESS: ");
    Showroom_address = sc.nextLine();
    System.out.println("TOTAL_EMPLOYEES: ");
    total_employees =sc.nextInt();
    System.out.println("TOTAL_CARS_INSTOCK: ");
    total_cars_instock = sc.nextInt();
    System.out.println("MANANGER NAME: ");
    mananger_name = sc.nextLine();

 }

    
}
