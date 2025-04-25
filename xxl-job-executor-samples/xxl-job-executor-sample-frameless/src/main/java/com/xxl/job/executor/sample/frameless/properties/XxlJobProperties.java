package com.xxl.job.executor.sample.frameless.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * xxl-job属性
 *
 * @author DanielHyw 702109083@qq.com
 */
@Data
@Component
@ConfigurationProperties(prefix = "xxl.job")
public class XxlJobProperties {
	private AdminProperties admin;
	private ExecutorProperties executor;

}