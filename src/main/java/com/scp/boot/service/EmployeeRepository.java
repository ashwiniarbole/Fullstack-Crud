package com.scp.boot.service;

import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scp.boot.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
