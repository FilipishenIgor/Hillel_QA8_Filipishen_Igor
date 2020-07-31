package web_tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses( {
            MyTestsSearch.class,
            MyTestsLoginAndRecover.class,
            AutoTest.class
}


)
public class TestSuit {
}
