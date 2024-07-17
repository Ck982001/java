class GoldShopRunner{
public static void main(String args[]){
boolean isAdded=GoldShop.createGoldItems("Bangles");
System.out.println("Added gold item is:"+isAdded);

isAdded=GoldShop.createGoldItems("Anklet");
System.out.println("Added gold item is:"+isAdded);

isAdded=GoldShop.createGoldItems("Necklace");
System.out.println("Added gold item is:"+isAdded);

isAdded=GoldShop.createGoldItems("Earrings");
System.out.println("Added gold item is:"+isAdded);

isAdded=GoldShop.createGoldItems("Chain");
System.out.println("Added gold item is:"+isAdded);

isAdded=GoldShop.createGoldItems("Nose pin");
System.out.println("Added gold item is:"+isAdded);

isAdded=GoldShop.createGoldItems("Bracelet");
System.out.println("Added gold item is:"+isAdded);


GoldShop.getGoldItems();
boolean isUpdated=GoldShop.updateGoldItems("Chain","Armlet");
System.out.println("The gold Item is"+isUpdated);
GoldShop.getGoldItems();

boolean isDeleted=GoldShop.deleteGoldItems("Nose pin");
System.out.println("The gold Item is"+isDeleted);
GoldShop.getGoldItems();
}
}
