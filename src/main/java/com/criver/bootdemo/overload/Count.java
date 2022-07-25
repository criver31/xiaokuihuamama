package com.criver.bootdemo.overload;

/**
 * @program: bootdemo
 * @description: 算法类
 * @author: fansc
 * @create: 2022-07-25 21:36
 * @version: V1.0.0
 **/
public class Count {

    //overload演示

    private int add(int a, int b) {
        return a + b;
    }


    private int add(int a, int b, int c) {
        return a + b + c;
    }

    private int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
