import java.util.Vector;
import java.util.Enumeration;


public class enumeration {

    public static void main(String[] args)
    {
        Enumeration<String> daynames;
        Vector<String> days = new Vector<String>();


        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        daynames = days.elements();
        while (daynames.hasMoreElements())
        {
            System.out.println(daynames.nextElement());
        }

    }
}
