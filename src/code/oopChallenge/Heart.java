package code.oopChallenge;
//12
public class Heart extends Organ{
// 12 declaring
    private int rate;

    //13. constructor

    public Heart(String name, String medicalCondition,  int rate) {
        super(name,medicalCondition);
        this.rate = rate;
    }

    //15. override method getDetails

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart rate: "+ this.getRate());
    }


    //14. setter and getter

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
