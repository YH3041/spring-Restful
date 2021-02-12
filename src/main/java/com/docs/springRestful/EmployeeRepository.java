package com.docs.springRestful;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository은 SpringData JPA를 확장해준다.

// EmployeeRepository 인터페이스 선언으로
// 1. 새로운 직원 생성 2. 기존 항목 업데이트 3. 직원 삭제, 찾기가 가능해진다.
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
