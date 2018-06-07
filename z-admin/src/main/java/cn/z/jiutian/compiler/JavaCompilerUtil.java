package cn.z.jiutian.compiler;

import java.io.File;
import java.util.Arrays;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaCompilerUtil {

    private static final Logger LOG = LoggerFactory.getLogger(JavaCompilerUtil.class);
    
    private static JavaCompiler javaCompiler;
    
    private JavaCompilerUtil(){
        
    }
    
    private static JavaCompiler getJavaCompiler(){
        if(javaCompiler == null){
            synchronized(JavaCompilerUtil.class){
                if(javaCompiler == null){
                    javaCompiler = ToolProvider.getSystemJavaCompiler();
                }
            }
        }
        
        return javaCompiler;
    }

    public static boolean compilerJavaFile(String sourceFileInputPath, String classFileOutputPath){
        Iterable<String> options = Arrays.asList("-d", classFileOutputPath);
        StandardJavaFileManager fileManager = getJavaCompiler().getStandardFileManager(null, null, null);
        
        Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(new File(sourceFileInputPath)));
        
        return getJavaCompiler().getTask(null, fileManager, null, options, null, compilationUnits).call();
    }
    
    public static void main(String[] args) {
        System.out.println(compilerJavaFile("d:\\8000\\JavaCompilerUtil.java", "d:\\8000\\JavaCompilerUtil.java"));
    }
}
