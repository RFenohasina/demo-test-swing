package com.testswing.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner  {

	public static void main(String[] args) {
		/*SpringApplication.run(DemoApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(DemoApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);*/
		ApplicationContext context = new SpringApplicationBuilder(DemoApplication.class)
				.headless(false)
				.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		SwingUtilities.invokeLater(()->{
			JFrame frame = new JFrame();
			frame.setVisible(false);
		});
	}
}
