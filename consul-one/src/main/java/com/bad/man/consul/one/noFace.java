package com.bad.man.consul.one;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "consul-two", fallback = Fallback.class)
public interface noFace {

    @GetMapping("/hi")
    String hi(@RequestParam(value = "name") String name);
}
