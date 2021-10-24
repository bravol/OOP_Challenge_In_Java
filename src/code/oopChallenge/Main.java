package code.oopChallenge;

import java.util.Scanner;
//31 creating main class
public class Main {
    public static void main(String[] args) {
        Patient patient=new Patient("Brian",23,
                new Eye("Left Eye","Normal","Blue",true),
                new Eye("Right Eye","Short Sighted","Blue",true),
                new Heart("Heart","Normal",60),
                new Stomach("Stomach","Not Normal",false),
                new Skin("Skin","Burned","white",50));

        System.out.println("Name: "+ patient.getName());
        System.out.println("Age: "+ patient.getAge());
        Scanner scanner=new Scanner(System.in); //we are going to receive the users input so we need the scanner

        boolean shouldFinish=false;
        while (! shouldFinish){
            System.out.println("Choose an Organ"+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin"+
                    "\n\t6. Quit");
            int choice=scanner.nextInt(); //since we are going to receive the users input we need a scanner
            switch (choice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().isOpened(true)) {
                        System.out.println("\t\t1.Close the Eye");
                        if(scanner.nextInt()==1){
                            patient.getLeftEye().close();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("\t\t1.Open the Eye");
                        if(scanner.nextInt()==1){
                            patient.getLeftEye().open();
                        }else {
                            continue;
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().isOpened(true)) {
                        System.out.println("\t\t1.Close the Eye");
                        if(scanner.nextInt()==1){
                            patient.getRightEye().close();
                        }else{
                            continue;
                        }
                    }else{
                        System.out.println("\t\t1.Open the Eye");
                        if(scanner.nextInt()==1){
                            patient.getRightEye().open();
                        }else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the Heart Rate");
                    if(scanner.nextInt()==1){
                        System.out.println("Enter the new Heart rate");
                        int newHeartRate=scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("heart Rate changed to: "+ patient.getHeart().getRate());
                    }else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if(scanner.nextInt()==1){
                        patient.getStomach().digest();
                    }else {
                        continue;
                    }
                    break;

                case 5:
                    patient.getSkin().getDetails();
                    break;

                default:
                    shouldFinish=true;
                    break;

            }

        }
    }
}
