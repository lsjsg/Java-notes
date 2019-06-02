package learn.demo.inherits;

public class SuperDemoParental {
    public static void main(String[] args) {
        Dogs obj = new Dogs("花花", 3);
        obj.say();
    }
}

class Animals {
    String name;

    public Animals(String name) {
        this.name = name;
    }
}

class Dogs extends Animals {
    int age;

    public Dogs(String name, int age) {
/*       注意：无论是 super() 还是 this()，都必须放在构造方法的第一行。
        在构造方法中调用另一个构造方法，调用动作必须置于最起始的位置。
        不能在构造方法以外的任何方法内调用构造方法。
        在一个构造方法内只能调用一个构造方法。*/
        super(name);
        this.age = age;
    }

    public void say() {
        System.out.println("我是一只可爱的小狗，我的名字叫" + name + "，我" + age + "岁了");
    }
}
