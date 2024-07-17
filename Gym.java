import java.util.Arrays;
class Gym{
static String gymEquipments[]={null,null,null,null,null,null,null,null};
static int index;

public static boolean createGymEquipment(String equipmentName){
boolean iscreateGymEquipment=false;
  if(equipmentName!=null){
   gymEquipments[index]=equipmentName;
   index++;
    iscreateGymEquipment=true;
  }
else{
   System.out.println("Enter valid Equipment Names");
   }
return iscreateGymEquipment;

}
public static boolean updateGymItems(String oldGymItem,String newGymItem){
System.out.println("Update gym items started");
boolean isgymItemUpdated=false;
for(int index=0;index<gymEquipments.length;index++){
if(oldGymItem==gymEquipments[index]){
gymEquipments[index]=newGymItem;
isgymItemUpdated=true;
}
}
if(isgymItemUpdated==false){
System.out.println(oldGymItem+"Not Found");
}
System.out.println("update operation ended");
return isgymItemUpdated;
}

public static boolean deleteGymItems(String gymitemtobeDeleted){
System.out.println("delete method started");
boolean isgymdeleted=false;
int newindex,oldindex;
for(newindex=0,oldindex=0;oldindex<gymEquipments.length;oldindex++){
if(gymEquipments[oldindex]!=gymitemtobeDeleted){
gymEquipments[newindex]=gymEquipments[oldindex];
newindex++;

}else(gymitemtobeDeleted!=null){
isgymdeleted=true;
}
}
gymEquipments=Arrays.copyOf(gymEquipments,newindex);


if(isgymdeleted==false){

System.out.println(isgymdeleted+"Not found");
}
System.out.println("delete operation ended");
return isgymdeleted;
}


public static void getEquipmentNames(){
for(String MyEquipmentName:gymEquipments)
System.out.println(MyEquipmentName);

}
   }




