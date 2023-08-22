package jproject.io.objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjOutputStream {
    static String fileO = "/home/rui/Videos/o.txt";

    public static void main(String[] args) throws IOException {
        DataObejct date = new DataObejct("jackie",12,"London");
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(fileO));
        oout.writeObject(date);
        oout.flush();
    }
}
