/*
通过上面的实例，读者可以看出，重载就是在一个类中，有相同的函数名称，但形参不同的函数。重载的结果，可以让一个程序段尽量减少代码和方法的种类。
仅仅参数变量名称不同是不可以的。
跟成员方法一样，构造方法也可以重载。
声明为final的方法不能被重载。
声明为static的方法不能被重载，但是能够被再次声明。

方法名称必须相同。
参数列表必须不同（个数不同、或类型不同、参数排列顺序不同等）。
方法的返回类型可以相同也可以不相同。
仅仅返回类型不同不足以成为方法的重载。
 */
public class MethodOverLoading {
    // 一个普通方法, 不带参数
    void test(){
        System.out.println("No parameters");
    }
    // 重载上面的方法, 并且带了一个整型参数
    void test(int a){
        System.out.println("a"+a);
    }
    // 重载上面的方法, 并且带了两个参数
    void test(int a,int b){
        System.out.println("a and b"+a+" "+b);
    }
    // 重载上面的方法, 并带了一个双精度参数
    double test(double a){
        System.out.println("double a:"+a);
        return a*a;
    }
    public static void main(String args[]){
        MethodOverLoading obj = new MethodOverLoading();
        obj.test();
        obj.test(2);
        obj.test(2,3);
        obj.test(2.0);
    }
}
