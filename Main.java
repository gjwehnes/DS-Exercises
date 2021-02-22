import java.util.List;
import org.junit.runner.*;

public class Main {

	static JUnitCore core = new JUnitCore();
	static int totalRunCount = 0;
	static int totalFailureCount = 0;
	static ClassLoader classLoader = Main.class.getClassLoader();;

	public static void main(String[] args) {

		runTest("ex029.ArrayPractice1Test");
		runTest("ex030.ArrayPractice2Test");
		runTest("ex031.ArrayPractice3Test");
		runTest("ex032.ArrayLoopingPractice1Test");
		runTest("ex033.ArrayLoopingPractice2Test");
		runTest("ex034.ArrayLoopingPractice3Test");
		runTest("ex035.ArrayLoopingPractice4Test");
		runTest("ex036.ArrayLists1Test");
		runTest("ex037.ArrayLists2Test");
		runTest("ex038.ArrayLists3Test");
		runTest("ex039.ArrayLists4Test");
		runTest("ex040.ArrayLists5Test");
		runTest("ex041.ArrayLists6Test");
		runTest("ex042.ArrayLists7Test");
		runTest("ex043.ArrayLists8Test");
		runTest("ex044.TwoDArrayPractice1Test");
		runTest("ex045.TwoDArrayPractice2Test");
		runTest("ex046.TwoDArrayPractice3Test");
		runTest("ex047.TwoDArrayPractice4Test");
		runTest("ex048.TwoDArrayPractice5Test");
		runTest("ex049.TwoDArrayPractice6Test");
		runTest("ex050.TwoDArrayPractice7Test");

		System.out.println("*** TOTAL ***");
		System.out.println(String.format("[%10d tests started         ]", totalRunCount));
		System.out.println(String.format("[%10d tests passed          ]", totalRunCount - totalFailureCount));
		System.out.println(String.format("[%10d tests failed          ]", totalFailureCount));

	}

	private static void runTest(String className) {		
		
		Class testClass = null;
		
		try {
			testClass = classLoader.loadClass(className);
		} catch (ClassNotFoundException e) {
		}

		System.out.println("*** " + className + " ***");

		if (testClass == null) {
			System.out.println("Test could not be loaded");
            totalRunCount += 1;
			totalFailureCount += 1;
		}
		else {
			Result result = core.run(testClass);

			List<org.junit.runner.notification.Failure> failures = result.getFailures();

			if (failures.size() > 0) {
				System.out.println(String.format("Failures (%d)", failures.size()));
				for (org.junit.runner.notification.Failure failure : failures) {
					System.out.println("Test:   " + failure.getTestHeader());
					System.out.println("Msg:    " + failure.getMessage());

					String[] trace = failure.getTrace().split("\\r?\\n");
					for (int i = 0; i < trace.length; i++) {
						if (trace[i].contains(className)) {
							System.out.println("Trace:  " + trace[i]);
						}
					}
				}
			}

			System.out.println(String.format("Test run finished after %d ms", result.getRunTime()));
			System.out.println(String.format("[%10d tests started         ]", result.getRunCount()));
			System.out.println(String.format("[%10d tests passed          ]", result.getRunCount() - result.getFailureCount()));
			System.out.println(String.format("[%10d tests failed          ]", result.getFailureCount()));
			
			totalRunCount += result.getRunCount();
			totalFailureCount += result.getFailureCount();
		}		


	}


}
