public class replaceString {

    public static void main(String[] args)
    {
        String a = "stay foolish, stay hungry";

        System.out.println(a.replace('a', 'A'));
        System.out.println(a.replaceFirst("a", "A"));
        System.out.println(a.replaceAll("a", "A"));

    }
}
