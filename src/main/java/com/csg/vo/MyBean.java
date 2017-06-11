package com.csg.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.*;
import javax.validation.constraints.NotNull;

@Component
@ConfigurationProperties("foo")
public class MyBean {

@NotNull
    private String name;
    private String  age;
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Security getSecurity() {
        return security;
    }

    private final Security security = new Security();
    public static   class  Security{
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String name;
    }
    // ...

}