class TextilesRunner {
public static void main(String[] args) {
boolean isAdded = Textiles.addMaterialBrand("Raymond");
isAdded = Textiles.addMaterialBrand("Arvind");
isAdded = Textiles.addMaterialBrand("Vimal");

if (isAdded) {
System.out.println("Enter the Material Brands:");
}

Textiles.getMaterialBrands();

boolean isUpdated = Textiles.updateMaterialBrand("Arvind", "Siyaram");
System.out.println("The brands are updated: " + isUpdated);
Textiles.getMaterialBrands();

boolean isDeleted = Textiles.deleteMaterialBrand("Vimal");
System.out.println("The brands are deleted: " + isDeleted);
Textiles.getMaterialBrands();
}
}