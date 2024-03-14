package Projects;

import java.util.Scanner;

interface Utility{

    public void get_details();
    public void set_details();

}


public class MainTest {
    static void main_menu(){
    
        System.out.println("******************* SHOWROOM MANAGEMENT SYSTEM: ********************** ");
        System.out.println();
        System.out.println("ENTER YOUR CHOICE: ");
        System.out.println();
        System.out.println("1]. ADD SHOWROOM  \t\t\t  2]. ADD EMPLOYEES  \t\t\t 3]. ADD CARS ");
        System.out.println();
        System.out.println("4]. GET SHOWROOM  \t\t\t  5]. GET EMPLOYEES  \t\t\t 6]. GET CARS ");
        System.out.println();
        System.out.println( "******************* ENTER 0 FOR EXIT ");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Showroom showroom[] = new Showroom[5];    //Showroom is a class and we are passing Arraytype object to it 
        Employees employees[] = new Employees[5]; //Employees is a class and we are passing Arraytype object to it
        Cars cars[] = new Cars[5];                //Cars is a class and we are passing Arraytype object to it

        int car_counter = 0;         // It is a variable car_counter and assigned value 0 to it
        int employee_counter = 0;    // It is a variable employee_counter and assigned value 0 to it 
        int showroom_counter = 0 ;   // It is a variable showroom_counter and assigned value 0 to it
          
        /* theses vaiable do : whenever we create an object it will increamnt by 1
         * so it will check that we are going at most to 5 not more than that or less than that 
         * [5] array size that we hardcode it  
         * so it will not through any error "Arrayindexoutofboundlike" we go above the size of an array 
         */

        int choice = 100;     //choice is a variable we assigned value 100 to it

        while(choice!=0){

            main_menu();

            choice = sc.nextInt();

            while(choice!=9 && choice!=0){
                switch (choice) {
                    case 1:
                         showroom[showroom_counter] = new Showroom(); //[showroom_counter is index numb of an srray of type showroom]
                         showroom[showroom_counter].set_details();
                         showroom_counter++;  // we will increament it because we will continue to move on next index of an array which is 1 ten 2 then 3 then 4.
                         System.out.println();
                         System.out.println("1]. ADD NEW SHOWROOM ");
                         System.out.println("9].GO BACK TO MAIN MENU");
                         choice =sc.nextInt();
                        break;
                    case 2: 
                    employees[employee_counter] = new Employees();
                    employees[employee_counter].set_details();
                    employee_counter++;
                    System.out.println();
                    System.out.println("2].ADD EMPLOYEES");
                    System.out.println("9].GO BACK TO MAIN MENU ");
                    choice = sc.nextInt();
                    break;

                    case 3:
                      cars[car_counter] = new Cars();
                      cars[car_counter].set_details();
                      car_counter++;
                      System.out.println();
                      System.out.println("3].ADD CARS");
                      System.out.println("9].GO BACK TO MAIN MENU");
                      choice =sc.nextInt();
                      break;

                    case 4:
                       for(int i=0;i<showroom_counter;i++){
                        showroom[i].get_details();
                        System.out.println();
                        System.out.println();

                       }
                       System.out.println("9]. GO BACK TO MAIN MENU");
                       System.out.println("0]. EXIT");
                       choice = sc.nextInt();
                       break;

                    case 5:
                    
                    for(int i = 0;i<employee_counter;i++){
                     employees[i].set_details();
                     System.out.println();
                     System.out.println();
                    }

                    System.out.println("9]. GO BACK TO MAIN MENUE");
                    System.out.println("0]. EXIT");
                    choice =sc.nextInt();
                    break;

                    case 6:
                    for(int i =0;i<car_counter;i++){
                        cars[i].set_details();
                        System.out.println();
                        System.out.println();
                       
                    } 
                    System.out.println("9]. GO BACKE TO MAIN MENUE");
                    System.out.println("0]. EXIT");
                    choice = sc.nextInt();
                    break;

                    default:
                    System.out.println("ENTER VALID CHOICE: ");
                        break;
                }

            }


        }

    }

    
}
 