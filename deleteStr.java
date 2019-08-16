public class deleteStr {

    public static void main(String[] args)
    {
        String s = "hellon";
        String b = delete(s, 3);
        System.out.println("删除前，字符串为： " + s);
        System.out.println("删除后，字符串为： " + b);
    }

    public static String delete(String s, int pos)
    {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
