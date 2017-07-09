package lessons.homeworks.tasks170707.MyString;

import mytestframework.Asserts;

public class MyStringTest
{
    public static void main(String[] args)
    {
        String s1 = "   H e l l o   ";

        Asserts.assertEquals(StringMethodPractice.trim(s1), "H e l l o");
        Asserts.assertNotEquals(StringMethodPractice.trim(s1), "Hello  ");

        String s2 = "Good neews evewryone";
        Asserts.assertEquals(StringMethodPractice.replace(s2, "ew", "OO"), s2.replace("ew", "OO"));
        String s3 = "Good news everyone";
        Asserts.assertEquals(StringMethodPractice.replace(s3, "e", "OO"), s3.replace("e", "OO"));
        String s4 = "newws neewwws newwwewewws";
        Asserts.assertEquals(StringMethodPractice.replace(s4, "ewww", "!"), s4.replace("ewww", "!"));

        // target longer than original string
        Asserts.assertEquals(StringMethodPractice.replace(s4, "newws neewwws newwwewewwsewww", "!"),
                s4.replace("newws neewwws newwwewewwsewww", "!"));

        // targets length == 0
        Asserts.assertEquals(StringMethodPractice.replace(s4, "", "!"), s4.replace("", "!"));

        // originals length == 0
        Asserts.assertEquals(StringMethodPractice.replace("", "a", "!"), "".replace("a", "!"));

        // originals & targets lengths == 0
        Asserts.assertEquals(StringMethodPractice.replace("", "", "!"), "".replace("", "!"));


    }
}
