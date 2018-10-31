package devPkg;

import java.util.Scanner;

public class Comp extends Devices{
	public int mem;
	public Comp getMem; {

}

	public int getMem() {
		return mem;
	}

	public void setMem(int mem) {
		this.mem = mem;}
	
	public int getMemSize() {
		System.out.println("Введите объем оперативной памяти от 1 до 32 Gb ");
		Scanner scan = new Scanner(System.in);
		int mem = scan.nextInt();
		while ((mem > 1) && (mem <= 32)) {
			System.out.println("Объем оперативной памяти Вашего компьютера составляет - " + mem + " Gb");
			return mem;
		}
		System.out.println("Ошибка " + " Введите корректный объем памяти ");
		return 0;

	}


	
	}
