class WatchShopRunner {
    public static void main(String[] args) {
    boolean isAdded = WatchShop.addWatchBrand("Rolex");
    isAdded = WatchShop.addWatchBrand("Omega");
    isAdded = WatchShop.addWatchBrand("Tag Heuer");
isAdded = WatchShop.addWatchBrand("Titan");

        if (isAdded) {
            System.out.println("Enter the Watch Brands:");
        }

        WatchShop.getWatchBrands();

boolean isUpdated = WatchShop.updateWatchBrand("Omega", "Seiko");
System.out.println("The brands are updated: " + isUpdated);
        WatchShop.getWatchBrands();

        boolean isDeleted = WatchShop.deleteWatchBrand("Tag Heuer");
        System.out.println("The brands are deleted: " + isDeleted);
        WatchShop.getWatchBrands();
}
}