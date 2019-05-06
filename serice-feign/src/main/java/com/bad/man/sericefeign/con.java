package com.bad.man.sericefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 *
 * @author: linyi
 * @Email: linyi4843@gmail.com
 */

@RestController
public class con {

    @Autowired
    private ins ins;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return ins.sayHiFromClientOne( name );
    }
}
