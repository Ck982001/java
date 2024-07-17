class AxisBank{
   static String customerName;
   static String emailId;
   static long phone;
   static String adhaarNum;
   static String panNum;
   static String dateOfBirth;
   static int agee;
   static String nomineName;
   static String currentAddress;
   static String bankAccountType;

    public static boolean  createAccount(String name,String email,long phoneNum,String adhaarNo,String panNo,String dob,int age,String nomine,String address,String accountType){
        
        boolean isAccountCreated = false;
        boolean isNameValid = false;
        boolean isemailValid = false;
        boolean isphoneNumValid =false;
        boolean isadhaarValid = false;
        boolean ispanNumValid = false;
        boolean isdobValid = false;
        boolean isageValid=false;
        boolean isnomineValid=false;
        boolean isaddressValid= false;
        boolean isaccountTypeValid=false;
         // validation using default values
            if(name!= null ){
                customerName  =    name;
                isNameValid = true;
            }else{
                System.out.println("Please enter proper name");
            }
            if(email != null){
                 emailId      =    email;
           isemailValid       = true;
            }else{
                System.out.println("Please enter proper email id");
            }
            if(phoneNum!= 0){
                phone       =    phoneNum;
           isphoneNumValid  =   true;
            }else{
                System.out.println("Please enter proper phone number");
            }
            if(adhaarNo != null){
                 adhaarNum    =    adhaarNo;
             isadhaarValid    = true;
            }else{
                System.out.println("Please enter proper adhaar number");
            }
            if(panNo!= null){
                panNum       =    panNo;
                ispanNumValid= true;
            }else{
                System.out.println("Please enter proper pan number");
            }
            if(dob!= null){
                 dateOfBirth =    dob;
                isdobValid= true;
            }else{
                System.out.println("Please enter proper date of birth");
            }
            if(age!= 0){
                 agee         =    age;
                isageValid= true;
            }else{
                System.out.println("Please enter proper age");
            }
            if(nomine!= null){
                 nomineName    =    nomine;
                isnomineValid= true;
            }else{
                System.out.println("Please enter proper nomine name");
            }  
            if(address!= null){
                  currentAddress =    address;
                isaddressValid= true;
            }else{
                System.out.println("Please enter proper address");
            }     
            if(accountType != null){
                 bankAccountType   =    accountType;
                 isaccountTypeValid = true;
            } else{
                System.out.println("Please enter valid account type");
            } 
            if( isNameValid && isemailValid && isphoneNumValid && isadhaarValid && ispanNumValid && isdobValid && isageValid && isnomineValid && isaddressValid && isaccountTypeValid) {
               isAccountCreated  =    true;
               System.out.println("account created");
           }else{
              System.out.println("Check the values entered");
           }
         
        return isAccountCreated;
            }
            public static void getAccountDetails(){
                System.out.println("Name:"+customerName);
                System.out.println("Email Id:"+emailId);
                System.out.println("Phone number:"+phone);
                System.out.println("Adhaar Number:"+adhaarNum);
                System.out.println("Pan Number:"+panNum);
                System.out.println("Date of Birth:"+dateOfBirth);
                System.out.println("Age:"+agee);
                System.out.println("Nomine Name:"+nomineName);
                System.out.println("Address: "+currentAddress);
                System.out.println("Account Type: "+bankAccountType);
                


            }
}