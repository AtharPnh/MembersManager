package com.jrp.mms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrp.mms.entity.Employee;

public interface EmployeesRepository extends JpaRepository<Employee, Long> {
/* JpaRepository has two parameters first is entity
 * the second is primary key type
 */


}
