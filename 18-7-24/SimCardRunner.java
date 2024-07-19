class SimCardRunner {
    public static void main(String[] args) {
        SimCard simCard1 = new SimCard();
        simCard1.setup("Verizon", "Unlimited Plan");
        simCard1.getDetails();
        simCard1.communication();

        SimCard simCard2 = new SimCard();
        simCard2.setup("AT&T", "Family Plan");
        simCard2.getDetails();
        simCard2.communication();

        SimCard simCard3 = new SimCard();
        simCard3.setup("T-Mobile", "Prepaid Plan");
        simCard3.getDetails();
        simCard3.communication();

        SimCard simCard4 = new SimCard();
        simCard4.setup("Sprint", "Basic Plan");
        simCard4.getDetails();
        simCard4.communication();

        SimCard simCard5 = new SimCard();
        simCard5.setup("Boost Mobile", "Pay As You Go");
        simCard5.getDetails();
        simCard5.communication();

        SimCard simCard6 = new SimCard();
        simCard6.setup("MetroPCS", "Unlimited Talk & Text");
        simCard6.getDetails();
        simCard6.communication();

        SimCard simCard7 = new SimCard();
        simCard7.setup("Cricket Wireless", "Unlimited Data");
        simCard7.getDetails();
        simCard7.communication();

        SimCard simCard8 = new SimCard();
        simCard8.setup("US Cellular", "Shared Data Plan");
        simCard8.getDetails();
        simCard8.communication();

        SimCard simCard9 = new SimCard();
        simCard9.setup("Virgin Mobile", "Unlimited Everything");
        simCard9.getDetails();
        simCard9.communication();

        SimCard simCard10 = new SimCard();
        simCard10.setup("Simple Mobile", "No Contract Plan");
        simCard10.getDetails();
        simCard10.communication();
    }
}
