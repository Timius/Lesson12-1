import java.io.*;

/**
 * Created by User on 19.11.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        File lesson12 = new File("src//lesson12.txt");
        lesson12.createNewFile();
        int i;
//      чтение файла в байтах
        FileInputStream byteRead = new FileInputStream("src//lesson12.txt");
        try {
            do {
                i = byteRead.read();
                if(i != -1) System.out.print((byte)i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        }
        byteRead.close();
        System.out.println("");
        System.out.println("------------------------------------");

////      чтение файла в виде строк
        FileReader symbolRead = new FileReader("src//lesson12.txt");
        try {
            do {
                i = symbolRead.read();
                if(i != -1) System.out.print((char)i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        }
        symbolRead.close();
        System.out.println("");
        System.out.println("------------------------------------");

        File lesson = new File("src//lesson.txt");
        lesson.createNewFile();

//        создание файла и запись в него примитивов
        ObjectOutputStream writerPrim = new ObjectOutputStream(
                new FileOutputStream("src//lesson.txt"));

        writerPrim.write((byte)46);
        writerPrim.write((byte)0);
        writerPrim.write(89);
        writerPrim.write(69);
        writerPrim.close();
// чтение из вновьсозданного файла
        FileInputStream byteRead1 = new FileInputStream("src//lesson.txt");
            do {
                i = byteRead1.read();
                if(i != -1) System.out.println((byte)i);
            } while (i != -1);
        
        byteRead1.close();
    }
}

