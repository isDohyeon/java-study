package level4.generic.ex2;


import level4.generic.animal.Animal;
import level4.generic.animal.Cat;
import level4.generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Animal> animalBox = new Box<>(animal);
        animalBox.set(animal);
        animalBox.set(dog);
        //animalBox.set(cat);

        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
