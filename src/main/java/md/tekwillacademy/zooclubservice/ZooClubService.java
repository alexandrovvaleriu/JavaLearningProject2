package md.tekwillacademy.zooclubservice;

public class ZooClubService {
    public static void main(String[] args) {
        Dog bimDog = new Dog("Baric");
        Animal lucyCat = new Cat ("Lucy meaw");
        Animal mouseMicky = new Mouse("Micky");

        lucyCat.eat();
        lucyCat.makeSound();
        bimDog.eat();
        bimDog.makeSound();
        mouseMicky.eat();
        mouseMicky.makeSound();
    }
}
