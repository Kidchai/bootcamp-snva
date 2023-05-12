package jdk8_features.method_reference.types;

import java.util.Arrays;
import java.util.List;

/*
Syntax:
ClassName::new
 */
public class Constructor {
    public static void main(String[] args) {
        List<String> bikeBrands = Arrays.asList("Giant", "Scott", "Trek", "GT");

        //using lambda expression
        bikeBrands.stream()
                .map(brand -> new Bicycle1(brand))
                .toArray(Bicycle1[]::new);

        //using method reference
        bikeBrands.stream()
                .map(Bicycle1::new)
                .toArray(Bicycle1[]::new);
    }
}

class Bicycle1 {

    private String brand;
    private Integer frameSize;

    Bicycle1(String brand) {
        this.brand = brand;
        this.frameSize = 0;
    }

    Bicycle1(String brand, Integer frameSize) {
        this.brand = brand;
        this.frameSize = frameSize;
    }

    public Integer getFrameSize() {
        return frameSize;
    }
}
