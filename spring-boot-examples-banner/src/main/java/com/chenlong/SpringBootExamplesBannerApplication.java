package com.chenlong;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenlong
 * @Date 2020/4/12 17:14
 */
@SpringBootApplication
public class SpringBootExamplesBannerApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringBootStudentBannerApplication.class, args);
		SpringApplication application = new SpringApplication(SpringBootExamplesBannerApplication.class);
		/*
		 * Mode.OFF:关闭;
		 * Mode.CONSOLE:控制台输出，默认方式;
		 * Mode.LOG:日志输出方式;
		 */
		application.setBannerMode(Mode.CONSOLE);
		application.run(args);
	}
}
