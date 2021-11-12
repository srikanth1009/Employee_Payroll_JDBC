package com.bridzelabz.jdbc;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class EmployeePayrollServiceTest {

    /**
     * Purpose : To test whether the number of records present in the database matches with the expected value
     */
    @Test
    public void givenEmployeePayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.DB_IO);
        Assert.assertEquals(4, employeePayrollData.size());
    }
}
