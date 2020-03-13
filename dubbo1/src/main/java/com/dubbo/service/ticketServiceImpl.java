package com.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.stereotype.Component;

@EnableDubbo //通过@EnableDubbo可以在指定的包名下
// （通过scanBasePackages),或者指定的类中（通过scanBasePackageClasses）
// 扫描 Dubbo 的服务提供者（以@Service标注）以及 Dubbo 的服务消费者（以@Reference标注）
@Component
@Service // 将服务发布到注册中心
public class ticketServiceImpl implements ticketService {
    @Override
    public String getTicket() {
        return "厉害了，我的国";
    }
}
