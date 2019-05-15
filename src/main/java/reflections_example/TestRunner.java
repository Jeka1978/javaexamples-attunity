package reflections_example;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
public class TestRunner {
    @SneakyThrows
    public void printObjectMetaData(Object o) {
        Class<?> clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Class<?> type = field.getType();
            System.out.println("field name: " + field.getName());
            System.out.println("field type: " + field.getType().getName());
            System.out.println(field.get(o));
        }
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
        }
    }


    @SneakyThrows
    @Deprecated
    public void runAllTestMethods(String className) {
        Class<?> clazz = Class.forName(className);
        Object o = clazz.newInstance();
        runAllTestMethods(o);
    }


    @SneakyThrows
    public void runAllTestMethods(Object o){
        Class<?> clazz = o.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")||method.isAnnotationPresent(Test.class)) {
                Test annotation = method.getAnnotation(Test.class);
                int repeat = annotation.value();
                for (int i = 0; i < repeat; i++) {

                    method.invoke(o);
                }
            }
        }
    }















}







