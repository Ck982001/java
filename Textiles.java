import java.util.Arrays;

class Textiles {
static String materialBrands[] = {null, null, null, null};
static int index;

public static boolean addMaterialBrand(String brandName) {
boolean isAddMaterialBrand = false;
if (brandName != null) {
materialBrands[index] = brandName;
index++;
isAddMaterialBrand = true;
} else {
System.out.println("Enter a valid Material Brand Name");
}
return isAddMaterialBrand;
    }

public static boolean updateMaterialBrand(String oldBrand, String newBrand) {
System.out.println("Update Material Brands started");
boolean isBrandUpdated = false;
for (int i = 0; i < materialBrands.length; i++) {
if (oldBrand.equals(materialBrands[i])) {
materialBrands[i] = newBrand;
isBrandUpdated = true;
            }
        }
        if (!isBrandUpdated) {
            System.out.println(oldBrand + " Not Found");
        }
        System.out.println("Update operation ended");
        return isBrandUpdated;
    }

    public static boolean deleteMaterialBrand(String brandNameToBeDeleted) {
        System.out.println("Delete method started");
        boolean isBrandDeleted = false;
        int newIndex, oldIndex;
        for (newIndex = 0, oldIndex = 0; oldIndex < materialBrands.length; oldIndex++) {
            if (!brandNameToBeDeleted.equals(materialBrands[oldIndex])) {
                materialBrands[newIndex] = materialBrands[oldIndex];
                newIndex++;
                isBrandDeleted = true;
            }
        }
        materialBrands = Arrays.copyOf(materialBrands, newIndex);

        if (!isBrandDeleted) {
            System.out.println(brandNameToBeDeleted + " Not found");
        }
        System.out.println("Delete operation ended");
        return isBrandDeleted;
    }

    public static void getMaterialBrands() {
        for (String materialBrand : materialBrands) {
            System.out.println(materialBrand);
        }
    }
}
