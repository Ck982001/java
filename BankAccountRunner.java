class BankAccountRunner{
    public static void main(String[] account){
        BankAccount.credit(500000.00);
        double totalBalance=BankAccount.getDetails();
        System.out.println("The available balance is "+totalBalance);
        
        BankAccount.debit(2000000.00);
        totalBalance=BankAccount.getDetails();
        System.out.println("The available balance is "+totalBalance);
    }
}