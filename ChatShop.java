import java.util.*;
class ChatShop{
      static String  chatNames[]={null,null,null,null,null,null};
      static double chatPrice[]={0.0,0.0,0.0,0.0,0.0,0.0};
      static int index;
      static int index1;
      static String ShopName="LCM";
      

      public static boolean   createChatName(String chatName){
          boolean  isChatNameAdded=false;
            if(chatName != null){
                
                    chatNames[index]=chatName;
                    index++;
                    isChatNameAdded=true;
                
            }else System.out.println("Add valid chat name,null is not valid");
           return  isChatNameAdded;
          }
    public static boolean addChatPrice(double price){
        boolean isChatPriceAdded = false;
        if(price > 0.0){
                   chatPrice[index1] = price;
                   index1++;
                   isChatPriceAdded=true;
        }else System.out.println("Add valid chat name,null is not valid");
    return isChatPriceAdded;
    }
      public static void getChatNames(){
        for(String chatname:chatNames) System.out.println(chatname);
        
      } 
      public static void getChatPrice(){
        for(double chatprice:chatPrice) System.out.println(chatprice);
        
      } 
      public static void getDetails(){
        System.out.println("Shop Name is: " + ShopName);
      }  

    public static boolean updateChatName(String oldChatName,String newChatName){
        boolean ischatNameUpdated = false;
        int Index;
        for( Index=0;Index < chatNames.length ; Index++){
            if(oldChatName == chatNames[Index]){
                  chatNames[Index]=newChatName;
                  ischatNameUpdated = true;  
            }
        }    
            if(ischatNameUpdated == false){
                System.out.println("Element not updated.");
            }
        
        return ischatNameUpdated;
    }

        public static boolean deleteChatName(String elementtobedeleted) {
        boolean isElementDeleted = false;
        int oldIndex,newIndex;
        for(oldIndex=0,newIndex=0; oldIndex <chatNames.length;oldIndex++){
            if( elementtobedeleted != chatNames[oldIndex]){
                         chatNames[newIndex]= chatNames[oldIndex];
                         newIndex++;
            }else(chatNames!=null){
          isElementDeleted = true;  
        }
        }
        chatNames = Arrays.copyOf(chatNames,newIndex);
        
        if(isElementDeleted == false){
            System.out.println(isElementDeleted+"Element not found.");
        }
        return isElementDeleted;
      }
}