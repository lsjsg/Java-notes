/*
name 和 age 变量虽然没有在 Teacher 中定义，但是已在 People 中定义，可以直接拿来用。
Teacher 是 People 的子类，People 是Teacher 类的父类。
子类可以覆盖父类的方法。
子类可以继承父类除private以为的所有的成员。
构造方法不能被继承。
 */
package learn.demo.inherits;

public class ExtendDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Tom";
        t.age = 70;
        t.school = "SUTD";
        t.subject = "conputing";
        t.seniority = 52;
        t.say();
        t.lecturing();
    }
}

class People {
    String name;
    int age;
    int height;

    void say() {
        System.out.println("我的名字是 " + name + "，年龄是 " + age + "，身高是 " + height);
    }
}

class Teacher extends People {
    String school;
    String subject;
    int seniority;

    // 覆盖 People 类中的 say() 方法
    void say() {
        System.out.println("我叫" + name + "，在" + school + "教" + subject + "，有" + seniority + "年教龄");
    }

    void lecturing() {
        System.out.println("我已经" + age + "岁了，依然站在讲台上讲课");
    }
}