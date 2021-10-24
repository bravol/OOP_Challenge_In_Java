package code.oopChallenge;
//22
public class Skin extends Organ{
//23 declaring
    private String color;
    private int softness;

//24. constructor
    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    //26.override method getDetails from Organ


    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin color: "+this.getColor());
    }

    //25.getter and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
