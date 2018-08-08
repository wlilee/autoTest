package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void group1(){
        System.out.println("服务端测试方法111");
    }

    @Test(groups = "server")
    public void group2(){
        System.out.println("服务端测试方法222");
    }

    @Test(groups = "client")
    public void group3(){
        System.out.println("客户端测试方法333");
    }

    @Test(groups = "client")
    public void group4(){
        System.out.println("客户端测试方法444");
    }

    @BeforeGroups(groups = "server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法！");
    }

    @AfterGroups(groups = "server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法！");
    }

}
