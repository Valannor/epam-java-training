package lessons.classworks.lesson170821;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class LambdaSupplier
{
    public static void main(String[] args)
    {
        // anonymous class
        Supplier<LocalDate> dateSupplier1 = new Supplier<LocalDate>()
        {
            @Override
            public LocalDate get()
            {
                return LocalDate.now();
            }
        };

        // lambda long
        Supplier<LocalDate> dateSupplier2 = () -> LocalDate.now();

        // lambda short
        Supplier<LocalDate> dateSupplier3 = LocalDate::now;

        // usage
        LocalDate localDate = dateSupplier3.get();
        System.out.println(localDate);

        // constructor example
        Supplier<ArrayList<String>> arrayListSupplier = ArrayList::new;
    }
}
