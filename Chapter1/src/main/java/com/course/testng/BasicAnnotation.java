package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod测试方法之前执行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod测试方法之后执行");
    }

    @Test
    public void testCase2(){
        System.out.println("Test这是测试用例2");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类之前执行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类之后执行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
}
