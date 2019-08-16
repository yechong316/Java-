public class lastString {

    public static void main(String[] args)
    {
        String sourStr = "I major in AI";
        String subStr = "AI";

        int lastIndex = sourStr.lastIndexOf("I");
        System.out.println(lastIndex);

        int lastIndex2 = sourStr.lastIndexOf("AI");
        System.out.println(lastIndex2);

        int lastIndex3 = sourStr.lastIndexOf("AffI");
        System.out.println(lastIndex3);
    }
}
