package 超市会员管理系统;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

//创建Person类
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
	// 检验账号密码函数
	public Person checkPerson(ArrayList<Person> list) {
		System.out.print("请输入您的会员卡号：");
		@SuppressWarnings("resource")
		Scanner scannerUser = new Scanner(System.in);
		String id = scannerUser.next();
		System.out.print("请输入您的会员卡密码：");
		@SuppressWarnings("resource")
		Scanner scannerPasswd = new Scanner(System.in);
		String password = scannerPasswd.next();
		// 检测p是否在list集合内
		for (Person p : list) {
			if (id.equals(p.getUserID()) && password.equals(p.getPasswd())) {
				return p;
			}
		}
		return null;
	}

	// 积分累积函数
	public void scoreAccumlation(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (list.contains(p)) {
			System.out.print("请输入您此次消费金额（消费1元累计1积分）：");
			@SuppressWarnings("resource")
			Scanner scannerScore = new Scanner(System.in);
			int score = scannerScore.nextInt();
			p.setScore(p.getScore() + score);
			System.out.println("积分累计成功！\n目前你的积分为：" + p.getScore());
		} else {
			System.out.println("账号信息不匹配，操作失败");
		}
		chooseFunction(list);
	}

	// 积分兑换函数
	public void scoreExchange(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (list.contains(p)) {
			System.out.print("请输入您需要兑换使用的积分（100积分抵用0.1元，不足100的积分不做抵用）：");
			@SuppressWarnings("resource")
			Scanner scannerScore = new Scanner(System.in);
			int score = scannerScore.nextInt();
			if (p.getScore() >= 100 && score >= 100 && score / 100 <= p.getScore()) {
				p.setScore(p.getScore() - score / 100);
				System.out.println("您的消费金额中使用会用积分抵消" + score / 100 + "元");
				System.out.println("积分兑换成功！\n目前你的积分为：" + p.getScore());
				System.out.println("积分兑换成功！");
				chooseFunction(list);
			} else {
				System.out.println("兑换积分失败，账户积分不足或需要兑换积分大于剩余积分！");
				chooseFunction(list);
			}
		} else {
			System.out.println("账号信息不匹配，操作失败");
		}
		chooseFunction(list);
	}

	// 查询积分及信息函数
	public void queryResidualScore(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (list.contains(p)) {
			System.out.println("姓名\t会员卡号\t剩余积分\t开卡日期");
			System.out.println(p.getName() + "\t" + p.getUserID() + "\t" + p.getScore() + "\t" + p.getDate());
			chooseFunction(list);
		} else {
			System.out.println("账号信息不匹配，操作失败");
		}
		chooseFunction(list);
	}

	// 修改密码函数
	public void changePassed(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (list.contains(p)) {
			System.out.print("请输入您的新密码：");
			@SuppressWarnings("resource")
			Scanner scannerNewPasswd = new Scanner(System.in);
			String NewPasswde = scannerNewPasswd.next();
			p.setPasswd(NewPasswde);
			System.out.println("密码修改成功！");
			chooseFunction(list);
		} else {
			System.out.println("账号信息不匹配，操作失败");
		}
		chooseFunction(list);
	}

	// 兑换礼品

	String gift = new String();

	public void exchangeGift(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (list.contains(p)) {
			System.out.print("可兑换礼品列表：\n1.2000积分兑换一支佳洁士牙膏\n" + "2.2500兑换一袋(小)雕牌洗衣粉\n" + "3.2500兑换一支电动牙刷\n"
					+ "4.3000兑换一瓶洗衣液(1L)\n" + "5.3500兑换一袋(大)雕牌洗衣粉\n" + "6.4000兑换一把飞科剃须刀\n" + "7.查看已兑换的礼品\n" + "8.取消\n");
			System.out.print("请输入数字选择你要兑换的礼品：");
			@SuppressWarnings("resource")
			Scanner scannerNumber = new Scanner(System.in);
			int n = scannerNumber.nextInt();
			switch (n) {
			case 1:
				if (p.getScore() >= 2000) {
					p.setScore(p.getScore() - 2000);
					gift = gift + "一支佳洁士牙膏\n";
					System.out.println("成功兑换一支佳洁士牙膏");
				} else {
					System.out.println("积分不足，兑换失败");
				}
				break;
			case 2:
				if (p.getScore() >= 2500) {
					p.setScore(p.getScore() - 2500);
					gift = gift + "一袋(小)雕牌洗衣粉\n";
					System.out.println("成功兑换一袋(小)雕牌洗衣粉");
				} else {
					System.out.println("积分不足，兑换失败");
				}
				break;
			case 3:
				if (p.getScore() >= 2500) {
					p.setScore(p.getScore() - 2500);
					gift = gift + "一支电动牙刷\n";
					System.out.println("成功兑换一支电动牙刷");
				} else {
					System.out.println("积分不足，兑换失败");
				}
				break;
			case 4:
				if (p.getScore() >= 3000) {
					p.setScore(p.getScore() - 3000);
					gift = gift + "一瓶洗衣液(1L)\n";
					System.out.println("成功兑换一瓶洗衣液(1L)");
				} else {
					System.out.println("积分不足，兑换失败");
				}
				break;
			case 5:
				if (p.getScore() >= 3500) {
					p.setScore(p.getScore() - 3500);
					gift = gift + "一袋(大)雕牌洗衣粉\n";
					System.out.println("成功兑换一袋(大)雕牌洗衣粉");
				} else {
					System.out.println("积分不足，兑换失败");
				}
				break;
			case 6:
				if (p.getScore() >= 4000) {
					p.setScore(p.getScore() - 4000);
					gift = gift + "一把飞科剃须刀\n";
					System.out.println("成功兑换一把飞科剃须刀");
				} else {
					System.out.println("积分不足，兑换失败");
				}
				break;
			case 7:
				p.setGift(gift);
				System.out.println("会员卡" + p.getUserID() + "已成功兑换下列礼品\n" + p.getGift());
				break;
			case 8:
				exit();
				break;
			default:
				System.out.println("输入有误，请重新进行操作");
			}
		} else {
			System.out.println("账号信息不匹配，操作失败");
		}
		chooseFunction(list);
	}

	// 开卡函数
	public void openCard(ArrayList<Person> list) {

		System.out.print("请输入注册姓名：");
		@SuppressWarnings("resource")
		Scanner scannerNewName = new Scanner(System.in);
		String NewName = scannerNewName.next();
		System.out.print("请输入注册密码：");
		@SuppressWarnings("resource")
		Scanner scannerNewPasswd = new Scanner(System.in);
		String NewPasswd = scannerNewPasswd.next();
		while (NewPasswd.length() < 6) {
			System.out.print("会员密码不能少于6位，请重新输入注册密码：");
			@SuppressWarnings("resource")
			Scanner scannerNewPasswdTrue = new Scanner(System.in);
			NewPasswd = scannerNewPasswdTrue.next();
		}
		// 以一定格式获取当前时间
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));
		// 随机数产生会员卡号
		StringBuilder newUserID = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			newUserID.append(random.nextInt(10));
		}
		// 检测产生的会员卡号是否在list集合内存在
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
		System.out.println("恭喜，开通会员卡成功，系统赠送您100积分！您的会员卡号为：" + NewUserIDT);
		System.out.println("姓名：" + NewName + "\n会员卡号：" + NewUserIDT + "\n剩余积分（开卡默认100积分）：" + 100 + "\n开卡时间：" + date);
		chooseFunction(list);
	}

	// 清除会员
	public void dropCard(ArrayList<Person> list) {
		Person p = checkPerson(list);
		if (list.contains(p)) {
			list.remove(p);
			System.out.println("会员卡账号已成功删除");
		} else {
			System.out.println("账号信息不匹配，操作失败");
		}
		chooseFunction(list);

	}

	// 退出函数
	public void exit() {
		System.out.println("已成功退出");
	}

	// 功能函数
	public void chooseFunction(ArrayList<Person> list) {
		@SuppressWarnings("unused")
		Person p = new Person();
		System.out.println("当前系统有" + list.size() + "个会员");
		System.out.print("请选择：");
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
			System.out.println("输入有误，请重新输入！！！");
			chooseFunction(list);
		}
	}
}

public class TestDemo {
	public static void main(String[] args) {
		System.out.println(
				"************************************************欢迎进入超市会员管理系统*************************************");
		System.out.println("1.积分累计\t2.积分兑换\t3.查询剩余积分\t4.修改密码\t5.开卡\t6.删除会员卡账号\t7.兑换礼品\t8.退出");
		System.out.println(
				"*****************************************************************************************************");
		ArrayList<Person> list = new ArrayList<Person>();
		@SuppressWarnings("unused")
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());
		list.add(new Person("张三", "12345678", "12345678", 10000, date, ""));
		list.add(new Person("李四", "12345679", "12345679", 1000, date, ""));
		new OtherMethod().chooseFunction(list);
	}
}
