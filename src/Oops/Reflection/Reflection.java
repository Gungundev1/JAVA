package Oops.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
   class  Myclass{
    private String privateField;
public int publicField;


public Myclass(){

}
public Myclass(String privateField,int publicField){
    this.privateField=privateField;
    this.publicField=publicField;
}
private void privateMethod(){
    int var=0;
    System.out.println("private Method");
}
public void publicMethod(){

    System.out.println("public method");
}
}

public class Reflection {
    public static void main(String[] args) {
        Class<?>  clazz = Myclass.class;
        System.out.println("class name: "+clazz.getName());
        System.out.println("modifiers: "+Modifier.toString(clazz.getModifiers()));
        System.out.println("Super class: "+clazz.getSuperclass().getName());

        System.out.println("constructor:");
  Constructor<?>[] constructors =clazz.getDeclaredConstructors();
  for (Constructor<?> constructor : constructors){
      System.out.println("constructor Name: "+constructor.getName());
      System.out.println("Modifiers: "+Modifier.toString(constructor.getModifiers()));
      Class<?>[] parameterTypes =constructor.getParameterTypes();
      for (Class<?> parameterType : parameterTypes){
          System.out.println("parameter type: "+parameterType.getName());
      }
  }
        System.out.println("Fields:-");
  Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Type: " + field.getType().getName());
            System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
        }

        System.out.println("Methods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType().getName());
            System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("Parameter Type: " + parameterType.getName());
            }
            for (Field field : fields) {
                System.out.println("Field Name: " + field.getName());
                System.out.println("Field Type: " + field.getType().getName());
                System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
            }
        }
    }
}
