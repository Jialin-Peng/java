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
	private String gift;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String userID, String passwd, int score, Date date, String gift) {
		super();
		this.name = name;
		this.userID = userID;
		this.passwd = passwd;
		this.score = score;
		this.date = date;
		this.gift = gift;
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

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
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
		// ���p�Ƿ���list������
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
		if (list.contains(p)) {
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
		if (list.contains(p)) {
			System.out.print("����������Ҫ�һ�ʹ�õĻ��֣�100���ֵ���0.1Ԫ������100�Ļ��ֲ������ã���");
			@SuppressWarnings("resource")
			Scanner scannerScore = new Scanner(System.in);
			int score = scannerScore.nextInt();
			if (p.getScore() >= 100 && score >= 100 && score / 100 <= p.getScore()) {
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
		chooseFunction(list);
	}

	// ��ѯ���ּ���Ϣ����
	public void queryResidualScore(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (list.contains(p)) {
			System.out.println("����\t��Ա����\tʣ�����\t��������");
			System.out.println(p.getName() + "\t" + p.getUserID() + "\t" + p.getScore() + "\t" + p.getDate());
			chooseFunction(list);
		} else {
			System.out.println("�˺���Ϣ��ƥ�䣬����ʧ��");
		}
		chooseFunction(list);
	}

	// �޸����뺯��
	public void changePassed(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (list.contains(p)) {
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
		chooseFunction(list);
	}

	// �һ���Ʒ

	String gift = new String();

	public void exchangeGift(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (list.contains(p)) {
			System.out.print("�ɶһ���Ʒ�б�\n1.2000���ֶһ�һ֧�ѽ�ʿ����\n" + "2.2500�һ�һ��(С)����ϴ�·�\n" + "3.2500�һ�һ֧�綯��ˢ\n"
					+ "4.3000�һ�һƿϴ��Һ(1L)\n" + "5.3500�һ�һ��(��)����ϴ�·�\n" + "6.4000�һ�һ�ѷɿ����뵶\n" + "7.�鿴�Ѷһ�����Ʒ\n" + "8.ȡ��\n");
			System.out.print("����������ѡ����Ҫ�һ�����Ʒ��");
			@SuppressWarnings("resource")
			Scanner scannerNumber = new Scanner(System.in);
			int n = scannerNumber.nextInt();
			switch (n) {
			case 1:
				if (p.getScore() >= 2000) {
					p.setScore(p.getScore() - 2000);
					gift = gift + "һ֧�ѽ�ʿ����\n";
					System.out.println("�ɹ��һ�һ֧�ѽ�ʿ����");
				} else {
					System.out.println("���ֲ��㣬�һ�ʧ��");
				}
				break;
			case 2:
				if (p.getScore() >= 2500) {
					p.setScore(p.getScore() - 2500);
					gift = gift + "һ��(С)����ϴ�·�\n";
					System.out.println("�ɹ��һ�һ��(С)����ϴ�·�");
				} else {
					System.out.println("���ֲ��㣬�һ�ʧ��");
				}
				break;
			case 3:
				if (p.getScore() >= 2500) {
					p.setScore(p.getScore() - 2500);
					gift = gift + "һ֧�綯��ˢ\n";
					System.out.println("�ɹ��һ�һ֧�綯��ˢ");
				} else {
					System.out.println("���ֲ��㣬�һ�ʧ��");
				}
				break;
			case 4:
				if (p.getScore() >= 3000) {
					p.setScore(p.getScore() - 3000);
					gift = gift + "һƿϴ��Һ(1L)\n";
					System.out.println("�ɹ��һ�һƿϴ��Һ(1L)");
				} else {
					System.out.println("���ֲ��㣬�һ�ʧ��");
				}
				break;
			case 5:
				if (p.getScore() >= 3500) {
					p.setScore(p.getScore() - 3500);
					gift = gift + "һ��(��)����ϴ�·�\n";
					System.out.println("�ɹ��һ�һ��(��)����ϴ�·�");
				} else {
					System.out.println("���ֲ��㣬�һ�ʧ��");
				}
				break;
			case 6:
				if (p.getScore() >= 4000) {
					p.setScore(p.getScore() - 4000);
					gift = gift + "һ�ѷɿ����뵶\n";
					System.out.println("�ɹ��һ�һ�ѷɿ����뵶");
				} else {
					System.out.println("���ֲ��㣬�һ�ʧ��");
				}
				break;
			case 7:
				p.setGift(gift);
				System.out.println("��Ա��" + p.getUserID() + "�ѳɹ��һ�������Ʒ\n" + p.getGift());
				break;
			case 8:
				exit();
				break;
			default:
				System.out.println("�������������½��в���");
			}
		} else {
			System.out.println("�˺���Ϣ��ƥ�䣬����ʧ��");
		}
		chooseFunction(list);
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
		// ��һ����ʽ��ȡ��ǰʱ��
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));
		// �����������Ա����
		StringBuilder newUserID = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			newUserID.append(random.nextInt(10));
		}
		// �������Ļ�Ա�����Ƿ���list�����ڴ���
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
		list.add(new Person(NewName, NewUserIDT, NewPasswd, 100, date, ""));
		System.out.println("��ϲ����ͨ��Ա���ɹ���ϵͳ������100���֣����Ļ�Ա����Ϊ��" + NewUserIDT);
		System.out.println("������" + NewName + "\n��Ա���ţ�" + NewUserIDT + "\nʣ����֣�����Ĭ��100���֣���" + 100 + "\n����ʱ�䣺" + date);
		chooseFunction(list);
	}

	// �����Ա
	public void dropCard(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (list.contains(p)) {
			list.remove(p);
			System.out.println("��Ա���˺��ѳɹ�ɾ��");
		} else {
			System.out.println("�˺���Ϣ��ƥ�䣬����ʧ��");
		}
		chooseFunction(list);

	}

	// �˳�����
	public void exit() {
		System.out.println("�ѳɹ��˳�");
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
		case 6:
			dropCard(list);
			break;
		case 7:
			exchangeGift(list);
			break;
		case 8:
			exit();
			break;
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
		System.out.println("1.�����ۼ�\t2.���ֶһ�\t3.��ѯʣ�����\t4.�޸�����\t5.����\t6.ɾ����Ա���˺�\t7.�һ���Ʒ\t8.�˳�");
		System.out.println(
				"*****************************************************************************************************");
		ArrayList<Person> list = new ArrayList<Person>();
		@SuppressWarnings("unused")
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		list.add(new Person("����", "12345678", "12345678", 10000, date, ""));
		list.add(new Person("����", "12345679", "12345679", 1000, date, ""));
		new OtherMethod().chooseFunction(list);
	}
}
