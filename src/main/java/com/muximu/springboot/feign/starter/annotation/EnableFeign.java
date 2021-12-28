package com.muximu.springboot.feign.starter.annotation;

import com.muximu.springboot.feign.starter.FeignClientRegister;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({FeignClientRegister.class})
public @interface EnableFeign {
}
