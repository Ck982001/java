class Hospital {
    static int patientId;
    static String patientName;
    static int patientAge;
    static String admissionDate;
    static String diagnosis;

    public static void admitPatient(int patientId, String patientName, int patientAge, String admissionDate, String diagnosis) {
        Hospital.patientId = patientId;
        Hospital.patientName = patientName;
        Hospital.patientAge = patientAge;
        Hospital.admissionDate = admissionDate;
        Hospital.diagnosis = diagnosis;
    }

    public static void getPatientDetails() {
        System.out.println("Patient Id: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Age: " + patientAge);
        System.out.println("Admission Date: " + admissionDate);
        System.out.println("Diagnosis: " + diagnosis);
    }
}
