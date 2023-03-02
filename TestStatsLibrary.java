import java.util.ArrayList;
import java.math.BigInteger;
import java.util.Collections;

/**
 * This is the where we test the StatsLibrary for Project 1.
 * 
 * Dillon Groh
 */
public class TestStatsLibrary
{
    public static void main(String[] args) {
        //Calls StatsLibrary class
        StatsLibrary test = new StatsLibrary();
        //Creates ArrayList with many test numbers for mean, median, mode, and standard deviation
        ArrayList<Integer> someNumbers = new ArrayList<>();
        ArrayList<Integer> moreNumbers = new ArrayList<>();
        
        someNumbers.add(1);
        someNumbers.add(18);
        someNumbers.add(3);
        someNumbers.add(4);
        someNumbers.add(9);
        someNumbers.add(7);
        someNumbers.add(3);
        someNumbers.add(6);
        someNumbers.add(8);
        someNumbers.add(2);
        someNumbers.add(10);
        someNumbers.add(4);
        someNumbers.add(18);
        someNumbers.add(4);
        
        moreNumbers.add(14);
        moreNumbers.add(8);
        moreNumbers.add(3);
        moreNumbers.add(12);
        moreNumbers.add(14);
        moreNumbers.add(14);
        moreNumbers.add(6);
        moreNumbers.add(87);
        moreNumbers.add(9);
        
        //Output for someNumbers
        System.out.println("This list is comprised of numbers: " + someNumbers);
        System.out.println("Average of input is: " + test.findMean(someNumbers));
        System.out.println("Median of the input is: " + test.findMedian(someNumbers));
        System.out.println("Mode of input is: " + test.findMode(someNumbers));
        System.out.println("Standard Deviation of the input is: " + test.findStandardDeviation(someNumbers)); 
        
        //Output for moreNumbers
        System.out.println("This list is comprised of numbers: " + moreNumbers);
        System.out.println("Average of input is: " + test.findMean(moreNumbers));
        System.out.println("Median of the input is: " + test.findMedian(moreNumbers));
        System.out.println("Mode of input is: " + test.findMode(moreNumbers));
        System.out.println("Standard Deviation of the input is: " + test.findStandardDeviation(moreNumbers)); 
        
        //Factorial test for the number 5 which equals 120
        System.out.println("The factorial of 5 is: " + test.findFactorial(BigInteger.valueOf(5)));
        
        //Permutation test for n = 5 and r = 3 which equals 60 because it is 5 choose 3
        System.out.println("The permutation of n = 5 and r = 3 is: " + test.findPermutation(BigInteger.valueOf(5), BigInteger.valueOf(3)));
        
        //Combination test for n = 7 and r = 3 which equals 35
        System.out.println("The combinations of n = 7 and r = 4 are: "+ test.findCombinations(BigInteger.valueOf(7), BigInteger.valueOf(4)));
        
        //Binomial Distribution test where we flip a coin 5 times and the chances of it landing on heads 2 times exactly.
        //The probability when flipping a coin (p) is 0.5, the number of trials (n) is 5, and the exact number of succeses (y) is 2. The answer should be 31.25%
        System.out.println("The binomial distribution when flipping a coin 5 times and having it land on heads exactly 2 times is: " + test.findBinomialDistribution(5,2,0.5) + "%");
        
        //Geometric Distribution test where we test the probability of landing a tail on the 5th toss.
        //The probability when flipping a coin (p) is 0.5, and the amount of trials (y) is 5. This implies that the first four flips were all heads and this one will be tails. The answer should be 3.125%
        System.out.println("The geometric distribution when getting your first tails on the 5th flip is: " + test.findGeometricDistribution(0.5, 5) + "%");
        
    }
}
