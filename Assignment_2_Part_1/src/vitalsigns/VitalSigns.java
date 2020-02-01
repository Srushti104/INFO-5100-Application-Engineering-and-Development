/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalsigns;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author srush
 */
public class VitalSigns {

    private int respiratoryRate;
    private int bloodPressure;
    private int heartRate;
    private double weightKg;
    private double weightPd;
    private int age;

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getWeightPd() {
        return weightPd;
    }

    public void setWeightPd(double weightPd) {
        this.weightPd = weightPd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean result = false;
        // Create a VitalSigns object 
        VitalSigns vs = new VitalSigns();

        // Create a Scanner object        
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter username:");
        // Read user input for name
        String userName = obj.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("Please enter age: \nNote: For Newborn enter value as 0 "
                + "and for less than 1 year i.e. 1-12 months enter value as 1.");
        vs.setAge(obj.nextInt());

        // Read user input for all Vital Signs parameters
        System.out.println("Enter Respiratory Rate:");
        vs.setRespiratoryRate(obj.nextInt());

        System.out.println("Enter Heart Rate:");
        vs.setHeartRate(obj.nextInt());

        System.out.println("Enter Systolic Blood Pressure:");
        vs.setBloodPressure(obj.nextInt());

        System.out.println("Enter Weight (in Kg):");
        vs.setWeightKg(obj.nextDouble());

        System.out.println("Enter Weight (in Pound):");
        vs.setWeightPd(obj.nextDouble());

        //Object instantiation
        Patient patient = new Patient();
        result = patient.isPatientNormal(vs);

        if (result) {
            System.out.println("\nPatient is normal");
        } else {
            System.out.println("\nPatient is abnormal");
        }

    }

}
