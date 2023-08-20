package jproject.io.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream ;

import static javafx.scene.input.KeyCode.H;

public class ByteInputDemo {
    static String fileA = "/home/rui/Videos/a.txt";
    static String fileB = "/home/rui/Videos/b.txt";
    static String fileC = "/home/rui/Videos/c.txt";
    static String fileD = "/home/rui/Videos/d.txt";
    static String fileE = "/home/rui/Videos/e.txt";
    static String fileF = "/home/rui/Videos/f.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream wa =  new FileInputStream(fileA);
        FileInputStream wb =  new FileInputStream(fileB );
        FileInputStream wc =  new FileInputStream(fileC );
        FileInputStream wd =  new FileInputStream(fileD );
        FileInputStream  we =  new FileInputStream(fileE );
        FileInputStream wf =  new FileInputStream(fileF );
        while(wa.available() > 0){
            System.out.print("a:字节"+wa.read());
        }
        System.out.println();
        while(wb.available() > 0){
            System.out.print("b:字节"+wb.read());
        }
        System.out.println();

        while(wc.available() > 0){
            System.out.print("c:字节"+wc.read());
        }
        System.out.println();

        while(wd.available() > 0){
            System.out.print("d:字节"+wd.read());
        }
        System.out.println();

        while(we.available() > 0){
            System.out.print("e:字节"+we.read());
        }
        System.out.println();

        while(wf.available() > 0){
            int s = wf.read();
            System.out.print("f:字节"+Integer.toHexString(s));
        }
    }
}
