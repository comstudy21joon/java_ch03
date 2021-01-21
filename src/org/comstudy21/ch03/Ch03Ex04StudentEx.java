package org.comstudy21.ch03;

import java.util.Scanner;

class Student {
	String name;
	String mj;
	double score;
	int rank;
	
	public Student() {
		// ����Ʈ ������
		System.out.println("����Ʈ ������ ȣ��");
	}
	
	// �����ε� - ���� Ŭ���� ���� �̸��� �޼ҵ带 �߰� �� �ش�.
	// �ñ׳�ó - �Ű������� Ÿ�԰� ������ �ȴ�.
	public Student(String name, String mj, double score, int rank) {
		this.name = name;
		this.mj = mj;
		this.score = score;
		this.rank = rank;
	}

	// �������̵� - ��Ӱ��� �θ��� ����� ������ �Ѵ�.
	@Override  
	public String toString() {
		return "[" + name + ", " + mj + ", " + score + ", " + rank + "]";
	}
}

public class Ch03Ex04StudentEx {
	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	
	static final int MAX = 50;
	static Student[] stArr = new Student[MAX];
	static int top = 0;
	
	static Student mkStudent() {
		Student student = new Student();
		System.out.print("����>>> ");
		student.name = scan2.nextLine();
		System.out.print("�а�>>> ");
		student.mj = scan.next();
		System.out.print("����>>> ");
		student.score = scan.nextDouble();
		System.out.print("���>>> ");
		student.rank = scan.nextInt();
		
		return student;
	}
	
	public static void main(String[] args) {
		Student[] arr = new Student[2];
		
		// ������ �����ε��� �Ǿ������� ����Ʈ �����ڸ� ��������� �߰� �ؾ� �Ѵ�.
		// ������ �����ε� �Ǿ������� �����Ϸ��� ����Ʈ �����ڸ� ������ �ʴ´�.
		for(int i=0; i<arr.length; i++) {
			arr[i] = mkStudent(); // ��ü ���� �� ��ȯ�ϴ� �޼ҵ�
		}
		//System.out.println(Arrays.toString(arr));
		for(Student st : arr) {
			System.out.println(st);
		}
	}

	public static void test(String[] args) {
		//                         ����        �а�    ����  ���
		Student kim = new Student("ȫ�浿", "��ǻ�Ͱ���", 4.5, 10);
		Student lee = new Student("�̼���", "������", 5.0, 1);
		Student park = new Student("�����ż�", "â����", 4.8, 1);
				
		//System.out.println(kim);
		//System.out.println(lee);
		//System.out.println(park);
		Student[] stdArr = new Student[3];
		stdArr[0] = kim;
		stdArr[1] = lee;
		stdArr[2] = park;
		
		stdArr[1].name = "�̼���";
		stdArr[1].mj = "�����а�";
		
		for(Student std : stdArr) {
			System.out.println(std);
		}
	}

}
