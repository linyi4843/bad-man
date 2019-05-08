package com.bad.man.consul.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther linyi
 * @email linyi4843@gmail.com
 */
@Service
public class hiService {

    @Autowired
    noFace face;

    public String hi(String name) {
        return face.hi(name);
    }
}
