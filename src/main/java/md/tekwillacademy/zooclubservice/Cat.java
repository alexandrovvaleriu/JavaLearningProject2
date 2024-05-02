package md.tekwillacademy.zooclubservice;

public class Cat extends Animal implements Animalinterface{

    public Cat(String name){
        super(name);
    }
    @Override
    public void makeSound (){
        System.out.println(this.getName() + "  The cat is making meow");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + "  The cat is eating fish");
    }
}
