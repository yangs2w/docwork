package com.mdds.service;

import com.mdds.entity.HpDepartment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {

    List<HpDepartment> listDeptByName(String deptName);
}
