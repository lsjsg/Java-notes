package learn.demo.objects;
/* getName()/setName() 和 getAge()/setAge() 它们用来获取和设置私有变量的值。
父类中声明为public的方法在子类中也必须为public。

父类中声明为protected的方法在子类中要么声明为protected，要么声明为public。不能声明为private。

父类中默认修饰符声明的方法，能够在子类中声明为private。

父类中声明为private的方法，不能够被继承。*/

public class Protected {
    private String name;
    private int age;

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
        this.age = age;
    }
}