package com.luoluo.role.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mingwei zhang
 * @description 角色类
 * @create 2019-03-21-13:50
 */
public class RoleController {
    public static void main(String[] args){
        Map<String,String> map=new HashMap<>();
        map.put("name","zhang");
        map.put("age","16");

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        for (String i:list) {
            System.out.println(i);
        }

        for (int i = 0; i < list.size()+1; i++) {
            System.out.println("123");
            System.out.println("456");
        }
        new RoleController().method1("Join",18);
        Role role=new Role();
        role.setName("luo");
        role.setAge(18);
        role.setAddress("shandong");
        role.setEmail("885014718");
        Role rol = new RoleController().method2(role);
        System.out.println(rol);
    }
    /**
     * @author mingwei zhang
     * @description
     * @date 14:21 2019/3/21
     * @param name 姓名
     * @param age 年龄
     * @return void
     **/
    public void method1(String name,Integer age){
        System.out.println(name+age);
    }
    /**
     * @author mingwei zhang
     * @description
     * @date 14:27 2019/3/21
     * @param role 角色
     * @return com.luoluo.role.controller.Role
     **/
    public Role method2(Role role){
        return role;
    }
}
