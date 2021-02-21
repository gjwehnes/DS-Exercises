import java.util.List;
import org.junit.runner.*;

public class Main {

	static JUnitCore core = new JUnitCore();
	static int totalRunCount = 0;
	static int totalFailureCount = 0;
	static ClassLoader classLoader = Main.class.getClassLoader();;

	public static void main(String[] args) {


		runTest("ex015.DividerTest");
		runTest("ex016.DonutBoxesTest");
		runTest("ex017.MaximumTest");
		runTest("ex018.ConditionalStatements1Test");
		runTest("ex019.ConditionalStatements2Test");
		runTest("ex020.ConditionalStatements3Test");
		runTest("ex021.ConditionalStatements4Test");
		runTest("ex022.ConditionalStatements6Test");
		runTest("ex023.Loops1Test");
		runTest("ex024.Loops2Test");
		runTest("ex025.Loops3Test");
		runTest("ex026.Loops4Test");
		runTest("ex027.Loops5Test");
		runTest("ex028.Loops6Test");

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
