package com.adrian.experiments.simple.bussiness.book;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import javax.inject.Qualifier;

/**
 * Used to mark the the inject points where thirteen digits must be considered.
 * @author aciucanel
 *
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface ThirteenDigits {

}
