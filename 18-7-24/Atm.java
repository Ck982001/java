class Atm {
    String name;
    int noOfRooms;

    public boolean setupAtm(String name, int noOfRooms) {
        boolean isAtmCreated = false;
        if (name != null && !name.isEmpty() && noOfRooms > 0) {
            this.name = name;
            this.noOfRooms = noOfRooms;
            isAtmCreated = true;
        }
        return isAtmCreated;
    }

    public void getDetails() {
        System.out.println("ATM Name: " + this.name);
        System.out.println("Number of Rooms: " + this.noOfRooms);
    }   
}