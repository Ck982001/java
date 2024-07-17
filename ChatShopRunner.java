class ChatShopRunner{
    public static void main(String[]  shop){
        ChatShop.getDetails();
   boolean isAdded =    ChatShop.createChatName("Pani Puri");
   boolean Price =    ChatShop.addChatPrice(35.0);
    isAdded =    ChatShop.createChatName("Masala Puri");
    Price =    ChatShop.addChatPrice(40.0);
    isAdded =    ChatShop.createChatName("Nipat Masala");
    Price =    ChatShop.addChatPrice(30.0);
    isAdded =    ChatShop.createChatName("Bhel Puri");
    Price =    ChatShop.addChatPrice(45.0);
    isAdded =    ChatShop.createChatName("Sev Puri");
    Price =    ChatShop.addChatPrice(40.0);
    isAdded =    ChatShop.createChatName("Dahi Puri");
    Price =    ChatShop.addChatPrice(35.0);
    
        if(isAdded == true && Price==true){
            System.out.println("The Menu is");
           } 
    System.out.println("Create operation");    
    ChatShop.getChatNames();
    ChatShop.getChatPrice();
    System.out.println("Update operation");
    ChatShop.updateChatName("Masala Puri","Vada");
    ChatShop.getChatNames();
    System.out.println("Deletion operation");
    ChatShop.deleteChatName("Bhel Puri");
     ChatShop.getChatNames();
   
}
}