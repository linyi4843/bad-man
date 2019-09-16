package com.bad.man.eurekaserver;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * /**
 * Created with IDEA
 *
 * @author: linyi
 * @email: linyi4843@gmail.com
 */
@Component
@Slf4j
public class RabbitConfig {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "key.boot", durable = "true"),
            exchange = @Exchange(value = "ng", type = "topic", ignoreDeclarationExceptions = "true"),
            key = "key.boot"
    ))
    @RabbitHandler
    public void rabbit(@Payload Demo demo, Message message, Channel channel) throws IOException, InterruptedException {
        log.info(" demo -> {}", demo.toString());
        System.out.println("数到消息    -> " + message.getMessageProperties());
        MessageProperties messageProperties = message.getMessageProperties();
        long tag = messageProperties.getDeliveryTag();
        Thread.sleep(5000L);

        channel.basicAck(tag, false);
        System.out.println("牵手成功");
    }

}
