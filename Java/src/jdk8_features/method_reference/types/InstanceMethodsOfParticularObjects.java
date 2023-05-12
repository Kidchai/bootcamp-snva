package jdk8_features.method_reference.types;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Syntax:
containingObject::instanceMethodName
 */
public class InstanceMethodsOfParticularObjects {
    public static void main(String[] args) {
        BicycleComparator bicycleComparator = new BicycleComparator();

        List<Bicycle> bicycles = new ArrayList<>();
        bicycles.add(new Bicycle("Brand 1", 50));
        bicycles.add(new Bicycle("Brand 2", 40));
        bicycles.add(new Bicycle("Brand 3", 60));

        //using lambda expression
        bicycles.stream()
                .sorted((a, b) -> bicycleComparator.compare(a, b));

        //using method reference
        bicycles.stream()
                .sorted(bicycleComparator::compare);
    }
}

class Bicycle {

    private String brand;
    private Integer frameSize;

    Bicycle(String brand, Integer frameSize) {
        this.brand = brand;
        this.frameSize = frameSize;
    }

    public Integer getFrameSize() {
        return frameSize;
    }
}

class BicycleComparator implements Comparator<Bicycle> {
    @Override
    public int compare(Bicycle o1, Bicycle o2) {
        return o1.getFrameSize().compareTo(o2.getFrameSize());
    }
}
