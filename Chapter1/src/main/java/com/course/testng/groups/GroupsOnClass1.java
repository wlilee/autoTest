package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass1中的stu111运行！");
    }
    public void stu2(){
        System.out.println("GroupsOnClass1中的stu222运行！");
    }
    public void stu3(){
        System.out.println("GroupsOnClass1中的stu333运行！");
    }
}
