package com.criver.bootdemo.impl;

import com.criver.bootdemo.ai.ICount;
import org.springframework.stereotype.Service;

/**
 * @program: bootdemo
 * @description: count实现类
 * @author: fansc
 * @create: 2022-07-25 21:28
 * @version: V1.0.0
 **/
@Service
public class CountImpl implements ICount {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

}
