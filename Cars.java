package Projects;

import java.util.Scanner;

public class Cars extends Showroom implements Utility {

    String car_name;

    String car_color;

    String car_fuel_type; 

    String car_type;

    String car_price;

    String car_transmission;


    public void get_details(){
        System.out.println("Car_Name: " +car_name );
        System.out.println("Car_Color: " +car_color);
        System.out.println("Car_fuel_type: " +car_fuel_type);
        System.out.println("Car_type: "+car_type);
        System.out.println("Car_price: " +car_price);
        System.out.println("Car_Transmission: " + car_transmission);

    }
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("************************ Enter Car Details: ***************************");
        System.out.println();
        System.out.println("Car_Name: ");
        car_name = sc.nextLine();
        System.out.println("Car_color: ");
        car_color = sc.nextLine();
        System.out.println("Car_fuel_type:");
        car_fuel_type = sc.nextLine();
        System.out.println("Car_type: ");
        car_type =sc.nextLine();
        System.out.println("Car_transmission: ");
        car_transmission =sc.nextLine();
        total_cars_instock++;
      

    }

}
