import java.util.Arrays;
class GoldShop{
static String name="Vasavi";
static String goldItems[]={null,null,null,null,null,null,null};
static int index;

public static boolean createGoldItems(String goldItem){
System.out.println("Create gold items started");
boolean isGoldItemCreated=false;
if(index<goldItems.length){
if(goldItem!=null){
goldItems[index]=goldItem;
index++;
isGoldItemCreated=true;
}
else{
System.out.println(" gold items are null");
}
}
else{
System.out.println(" gold items are full");
}
System.out.println("Create gold items ended");
return isGoldItemCreated;
}

public static boolean updateGoldItems(String oldGoldItem,String newGoldItem){
System.out.println("Update gold items started");
boolean isGoldItemUpdated=false;
for(int index=0;index<goldItems.length;index++){
if(oldGoldItem==goldItems[index]){
goldItems[index]=newGoldItem;
isGoldItemUpdated=true;
}
}
if(isGoldItemUpdated==false){
System.out.println(oldGoldItem+"Not Found");
}
System.out.println("update operation ended");
return isGoldItemUpdated;
}

public static boolean deleteGoldItems(String goldtobeDeleted){
System.out.println("delete method started");
boolean isgolddeleted=false;
int newindex,oldindex;
for(newindex=0,oldindex=0;oldindex<goldItems.length;oldindex++){
if(goldItems[oldindex]!=goldtobeDeleted){
goldItems[newindex]=goldItems[oldindex];
newindex++;

}
}
goldItems=Arrays.copyOf(goldItems,newindex);

if(goldtobeDeleted!=null){
isgolddeleted=true;
}
if(isgolddeleted==false){

System.out.println(isgolddeleted+"Not found");
}
System.out.println("delete operation ended");
return isgolddeleted;

}
public static void getGoldItems(){
System.out.println("available gold items are");
for(String MyGold:goldItems){
System.out.println(MyGold);
}
}
}





