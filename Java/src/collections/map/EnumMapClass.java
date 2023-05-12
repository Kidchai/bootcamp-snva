package collections.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapClass {
    public static void main(String[] args) {
        EnumMap<Month, String> map = new EnumMap<>(Month.class);

        map.put(Month.JAN, "January");
        map.put(Month.FEB, "February");
        map.put(Month.MAR, "March");
        map.put(Month.APR, "April");
        map.put(Month.MAY, "May");
        map.put(Month.JUN, "June");
        map.put(Month.JUL, "July");
        map.put(Month.AUG, "August");
        map.put(Month.SEP, "September");
        map.put(Month.OCT, "October");
        map.put(Month.NOV, "November");
        map.put(Month.DEC, "December");

        System.out.printf("EnumMap size: %d\n", map.size());
        for (Map.Entry<Month, String> entry : map.entrySet()) {
            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue());
        }
    }
}

enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
}

//create employee class and sort by salaries
