package com.bad.man.eurekaserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.bad.man.eurekaserver.DemoController.MAP;


/**
 * Created with IDEA
 *
 * @author: linyi
 * @Email: linyi4843@gmail.com
 */
@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("test")
    public Map t1() {
        MAP.put("flag", false);
        return MAP;
    }

}
