package io.github.kobakei.grenade.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by keisukekobayashi on 16/04/08.
 */
@Target(ElementType.TYPE)
public @interface Launcher {
    String[] value() default {};
}
