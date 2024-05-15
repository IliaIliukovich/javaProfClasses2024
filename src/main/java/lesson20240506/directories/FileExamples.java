package lesson20240506.directories;

import java.io.File;

public class FileExamples {

    public static void main(String[] args) {
        File file = new File("src/main/resources/newFile.txt");

        File directory = new File("src/main/resources/dir");
        directory.mkdir();
        System.out.println(directory.exists());

        System.out.println(file.length());
    }


}
