package learn.demo.objects;

public class Define { // public 修饰符
    String name; // name, age 成员变量
    int age;
    Define(String name1, int age1){
        name = name1;
        age = age1;
        System.out.println("Successfilly create a class");
    }
    void bark(){
        System.out.println("WOWOWO");
    }
    void hungry(){
        System.out.println("Hungry");
    }
    public static void main(String[] args){
        Define Dog = new Define("dog",1);
        System.out.println(Dog.name);
        System.out.println(Dog.age);
        Dog.bark();
        Dog.hungry();
    }
}

/*
public	共有的，对所有类可见。
protected	受保护的，对同一包内的类和所有子类可见。
private	私有的，在同一类内可见。
默认的	在同一包内可见。默认不使用任何修饰符。
 */
