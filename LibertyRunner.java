class LibertyRunner {
public static void main(String[] args) {
boolean isAdded = Liberty.addShoeBrand("Nike");
isAdded = Liberty.addShoeBrand("Adidas");
isAdded = Liberty.addShoeBrand("Puma");

if (isAdded) {
System.out.println("Enter the Shoe Brands:");
}

Liberty.getShoeBrands();

boolean isUpdated = Liberty.updateShoeBrand("Adidas", "Reebok");
System.out.println("The brands are updated: " + isUpdated);
Liberty.getShoeBrands();

boolean isDeleted = Liberty.deleteShoeBrand("Puma");
System.out.println("The brands are deleted: " + isDeleted);
Liberty.getShoeBrands();
}
}
