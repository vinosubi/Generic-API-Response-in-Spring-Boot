package com.vinotech.code.mapper;


import com.vinotech.code.entity.EmployeeEntity;
import com.vinotech.code.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public EmployeeEntity getEmployeeEntityFromModel(Employee employee) {
        EmployeeEntity empEntity = new EmployeeEntity();
        empEntity.setName(employee.getName());
        empEntity.setAge(employee.getAge());
        empEntity.setSalary(employee.getSalary());
        empEntity.setAddress(employee.getAddress());
        return empEntity;
    }

    public Employee getEmployeeModelFromEntity(EmployeeEntity empEntity) {
        return new Employee(empEntity.getId(), empEntity.getName(),
                empEntity.getAge(), empEntity.getSalary(), empEntity.getAddress());
    }
}
