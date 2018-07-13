package cn.z.jiuitan.annotation;

import java.lang.reflect.Method;

public class AnalysisAnnotation {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("cn.z.jiuitan.annotation.Utility");
            Method[] methods = clazz.getMethods();
            
            Boolean flag = clazz.isAnnotationPresent(Description.class);
            if(flag){
                Description des = (Description) clazz.getAnnotation(Description.class);
                System.out.println("utility's description --->" + des.value());
                
                for (Method method : methods) {
                    if(method.isAnnotationPresent(Author.class)){
                        Author author = method.getAnnotation(Author.class);
                        System.out.println("utility author's name --> " + author.name() + " from " + author.group());
                    }
                }
            }
           
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
