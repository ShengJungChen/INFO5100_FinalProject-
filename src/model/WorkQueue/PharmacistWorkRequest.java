
package model.WorkQueue;


public class PharmacistWorkRequest extends WorkRequest {
    
    private String result;
    private String prescription; //not used

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
}
