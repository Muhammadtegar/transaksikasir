
import java.util.stream.IntStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tegar
 */
public class tes {

    public static void main(String[] args) {
        int[] a = {40, 50};
        int sum = IntStream.of(a).sum();
        System.out.println("The sum is " + sum);
        
    }
}
