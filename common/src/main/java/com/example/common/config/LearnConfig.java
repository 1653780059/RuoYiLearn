package com.example.common.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author 16537
 * @Classname LearnConfig
 * @Description
 * @Version 1.0.0
 * @Date 2022/9/26 10:52
 */
@Component
@ConfigurationProperties(prefix = "learn")
@Data
public class LearnConfig {
    public static String resource;

    public static String getProfile(){
        return resource+"/profile";
    }
    public static String getUploadPath(){
        return getProfile()+"/upload";
    }
    public static String getResource(){
        return resource;
    }
}
