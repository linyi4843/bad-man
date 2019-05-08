package com.bad.man.consul.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther linyi
 * @email linyi4843@gmail.com
 */
@RestController
public class controller {

    @Autowired
    haveFace face;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return face.hi(name);
    }
}
