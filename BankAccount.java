class BankAccount{
    static double balance;
    public static void credit(double amount){
        if(amount > 0 ){
        balance=balance+amount;
        System.out.println(amount+" is credited into your bank account");
        }else{
            System.out.println("add valid amount.");
        }
    }
    public static void debit(double amount){
        if(balance >= amount){
        balance=balance-amount;
        System.out.println(amount+" is debited from your bank account");
        }else
        System.out.println("Insufficient Balance.");
    }
    public static double getDetails(){
        return balance;
    }
}