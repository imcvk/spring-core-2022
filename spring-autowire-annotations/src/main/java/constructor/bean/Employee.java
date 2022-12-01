package constructor.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private int empId;
    private String empName;

    private Address address;

    public Employee() {
    }

    @Autowired
    public Employee(int empId, String empName, Address address) {
        System.out.println("Autowired using constructor");
        this.empId = empId;
        this.empName = empName;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", address=" + address +
                '}';
    }
}
