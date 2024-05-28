package cn.itcast.user.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "pattern")
@Component
public class PatternProperties {
    public String dateformat;
}
