
import java.io.*;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileOfType {

    public static void main(String[] args) {// write your code here

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        File file = new File(s);

        FileFilter ff
                = new FileFilter() {
            public boolean accept(File file) {

                if (file.getName().endsWith(".txt")) {
                    System.out.println(file.getName());
                    return true;

                } else {
                    return false;
                }
            }
        };

        File[] files = file.listFiles(ff);
        String[] fname=new String[files.length];

        for(File f:files){
            System.out.println(f);
                InputStream is = null;
                try {
                    is = new FileInputStream(f);

                    byte[] content = new byte[2*1024];
                    int count = 0;
                    while((count = is.read(content)) > 0){
                        System.out.println(new String(content, 0, count));

                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }

        }

    }
}
