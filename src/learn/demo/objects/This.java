/*
1.object 是类的一个实例,this与object等价,执行this.x就相当于执行object.x
2.成员变量与方法内部的变量重名时, 希望在方法内部调用成员变量,就需要使用this
3.相当于调用本类的其他构造方法,它必须作为构造方法的第一句
 */
public class This {
    public String name;
    public int age;

    public This() {
        this("Hi", 5);
    }

    public This(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("The name is:" + name + ", The age is:" + age);
    }

    public static void main(String[] args) {
        This obj = new This("WE", 3);
        obj.say();
    }
}
