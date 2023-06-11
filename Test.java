package looseVStightCoupling;

public class Test {

    public static void main(String[] args){
        Traveller traveller=new Traveller();

        traveller.setV(new Car()); //inject car dependency


        traveller.start();
        traveller.setV(new Bike()); //inject bike dependency
        traveller.start();

    }
}
