package lessons.classworks.lesson170821;

public class MyFunctionalInterface
{
    public static boolean checkSumIsZero(int x, int y, int z)
    {
        return x + y + z == 0;
    }

    public static boolean checkProductIsZero(int x, int y, int z)
    {
        return x + y + z == 0;
    }

    public static void main(String[] args)
    {
        TriIntToBoolean t1 = (x, y, z) -> checkSumIsZero(x, y, z);
        TriIntToBoolean t2 = MyFunctionalInterface::checkSumIsZero;
        TriIntToBoolean t3 = MyFunctionalInterface::checkProductIsZero;
    }
}

@FunctionalInterface
interface TriIntToBoolean
{
    boolean test(int x, int y, int z);

//    void x(); only one public abstract method can be inside the FunctionalInterface
}
