package stream_api;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtilTest {
    @Test
    public void totalSalaryIsWorking() {
        List<Employee> employees = asList(
               Employee.builder().salary(10).build(),
               Employee.builder().salary(12).build(),
               Employee.builder().salary(15).build()
        );

        int total = EmployeeUtil.totalSalary(employees);
        Assert.assertEquals(37, total);
    }
    @Test
    public void totalSalaryIsWorkingForEmptyList() {
        List<Employee> employees = asList();

        int total = EmployeeUtil.totalSalary(employees);
        Assert.assertEquals(0, total);
    }
}






