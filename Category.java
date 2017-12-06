public class Category{
   String name;
   Item[] itemList = new Item[30];
   public Category(String name){
      this.name = name;
   }
   
   // setter 
   public void setName(String name){
      this.name = name;
   }
   public void setItemList(Item[] itemList){
      this.itemList = itemList;
   }
   
   // getter
   public String getName(){
      return name;
   }
   
   public Item[] getItemList(){
      return itemList;
   }
   
   // check if itemList is empty and return true is itemList is empty
   public boolean isEmpty(){
      if(itemList == null){
         return true;
      }else{
         return false;
      }
   }
   
   // to String: print name of category and everything in item list of category
   public String toString(){
      String s = "";
      s = name+"\n";
      for(int i = 0; i<itemList.length; i++){
         if(itemList[i]!=null){
            s = s + itemList[i].toString();
         }
      }
      return s;
   }
}