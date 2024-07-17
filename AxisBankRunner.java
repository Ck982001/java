class AxisBankRunner{
    public static void main(String account[]){
       boolean isAccountCreated = AxisBank.createAccount("Sony","sony123@gmail.com",9875432876L,"654321768654","5465SFA25","12/5/23",45,"Maya","Bangalore","Savings");
       if(isAccountCreated == true){
            AxisBank.getAccountDetails();
       }else{
          System.out.println("Please enter valid details.");
       }
       
    }
}