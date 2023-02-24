package session2;

import java.util.Scanner;
public class Prog{
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of Shirts to order"); 
     int shirts = sc.nextInt();
      System.out.println("Enter the number of Trousers to order");
      int trousers = sc.nextInt();
      
      int trouserCost = trousers * 250;
      int shirtsCost = shirts * 500;
      
      float totalCost = trouserCost +shirtsCost;
      float DiscountedPrice = 0.0f;
      if(totalCost>3000){
          
          float discount = totalCost *0.10f;
          DiscountedPrice = totalCost-discount;
          System.out.println("Total price "+totalCost); 
       System.out.println("Discount price "+DiscountedPrice);
    }else{
      
       System.out.println("Total Price "+totalCost); 
    }
    }

}
