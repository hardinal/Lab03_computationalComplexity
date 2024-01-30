package algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import labtests.util.StructureTest;
import labtests.util.specs.ClassSpec;
import labtests.util.specs.ConstructorSpec;
import labtests.util.specs.FieldSpec;
import labtests.util.specs.MethodSpec;

/**
 * BigOhTest provides test cases for the BigOh class.
 * 
 * @author Mitch Parry
 * @version 2013-08-13
 */
public class BigOhTest extends StructureTest
{
    public static final double EPS = 0.15;
    public static final double TOL = 1e-9;
    public static final long SEED = 1089575;
    public static final int[] N01 = {10000000, 204, 4248, 3130, 39, 50};
    public static final int[] N02 = {20000000, 258, 6000, 4400, 45, 100};
    public static final int[] N04 = {40000000, 325, 8500, 6260, 52, 132};
    public static final int[] N05 = {50000000, 350, 9500, 7000, 54, 140};
    public static final int[] N06 = {60000000, 372, 10400, 7668, 56, 147};
    public static final int[] N10 = {100000000, 500, 14000, 10000, 62, 165};
    public static final int[] N15 = {130000000, 515, 16500, 11500, 67, 180};
    public static final int[] N100 = {1000000000, 1000, 43000, 30000, 100, 295};
    private BigOh bo;
    private boolean bigOhFuncComprehensible = false;
    private boolean bigOhFuncPasses = false;

    /**
     * Creates a BigOh object.
     * 
     * @throws Exception
     *             if something goes wrong during setup
     */
    @BeforeEach
    public void setUp() throws Exception
    {
        bo = new BigOh(new Random(SEED));
        bigOhFuncComprehensible = checkBigOhFunc();
        bigOhFuncPasses = checkBigOhFunc2();
    }

    /**
     * testAlgorithm1 tests the complexity estimate for alg 1.
     */
    @Test
    public void testAlgorithm1()
    {
        testBigOhFunc();
        final int CHOICE = 1;
        final int N1 = N02[CHOICE - 1];
        final int N2 = N10[CHOICE - 1];
        double error = bo.computePercentError(CHOICE, N1, N2);
        double errorUp = (error + 1) * N1 / N2 - 1;
        double errorDown = (error + 1) * N2 / N1 - 1;
        System.out.println(errorUp);
        System.out.println(error);
        System.out.println(errorDown);
        assertTrue(Math.abs(error) < Math.abs(errorUp),
            "Error is too large for algorithm " + CHOICE + " timing.");
        assertTrue(Math.abs(error) < Math.abs(errorDown),
            "Error is too large for algorithm " + CHOICE + " timing.");
    }

    /**
     * testAlgorithm2 tests the complexity estimate for alg 2.
     */
    @Test
    public void testAlgorithm2()
    {
        testBigOhFunc();
        final int CHOICE = 2;
        final int N1 = N02[CHOICE - 1];
        final int N2 = N06[CHOICE - 1];
        double error = bo.computePercentError(CHOICE, N1, N2);
        double errorUp = (error + 1) * N1 / N2 - 1;
        double errorDown = (error + 1) * N2 / N1 - 1;
        System.out.println(errorUp);
        System.out.println(error);
        System.out.println(errorDown);
        assertTrue(Math.abs(error) < Math.abs(errorUp),
            "Error is too large for algorithm " + CHOICE + " timing.");
        assertTrue(Math.abs(error) < Math.abs(errorDown),
            "Error is too large for algorithm " + CHOICE + " timing.");
    }

    /**
     * testAlgorithm3 tests the complexity estimate for alg 3.
     */
    @Test
    public void testAlgorithm3()
    {
        testBigOhFunc();
        final int CHOICE = 3;
        final int N1 = N02[CHOICE - 1];
        final int N2 = N10[CHOICE - 1];
        double error = bo.computePercentError(CHOICE, N1, N2);
        double errorUp = (error + 1) * N1 / N2 - 1;
        double errorDown = (error + 1) * N2 / N1 - 1;
        System.out.println(errorUp);
        System.out.println(error);
        System.out.println(errorDown);
        assertTrue(Math.abs(error) < Math.abs(errorUp),
            "Error is too large for algorithm " + CHOICE + " timing.");
        assertTrue(Math.abs(error) < Math.abs(errorDown),
            "Error is too large for algorithm " + CHOICE + " timing.");
    }

    /**
     * testAlgorithm4 tests the complexity estimate for alg 4.
     */
    @Test
    public void testAlgorithm4()
    {
        testBigOhFunc();
        final int CHOICE = 4;
        final int N1 = N02[CHOICE - 1];
        final int N2 = N10[CHOICE - 1];
        double error = bo.computePercentError(CHOICE, N1, N2);
        double errorUp = (error + 1) * N1 / N2 - 1;
        double errorDown = (error + 1) * N2 / N1 - 1;
        System.out.println(errorUp);
        System.out.println(error);
        System.out.println(errorDown);
        assertTrue(Math.abs(error) < Math.abs(errorUp),
            "Error is too large for algorithm " + CHOICE + " timing.");
        assertTrue(Math.abs(error) < Math.abs(errorDown),
            "Error is too large for algorithm " + CHOICE + " timing.");
    }

    /**
     * testAlgorithm5 tests the complexity estimate for alg 5.
     */
    @Test
    public void testAlgorithm5()
    {
        testBigOhFunc();
        final int CHOICE = 5;
        final int N1 = N02[CHOICE - 1];
        final int N2 = N10[CHOICE - 1];
        double error = bo.computePercentError(CHOICE, N1, N2);
        double errorUp = (error + 1) * N1 / N2 - 1;
        double errorDown = (error + 1) * N2 / N1 - 1;
        System.out.println(errorUp);
        System.out.println(error);
        System.out.println(errorDown);
        assertTrue(Math.abs(error) < Math.abs(errorUp),
            "Error is too large for algorithm " + CHOICE + " timing.");
        assertTrue(Math.abs(error) < Math.abs(errorDown),
            "Error is too large for algorithm " + CHOICE + " timing.");
    }

    /**
     * testAlgorithm6 tests the complexity estimate for alg 6.
     */
    @Test
    public void testAlgorithm6()
    {
        testBigOhFunc();
        final int CHOICE = 6;
        final int N1 = N02[CHOICE - 1];
        final int N2 = N10[CHOICE - 1];
        double error = bo.computePercentError(CHOICE, N1, N2);
        double errorUp = (error + 1) * N1 / N2 - 1;
        double errorDown = (error + 1) * N2 / N1 - 1;
        System.out.println(errorUp);
        System.out.println(error);
        System.out.println(errorDown);
        assertTrue(Math.abs(error) < Math.abs(errorUp),
            "Error is too large for algorithm " + CHOICE + " timing.");
        assertTrue(Math.abs(error) < Math.abs(errorDown),
            "Error is too large for algorithm " + CHOICE + " timing.");
    }

    /**
     * testRunAlgorithmInvalidChoice test runAlgorithm with an invalid choice
     * value.
     */
    @Test
    public void testRunAlgorithmInvalidChoice()
    {
        testBigOhFunc();
        BigOh bo = new BigOh();
        int ans = bo.runAlgorithm(-1, 10);
        assertTrue(ans < 0, "runAlgorithm runs unexpected algorithm for choice = -1");
    }

    /**
     * testRunAlgorithm test runAlgorithm with valid choices.
     */
    @Test
    public void testRunAlgorithm()
    {
        testBigOhFunc();
        final int[] ANSWERS = {7500077, 6366063, 2255973,
            2450983, 2110321, 547343};
        for (int i = 0; i < ANSWERS.length; i++)
        {
            int ans = bo.runAlgorithm(i + 1, N01[i]);
            assertEquals(ANSWERS[i], ans,
                "runAlgorithm returns wrong result choice = " + (i + 1));
        }
    }

    public boolean checkBigOhFunc()
    {
        final double[] ANSWERS = {1.000000000, 0.903089987, 2.079441542,
            3.000000000, 8.000000000, 7.224719896, 16.635532333, 24.000000000,
            64.000000000, 57.797759167, 133.084258668, 192.000000000,
            512.000000000, 4096.000000000, 32768.000000000, 262144.000000000,
            2097152.000000000, 16777216.000000000};
        final int N = 8;
        for (int i = 0; i < 6; i++)
        {
            double ans = bo.bigOhFunc(i + 1, N);
            int index = -1;
            for (int j = 0; j < ANSWERS.length; j++)
            {
                if (Math.abs(ANSWERS[j] - ans) < TOL)
                {
                    index = j;
                    break;
                }
            }
            if (index < 0)
            {
                return false;
            }
        }
        return true;
    }


    /**
     * testBigOhFunc tests all the user-defined BigOh functions to see if they
     * are all right but does not provide helpful feedback.
     */
    @Test
    public void testBigOhFunc()
    {
        assertTrue(bigOhFuncComprehensible,
            "bigOhFunc returns at least one incomprehensible result");
        assertTrue(bigOhFuncPasses,
            "bigOhFunc returns at least one incorrect result");
    }

    /**
     * Helper method to make sure the big-oh function passes before anything 
     * else.
     * @return true if the big-oh function is correct.
     */
    public boolean checkBigOhFunc2()
    {
        final int[] ANSWERS = {123, 512, 36, 1156, 1024, 625};
        final int[] N = {123, 8, 6, 34, 4, 5};
        BigOh bo = new BigOh();
        for (int i = 0; i < ANSWERS.length; i++)
        {
            double ans = bo.bigOhFunc(i + 1, N[i]);
            if (Math.abs(ANSWERS[i] - ans) > TOL)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * correctRobustTimeAlgorithm provides a correct implementation of the
     * robustTimeAlgorithm method.
     * 
     * @param choice
     *            Algorithm number
     * @param n
     *            problem size
     * @return the time in seconds
     */
    private double correctRobustTimeAlgorithm(int choice, int n)
    {
        testBigOhFunc();
        double minSeconds = Double.MAX_VALUE;
        for (int i = 0; i < 5; i++)
        {
            double seconds = correctTimeAlgorithm(choice, n);
            if (seconds < minSeconds)
            {
                minSeconds = seconds;
            }
        }
        return minSeconds;
    }

    /**
     * correctTimeAlgorithm provides a correct implementation of the
     * timeAlgorithm method.
     * 
     * @param choice
     *            Algorithm number
     * @param n
     *            problem size
     * @return the time in seconds
     */
    private double correctTimeAlgorithm(int choice, int n)
    {
        testBigOhFunc();
        final double MILLISECONDS_PER_SECOND = 1000.0;
        // make sure that the garbage collector doesn't run
        // during timing. (Do this first.)
        System.gc();

        // TODO
        long startTime = System.currentTimeMillis();
        bo.runAlgorithm(choice, n);
        long finishTime = System.currentTimeMillis();
        long time = finishTime - startTime;
        double seconds = time / MILLISECONDS_PER_SECOND;
        return seconds;
    }

    /**
     * testTimeAlgorithm runs a basic check on the robustTimeAlgorithm method.
     * Checks that this algorithm runs in less than a second.
     */
    @Test
    public void testTimeAlgorithm()
    {
        testBigOhFunc();
        final double MAX_TIME = 1.00;
        final double MIN_TIME = 0.01;
        final int CHOICE = 1;
        double time = bo.timeAlgorithm(CHOICE, N01[CHOICE - 1]);
        System.out.println(time);
        assertTrue(time > MIN_TIME && time < MAX_TIME,
            "timeAlgorithm(" + CHOICE + ", " + N01[CHOICE - 1]
                + ", rand) should be between " + MIN_TIME + " and "
                + MAX_TIME + " seconds: " + time + " seconds.");
    }

    /**
     * testRobustTimeAlgorithm runs a basic check on the robustTimeAlgorithm
     * method.
     */
    @Test
    public void testRobustTimeAlgorithm()
    {
        testBigOhFunc();
        final int CHOICE = 1;
        final int TRIALS = 10;
        double average = 0.0;
        for (int i = 0; i < TRIALS; i++)
        {
            average += bo.timeAlgorithm(CHOICE, N02[CHOICE - 1]);
        }
        average /= TRIALS;
        double robust = Double.MAX_VALUE;
        for (int i = 0; i < 2; i++)
        {
            double r = bo.robustTimeAlgorithm(CHOICE, N02[CHOICE - 1]);
            if (r < robust)
            {
                robust = r;
            }
        }
        assertTrue(robust < average,
            "robustTimeAlgorithm should be less than average "
                + "timeAlgorithm.\naverage = " + average
                + "; robust = " + robust
                + "\n");
    }

    /**
     * testRobustTimeAlgorithm runs a basic check on the robustTimeAlgorithm
     * method.
     */
    @Test
    public void testRobustTimeAlgorithm2()
    {
        testBigOhFunc();
        final int CHOICE = 1;
        double t0 = correctRobustTimeAlgorithm(CHOICE, N02[CHOICE - 1]);
        bo = new BigOh(new Random(SEED));
        double t1 = bo.robustTimeAlgorithm(CHOICE, N02[CHOICE - 1]);
        double error = (t1 - t0) / t0;
        assertEquals(0.0, error, EPS,
            "robustTimeAlgorithm has more than "
                + (100 * EPS) + "% error for algorithm "
                + CHOICE);
    }

    /**
     * testEstimateTiming checks that the function is correct.
     */
    @Test
    public void testEstimateTiming()
    {
        testBigOhFunc();
        final int N1 = 1000000;
        final int N2 = 2000000;
        final double T1 = 0.5;
        final double CORRECT = 1.0;
        final int CHOICE = 1;
        double student = bo.estimateTiming(CHOICE, N1, T1, N2);
        assertEquals(CORRECT, student, TOL,
            "estimateTiming equation is incorrect.");
    }

    /**
     * testEstimateTiming checks that the function is correct.
     */
    @Test
    public void testEstimateTiming2()
    {
        testBigOhFunc();
        final int[] N1 = {123, 8, 6, 34, 4, 5};
        final int[] N2 = {188, 10, 3, 42, 6, 10};
        final double T1 = 0.5;
        for (int i = 0; i < N1.length; i++)
        {
            int choice = i + 1;
            double correct = T1 * bo.bigOhFunc(choice, N2[i])
                / bo.bigOhFunc(choice, N1[i]);
            double student = bo.estimateTiming(choice, N1[i], T1, N2[i]);
            assertEquals(correct, student, TOL,
                "estimateTiming equation is incorrect.");
        }
    }

    /**
     * testPercentError checks the percentError method.
     */
    @Test
    public void testPercentError()
    {
        testBigOhFunc();
        final int CORRECT_1 = 100;
        final int ESTIMATE_1 = 95;
        final double ERROR_1 = -0.05;
        final double CORRECT_2 = 2.0;
        final double ESTIMATE_2 = 2.5;
        final double ERROR_2 = 0.25;
        BigOh bo = new BigOh();
        double perc = bo.percentError(CORRECT_1, ESTIMATE_1);
        assertTrue(perc < 0, "percentError has the wrong sign");
        assertEquals(ERROR_1, perc, TOL, "percentError should be -0.05 when "
            + "correct = 100 and estimated = 95");
        perc = bo.percentError(CORRECT_2, ESTIMATE_2);
        assertTrue(perc > 0, "percentError has the wrong sign");
        assertEquals(ERROR_2, perc, TOL, "percentError should be 0.25 when "
            + "correct = 2 and estimated = 2.5");
    }

    /**
     * correctComputePercentError is a correct implementation of
     * computePercentError that takes an algorithm choice, and two problem sizes
     * and computes the error in estimating the timing of the second problem
     * using the timing of the first.
     * 
     * @param choice
     *            The number representing the algorithm choice
     * @param n1
     *            The first problem size
     * @param n2
     *            The second problem size
     * @return the percent error in estimating t2 given n1 and n2.
     */
    private double correctComputePercentError(int choice,
        int n1, int n2)
    {
        testBigOhFunc();
        double t1 = bo.robustTimeAlgorithm(choice, n1);
        double t2 = bo.robustTimeAlgorithm(choice, n2);
        double e2 = bo.estimateTiming(choice, n1, t1, n2);
        double error = (e2 - t2) / t2;
        return error;
    }

    /**
     * testComputePercentError checks the computePercentError method. As long as
     * you have analyzed algorithm 1 correctly, this should pass.
     */
    @Test
    public void testComputePercentError()
    {
        testBigOhFunc();
        final int CHOICE = 1;
        final int N1 = 20000000;
        final int N2 = 40000000;
        double e1 = bo.computePercentError(CHOICE,
            N1, N2);
        assertEquals(0, e1, EPS,
            "computePercentError: For alg1 doubling N should double time.");
    }

    /**
     * testComputePercentError checks the computePercentError method.
     */
    @Test
    public void testComputePercentError2()
    {
        testBigOhFunc();
        final int CHOICE = 1;
        final double EPS = 0.21;
        final int N1 = 20000000;
        final int N2 = 40000000;
        double e0 = correctComputePercentError(CHOICE,
            N1, N2);
        bo = new BigOh(new Random(SEED));
        double e1 = bo.computePercentError(CHOICE,
            N1, N2);
        assertEquals(e0, e1, EPS, "difference in computePercentError too large");
    }

    @Override
    protected String getClassName()
    {
        return "algorithms.BigOh";
    }

    @Override
    protected ClassSpec getClassSpec()
    {
        return new ClassSpec(getClassName(), "public", false, false, false);
    }

    @Override
    protected ConstructorSpec[] getConstructorSpecs()
    {
        return new ConstructorSpec[]{
            new ConstructorSpec(getClassName(), "public", new String[]{}),
            new ConstructorSpec(getClassName(), "public", new String[]{"java.util.Random"}),
        };
    }

    @Override
    protected FieldSpec[] getFieldSpecs()
    {
        return new FieldSpec[]{
            new FieldSpec("MILLISECONDS_PER_SECOND", "private", true, true, "double"),
            new FieldSpec("NUM_TRIALS", "private", true, true, "int")
        };
    }

    @Override
    protected MethodSpec[] getMethodSpecs()
    {
        return new MethodSpec[]{
            new MethodSpec("robustTimeAlgorithm", "public", false, false,
                false, false, new String[]{"int", "int"}, "double"),
            new MethodSpec("timeAlgorithm", "public", false, false,
                false, false, new String[]{"int", "int"}, "double"),
            new MethodSpec("runAlgorithm", "public", false, false,
                false, false, new String[]{"int", "int"}, "int"),
            new MethodSpec("bigOhFunc", "public", false, false,
                false, false, new String[]{"int", "double"}, "double"),
            new MethodSpec("estimateTiming", "public", false, false, false,
                false, new String[]{"int", "int", "double", "int"}, "double"),
            new MethodSpec("percentError", "public", false, false,
                false, false, new String[]{"double", "double"}, "double"),
            new MethodSpec("computePercentError", "public", false, false,
                false, false, new String[]{"int", "int", "int"}, "double"),
        };
    }

}
