package baitap01;

public class baitap01 {
    public static void main(String[] args) {
        Animal [] arrAnimal = new Animal[2];

        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat1 = new Cat("Whiskers", 2, "Ghi");

        arrAnimal[0] = dog1;
        arrAnimal[1] = cat1;

        for( Animal animal : arrAnimal ) {
            animal.displayInfo();
            System.out.println("Âm thanh: " + animal.makeSound());
            System.out.println();
        }
    }
}
