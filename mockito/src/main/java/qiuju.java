import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-21 17:54
 **/

public class qiuju {
    public static void main(String[] args) throws Exception {
//        for (float i = 1.5f; i > -1.5f; i -= 0.15f) {
//            for (float j = -1.5f; j < 1.5f; j += 0.05f) {
//                float a = i * i + j * j - 1;
//                String str = (a * a * a - j * j * i * i * i)
//                        <= 0.0f ? "*" : " ";
//                System.err.print(str);
//            }
//            Thread.sleep(120);
//            System.err.println("");
//        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 100; j++) {
                if (j == 50||j==51) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            Thread.sleep(120);
            System.out.println("\t");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 100; j++) {
                if (j >35&&j<65) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            Thread.sleep(120);
            System.out.println("\t");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 100; j++) {
                if (j >25&&j<75) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            Thread.sleep(120);
            System.out.println("\t");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 200; j++) {
                if (j >15&&j<85) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            Thread.sleep(120);
            System.out.println("\t");
        }
    }
}
