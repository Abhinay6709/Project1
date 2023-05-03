package Tests;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class listeners extends TestListenerAdapter {
    public void onTestSuccess(ITestResult tr) {
       System.out.println("TestSuccess");
    }

    public void onTestFailure(ITestResult tr) {
        System.out.println("failed");
    }

    public void onTestSkipped(ITestResult tr) {
        System.out.println("skipped");
    }
    public void onStart(ITestContext testContext) {

        System.out.println("start");
    }

    public void onFinish(ITestContext testContext) {
        System.out.println("finish");
    }

}
