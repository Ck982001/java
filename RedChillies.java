import java.util.Arrays;
class RedChillies{
static String movies[]={null,null,null,null,null,null,null,null};
static int index;

public static boolean addMovieActors(String movieName){
boolean ismovienamecreated=false;
  if(movieName!=null){
   movies[index]= movieName;
   index++;
    ismovienamecreated=true;
  }
else{
   System.out.println("Enter valid Names");
   }
return ismovienamecreated;

}
public static boolean updateActors(String oldmovie,String newmovie){
System.out.println("Update movies started");
boolean ismovieUpdated=false;
for(int index=0;index < movies.length;index++){
if(oldmovie==movies[index]){
movies[index]=newmovie;
ismovieUpdated=true;
}else(ismovieUpdated==false){
System.out.println(oldmovie +"Not Found");
}
}

System.out.println("update operation ended");
return ismovieUpdated;
}

public static boolean deleteActors(String movietobeDeleted){
System.out.println("delete method started");
boolean ismoviedeleted=false;
int newindex,oldindex;
for(newindex=0,oldindex=0;oldindex < movies.length;oldindex++){
if(movies[oldindex]!=movietobeDeleted){
movies[newindex]=movies[oldindex];
newindex++;
}
}
movies=Arrays.copyOf(movies,newindex);
if(movietobeDeleted!=null){
ismoviedeleted=true;
}
if(ismoviedeleted==false){
System.out.println(ismoviedeleted+"Not found");
}
System.out.println("delete operation ended");
return ismoviedeleted;
}


public static void getMovieActors(){
for(String movieName:movies)
System.out.println(movieName);

}
   }




