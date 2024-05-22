/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averybigsum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

/**
 *
 * @author Slime nightmare
 */
public class AVeryBigSum {

    /**
     * @param args the command line arguments
     */
    public static long aVeryBigSum(long[] ar) {
        // Write your code here
        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int arCount = sc.nextInt();
        long[] ar = new long[arCount];
        for (int i = 0; i < arCount; i++) {
            ar[i] = sc.nextInt();
        }
        long result = aVeryBigSum(ar);
        System.out.println(result);

    }

}
