class Garden {
    String name;
    String place;

    public boolean setup(String name, String place) {
        boolean isGardenCreated = false;
        if (name != null && place != null) {
            this.name = name;
            this.place = place;
            isGardenCreated = true;
        }
        return isGardenCreated;
    }

    public void getDetails() {
        System.out.println(this.name);
        System.out.println(this.place);
    }

    public void gettingFreshAir() {
        System.out.println("Getting fresh air in the garden.");
    }
}
