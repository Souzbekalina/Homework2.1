package Hm1;

public class Grandpa {
    private int age;
    private String name;
    private National national;

    public Grandpa(int age, String name,National national) {
        this.age = age;
        this.name=name;
        this.national=national;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public National getNational() {
        return national;
    }
    public String getInfo(){
        return "age " +age +"\nName " + name + " \n National " + national;
    }

}
