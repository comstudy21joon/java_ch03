package org.comstudy21.ch03;

class People {
	String name;
	String phone;
	String address;
	
	// �����ڴ� ����� �ʱ�ȭ �ϴ� ������ �ִ� �޼ҵ�
	// �������� �ʰ� �������� ����.
	// ������ �޼ҵ��� �̸��� Ŭ������ �̸��� ���� �ؾ� �Ѵ�.
	// �����ڵ� �Լ��̹Ƿ� �Լ��� �ٸ� Ư¡�� ��� ������.
	// ������ Override - ������ ������
	public People(String name, String phone, String address) {
		//super(); <--- �θ��� �����ڸ� ȣ�� �ϴ°����� ���⼭�� �ʿ䰡 ����.
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	// ������ - 
	@Override
	public String toString() {
		return String.format("%-6s\t%-17s\t%s\n", name, phone, address);
	}
	
}

public class Ch03Ex03PointEx {

	public static void main(String[] args) {
//		People kim = new People();
//		kim.name = "������";
//		kim.phone = "010-1234-5678";
//		kim.address = "����� ���α� ������";
		People kim = new People("���ϼ�","010-1234-5656","��ȳ��� ����");
		
		//System.out.printf("%s | %s | %s\n", kim.name, kim.phone, kim.address);
		System.out.println(kim.toString());
	}

}
