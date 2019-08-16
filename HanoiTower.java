import java.util.Stack;
import java.util.Iterator;
/*
学习递归的用法
 */

public class HanoiTower{


    private static int hanoi(int num, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c)
    {
        if (num == 0) return 0;

        int num1 = hanoi(num - 1, a, c, b);
        c.push(a.pop());

        int num2 = hanoi(num - 1, b, a, c);

        return num1 + num2 + 1;
    }

    public static void main(String[] args)
    {
        int num = 2;
        Stack<Integer> a = new Stack<Integer>();
        Stack<Integer> b = new Stack<Integer>();
        Stack<Integer> c = new Stack<Integer>();

        for (int i=num; i>0; i--)
        {
            a.push(i);
        }

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        num = hanoi(num, a, b, c);
        System.out.println("移动后：");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("移动次数：" + num);

    }
}