/* This example show how to declare, create and initialize arrays

In Java, using an array is 3-step process i.e.

Declaring an Array
Constructing an Array
Initializing an Array

This could be done in seperate setps as well as one step, it depends on the program on hand
*/

package Arrays;
import java.util.Arrays; 
public class ArrayExample {
public static void main(String[] args){   
    
    //Declare an array 
    int[] myArray;

    //Constructing an Array
    myArray = new int[5];

    //Initializing an Array
    myArray[0] = 2000;
    myArray[1] = 1997;
    myArray[2] = 2014;
    myArray[3] = 2004;
    myArray[4] = 2018;
    

     //System.out.println("Original numeric array : "+ my_array1);
     System.out.println("Original numeric array : "+Arrays.toString(myArray));
     Arrays.sort(myArray);
     System.out.println("Sorted numeric array : "+Arrays.toString(myArray));

    //Array Delaration, construction, and assigning value in one step

    int[] my_array1 = {2000,1995,1997,2014,2004,2018};


            
    String[] progLanguages = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };   
    
    System.out.println("Original string array : "+Arrays.toString(progLanguages));
    Arrays.sort(progLanguages);
    System.out.println("Sorted string array : "+Arrays.toString(progLanguages));

    //Access specefic item in an array by using the item index
    System.out.println("We are learning " + progLanguages[0] + "in this cohort");

    //Values of an array can be changed
    progLanguages[4] = "JavaScript"
    System.out.println("from C Programming to  " + progLanguages[4] );


    }
}
