class RedChilliesRunner{

public static void main(String args[]){

boolean myActors = RedChillies.addMovieActors("Shah Rukh Khan");
myActors = RedChillies.addMovieActors("Kajol");
myActors = RedChillies.addMovieActors("Deepika Padukone");
myActors = RedChillies.addMovieActors("Anushka Sharma");
myActors = RedChillies.addMovieActors("Varun Dhawan");
myActors = RedChillies.addMovieActors("Kriti Sanon");
myActors = RedChillies.addMovieActors("Katrina Kaif");
myActors = RedChillies.addMovieActors("Alia Bhatt");
myActors = RedChillies.addMovieActors("John Abraham");

if(myActors == true){
System.out.println("Enter the Actors:");
}

RedChillies.getMovieActors();

boolean isUpdated=RedChillies.updateActors("Kriti Sanon","Samantha");
System.out.println("The  actors are"+isUpdated);
RedChillies.getMovieActors();

boolean isDeleted=RedChillies.deleteActors("Kajol");
System.out.println("The actors are"+isDeleted);
RedChillies.getMovieActors();
}
}
