package BasicTestng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class firsttestng {
  

@Test(retryAnalyzer = BasicTestng.failedTestcases.class)
  public void f() {
	//  System.out.print(a+b);
	  int count = 0;
	  int c=5;
	  String abc= null;
	//  assertNotNull(abc);
	  
	  
	//  System.setProperties("webdriver.chrome.driver,"");
  }


@Test
@Parameters("Anubhav")
public void name1(String ab)
{
	System.out.println("Hello ecplice"+ab);
	int a;
}


  
  @DataProvider
  public  Object [][]getData()
  {
	  Object Data[][] = {{"I am anubhav","Kumm" },{"Faridabad","Hatya"}};
	  
	  return Data;
  }
  
}
