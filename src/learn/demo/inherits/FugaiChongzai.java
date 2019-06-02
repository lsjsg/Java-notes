/*
子类能创建一个与父类方法有不同功能的方法，但具有相同的名称、返回值类型、参数列表。
注意：覆盖不会删除父类中的方法，而是对子类的实例隐藏，暂时不使用。
 */

package learn.demo.inherits;

public class FugaiChongzai {
    public static void main(String[] args) {
        Cat cat = new Cat("huahau");
        cat.say();//子类的实例调用子类中的方法

        Bigcat bigcat = new Bigcat("beibei");
        bigcat.say();
    }
}

/*
覆盖方法的返回类型、方法名称、参数列表必须与原方法的相同。
覆盖方法不能比原方法访问性差（即访问权限不允许缩小）。
覆盖方法不能比原方法抛出更多的异常。
被覆盖的方法不能是final类型，因为final修饰的方法是无法覆盖的。
被覆盖的方法不能为private，否则在其子类中只是新定义了一个方法，并没有对其进行覆盖。
被覆盖的方法不能为static。如果父类中的方法为静态的，而子类中的方法不是静态的，但是两个方法除了这一点外其他都满足覆盖条件，那么会发生编译错误；反之亦然。即使父类和子类中的方法都是静态的，并且满足覆盖条件，但是仍然不会发生覆盖，因为静态方法是在编译的时候把静态方法和类的引用类型进行匹配。
 */
class Bigcat {
    String name;

    public Bigcat(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("我是一只小动物，我的名字叫" + name + "，我会发出叫声");
    }
}

class Cat extends Bigcat {
    // 构造方法不能被继承，通过super()调用
    public Cat(String name) {
        super(name);
    }

    public void say() {
        System.out.println("我是一只小猫，我的名字叫" + name + "，我会发出喵喵的叫声");
    }
}