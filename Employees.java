package Projects;

import java.util.Scanner;
import java.util.UUID;

class Employees extends Showroom implements Utility {

    String emp_id;

    String emp_name;

    int emp_age;

    String emp_department;

    public void get_details(){
     System.out.println("Employee_id : " + emp_id);
     System.out.println("Employee name: " +emp_name);
     System.out.println("Employee age: " + emp_age);
     System.out.println("Employee department: " + emp_age);

    }
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();  //UUID is a class in java uuid is unique id like we donnt need to increment it again and again it will randomly geneerate the id:
        emp_id = String.valueOf(uuid);
        System.out.println("************************* Enter Employee Details: ***********************");
        System.out.println();
        System.out.println("EMPLOYEE NAME: ");
         emp_name = sc.nextLine();
         System.out.println("EMPLOYEE AGE: ");
         emp_age = sc.nextInt();
         System.out.println("EMPLOYEE DEPARTMENT: ");
         emp_department = sc.nextLine();
         System.out.println("SHOWROOM NAME: " );
         Showroom_name =sc.nextLine();


    }
    
}
