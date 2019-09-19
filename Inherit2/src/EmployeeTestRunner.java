import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ EmployeeTests.class, HourlyEmployeeTests.class, SalariedEmployeeTests.class })

public class EmployeeTestRunner {

}