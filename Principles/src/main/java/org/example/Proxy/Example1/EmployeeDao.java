package org.example.Proxy.Example1;

public interface EmployeeDao {

    public void create(String client, EmployeeDao obj) throws Exception;
    public void delete(String client, int employeeId) throws Exception;
    public EmployeeDo get(String client, int employeeId) throws Exception;
}
