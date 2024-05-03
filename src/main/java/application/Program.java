package application;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		Person p1 = new Person(1, "Carlos da Silva","carlos@gmial.com");
		Person p2 = new Person(2, "Joaquim Torres","joaquim@gmial.com");
		Person p3 = new Person(3, "Ana Maria","ana@gmial.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
