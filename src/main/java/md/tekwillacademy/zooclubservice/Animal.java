package md.tekwillacademy.zooclubservice;

public abstract class Animal implements Animalinterface {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public abstract void eat();
    }

