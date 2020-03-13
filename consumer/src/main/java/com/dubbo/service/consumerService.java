package com.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class consumerService {
    @Reference //用于远程引用，引用时按照ticketService的全类名进行匹配，看谁往注册中心里面注册了
            //ticketService的全类名的服务，生产者在发布的时候就是按照ticketService的全类名进行
            //发布的，所以就能匹配上，获取过来。
   ticketService ticketService;
    public void hello(){
        String ticket=ticketService.getTicket(); //该方法会远程调用生产者提供的相应功能
        System.out.println("买到票了："+ticket);
    }
}
