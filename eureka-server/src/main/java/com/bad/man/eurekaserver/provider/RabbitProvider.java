package com.bad.man.eurekaserver.provider;

import com.bad.man.eurekaserver.Demo;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 *
 * @author: linyi
 * @email: linyi4843@gmail.com
 */
@Component
@RequiredArgsConstructor
public class RabbitProvider {
    private final RabbitTemplate rabbitTemplate;

    private final RabbitTemplate.ConfirmCallback confirmCallback = (correlationData, ack, s) -> {
        System.out.println("correlationData" + correlationData);
        System.out.println("Ack" + ack);
        if (!ack) {
            //业务处理补偿
            System.out.println("发生了异常个");
        } else {
            //业务
            System.out.println(111);
        }
    };

    private final RabbitTemplate.ReturnCallback returnCallback = (message, i, s, s1, s2) -> System.out.println("wohaole ");

    public void sendMsg(Demo demo) {
        rabbitTemplate.setConfirmCallback(confirmCallback);
        rabbitTemplate.setReturnCallback(returnCallback);
        rabbitTemplate.convertAndSend("ng", "key.boot", demo, new CorrelationData("21324124124"));
    }

}
