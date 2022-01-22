package com.boj.algorithm.ch01;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220122
 *
 * [문제 번호]
 *
 * 10430
 *
 * [문제]
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *
 *       472    --- (1)
 *     x 385    --- (2)
 *    ------
 *      2360    --- (3)
 *     3776     --- (4)
 *    1416      --- (5)
 *    ------
 *    181720    --- (6)
 *
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 *
 * [출력]
 * 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 */
public class Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        double n1 = 472;
//        double n2 = 385;

//        System.out.println((int) (n1 * (Math.floor((n2 % 10)))));
//        System.out.println((int) (n1 * (Math.floor((n2 % 100) / 10))));        // (385 % 100) => (85.0) / 10 => Math.floor(8.0)
//        System.out.println((int) (n1 * (Math.floor((n2 % 1000) / 100))));
//        System.out.println((int) (n1 * n2));

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1 * (n2 % 10));             // 385 % 10     ==> 5
        System.out.println(n1 * (n2 % 100 / 10));       // 385 % 100    ==> 85 / 10 ==> 8
        System.out.println(n1 * (n2 / 100));            // 385 / 100    ==> 3
        System.out.println(n1 * n2);
    }
}
