import java.util.Scanner;

public class UserPrompt extends User{
   public static void Menu(){
      Scanner kb = new Scanner(System.in);
      int response;
      
      while(true){
         System.out.println("\n(1)Setting");
         System.out.println("(2)Check Inventory");
         System.out.println("(3)Restock Inventory");
         System.out.println("(4)Update and Exit");
         do{
            System.out.print("Response ->");
            response = kb.nextInt();
         }while(response>4 && response<1);
         
         switch(response){
            case 1:
               //setting();
               break;
            case 2:
               //checkInventory();
               break;
            case 3:
               //restockInventory();
               break;
            case 4:
               //update
               return;
            
         }
      }
   }
}