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
public class VitalSignHistory {

    private ArrayList<VitalSign> vitalSignsHistory;

    public VitalSignHistory() {
        this.vitalSignsHistory = new ArrayList<VitalSign>();
    }

    public ArrayList<VitalSign> getVitalSignHistory() {
        return this.vitalSignsHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> history) {
        this.vitalSignsHistory = history;
    }

    public void addVital(VitalSign v) {
        vitalSignsHistory.add(v);
    }

}
