package com.criver.bootdemo.impl;

import com.criver.bootdemo.ai.ICount;
import org.springframework.stereotype.Service;

/**
 * @program: bootdemo
 * @description: count的第二个实现类
 * @author: fansc
 * @create: 2022-07-25 21:32
 * @version: V1.0.0
 **/
@Service
public class Count2Impl implements ICount {

    @Override
    public int add(int a, int b) {
        //使用和Count1Impl不同的实现逻辑实现add方法
        return a + b + ( 1 + 2 - 1 -2);
    }

}
