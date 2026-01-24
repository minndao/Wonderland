package T9Q2;

public class Animal extends Organism {
    double eatingAmount;

    Animal(){
        eatingAmount = 1;
    }

    public void displayEatingAmount(){
        System.out.println(eatingAmount);
    }
}
