public class User{
   String companyName;
   Category catList[] = new Category[20];//20 category is hardcoded
   String userID;
   String userPassword;
   
   public User(){
      companyName = "Company Name has not been Set";
      userID = "admin";
      userPassword = "password";
   }
   
   public boolean verifyAdmin(String id, String password){
      if(id.equalsIgnoreCase(userID) && password.equals(userPassword)){
         return true;
      }else{
         return false;
      }
   }
}