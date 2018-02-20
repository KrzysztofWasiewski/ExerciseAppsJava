import Files_Saving_And_Reading.*;

import java.io.FileNotFoundException;

/**
 * Created by Kris on 2017-10-24.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        BinaryFiles bf = new BinaryFiles();
        String path = bf.getFileName();

        bf.writeFiles(path);
        bf.readFile(path);

    }

}
