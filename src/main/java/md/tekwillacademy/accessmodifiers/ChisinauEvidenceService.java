package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceService {

    public static void main(String[] args) {
        Person ionelBaiatGrozav = new Person();

        Person marcelBoy = new Person("Marcel Bivol", 65, 79123456, "Unknown");

        System.out.println(marcelBoy.getAge());
        System.out.println(ionelBaiatGrozav.getAge());

        ionelBaiatGrozav.name = "Ion Bostanel";

        marcelBoy.name = "Marcel Bivol";

        Person raisaPacalo = new Person("Raisa Pacalo","F");

        System.out.println(raisaPacalo.getGender());
        System.out.println(raisaPacalo.toString());
        System.out.println("Numele obiectului raisaPacalo: " + raisaPacalo.name);

        System.out.println(Person.nationality);
        Person.nationality = "Moldovean Editat";
        System.out.println(Person.nationality);

    }
}
