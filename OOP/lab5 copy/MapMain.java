package lab5;

public class MapMain
{
    static void main(String[] args)
    {
        MapImpl<Integer, String> map = new MapImpl<>();

        map.add(1, "A");
        map.add(2, "B");
        map.add(3, "C");

        System.out.println("Size: " + map.size());
        map.print();

        map.add(3, "N");
        System.out.println("Modified");
        map.print();

        System.out.println("Removed: " + map.remove(2));

        System.out.println("Size now: " + map.size());
        map.print();

        System.out.println("Is empty: " + map.isEmpty());

        map.remove(1);
        map.remove(3);

        System.out.println("Is empty now: " + map.isEmpty());
    }
}

