class Battery {
    String name;
    double weight;

    public boolean setup(String name, double weight) {
        boolean isBatteryCreated = false;
        if (name != null && weight != 0.0) {
            this.name = name;
            this.weight = weight;
            isBatteryCreated = true;
        }
        return isBatteryCreated;
    }

    public void getDetails() {
        System.out.println(this.name);
        System.out.println(this.weight);
    }

    public void charge() {
        System.out.println("The battery is being charged.");
    }
}
