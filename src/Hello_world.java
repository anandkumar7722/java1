import java.util.Date;
import java.lang.String;

public class Hello_world {
    public static void main(String[] args) {
        short age=19;
        System.out.println("\nmy age is "+age);
        Date today=new Date();
        System.out.println(today);
        int a=6;
        int b=8;
        //b=3;
        System.out.println(a);
        System.out.println(b);
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        float div=(float)a/(float) b;//type casting method
        int mod=a%b;
        System.out.println("the addition a+b "+add);
        System.out.println("the subtraction a-b "+sub);
        System.out.println("the multi a*b "+mul);
        System.out.println("the div a/b "+div);
        System.out.println("the mod a%b "+mod);
        //basic increaments
        a++;
        System.out.println("the a update value "+a);
        b++;
        System.out.println("the b update value "+b);
        //post
        System.out.println(a++);
        //pre
        System.out.println(++b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        boolean t=false;
        System.out.println(!t);
        //System.out.println(a && b);


    }
}
