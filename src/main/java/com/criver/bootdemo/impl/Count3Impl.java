package com.criver.bootdemo.impl;

import com.criver.bootdemo.ai.ICount;
import org.springframework.stereotype.Service;

/**
 * @program: bootdemo
 * @description: Count的第三个实现类
 * @author: fansc
 * @create: 2022-07-25 21:34
 * @version: V1.0.0
 **/
@Service
public class Count3Impl implements ICount {

    @Override
    public int add(int a, int b) {
        //使用和Count1Impl, Count2Impl 都不同的实现逻辑实现add方法
        a = a * 1;
        b = b + 1 + 2 - 3;
        return a + b ;
    }
}
