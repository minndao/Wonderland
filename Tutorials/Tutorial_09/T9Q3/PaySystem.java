package T9Q3;

public class PaySystem {
    protected double payRate;
    protected int hours;

    PaySystem(double payRate, int hours){
        this.payRate = payRate;
        this.hours = hours;
    }

    public double calculateGivenHours(int hours){
        return hours * payRate;
    }

    protected double totalPay(){
        return payRate * hours;
    }

    public void display(){
        System.out.println("Total payment: " + totalPay());
    }


}
