package SampleJunit.SampleJunit;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
      Class1.class,
      Class2.class
        	})
public  class JunitTestSuite {

}
