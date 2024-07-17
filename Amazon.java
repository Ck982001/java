class Amazon{
     static String fName;
     static String lName;
     static long phoneNo;
     static String emailNo;
     static String password;
     static String confirmpassword;

       public static boolean createAccount(String firstName,String lastName,long phone,
         String email,String Password,String confirmPassword ){
            boolean isaccountCreated = false;
            boolean isfNameValid = false;
            boolean islNameValid = false;
            boolean isphoneNoValid = false;
            boolean isemailValid = false;
            boolean ispasswordValid = false;
            boolean isconfirmpasswordValid = false;
            if(firstName != null){
               fName = firstName;
               isfNameValid = true;
            }else{
               System.out.println("check 1");
            }
            if(lastName != null){
               lName = lastName;
               islNameValid = true;
            }else{
               System.out.println("check 2");
            }
            if(phone != 0){
               phoneNo = phone;
               isphoneNoValid = true;
            }else{
               System.out.println("check 3");
            }
            if(email != null){
               emailNo = email;
               isemailValid = true;
            }else{
               System.out.println("check 4");
            }
            if(Password != null){
               password = Password;
               ispasswordValid = true;
            }else{
               System.out.println("check 5");
            }
            if(confirmPassword != null){
               confirmpassword = confirmPassword;
               isconfirmpasswordValid = true;
            }else{
               System.out.println("check 6");
            }
     if(firstName != null && lastName != null&& phone != 0 && email != null && password != null && confirmPassword != null){
      isaccountCreated=true;
     }else{
      System.out.println("Check the values entered");
         }
         return isaccountCreated;
      }
         public static void getDetails(){
            System.out.println("The first name is:"+fName);
            System.out.println("The last name is:"+lName);
            System.out.println("The Phone number is:"+phoneNo);
            System.out.println("Email ID:"+emailNo);
            System.out.println("The password is:"+password);
            System.out.println("The confirmed password is:"+confirmpassword);
         }
}




