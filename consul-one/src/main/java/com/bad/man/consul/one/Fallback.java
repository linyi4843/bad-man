package com.bad.man.consul.one;

import org.springframework.stereotype.Component;

/**
 * @auther linyi
 * @email linyi4843@gmail.com
 */
@Component
public class Fallback implements noFace {

    @Override
    public String hi(String str) {
        return "你就是个垃圾";
    }
}
