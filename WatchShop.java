import java.util.Arrays;

class WatchShop {
static String watchBrands[] = {null, null, null, null, null, null, null, null, null};
static int index;

        public static boolean addWatchBrand(String brandName) {
        boolean isAddWatchBrand = false;
        if (brandName != null) {
        watchBrands[index] = brandName;
        index++;
       isAddWatchBrand = true;
        } else {
            System.out.println("Enter a valid Watch Brand Name");
   }
        return isAddWatchBrand;
    }

    public static boolean updateWatchBrand(String oldBrand, String newBrand) {
    System.out.println("Update Watch Brands started");
     boolean isBrandUpdated = false;
     for (int i = 0; i < watchBrands.length; i++) {
     if (oldBrand.equals(watchBrands[i])) {
        watchBrands[i] = newBrand;
      isBrandUpdated = true;
}
 }
        if (!isBrandUpdated) {
            System.out.println(oldBrand + " Not Found");
        }
        System.out.println("Update operation ended");
        return isBrandUpdated;
    }

    public static boolean deleteWatchBrand(String brandNameToBeDeleted) {
        System.out.println("Delete method started");
        boolean isBrandDeleted = false;
        int newIndex, oldIndex;
        for (newIndex = 0, oldIndex = 0; oldIndex < watchBrands.length; oldIndex++) {
            if (!brandNameToBeDeleted.equals(watchBrands[oldIndex])) {
           watchBrands[newIndex] = watchBrands[oldIndex];
          newIndex++;
                isBrandDeleted = true;
            }
        }
        watchBrands = Arrays.copyOf(watchBrands, newIndex);

        if (!isBrandDeleted) {
            System.out.println(brandNameToBeDeleted + " Not found");
        }
        System.out.println("Delete operation ended");
        return isBrandDeleted;
    }

    public static void getWatchBrands() {
        for (String watchBrand : watchBrands) {
            System.out.println(watchBrand);
        }
}
}


