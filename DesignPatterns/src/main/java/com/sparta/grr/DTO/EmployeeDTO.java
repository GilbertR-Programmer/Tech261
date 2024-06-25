package com.sparta.grr.DTO;

import java.time.LocalDate;
import java.util.Objects;

//DATA TRANSFER OBJECT
public class EmployeeDTO {

    private final String name;
    private final Integer salary; // using Integer here to have slightly more functionality
    private final LocalDate dob;

    public EmployeeDTO(String name, Integer salary, LocalDate dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        EmployeeDTO that = (EmployeeDTO) object;
        return Objects.equals(name, that.name) && Objects.equals(salary, that.salary) && Objects.equals(dob, that.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, dob);
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob=" + dob +
                '}';
    }
}
