//public class Datatype{
//    public static void main(String[] args){
//        int a=10;
//        int b=20;
//        int sum=a+b;
//        double multi=a/b;
//        System.out.println(sum);//sum
//        System.out.println(b-a);
//        System.out.println(a*b);
//        System.out.println(multi);
//        System.out.println(a%b);
//    }
//}THEN LETS TAKE THE INPUT IN JAVA

import java.util.*;
//public class Datatype{
//    public static void main(String[] args){
//        System.out.print("Enter Your Name:");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();//BY THE USE OF NEXT LINE I CAN TAKE INPUT OF FULL NAME WITHOUT IT IF I USE ONLY NEXT THEN IT TAKE INPUT OF THE FIRST LINE
//        System.out.println(name);
//    }
//}
public class Datatype{
    public static void main(String[] args){
        System.out.print("Enter your first Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Enter your second Number:");

        int num2=sc.nextInt();
        int sum=num+num2;
        System.out.println(sum);
    }
}//show like that we take input and do any arithimetic things