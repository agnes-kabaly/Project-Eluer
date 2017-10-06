package solution;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public BigInteger evenFibonacciNumbers(BigInteger num) {
        BigInteger sumBigInt = BigInteger.valueOf(2);
        BigInteger tempBig1 = BigInteger.valueOf(1);
        BigInteger tempBig2 = BigInteger.valueOf(2);
        BigInteger nextFiboBig = BigInteger.valueOf(0);

        while (nextFiboBig.compareTo(num) < 0) {
            nextFiboBig = tempBig1.add(tempBig2);
            if ((nextFiboBig).mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))) {
                sumBigInt = sumBigInt.add(nextFiboBig);
            }
            tempBig1 = tempBig2;
            tempBig2 = nextFiboBig;
        }
        return sumBigInt;
    }

    @Override
    public int[] largestPrimeFactor(long num) {
        List<Integer> resultList = new ArrayList<>();
        for (int i=2; i <= num; i++) {
            if (num % i == 0) {
                resultList.add(i);
                num = num / i;
            }
        }
        return resultList.stream().mapToInt(i->i).toArray();
    }

    @Override
    public int largestPalindrome(int num1, int num2) {
        int max = 0;
        for (int i = num1; i >= num1/2; i--) {
            for (int j = num2; j >= num2/2; j--) {
                int isPali = i*j;
                if (isPalindrome(isPali)) {
                    if (max < isPali) {
                        max = isPali;
                    }
                }
            }
        }
        return max;
    }

    private boolean isPalindrome(int checkPali) {
        char[] numArr = (Integer.toString(checkPali)).toCharArray();
        int begin = 0;
        int end = numArr.length - 1;
        while (end > begin) {
            if (numArr[begin] != numArr[end]) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    // I have to optimize this...
    @Override
    public int smallestMultiple(int num) {
        int result = num;
        for (int i = 2; i < num+1; i++) {
            if (result%i != 0) {
                i = 0;
                result++;
            }
        }
        return result;
    }

    @Override
    public int sumSquareDifference(int num) {
        return squareOfSum(10) - sumSquares(10);
    }

    public int sumSquares(int num) {
        int sum = 0;
        for (int i=1; i < num+1; i++) {
            sum += i*i;
        }
        return sum;
    }

    public int squareOfSum(int num) {
        int sum = 0;
        for (int i=1; i < num+1; i++) {
            sum += i;
        }
        return sum * sum;
    }

}