package lessons.homeworks.tasks170627;

import mytestframework.Asserts;

public class NumSysConverterTest
{
    public static void main(String[] args)
    {
        System.out.println(Asserts.assertEquals(NumSysConverter.toBinary(6111), Integer.toBinaryString(6111)));
        System.out.println(Asserts.assertEquals(NumSysConverter.toBinary(-6111), Integer.toString(-6111, 2)));

        System.out.println(Asserts.assertEquals(NumSysConverter.toOctal(6111), Integer.toOctalString(6111)));
        System.out.println(Asserts.assertEquals(NumSysConverter.toOctal(-6111), Integer.toString(-6111, 8)));

        System.out.println(Asserts.assertEquals(NumSysConverter.toHex(6111), Integer.toHexString(6111)));
        System.out.println(Asserts.assertEquals(NumSysConverter.toHex(-6111), Integer.toString(-6111, 16)));

        System.out.println(Asserts.assertEquals(NumSysConverter.universalSystem(6111, 3), Integer.toString(6111, 3)));
        System.out.println(Asserts.assertEquals(NumSysConverter.universalSystem(-6111, 3), Integer.toString(-6111, 3)));
    }
}
