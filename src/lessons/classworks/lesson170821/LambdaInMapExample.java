package lessons.classworks.lesson170821;

import java.util.Map;
import java.util.TreeMap;

public class LambdaInMapExample
{
    public static void main(String[] args)
    {
        Map<String, String> staff = new TreeMap<>();
        staff.put("Arya Stark", "Braavos");
        staff.put("Bran Stark", "Northern lands");
        staff.put("Robb Stark", "Towers");
        staff.put("Rickon Stark", "Winterfell");
        staff.put("Jon Snow", "Wall");
        staff.put("Sansa Stark", "Winterfell");

        staff.replaceAll((s1, s2) -> s2.toUpperCase());

        System.out.println(staff);

        staff.computeIfAbsent("Tyrion Lannister", p -> "Kings-Landing");

        System.out.println(staff);
    }
}
