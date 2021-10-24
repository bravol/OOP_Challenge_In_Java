package code.oopChallenge;
//16
public class Stomach extends Organ{
    //17. declaring
    private boolean isEmpty;

    //18. constructor
    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name,medicalCondition);
        this.isEmpty = isEmpty;
    }

    //21. creating a method digest
    public void digest(){
        System.out.println("Digesting begin ....");
    }

    //20. override method getDetails from Organ (ctrl +O)

    @Override
    public void getDetails() {
        super.getDetails();

        if(this.isEmpty()){
            System.out.println("Need to be fed");
        }else{
            System.out.println("Stomach is full");
        }
    }

    //19. getter and setter
    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
