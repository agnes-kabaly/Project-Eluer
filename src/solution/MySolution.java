package solution;

public class MySolution implements Solution {

    @Override
    public int multiples(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    @Override
    public int multiplesOf3And5(int num) {
        int sumMultiples = 0;
        int five = 5;
        int three = 3;
        int min15 = 15;

        int howManyTimes5 = (num-1)/five;
        int howManyTimes3 = (num-1)/three;
        int howManyTimes15 = num/min15;

        sumMultiples += repeater(howManyTimes5, five);
        sumMultiples += repeater(howManyTimes3, three);
        sumMultiples -= repeater(howManyTimes15, min15);

        return sumMultiples;
    }

    private int repeater(int howManyTimes, int multi) {
        int toAdd = 0;
        for(int i=0; i <= howManyTimes; i++) {
            toAdd += i * multi;
        }
        return toAdd;
    }

    @Override
    public int multiplesTWO(int num) {
        int sumMulti = 0;
        for(int i = 1; i < num; i++) {
            if (i % 15 == 0) {
                sumMulti += i;
            } else if (i % 3 == 0) {
                sumMulti += i;
            } else if (i % 5 == 0) {
                sumMulti += i;
            }
        }
        return sumMulti;
    }


}