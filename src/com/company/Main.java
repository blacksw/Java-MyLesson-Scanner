package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	//Получение первой строки  входных данных
		System.out.print("Как вас зовут?");
		String name = in.nextLine();

	//Получение целочисленного значения
		System.out.print("Сколько вам лет?");
		int age = in.nextInt();

	// Отображение информации в консольном окне
	System.out.println(name + ", в следушем году вам будет" + (age + 1));
    }
}
