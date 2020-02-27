package com.mdds.service.serviceImpl;

import com.mdds.entity.HpDepartment;
import com.mdds.mapper.TestDao;
import com.mdds.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<HpDepartment> listDeptByName(String deptName) {

        if (null == deptName)
            return null;
        return testDao.selectDeptByName(deptName);
    }
}
