/*
每个包装类的对象可以封装一个相应的基本类型的数据，并提供了其它一些有用的方法。包装类对象一经创建，其内容（所封装的基本类型数据值）不可改变。
 */
public class WrapperClasses {
    public static void main(String[] args){
        // int 和 Integer的相互转换
        int m = 500;
        Integer obj = new Integer(m);
        int n = obj.intValue();
        System.out.println("n="+n);
        Integer obj1 = new Integer(500);
        System.out.println("obj = obj1"+obj.equals(obj1));
        // 将字符串转换为整数
        String str[] = {"123","123abc","abc123","abcxyz"};
        for (String str1:str){
            try{
                int x = Integer.parseInt(str1,10);
                System.out.println(str1+"可以转换为整数"+x);
            }catch(Exception e){
                System.out.println(str1+"无法转换为整数");
            }
        }
        // 将整数转换为字符串
        int y= 11;
        String s = Integer.toString(y);
        System.out.println(("s="+s));
        // 将整数转换为字符串
        int num = 50;
        String st = Integer.toString(num);
        System.out.println("s="+st);
        // 自动拆箱和装箱
        int i=40;
        Integer obj2=i;
        int j = obj2;
        System.out.println("j="+j);
        Integer obj3=500;
        System.out.println("obj3 == obj1="+obj3.equals(obj1));
    }
}
