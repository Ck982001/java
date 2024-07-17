class Product{
          static int billId;
          static String productName;
          static double productCt;
          static String billDate;
          static double tot;

        public static void generateBill(int BillId,String productName,double productCost,String billDate,double total){
                 billId=BillId;
                 productName= productName;
                 productCt=productCost;
                 billDate=billDate;
                 tot=total;
         }
         public static void getBill(){
            System.out.println("Bill Id:"+billId);
            System.out.println("ProductName:"+productName);
            System.out.println("productCost:"+productCt);
            System.out.println("Bill Date:"+billDate);
            System.out.println("Total:"+tot);

         }

}