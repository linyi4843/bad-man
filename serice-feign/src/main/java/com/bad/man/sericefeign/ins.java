package com.bad.man.sericefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IDEA
 *
 * @author: linyi
 * @Email: linyi4843@gmail.com
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface ins {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
