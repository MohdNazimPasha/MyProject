package MyProject;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Nazim
 */
//C:\Nazim
public class practical {
//create an ArrayList to store directory Path
public static ArrayList aList=new ArrayList(); 
public static void method1(String sPath) throws InvalidException{
File f = new File (sPath);
//cheacking given path is valid or not.
if( f.isFile()==true){
 aList.add(f.getPath());

}else if (f.isDirectory()==true  ) {
   // call method2 if found Directory
    method2(sPath);
}else
 throw new InvalidException("Invalid Directrory");   

}
//------------------------------------------------------
public static void method2(String path1){
File f = new File (path1);
File []f1=f.listFiles();
//cheacking given path is valid or not.
for(File f2:f1){
               if(f2.isDirectory()==true){
               String pathRecursive=f2.getAbsolutePath();
               method2(pathRecursive);
               }
               else
               {
                   aList.add(f2.getAbsolutePath());
                  
               }          
}}
}
