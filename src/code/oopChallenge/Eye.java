package code.oopChallenge;
//5. extends to organ
public class Eye extends Organ{
    //6. declaring
    private String color;
    private boolean isOpened;
    //7. generating constructor

    public Eye(String name, String medicalCondition, String color, boolean isOpened) {
        super(name,medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }
    //9.override the method getDetails by pressing (ctrl + O)

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: "+ this.getColor());
    }
    //10. creating another method isOpen
    public void open(){
        this.isOpened(true);
        System.out.println(this.getName() + " Opened");
    }

    //11.create another method close
    public void close(){
        this.isOpened(false);
        System.out.println(this.getName()+" Closed");
    }

    //8.generating getter and setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened(boolean b) {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}

