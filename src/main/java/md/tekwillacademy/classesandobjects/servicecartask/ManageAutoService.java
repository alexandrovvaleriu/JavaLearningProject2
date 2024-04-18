package md.tekwillacademy.classesandobjects.servicecartask;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage masterLuxObject = new Garage("Str.Calea Orheiului 147", 3, 220);
        System.out.println(masterLuxObject.address);

        Garage autoLux = new Garage();
        System.out.println(autoLux.numberOfBoxes);
        System.out.println(autoLux.address);
        System.out.println(autoLux.dimensionSqFt);

        autoLux.address = "str.Stefan cel Mare";
        autoLux.dimensionSqFt = 250.6;
        autoLux.numberOfBoxes = 5;

        System.out.println("Informatii despre obiectul autoLux " + autoLux.address +
                " cu numarul de boxe " + autoLux.numberOfBoxes + " si dimensiunea " + autoLux.dimensionSqFt);


        Tools Hummer011 = new Tools("Hummer");
        System.out.println(Hummer011.material);
        System.out.println(Hummer011.nameOfTheTool);

        Tools key = new Tools ("Lucky key");
        System.out.println(key.nameOfTheTool);

        Worker Ionel = new Worker("Ion");
        System.out.println(Ionel.pricePerHour);
        Ionel.yearsOfExperience = 5;
        System.out.println(Ionel.yearsOfExperience);

        Worker marcelcelPuternic = new Worker ();

        Car masinaLuiValeriu = new Car("Bmw", "Black", 4, 2000);
        System.out.println(masinaLuiValeriu.make);

    }

}
