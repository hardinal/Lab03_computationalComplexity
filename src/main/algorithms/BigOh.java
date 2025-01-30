package algorithms;
import java.util.Random;

/**
 * Algorithmic complexity testing.
 * This class contains various methods for testing Big O and time.
 * @author Austin Hardin
 * @version v1
 */
public class BigOh
{
    private static final double MILLISECONDS_PER_SECOND = 1000.0;
    private static final int NUM_TRIALS = 5;
    private Random rand;

    /**
     * Big O constructor.
     */
    public BigOh()
    {
        this.rand = new Random();
    }

    /**
     * Instantiates a new Big oh.
     *
     * @param rand the rand
     */
    public BigOh(Random rand)
    {
        this.rand = rand;
    }

    /**
     * Runs a specific algorithm based on choice.
     *
     * @param choice the chosen MysteryAlgorithm
     * @param numElements the size of the input for the algorithm
     * @return the results of the algorithm, or -1 if choice invalid
     */
    public int runAlgorithm(int choice, int numElements)
    {
        switch (choice)
        {
            case 1:
                return MysteryAlgorithms.alg1(numElements, rand);
            case 2:
                return MysteryAlgorithms.alg2(numElements, rand);
            case 3:
                return MysteryAlgorithms.alg3(numElements, rand);
            case 4:
                return MysteryAlgorithms.alg4(numElements, rand);
            case 5:
                return MysteryAlgorithms.alg5(numElements, rand);
            case 6:
                return MysteryAlgorithms.alg6(numElements, rand);
            default:
                return -1;
        }
    }

    /**
     * Computes the theoretical time complexity for the chosen algorithm
     * and input size.
     *
     * @param choice chosen algorithm
     * @param n      input size
     * @return the BigO functional result, or -1 for invalid
     */
    public double bigOhFunc(int choice, double n)
    {
        if (n <= 0)
        {
            return -1;
        }

        switch (choice)
        {
            case 1:
                return n;
            case 2:
                return Math.pow(n, 3);
            case 3, 4:
                return Math.pow(n, 2);
            case 5:
                return Math.pow(n, 5);
            case 6:
                return Math.pow(n, 4);
            default:
                return -1;
        }
    }

    /**
     * A method for calculating the time of the algorithm.
     * It works as a stop watch by taking current time,
     * running the algorithm, taking end time,
     * and finally returning time elapsed.
     *
     * @param choice chosen algorithm
     * @param n      input size
     * @return the difference in T_f and T_i
     */
    public double timeAlgorithm(int choice, int n)
    {
        System.gc();

        long start = System.currentTimeMillis();

        runAlgorithm(choice, n);

        long finishLine = System.currentTimeMillis();

        return (finishLine - start) / MILLISECONDS_PER_SECOND;
    }

    /**
     * Method for finding the fastest compute time of the algorithm.
     * It stores the largest value possible, fastestLap_i,
     * loops over the number of trials,
     * then compares the lapTime with fastestLap.
     * If a faster time is found, it replaces fastestLap.
     *
     * @param choice chosen algorithm
     * @param n      input size
     * @return the fastest time after loop completion
     */
    public double robustTimeAlgorithm(int choice, int n)
    {
        double fastestLap = Double.MAX_VALUE;

        for (int i = 0; i < NUM_TRIALS; ++i)
        {
            double lapTime = timeAlgorithm(choice, n);
            if (lapTime < fastestLap)
            {
                fastestLap = lapTime;
            }
        }
        return fastestLap;
    }

    /**
     * Estimates the execution time for the chosen algorithm
     * with two sizes.
     *
     * @param choice chosen algorithm
     * @param n1     the input 1
     * @param t1     the time for t1
     * @param n2     the second input
     * @return the double
     */
    public double estimateTiming(int choice, int n1, double t1, int n2)
    {
        double bigOn1 = bigOhFunc(choice, n1);
        double bigOn2 = bigOhFunc(choice, n2);

        if (bigOn1 <= 0 || bigOn2 <= 0)
        {
            return -1;
        }

        if (bigOn1 == bigOn2)
        {
            System.out.println(bigOn1 + " and " + bigOn2 + " are equal");
        }

        return t1 * (bigOn2 / bigOn1);
    }

    /**
     * Helper method for calculating the percent error
     * between the estimated value and the correct value.
     *
     * @param correct  the correct value
     * @param estimate the estimated value
     * @return the percent error
     */
    public double percentError(double correct, double estimate)
    {
        return (estimate - correct) / correct;
    }

    /**
     * Method calculated the percent error.
     * It does so by taking T_1 actual and using it to estimate T_2.
     * T_2 actual is calculated and the %error between estimated and actual
     * are computed.
     *
     * @param choice chosen algorithm
     * @param n1     input 1
     * @param n2     input 2
     * @return the %error between the estimated and actual T.
     */
    public double computePercentError(int choice, int n1, int n2)
    {
        double t1Ro = robustTimeAlgorithm(choice, n1);
        double t2Est = estimateTiming(choice, n1, t1Ro, n2);
        double t2Ro = robustTimeAlgorithm(choice, n2);
        return percentError(t2Ro, t2Est);
    }
}
