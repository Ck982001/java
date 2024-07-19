class Agarbathi{
    String brandName;
    int noOfSticks;
    String fragrance;
    double price;
    public boolean pooja(String brandName,int noOfSticks,String fragrance,double price){
        boolean isAgarbathiCreated = false;
        if(brandName != null && noOfSticks != 0 && fragrance != null && price != 0.0){
            this.brandName = brandName;
            this.noOfSticks = noOfSticks;
            this.fragrance = fragrance;
            this.price = price;
            isAgarbathiCreated = true;
        }
        return isAgarbathiCreated;
    }
    public void getDetails(){
        System.out.println(this.brandName);
        System.out.println(this.noOfSticks);
        System.out.println(this.fragrance);
        System.out.println(this.price);

    }
}