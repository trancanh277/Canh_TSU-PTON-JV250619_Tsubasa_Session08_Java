package baitap01;

public class Animal {
    protected  String name;
    protected   int age;

    public Animal(String name, int age) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Tên không được để trống");
        }
        if(age<0 )
            throw  new IllegalArgumentException("Tuổi không được âm");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Tuổi không được âm");
        }
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }
    public String makeSound() {
        return "Some generic sound";
    }
}
