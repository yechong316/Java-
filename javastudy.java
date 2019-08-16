import java.util.Scanner;



public class javastudy
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        System.out.println("输入整数： ");

        if (scan.hasNextInt())
        {
            i = scan.nextInt();
            System.out.println("整数数据：" + i);
        }
        else
        {
            System.out.print("输入的步数整数！");
        }

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("next方式接收: ");
//
//        if (scan.hasNext())
//        {
//            String str1 = scan.next();
//            System.out.println("输入数据为：" + str1);
//        }
//        scan.close();
    }

}
