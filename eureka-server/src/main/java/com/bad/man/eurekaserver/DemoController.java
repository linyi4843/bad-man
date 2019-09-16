package com.bad.man.eurekaserver;

import com.bad.man.eurekaserver.provider.RabbitProvider;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IDEA
 *
 * @author: linyi
 * @Email: linyi4843@gmail.com
 */
@RestController
@RequestMapping("/")
public class DemoController {

    public static final ConcurrentHashMap<String, Boolean> MAP = new ConcurrentHashMap<>();

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    RabbitProvider provider;

    @GetMapping("/send")
    public void send() {
        Demo d = new Demo();
        d.setAddress("123");
        d.setId(2);
        d.setName("zhansgan");
        //rabbitTemplate.convertAndSend("ng","key.boot",d);
        provider.sendMsg(d);
    }

    @GetMapping("demo")
    public Map t1() {
        MAP.put("flag", true);
        return MAP;
    }

}
