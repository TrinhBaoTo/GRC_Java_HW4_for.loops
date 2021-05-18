// Trinh To, CS141, Fall 2019, Section A
// Programming Assignment #4, 10/07/19

// This program's behavior is shows the amount of rice each day (for 30 days), 
//      and then gives the final amount of rice given all together.

public class HW4
{ //open class
	public static void main(String[] args)
   { //open main
   
   
      int count=0; //initialize count
      int total=0; //initialize toal
      
      
      for (int i=1; i<=2; i++) // loops counting rice for the first 2 days
      { //open loop
         count=count+1; //count how much rice receives day i
         total=total+count; //total rice counts
         System.out.println("Day # " + i + " - Rice count = " + count
                              + " - Total Rice count = " + total); //print the amount of rice receive day x, and gives the final amount of rice given all together.
      } //end loop
      
      
      for (int i=3; i<=30; i++) // loops counting rice from day 3 to day 30
      { //open loop
         count=count*2; //count how much rice receives day i
         total=total+count; //total rice counts
         System.out.println("Day # " + i + " - Rice count = " + count
                              + " - Total Rice count = " + total); //print the amount of rice receive day x, and gives the final amount of rice given all together.
      } //end loop
       
      
      System.out.print("Total Rice was "+ total); //print total amount of rice after 30 days
      
      
   } //end main
  
} //end class