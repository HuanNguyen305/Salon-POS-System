import java.util.*;

public class Inventory{
   
   public static void main(String[] args){
     //initallize statement
     User theUser = new User();
     theUser.Menu();
   }
   
   // create a new list of items
   public static void createItemList(Item[] itemList, Scanner kb){
      String name;
      double wholeSalesPrice;
      double salesPrice;
      int amountInStock;
      for(int i = 0; i<itemList.length; i++){
         System.out.print("Item Name: ");
         name = kb.next();
         
         System.out.print("Item's Whole Sales Price: ");
         wholeSalesPrice = kb.nextDouble();
         
         System.out.print("Item's Sales Price: ");
         salesPrice = kb.nextDouble();
         
         System.out.print("Stock Amount: ");
         amountInStock = kb.nextInt();
         
         itemList[i] = new Item(name, wholeSalesPrice, salesPrice, amountInStock);
      }
   }
   
   //display category list
   public static void printCategoryList(Category[] categoryList){
      for(int i=0; i<categoryList.length; i++){
         if(!(categoryList[i]==null)){
            System.out.print((i+1)+categoryList[i].getName+": ");
         }
      }
   }
   
   // new user set up
   public static void userSetUp(Category[] categoryList, Scanner kb){
      System.out.print("Number of Categories: ");
      int categoriesNum =  kb.nextInt();
      String temp;
      
      for(int i = 0; i<categoriesNum; i++){
         System.out.print("Category number "+(i+1)+" name: ");
         temp = kb.next();
         categoryList[i] = new Category(temp);
      }
   }
   
}