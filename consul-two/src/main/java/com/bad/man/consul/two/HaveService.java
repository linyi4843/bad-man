package com.bad.man.consul.two;

import org.springframework.stereotype.Service;

/**
 * @auther linyi
 * @email linyi4843@gmail.com
 */
@Service
public class HaveService implements haveFace {
    @Override
    public String hi(String name) {
        return "two : " + name;
    }
}
