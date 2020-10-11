package ���л�Ա����ϵͳ;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

//����Person��
class Person {
	private String name;
	private String userID;
	private String passwd;
	private int score;
	private Date date;

	public Person() {
		super();
	}

	public Person(String name, String userID, String passwd, int score, Date date) {
		super();
		this.name = name;
		this.userID = userID;
		this.passwd = passwd;
		this.score = score;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getDate() {
		return date;
	}

	public void setData(Date date) {
		this.date = date;
	}
}

class OtherMethod {
	// �����˺����뺯��
	public Person checkPerson(ArrayList<Person> list) {
		System.out.print("���������Ļ�Ա���ţ�");
		@SuppressWarnings("resource")
		Scanner scannerUser = new Scanner(System.in);
		String id = scannerUser.next();
		System.out.print("���������Ļ�Ա�����룺");
		@SuppressWarnings("resource")
		Scanner scannerPasswd = new Scanner(System.in);
		String password = scannerPasswd.next();
		for (Person p : list) {
			if (id.equals(p.getUserID()) && password.equals(p.getPasswd())) {
				return p;
			}
		}
		return null;
	}

	// �����ۻ�����
	public void scoreAccumlation(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (p != null) {
			System.out.print("���������˴����ѽ�����1Ԫ�ۼ�1���֣���");
			@SuppressWarnings("resource")
			Scanner scannerScore = new Scanner(System.in);
			int score = scannerScore.nextInt();
			p.setScore(p.getScore() + score);
			System.out.println("�����ۼƳɹ���\nĿǰ��Ļ���Ϊ��" + p.getScore());
		} else {
			System.out.println("�˺���Ϣ��ƥ�䣬����ʧ��");
		}
		chooseFunction(list);
	}

	// ���ֶһ�����
	public void scoreExchange(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (p != null) {
			System.out.print("����������Ҫ�һ�ʹ�õĻ��֣�100���ֵ���0.1Ԫ������100�Ļ��ֲ������ã���");
			@SuppressWarnings("resource")
			Scanner scannerScore = new Scanner(System.in);
			int score = scannerScore.nextInt();
			if (p.getScore() >= 100 && score >= 100 && score <= p.getScore()) {
				p.setScore(p.getScore() - score / 100);
				System.out.println("�������ѽ����ʹ�û��û��ֵ���" + score / 100 + "Ԫ");
				System.out.println("���ֶһ��ɹ���\nĿǰ��Ļ���Ϊ��" + p.getScore());
				System.out.println("���ֶһ��ɹ���");
				chooseFunction(list);
			} else {
				System.out.println("�һ�����ʧ�ܣ��˻����ֲ������Ҫ�һ����ִ���ʣ����֣�");
				chooseFunction(list);
			}
		} else {
			System.out.println("�˺���Ϣ��ƥ�䣬����ʧ��");
		}
	}

	// ��ѯ���ּ���Ϣ����
	public void queryResidualScore(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (p != null) {
			System.out.println("����\t��Ա����\tʣ�����\t��������");
			System.out.println(p.getName() + "\t" + p.getUserID() + "\t" + p.getScore() + "\t" + p.getDate());
			chooseFunction(list);
		} else {
			System.out.println("�˺���Ϣ��ƥ�䣬����ʧ��");
		}
	}

	// �޸����뺯��
	public void changePassed(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (p != null) {
			System.out.print("���������������룺");
			@SuppressWarnings("resource")
			Scanner scannerNewPasswd = new Scanner(System.in);
			String NewPasswde = scannerNewPasswd.next();
			p.setPasswd(NewPasswde);
			System.out.println("�����޸ĳɹ���");
			chooseFunction(list);
		} else {
			System.out.println("�˺���Ϣ��ƥ�䣬����ʧ��");
		}
	}

	// ��������
	public void openCard(ArrayList<Person> list) {

		System.out.print("������ע��������");
		@SuppressWarnings("resource")
		Scanner scannerNewName = new Scanner(System.in);
		String NewName = scannerNewName.next();
		System.out.print("������ע�����룺");
		@SuppressWarnings("resource")
		Scanner scannerNewPasswd = new Scanner(System.in);
		String NewPasswd = scannerNewPasswd.next();
		while (NewPasswd.length() < 6) {
			System.out.print("��Ա���벻������6λ������������ע�����룺");
			@SuppressWarnings("resource")
			Scanner scannerNewPasswdTrue = new Scanner(System.in);
			NewPasswd = scannerNewPasswdTrue.next();
		}

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));

		StringBuilder newUserID = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			newUserID.append(random.nextInt(10));
		}
		String NewUserIDT = newUserID.toString();
		for (Person p : list) {
			if (p.getUserID() == NewUserIDT) {
				random = new Random();
				for (int i = 0; i < 8; i++) {
					newUserID.append(random.nextInt(10));
					NewUserIDT = newUserID.toString();
				}
			}
		}
		list.add(new Person(NewName, NewUserIDT, NewPasswd, 100, date));
		System.out.println("��ϲ����ͨ��Ա���ɹ���ϵͳ������100���֣����Ļ�Ա����Ϊ��" + NewUserIDT);
		System.out.print("������" + NewName + "\n��Ա���ţ�" + NewUserIDT + "\nʣ����֣�����Ĭ��100���֣���" + 100 + "\n����ʱ�䣺" + date);
		chooseFunction(list);
	}

	// ���ܺ���
	public void chooseFunction(ArrayList<Person> list) {
		@SuppressWarnings("unused")
		Person p = new Person();
		System.out.println("��ǰϵͳ��" + list.size() + "����Ա");
		System.out.print("��ѡ��");
		@SuppressWarnings("resource")
		Scanner scannerNumber = new Scanner(System.in);
		int n = scannerNumber.nextInt();
		switch (n) {
		case 1:
			scoreAccumlation(list);
			break;
		case 2:
			scoreExchange(list);
			break;
		case 3:
			queryResidualScore(list);
			break;
		case 4:
			changePassed(list);
			break;
		case 5:
			openCard(list);
			break;
		//case 6:exit();break;
		default:
			System.out.println("�����������������룡����");
			chooseFunction(list);
		}
	}
}

public class TestDemo {
	public static void main(String[] args) {
		System.out.println(
				"************************************************��ӭ���볬�л�Ա����ϵͳ*************************************");
		System.out.println("1.�����ۼ�\t2.���ֶһ�\t3.��ѯʣ�����\t�޸�����\t5.����\t6.�˳�");
		System.out.println(
				"************************************************************************************************************");
		ArrayList<Person> list = new ArrayList<Person>();
		@SuppressWarnings("unused")
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		list.add(new Person("����", "12345678", "12345678", 1000, date));
		new OtherMethod().chooseFunction(list);
	}
}
