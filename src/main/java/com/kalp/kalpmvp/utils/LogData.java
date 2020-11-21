package com.kalp.kalpmvp.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.kalp.kalpmvp.model.LogLevel;

@Retention( RetentionPolicy.RUNTIME ) // the annotation will be available during runtime
@Target( ElementType.METHOD )         // this can just used in methods
public @interface LogData {

    LogLevel logLevel() default LogLevel.INFO;

}