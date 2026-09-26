package programmingJava8AndAbove;

import jdk.incubator.vector.*;

public class Main {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {10, 20, 30, 40};
        int[] result = new int[4];

        VectorSpecies<Integer> species =
                IntVector.SPECIES_PREFERRED;

        IntVector va =
                IntVector.fromArray(species, a, 0);

        IntVector vb =
                IntVector.fromArray(species, b, 0);

        IntVector vc =
                va.add(vb);

        vc.intoArray(result, 0);

        System.out.println(java.util.Arrays.toString(result));
    }
}
