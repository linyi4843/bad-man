package com.bad.man.rabbitmq;/**
 * Created with IDEA
 *
 * @author: linyi
 * @Email: linyi4843@gmail.com
 */


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IDEA
 *
 * @author: linyi
 * @email: linyi4843@gmail.com
 */
public class DemoController {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("/send")
    public void send() {
        rabbitTemplate.convertAndSend("ex", "key", "你不是人");
    }
}
