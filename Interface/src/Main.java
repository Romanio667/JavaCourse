import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        Fish fish=new Fish();
        Bird bird=new Bird();
        ArrayList<Animal>animals=new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);
        animals.add(bird);
        for (Animal animal : animals){
            animal.eat();
        }
        Dog dog1=new Dog();
        Cat cat1=new Cat();
        Fish fish1=new Fish();
        Bird bird1=new Bird();
        ArrayList<CanRun> animals1=new ArrayList<>();
        animals1.add(dog1);
        animals1.add(cat1);
        animals1.add(bird1);
        for(CanRun animal:animals1){
            animal.run();
        }

    }


}
