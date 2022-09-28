package test;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showInfo(){
        System.out.println("Имя: "+name);
        System.out.println("Возраст: "+age);
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("возраст больше 0 должен быть");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
