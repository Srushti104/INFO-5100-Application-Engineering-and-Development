/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalsigns;

import java.util.ArrayList;

/**
 *
 * @author srush
 */
public class PatientList {

    private ArrayList<Patient> patientList;

    public PatientList() {
        this.patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient getPatient(String fullName) {
        for (Patient p : this.patientList) {
            if (p.getFullName().toLowerCase().equals(fullName.toLowerCase())) {
                return p;
            }
        }
        Patient p = new Patient(fullName);
        this.patientList.add(p);
        return p;
    }
}
