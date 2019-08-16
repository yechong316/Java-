public class compareString {

    public static void main(String[] args)
    {
        String str = "W";
        String anotherString = "w";
        Object objStr = str;

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objStr.toString()));
    }
}
