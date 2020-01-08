import java.util.HashSet;

public class Main
{

    public static void main(String[] args)
    {

        HashSet<Integer> aList = new HashSet<Integer>();
        aList.add(3);
        aList.add(7);
        aList.add(7);
        aList.add(2);
        print(aList);
        System.out.println("List contain 2: " + aList.contains(2));
        aList.remove(2);
        System.out.println("list contains: s " +aList.contains(2));
    }

    public static void print(HashSet<Integer> values)
    {
        System.out.println("The set contains");
        for(Object obj : values.toArray())
        {
            Integer num = (Integer)obj;
            System.out.println(num.intValue());
        }

    }
}
