/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalsigns;

/**
 *
 * @author srush
 */
public class Patient {

    boolean isPatientNormal = false;

    public boolean isPatientNormal(VitalSigns vs) {
        int age = vs.getAge();
        int respiratoryRate = vs.getRespiratoryRate();
        int bloodPressure = vs.getBloodPressure();
        int heartRate = vs.getHeartRate();
        double weightKg = vs.getWeightKg();
        double weightPd = vs.getWeightPd();
        int isAge = 0;

        //Check for age
        if (age == 0) {
            isAge = 1;
        } else if (age == 1) {
            isAge = 2;
        } else if (age > 1 && age <= 3) {
            isAge = 3;
        } else if (age >= 4 && age <= 5) {
            isAge = 4;
        } else if (age >= 6 && age <= 12) {
            isAge = 5;
        } else if (age >= 13) {
            isAge = 6;
        } else {
            System.out.println("Invalid age.");
        }

        switch (isAge) {
            case 1:

                if (respiratoryRate >= 30 && respiratoryRate <= 50 && bloodPressure >= 50 && bloodPressure <= 70
                        && heartRate >= 120 && heartRate <= 160 && weightKg >= 2 && weightKg <= 3
                        && weightPd >= 4.5 && weightPd <= 7) {
                    isPatientNormal = true;
                } else {
                    isPatientNormal = false;
                }

                break;

            case 2:
                if (respiratoryRate >= 20 && respiratoryRate <= 30 && bloodPressure >= 70 && bloodPressure <= 100
                        && heartRate >= 80 && heartRate <= 140 && weightKg >= 4 && weightKg <= 10
                        && weightPd >= 9 && weightPd <= 22) {
                    isPatientNormal = true;
                } else {
                    isPatientNormal = false;
                }

                break;

            case 3:
                if (respiratoryRate >= 20 && respiratoryRate <= 30 && bloodPressure >= 80 && bloodPressure <= 110
                        && heartRate >= 80 && heartRate <= 130 && weightKg >= 10 && weightKg <= 14
                        && weightPd >= 22 && weightPd <= 31) {
                    isPatientNormal = true;
                } else {
                    isPatientNormal = false;
                }

                break;

            case 4:
                if (respiratoryRate >= 20 && respiratoryRate <= 30 && bloodPressure >= 80 && bloodPressure <= 110
                        && heartRate >= 80 && heartRate <= 120 && weightKg >= 14 && weightKg <= 18
                        && weightPd >= 31 && weightPd <= 40) {
                    isPatientNormal = true;
                } else {
                    isPatientNormal = false;
                }

                break;

            case 5:
                if (respiratoryRate >= 20 && respiratoryRate <= 30 && bloodPressure >= 80 && bloodPressure <= 120
                        && heartRate >= 70 && heartRate <= 110 && weightKg >= 20 && weightKg <= 42
                        && weightPd >= 41 && weightPd <= 92) {
                    isPatientNormal = true;
                } else {
                    isPatientNormal = false;
                }

                break;

            case 6:
                if (respiratoryRate >= 12 && respiratoryRate <= 20 && bloodPressure >= 110 && bloodPressure <= 120
                        && heartRate >= 55 && heartRate <= 105 && weightKg > 50 && weightPd > 110) {
                    isPatientNormal = true;
                } else {
                    isPatientNormal = false;
                }
                break;

        }
        return isPatientNormal;
    }

}
