class SimCard {
    String name;
    String plan;

    public boolean setup(String name, String plan) {
        boolean isSimCardCreated = false;
        if (name != null && plan != null) {
            this.name = name;
            this.plan = plan;
            isSimCardCreated = true;
        }
        return isSimCardCreated;
    }

    public void getDetails() {
        System.out.println(this.name);
        System.out.println(this.plan);
    }

    public void communication() {
        System.out.println("The SIM card is being used for communication.");
    }
}
