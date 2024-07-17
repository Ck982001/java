import java.util.Arrays;

class Liberty {
static String shoeBrands[] = {null, null, null, null};
static int index;

public static boolean addShoeBrand(String brandName) {
        boolean isAddShoeBrand = false;
        if (brandName != null) {
shoeBrands[index] = brandName;
index++;
isAddShoeBrand = true;
        }
else {
            System.out.println("Enter a valid Shoe Brand Name");
        }
        return isAddShoeBrand;
    }

public static boolean updateShoeBrand(String oldBrand, String newBrand) {
System.out.println("Update Shoe Brands started");
boolean isBrandUpdated = false;
for (int i = 0; i < shoeBrands.length; i++) {
if (oldBrand.equals(shoeBrands[i])) {
shoeBrands[i] = newBrand;
isBrandUpdated = true;
}
}
        if (!isBrandUpdated) {
            System.out.println(oldBrand + " Not Found");
        }
        System.out.println("Update operation ended");
        return isBrandUpdated;
    }

    public static boolean deleteShoeBrand(String brandNameToBeDeleted) {
        System.out.println("Delete method started");
        boolean isBrandDeleted = false;
        int newIndex, oldIndex;
        for (newIndex = 0, oldIndex = 0; oldIndex < shoeBrands.length; oldIndex++) {
            if (!brandNameToBeDeleted.equals(shoeBrands[oldIndex])) {
                shoeBrands[newIndex] = shoeBrands[oldIndex];
                newIndex++;
                isBrandDeleted = true;
            }
        }
        shoeBrands = Arrays.copyOf(shoeBrands, newIndex);

        if (!isBrandDeleted) {
            System.out.println(brandNameToBeDeleted + " Not found");
        }
        System.out.println("Delete operation ended");
        return isBrandDeleted;
    }

    public static void getShoeBrands() {
        for (String shoeBrand : shoeBrands) {
            System.out.println(shoeBrand);
        }
    }
}
