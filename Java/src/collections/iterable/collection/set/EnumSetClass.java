package collections.iterable.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.EnumSet;

public class EnumSetClass {
    public static void main(String[] args) {
        Set<Days> days = EnumSet.allOf(Days.class);

        System.out.printf("Days size: %d\n", days.size());
        System.out.println(days);

        for (Days day : days) {
            System.out.println(day);
        }

        Set<Days> copy = EnumSet.allOf(Days.class);
        copy.remove(Days.MONDAY);

        System.out.printf("Copied days size: %d\n", copy.size());
        System.out.printf("Days size: %d\n", days.size());

    }
}

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
