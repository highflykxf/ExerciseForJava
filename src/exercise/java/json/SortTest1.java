package exercise.java.json;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog(5, "dog_a"));
        dogs.add(new Dog(6, "dog_b"));
        dogs.add(new Dog(4, "dog_c"));
        Collections.sort(dogs, new Comparator<Dog>(){
            public int compare(Dog dog_1, Dog dog_2){
                return dog_1.age - dog_2.age;
            }
        });
        System.out.println(dogs);
        Collections.sort(dogs, new Comparator<Dog>(){
            public int compare(Dog dog_1, Dog dog_2){
                return dog_1.name.compareTo(dog_2.name);
            }
        });
        System.out.println(dogs);
    }

}
class Dog{
    public int age;
    public String name;
    public Dog(){
        this.age = 0;
        this.name = "";
    }
    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Dog [age=" + age + ", name=" + name + "]";
    }
}
