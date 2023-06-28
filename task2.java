package Java.HomeWork2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.io.IOException;
import java.util.logging.*;


public class task2 {
      
    
    public static void main(String[] args) throws IOException {
        
        ArraySort(); 
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("logArray1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info(" Сортровка массива проведена ");
      
    }
    public static void ArraySort(){
            int size = 10;
            int upper = 100;
            int [] array1 = new int[size];
            Random random = new Random();
            IntStream.range(0, size).forEach(index -> array1[index] = random.nextInt(upper));
            System.out.println("Массив случайных чисел от 1 до 100");
            System.out.println(Arrays.toString(array1));
            boolean Sort = false;
            int bufer;
            while(!Sort) {
                Sort = true;
                for (int i = 0; i < array1.length - 1; i++) {
                    if(array1[i] > array1[i + 1]){
                        Sort = false;
                            bufer = array1[i];
                            array1[i] = array1[i + 1];
                            array1[i + 1] = bufer;
                        }
                    }
                }
            System.out.println("Массив отсортированный по возрастанию");
            System.out.println(Arrays.toString(array1));
           
    }
}
        


    

