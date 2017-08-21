package lessons.classworks.lesson170821;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortExample
{
    public static void main(String[] args)
    {
        List <Person> staff = new ArrayList<>();
        staff.add(new Person("Robb Stark", 25));
        staff.add(new Person("Petyr Baelish", 40));
        staff.add(new Person("Arya Stark", 16));
        staff.add(new Person("Bran Stark", 18));
        staff.add(new Person("Jon Snow", 25));

        staff.sort(new Comparator<Person>()
        {
            @Override
            public int compare(Person o1, Person o2)
            {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(staff);

//        ToIntFunction<Person> ageFunction = Person::getAge;
//        Comparator.comparingInt(ageFunction);
        staff.sort(Comparator.comparingInt(Person::getAge));
        System.out.println(staff);

        // first - sort by age, then sort by name
        staff.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));

        System.out.println(staff);
    }
}

class Person
{
    final String name;
    final int age;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return name + " : " + age;
    }
}