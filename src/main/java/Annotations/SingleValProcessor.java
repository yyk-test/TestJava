package Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class SingleValProcessor {
    public static int getValue(Object bean) {
         Field[] fields = bean.getClass().getDeclaredFields();
         Annotation[] annList = bean.getClass().getAnnotations();
         SingleVal singleVal = bean.getClass().getAnnotation(SingleVal.class);
         System.out.println(singleVal);
         try {
             Field field = bean.getClass().getField("val1");
             System.out.println(field.getType());
         } catch(NoSuchFieldException e) {
             try {
                 throw e;
             } catch (NoSuchFieldException ex) {
                 ex.printStackTrace();
             }
         }

         return fields[0].getAnnotation(SingleVal.class).value();
    }
}
