class GymRunner{

public static void main(String args[]){

boolean MyEquipments=Gym.createGymEquipment("Dumbbells");
MyEquipments=Gym.createGymEquipment("Treadmill");
MyEquipments=Gym.createGymEquipment("Stationary bicycle");
MyEquipments=Gym.createGymEquipment("Dipping Bars");
MyEquipments=Gym.createGymEquipment("Medicine ball");
MyEquipments=Gym.createGymEquipment("Leg Curl machine");
MyEquipments=Gym.createGymEquipment("Battle ropes");
MyEquipments=Gym.createGymEquipment("Kettlebell");

if(MyEquipments==true){
System.out.println("Enter the Equipments:");
}
Gym.getEquipmentNames();

boolean isUpdated=Gym.updateGymItems("Dumbbells","Ropes");
System.out.println("The gym Item is"+isUpdated);
Gym.getEquipmentNames();

boolean isDeleted=Gym.deleteGymItems("Treadmill");
System.out.println("The gym Item is"+isDeleted);
Gym.getEquipmentNames();
}
}