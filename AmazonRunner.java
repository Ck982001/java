class AmazonRunner{

    public static void main(String[] create){
       boolean isAccountCreated= Amazon.createAccount("Chandana","K",7022749707L,"ck982001@gmail.com","Ck123%^","Ck123%^");
        if(isAccountCreated==true){
        Amazon.getDetails();
        }
        
    }
}