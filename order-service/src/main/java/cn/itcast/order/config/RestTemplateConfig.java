package cn.itcast.order.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced     // LoadBalancerInterceptor负载均衡拦截器
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    //负载均衡策略--全局配置
    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }
}
