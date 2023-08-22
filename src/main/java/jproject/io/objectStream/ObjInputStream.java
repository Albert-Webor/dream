package jproject.io.objectStream;

import org.springframework.boot.context.properties.bind.DataObjectPropertyName;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ObjInputStream {
    static String fileO = "/home/rui/Videos/o.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oio = new ObjectInputStream(new FileInputStream(fileO));
        DataObejct data = (DataObejct)oio.readObject();
        System.out.println(data.home);
    }
}
