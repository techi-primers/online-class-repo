package class2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestTimeZones {
//2015-06-16T15:35:56Z
    public static void main(String[] args) {

        String str = "16Jun2015_153556";
        String str1 = "2022-02-21_000000";
        String end = "2022-06-15_235959";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd_HHmmss");
        ZoneId zone = ZoneId.of("US/Central");
        LocalDateTime dateTime = LocalDateTime.parse(str1, formatter1);
        ZonedDateTime zoned = ZonedDateTime.of(dateTime, zone);

        // Both of these print 2015-06-16T19:35:56Z
        System.out.println(zoned.toInstant());
        System.out.println(zoned);
        System.out.println(zoned.withZoneSameInstant(ZoneOffset.UTC));
    }

    /*

     JSONArray a = (JSONArray) parser.parse(new FileReader("c:\\exer4-courses.json"));

  for (Object o : a)
  {
    JSONObject person = (JSONObject) o;

    String name = (String) person.get("name");
    System.out.println(name);

    String city = (String) person.get("city");
    System.out.println(city);

    String job = (String) person.get("job");
    System.out.println(job);

    JSONArray cars = (JSONArray) person.get("cars");

    for (Object c : cars)
    {
      System.out.println(c+"");
    }
  }

    */
}
