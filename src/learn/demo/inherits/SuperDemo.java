/*
super 关键字与 this 类似，this 用来表示当前类的实例，super 用来表示父类。
super 关键字的功能：
    调用父类中声明为 private 的变量。
    点取已经覆盖了的方法。
    作为方法名表示父类构造方法。
 */
package learn.demo.inherits;

public class SuperDemo{
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.move();
    }
}
class Animal{
    private String desc = "Animals are human's good friends";
    // 必须要声明一个 getter 方法
    public String getDesc() { return desc; }
    public void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{
    public void move(){
        super.move();  // 调用父类的方法
        System.out.println("Dogs can walk and run");
        // 通过 getter 方法调用父类隐藏变量
        System.out.println("Please remember: " + super.getDesc());
    }
}