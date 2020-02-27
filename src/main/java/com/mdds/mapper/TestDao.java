package com.mdds.mapper;

import com.mdds.entity.HpDepartment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {

    List<HpDepartment> selectDeptByName(String deptName);
}
