package BasicTestng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

  class failedTestcases implements IRetryAnalyzer{
	

	private int retryc =0;
	private static final int maxretry=5;
	
	public boolean retry(ITestResult result)
	{
		
		if(retryc < maxretry)
		{
			retryc++;
			return true;
		}
		return false;
		
	}
	
}
