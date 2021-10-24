package code.oopChallenge;

public class Organ {
/**
 *A challenge to know whether you have understood the concepts
 *
 * you are a doctor and you want to check on your patient, and know the condition of his/her organs
 */
//1.declaring
private String name;
private String medicalCondition;


//2.constructor
    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;

    }

    //4.create another method get details
    public void getDetails(){
        System.out.println("Name: " + this.getName());
        System.out.println("Medical Condition: "+ this.getMedicalCondition());
    }
    //3. getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }



}
