package Annotations;

public @interface MultiVal {
    int num() default 0;
    String str() default "";
}
