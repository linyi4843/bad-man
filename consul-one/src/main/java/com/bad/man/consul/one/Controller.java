package com.bad.man.consul.one;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther linyi
 * @email linyi4843@gmail.com
 */
@RestController
@RefreshScope
@RequiredArgsConstructor
public class Controller {

    final hiService face;

    @Value("${ow.dva}")
    String value;

    @GetMapping("/hi")
    public String hi(@RequestParam(defaultValue = "6666", required = false) String name) {
        return "我是consul-one : " + face.hi(name);
    }

    @GetMapping("/ow")
    public String ow() {
        return value;
    }
}
