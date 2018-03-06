package com.app.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;


@Configuration
@ComponentScan("com.app.el")
@PropertySource("classpath:test.properties")
public class ElConfig {

    @Value("I Love You!")
    private String normal;

    @Value("#{systemProperties['os.arch']}")
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private String randomNum;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:test.txt")
    private Resource textFile;

    @Value("http://www.baidu.com")
    private Resource textUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer configurer(){
        return  new PropertySourcesPlaceholderConfigurer();
    }

    public  void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNum);
            System.out.println(fromAnother);

            System.out.println(IOUtils.toString(textFile.getInputStream()));
            System.out.println(IOUtils.toString(textUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
