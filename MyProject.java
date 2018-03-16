package MyProject;
import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import MyProject.practical;
import static MyProject.practical.aList;
/**
 *
 * @author Nazim
 */
public class MyProject{

public static void main(String[] args) throws Exception,InvalidException{
System.out.println("*******My Project File Handling*******");
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter Directory Path:");
//for input directory path
String sPath=sc.nextLine();
File f = new File (sPath);
if(f.exists()){
practical.method1(sPath);
}
else{
throw new InvalidException("Invalid Directrory Path "); 
}
System.out.println("Please Enter File Path to Store Directory Path:");
//for output store directory path
String dPath=sc.nextLine();
//for write output in given File path
File fwr = new File (dPath);
if(fwr.isFile()){
System.out.println("-------------------------OUTPUT--------------------");
FileWriter fw=new FileWriter(fwr);
BufferedWriter bw=new BufferedWriter(fw);
//for cursor 
 Iterator itr=aList.iterator();
            while(itr.hasNext())
            {
            //For typeCasting itr.next() object into String
            String str=(String) itr.next();
            //for print output only console
            //System.out.println(str);
            //for write path given File add...
            bw.write(str);
            bw.newLine();
            bw.flush();
            }
            System.out.println("File Directory All Path:\t"+sPath+"\tTransfer To:\t"+dPath);
            System.out.println("Successfully");
}  
else{
throw new InvalidException("Invalid File Directrory"); 
}
}
}

    

