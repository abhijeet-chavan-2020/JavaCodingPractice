package main.java.org.FileHandling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class basicHandling {

    public static void main(String[] args) {
        // usingScannerToInputAndRead();
        // usingFileReaderAndPrint();
        //  usingBufferedReaderAndPrint();
        // fileReaderUsingBufferedReaderAndPrint();
        // outputStreamWriter();
        // fileWriterExample();
        //  fileWriterExampleWithAppend();
        //  bufferedWriterExampleWithAppend();
//        endToEndFileHandling();
//        deleteFile("note.txt");
        //test1();
        //test2();
        // test3();
        //test4("I have written the contents into the file using OutputStreamWriter and then reading from InputStreamReader.");
        test5("I have written the contents into the file using OutputStreamWriter and then reading from InputStreamReader.");
    }

    public static void usingScannerToInputAndRead() {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter some letters");
            int letters = isr.read();
            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void usingFileReaderAndPrint() {
        try (FileReader fr = new FileReader("note.txt")) {
            int letters = fr.read();
            while (fr.ready()) {
                System.out.println((char) letters);
                letters = fr.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void usingBufferedReaderAndPrint() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fileReaderUsingBufferedReaderAndPrint() {
        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //output writer

    public static void outputStreamWriter() {
        OutputStream os = System.out;
        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write("\n");
            osw.write('A');
            char[] arr = "My Name Is ABhijeet".toCharArray();
            osw.write(arr);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fileWriterExample() {
        try (FileWriter osw = new FileWriter("note.txt")) {
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write("\n");
            osw.write('A');
            char[] arr = "My Name Is ABhijeet".toCharArray();
            osw.write(arr);
            osw.close();
            fileReaderUsingBufferedReaderAndPrint();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fileWriterExampleWithAppend() {
        try (FileWriter osw = new FileWriter("note.txt", true)) {
            osw.write("\n");
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write("\n");
            osw.write('A');
            char[] arr = "My Name Is ABhijeet".toCharArray();
            osw.write(arr);
            osw.close();
            fileReaderUsingBufferedReaderAndPrint();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void bufferedWriterExampleWithAppend() {
        try (BufferedWriter osw = new BufferedWriter(new FileWriter("note.txt", true))) {
            char[] arr = "My Name Is Abhijeet".toCharArray();
            osw.write(arr);
            String s = " India is my country";
            osw.write(s);
            osw.close();
            fileReaderUsingBufferedReaderAndPrint();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void endToEndFileHandling() {
        fileWriterExampleWithAppend();
        try {
            File fo = new File("new-file.txt");
            fo.createNewFile();
            fo.setReadable(true);
            fo.setWritable(true);
            if (fo.exists()) {
                FileWriter fw = new FileWriter(fo, true);
                fw.write("My Name is Abhijeet");
                BufferedReader bfr = new BufferedReader(new FileReader("note.txt"));
                fw.write(bfr.read());
                System.out.println("File contents are: " + bfr.readLine());
                fw.close();
                bfr.close();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteFile(String filename) {
        if (Files.exists(Paths.get(filename))) {
            try {
                Files.delete(Paths.get(filename));
                System.out.println("File has been deleted successfully");
                System.out.println("Filename was= " + filename);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public static void test1() {
        File fo = new File("test1.txt");
        int i;
        try {
            if (!fo.isFile()) {
                fo.createNewFile();
            } else {
                System.out.println("File is already created. Contents of the files are \n");
                try (FileInputStream fis = new FileInputStream(fo)) {
                    do {
                        i = fis.read();
                        System.out.print((char) i);
                    } while (i != -1);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test2() {
        File fo = new File("test1.txt");
        int i;
        try {
            if (!fo.isFile()) {
                fo.createNewFile();
            } else {
                System.out.println("File is already created. Contents of the files are \n");
                try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fo))) {
                    do {
                        i = isr.read();
                        System.out.print((char) i);
                    } while (i != -1);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test3() {
        File fo = new File("test1.txt");
        int i;
        try {
            if (!fo.isFile()) {
                fo.createNewFile();
            } else {
                System.out.println("File is already created. Contents of the files are \n");
                try (FileReader fr = new FileReader(fo)) {
                    do {
                        i = fr.read();
                        System.out.print((char) i);
                    } while (i != -1);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test4(String write) {
        File fo = new File("test1.txt");
        int i;
        try {
            if (!fo.isFile()) {
                fo.createNewFile();
                fo.setReadable(true);
            } else {
                System.out.println("File is already created. Contents of the files are \n");
                try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fo));
                     OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(fo))) {
                    osw.write(write);
                    osw.close();
                    System.out.println("Contents has been written to the file. The contents are: \n");
                    do {
                        i = isr.read();
                        System.out.print((char) i);
                    } while (i != -1);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test5(String write) {
        File fo = new File("test1.txt");
        int i;
        try {
            if (!fo.isFile()) {
                fo.createNewFile();
                fo.setReadable(true);
            } else {
                System.out.println("File is already created. Contents of the files are \n");
                try(BufferedReader br = new BufferedReader(new FileReader(fo));
                ) {
                    if (!isFileEmptyUsingInputStreamReader(fo)) {
                        BufferedWriter bw = new BufferedWriter(new FileWriter(fo, true));
                        bw.write("\n " + write);
                        bw.close();
                    } else {
                        BufferedWriter bw = new BufferedWriter(new FileWriter(fo));
                        bw.write(write);
                        bw.close();
                    }
                    System.out.println("Contents has been written to the file. The contents are: \n");
                    do {
                        i = br.read();
                        System.out.print((char) i);
                    } while (i != -1);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isFileEmptyUsingInputStreamReader(File file) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
        if (reader.read() == -1) {
            reader.close();
            return true; // File is empty
        } else {
            int i;
            do {
                i = reader.read();
                System.out.print((char) i);
            } while (i != -1);
        }
        reader.close();
        return false; // File has content
    }

    public static boolean isFileEmptyUsingFileReader(File file) throws IOException {
        FileReader reader = new FileReader(file);
        if (reader.read() == -1) {
            reader.close();
            return true; // File is empty
        } else {
            int i;
            do {
                i = reader.read();
                System.out.print((char) i);
            } while (i != -1);
        }
        reader.close();
        return false; // File has content
    }

    public static boolean isFileEmptyUsingBufferedReader(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        if (reader.read() == -1) {
            reader.close();
            return true; // File is empty
        } else {
            int i;
            do {
                i = reader.read();
                System.out.print((char) i);
            } while (i != -1);
        }
        reader.close();
        return false; // File has content
    }

    public static boolean isFileEmptyUsingFIleInputStream(File file) throws IOException {
        FileInputStream reader = new FileInputStream(file);
        if (reader.read() == -1) {
            reader.close();
            return true; // File is empty
        } else {
            int i;
            do {
                i = reader.read();
                System.out.print((char) i);
            } while (i != -1);
        }
        reader.close();
        return false; // File has content
    }
}
