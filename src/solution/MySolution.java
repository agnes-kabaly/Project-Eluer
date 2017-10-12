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
        for (int i = 2; i <= num; i++) {
            if (result%i != 0) {
                i = 0;
                result++;
            }
        }
        return result;
    }

    @Override
    public int sumSquareDifference(int num) {
        return squareOfSum(num) - sumSquares(num);
    }

    private int sumSquares(int num) {
        int sum = 0;
        for (int i=1; i <= num; i++) {
            sum += i*i;
        }
        return sum;
    }

    private int squareOfSum(int num) {
        int sum = 0;
        for (int i=1; i <= num; i++) {
            sum += i;
        }
        return sum * sum;
    }

    // I have to optimize this...
    @Override
    public int prime10001st(int num) {
        int primeCounter = 0;
        int i = 2;
        while (primeCounter < num) {
            if (isPrime(i)) {
                primeCounter++;
            }
            i++;
        }
        return --i;
    }

    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public long largestProductSeries(int num){
        String numbers = "73167176531330624919225119674426574742355349194934" +
                "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450";
        char[] charArr = numbers.toCharArray();
        int[] numArray = new int[numbers.toCharArray().length];
        for (int i=0; i < charArr.length; i++) {
            numArray[i] = Integer.parseInt(String.valueOf(charArr[i]));
        }

        long maxNumValue = 1;
        for (int i = 0; i < num; i++) {
            maxNumValue = maxNumValue*numArray[i];
        }

        String newMax = "";
        for (int j = 0; j < numArray.length-num; j++ ){
            for (int i=j; i<num+j; i++) {
                if (newMax.length() == num) {
                    long valueOfNew = 1;
                    for (char c : newMax.toCharArray()) {
                        valueOfNew = Integer.parseInt(String.valueOf(c))*valueOfNew;
                    }
                    if (maxNumValue < valueOfNew) {
                        maxNumValue = valueOfNew;
                    }
                    newMax = "";
                }
                newMax += String.valueOf(numArray[i]);
            }
        }
        return maxNumValue;
    }

    @Override
    public int specialPythagoreanTriplet(int num) {
        int a;
        int b;
        int c;
        int[] resultArr = new int[3];
        int result = 0;
        for (a = 0; a < num; a++) {
            for (b = a+1; b < num; b++) {
               for (c = b+1; c < num; c++) {
                   if (c==num-a-b && a*a+b*b==c*c) {
                       resultArr[0] = a;
                       resultArr[1] = b;
                       resultArr[2] = c;
                       result = a*b*c;
                       return result;
                   }
               }
            }
        }
        return result;
    }

    @Override
    public long summationPrimes(int num) {
        long sum = 2;
        for (int i = 2; i < num; i++) {
            if (isPrimeTwo(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private boolean isPrimeTwo(int num) {
        for (int i = 2; i < Math.sqrt(num)+1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}