package com.mdds.test;

import com.mdds.entity.HpDepartment;
import com.mdds.service.serviceImpl.TestServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DataSourceTest {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");

    public void DeptS() {
        String[] names = context.getBeanDefinitionNames();
        TestServiceImpl testService = context.getBean("testServiceImpl", TestServiceImpl.class);
        List<HpDepartment> chinese = testService.listDeptByName("中医科");
        for (HpDepartment hd : chinese) {
            System.out.println(hd.toString());
        }
    }

    public static void main(String[] args) {
        DataSourceTest test = new DataSourceTest();
        test.DeptS();
    }
}
