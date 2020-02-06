/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalsigns;

import java.util.Scanner;

/**
 *
 * @author srush
 */
public class Patient {

    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private VitalSignHistory vitalSignsHistory;

    public Patient(String fullName) {
        this.fullName = fullName;
        this.vitalSignsHistory = new VitalSignHistory();
    }

    // Add a new vital sign
    public VitalSignHistory getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(VitalSignHistory vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }

    private PatientList patientList;

    public static void main(String[] args) {
        Patient mc = new Patient();
        mc.create();
    }

    public Patient() {
        this.patientList = new PatientList();
    }

    private void create() {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        int choice = 0;

        System.out.println("Hello and Welcome...!!!");

        printInstructions();

        while (!quit) {
            System.out.println("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addVitalSign();
                    break;
                case 2:
                    displayHistory();
                    break;
                case 3:
                    isThisVitalSignNormal();
                    break;
                case 4:
                    quit = true;
                    break;
            }
            printInstructions();
        }

    }

    public static void printInstructions() {
        System.out.println("\nSelect from below options: ");
        System.out.println("\t 0 - To Print choice options.");
        System.out.println("\t 1 - To Add new record. ");
        System.out.println("\t 2 - To Display records. ");
        System.out.println("\t 3 - To Check the vital signs status. ");
        System.out.println("\t 4 - To Quit the application.");
    }

    //Add vital signs
    public void addVitalSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patients full name: ");

        String patientFullName = scanner.nextLine();

        Patient patient = this.patientList.getPatient(patientFullName);

        System.out.println("\nNote: For Newborn enter value of age as 0 "
                + "and for less than 1 year i.e. 1-12 months enter value of age as 1.");
        System.out.println("Enter age here:");

        int age = scanner.nextInt();

       
        System.out.println("Enter Patients Respiratory Rate: ");
        double respiratoryRate = scanner.nextDouble();

        System.out.println("Enter Patients Heart Rate: ");
        double heartRate = scanner.nextDouble();

        System.out.println("Enter Patients Blood Pressure: ");
        double bloodPressure = scanner.nextDouble();

        System.out.println("Enter Patients Weight in Kgs: ");
        double weightInKgs = scanner.nextDouble();

        System.out.println("Enter Patients Weight in pounds: ");
        double weightInLbs = scanner.nextDouble();

        patient.addNewVitalSign(age, respiratoryRate, heartRate, bloodPressure, weightInKgs, weightInLbs);

        System.out.println("\nVital signs entry successful");

    }

    public void addNewVitalSign(int age, double respiratoryRate, double heartRate, double bloodPressure, double weightInKgs, double weightInLbs) {
        for (int i = 0; i < this.vitalSignsHistory.getVitalSignHistory().size(); i++) {
            VitalSign vs = this.vitalSignsHistory.getVitalSignHistory().get(i);
            if (vs.getIsIsRecent()) {
                vs.setIsRecent(false);
            }
        }

        VitalSign vitalSign = new VitalSign();
        vitalSign.setAge(age);
        vitalSign.setRespiratoryRate(respiratoryRate);
        vitalSign.setHeartRate(heartRate);
        vitalSign.setBloodPressure(bloodPressure);
        vitalSign.setWeightKg(weightInKgs);
        vitalSign.setWeightInPounds(weightInLbs);
        vitalSign.setIsRecent(true);
        this.vitalSignsHistory.addVital(vitalSign);
    }

    //Display vital signs
    private void displayHistory() {
        System.out.println("VitalSigns History: ");
        for (Patient p : this.patientList.getPatientList()) {
            System.out.println("\nPatient Name: " + p.getFullName());
            p.displayVitalSignsHistory();
        }
    }

    public void displayVitalSignsHistory() {
        
        for (int i = 0; i < this.vitalSignsHistory.getVitalSignHistory().size(); i++) {
            VitalSign vs = this.vitalSignsHistory.getVitalSignHistory().get(i);
            System.out.println("\nRecord No. " + (i + 1)+" :");
            System.out.println("Age: " + vs.getAge());
            System.out.println("Respiratory rate: " + vs.getRespiratoryRate());
            System.out.println("Heart rate: " + vs.getHeartRate());
            System.out.println("Blood pressure: " + vs.getBloodPressure());
            System.out.println("Weight in kgs: " + vs.getWeightKg());
            System.out.println("Weight in Pounds: \n" + vs.getWeightInPounds());
        }
    }

    // Check vital signs status      
    private void isThisVitalSignNormal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter patient's full name: ");

        String name = scanner.nextLine();

        System.out.println("Please enter your vital sign attribute: ");
        System.out.println("\n\"RespiratoryRate\"");
        System.out.println("\"HeartRate\"");
        System.out.println("\"BloodPressure\"");
        System.out.println("\"WeightInKg\"");
        System.out.println("\"WeightInPd\"");

        String selectedOption = scanner.nextLine();

        Patient p = this.patientList.getPatient(name);

        boolean result = false;

        switch (selectedOption) {
            case "RespiratoryRate":
                result = p.isThisVitalSignNormal("RespiratoryRate");
                break;

            case "HeartRate":
                result = p.isThisVitalSignNormal("HeartRate");
                break;

            case "BloodPressure":
                result = p.isThisVitalSignNormal("BloodPressure");
                break;

            case "WeightInKg":
                result = p.isThisVitalSignNormal("WeightInKgs");
                break;

            case "WeightInPd":
                result = p.isThisVitalSignNormal("WeightInLbs");
                break;
        }

        if (result) {
            System.out.println("Vital sign is normal");
        } else {
            System.out.println("Vital sign is abnormal");
        }
    }

    public boolean isThisVitalSignNormal(String selectedVialSignName) {
        for (VitalSign vs : this.vitalSignsHistory.getVitalSignHistory()) {
            if (vs.getIsIsRecent()) {
                return vs.isThisVitalSignNormal(selectedVialSignName);
            }
        }
        return false;
    }

}
