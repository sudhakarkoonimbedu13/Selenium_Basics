package DataDriverTesting_JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
		
{   GooglePage.class,
	LoginTest.class,
	DemoToursTesting_ErrorCollector.class
 
}
)
public class MySuite1Runner 
{
  
}
