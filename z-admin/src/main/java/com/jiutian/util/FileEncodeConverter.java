package com.jiutian.util;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class FileEncodeConverter {

    private static String sourcePath = "D:/xinrenworkspace/xinrenol_debt_cd_20180801gb/p2p_core_chinapnr/src/main/java/com/rd/p2p/core/ws/client/match";
    private static String destPath = sourcePath + "_copy";
    
    
    public static void main(String[] args) throws IOException {
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        
        if(!sourceFile.isDirectory()){
            return;
        }
        
        //获取文件夹中的所有.java文件，包括所有子级文件夹中的文件
        Collection<File> files = FileUtils.listFiles(sourceFile, new String[]{"java","JAVA"}, true);
        for (File file : files) {
            String absolutePath = file.getAbsolutePath();
            String newDire = absolutePath.replace(sourceFile.getName() , destFile.getName());
            
            // 把单个文件从gbk编码转化到utf-8编码，生成新文件，可以自动创建父级目录
            FileUtils.writeLines(new File(newDire), "UTF-8", FileUtils.readLines(file, "ANSI"));
        }
        // 删除源目录,子文件都删除
        FileUtils.deleteQuietly(sourceFile);
        // 把生成文件目录重命名成源目录名
        destFile.renameTo(new File(sourceFile.getAbsolutePath()));
    }
    
    
}
