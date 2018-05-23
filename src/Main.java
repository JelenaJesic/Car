
public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();
//        myCar.printAttributes();
//        myCar.changeLicence("efg123");
//        double distance = myCar.maxDistance();
//        System.out.println("Maksimalna distanca je: " + distance);

        Car audi = new Car("Audi", 50, 2);
        audi.printAttributes();
//        audi.changeLicence("zcv345");
//        audi.printAttributes();
//        //audi.changeWeight(500);
//        //audi.printAttributes();
//        System.out.println("Maksimalna distanca je: " + audi.maxDistance());
        audi.fuelUp();
        audi.printAttributes();
        audi.travel(20);
        audi.printAttributes();
        audi.travel(30);
        audi.printAttributes();
    }

}
