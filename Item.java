public class Item{
   String name;
   double wholeSalesPrice;
   double salesPrice;
   int amountInStock;
   
   public Item(String name, double wholeSalesPrice, double salesPrice, int amountInStock){
      this.name = name;
      this.wholeSalesPrice = wholeSalesPrice;
      this.salesPrice = salesPrice;
      this.amountInStock = amountInStock;
   }
   
   //Setter Methods
   public void setName(String name){
      this.name = name;
   }
   
   public void setWholeSalesPrice(){
      this.wholeSalesPrice = wholeSalesPrice;
   }
   
   public void setSalesPrice(){
      this.salesPrice = salesPrice;
   }
   
   public void setAmountInStock(){
      this.amountInStock = amountInStock;
   }
   //Getter Methods
   public String getName(){
      return name;
   }
   
   public double getWholeSalesPrice(){
      return wholeSalesPrice;
   }
   
   public double getSalesPrice(){
      return salesPrice;
   }
   
   public int getAmountInStock(){
      return amountInStock;
   }
   
   // to String method
   public String toString(){
      String s = ("Name: "+name+"\n");
      s = s + ("Whole Sales Price: "+wholeSalesPrice+"\n");
      s = s + ("Sales Price: "+salesPrice+"\n");
      s = s + ("Stock: "+amountInStock+"\n");
      return s;
   }
}