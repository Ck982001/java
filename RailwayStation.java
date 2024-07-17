class RailwayStation{
           static String Name;
           static int NOT;
           static String from;
           static String dest;
           static String time;

               public static void issueTicket(String name,int noOfTickets,String source,String destination,String time){
                       Name=name;
                       NOT=noOfTickets;
                       from=source;
                       dest=destination;
                       time=time;
               }
               public static void getTicket(){
                System.out.println("name:"+Name);
                System.out.println("No of Tickets:"+NOT);
                System.out.println("From:"+from);
                System.out.println("To:"+ dest);
                System.out.println("Timings:"+time);
               }
}