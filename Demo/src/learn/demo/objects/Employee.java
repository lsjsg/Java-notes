/*
一个源文件中只能有一个public类。
一个源文件可以有多个非public类。
源文件的名称应该和public类的类名保持一致。
如果一个类定义在某个包中，那么package语句应该在源文件的首行。
如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，
那么import语句应该在源文件中最前面。
import语句和package语句对源文件中定义的所有类都有效。
 */
package learn.demo.objects;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    // Employee 类的构造方法
    public Employee(String name) {
        this.name = name;
    }

    // 设置age的值
    public void empAge(int empAge) {
        age = empAge;
    }

    // 设置designation的值
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    // 设置salary的值
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    // 输出信息
    public void printEmployee() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Salary:" + salary);
    }
// 程序需要从main开始执行， 我们创建另一个package并引入package执行main
}
