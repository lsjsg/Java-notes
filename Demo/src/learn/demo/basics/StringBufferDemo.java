package learn.demo.basics;

public class StringBufferDemo {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("test 1000 rounds");
        str.append(true);
        System.out.println(str);
        str.deleteCharAt(7);
        System.out.println(str);
        str.delete(4,7);
        System.out.println(str);
        str.insert(3,"xyz");
        System.out.println(str);
        str.setCharAt(1,'z');
        System.out.println(str);

        int time = 50000;
        long timeStart1 = System.currentTimeMillis();
        String fragment = "abc";
        String str1 = "";
        for (int i=0;i<time;i++){
            str1 += fragment;
        }
        long timeEnd1 = System.currentTimeMillis();
        System.out.println("string:"+(timeEnd1-timeStart1) + "ms");

        long timeStart2 = System.currentTimeMillis();
        StringBuffer str2 = new StringBuffer();
        for (int i=0; i<time; i++) {
            str2.append(fragment);
        }
        long timeEnd2 = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (timeEnd2 - timeStart2) + "ms");
    }
}
