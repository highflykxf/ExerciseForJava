package exercise.java.sort;

public class Person {
    private int Age;
    private String Name;
    public Person(){
    	Name="None";
    	Age=0;
    }
    public Person(String name,int age){
    	Name=name;
    	Age=age;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
}

