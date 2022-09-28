package main;
import box.Box;
import test.Man;
import test.MyMath;

public class Main {
    public static void main(String[] args) {
        /*box.Box box1=new box.Box();
        box.Box box2=new box.Box();
        box1.length=5;
        box1.height=5;
        box1.width=5;
        box2.length=10;
        box2.height=10;
        box2.width=10;
        double volume1=box1.volume();
        double volume2=box2.volume();
        System.out.println(volume1);
        System.out.println(volume2);*/
        /*test.Test test=new test.Test();
        int square=test.square(80);
        System.out.println(square);*/
        /*box.Box box=new box.Box();
        box.setDimens(15,15,15);
        System.out.println(box.volume());*/
        /*box.Box box=new box.Box(10,15,20);
        System.out.println(box.volume());
        box.Box box2=new box.Box(30,30,30);
        System.out.println(box2.volume());*/
        /*test.Test test=new test.Test();
        int result=test.multiple(5);
        System.out.println(result);*/
       // int result=test.Test.multiple(5);
        /*box.Box box=new box.Box(10);
        box.Box box2=new box.Box(15,20,25);
        int result=box.compare(box2);*/
        /*box.Box box1=new box.Box(10);
        box.Box box2=box1.increase(2);
        box1.showVolume();
        box2.showVolume();
        int result=box1.compare(box2);
        switch(result){
            case -1:
                System.out.println("Наша коробка меньше");
                break;
            case 0:
                System.out.println("Коробки равны");
                break;
            case 1:
                System.out.println("Наша коробка больше");
                break;
        }*/
        /*Man man=new Man("Иван", 27);
        System.out.println(man.getAge());
        System.out.println(man.getName());
        man.setAge(28);
        man.showInfo();
        Box box=new Box(23);*/
       int square = MyMath.square(20);
        System.out.println(square);
        double length=MyMath.length(10);
        System.out.println(length);
    }
}
