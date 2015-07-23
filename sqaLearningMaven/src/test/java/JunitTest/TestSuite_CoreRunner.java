package JunitTest;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import automation.Test1;
import automation.TestStringLength;

public class TestSuite_CoreRunner {
	public static void main(String[] args) {
		JUnitCore runner = new JUnitCore();
		runner.addListener(new TextListener(System.out));
		runner.run(
			Test1.class,
			TestStringLength.class);
	}
}
