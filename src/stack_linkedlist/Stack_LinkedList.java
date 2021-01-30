
package stack_linkedlist;
import java.util.Scanner;

/**
 *
 * @author javadaminkp
 */
public class Stack_LinkedList {

    public static void main(String[] args) {
     
        System.out.println("Program developed by: Jawad Amin");
        Scanner askme = new Scanner(System.in);

        
        
        
        stackADT Stack = new stackADT();

        //menu for this app
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("-------------STACK ELABORATION---------------");

        System.out.print("Enter 1 > Push an element to stack: \n");
        System.out.print("Enter 2 > Pop element from stack: \n");
        System.out.print("Enter 3 > Display the current stack: \n");
        System.out.print("Enter 4 > Exit the App: \n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int option;

        do {
            
            
            
            
            System.out.print("Enter your choice:");

            System.out.println("");

            option = askme.nextInt();

            System.out.println("");

            if (option == 1) {

                int number;
                System.out.print("Enter number to push: \n");
                number = askme.nextInt();

                Stack.Push(number);

                System.out.println("");

            } else if (option == 2) {

                Stack.Pop();

            } else if (option == 3) {

                Stack.Display();
            }
        } while (option != 4);

        System.out.println("Program Terminated : )");
        
        
    }
    
}
