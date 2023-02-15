package chapter02.Scanner;

import java.util.*;
class ScannerBasic {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in); // Scanner 클래스의 객체 생성
        String input = scanner.nextLine(); // 입력받은 내용을 input에 저장
        int num = Integer.parseInt(input); // 입력받은 내용을 input 타입의 값으로 변환
    }
}
