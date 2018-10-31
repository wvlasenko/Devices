package devPkg;

public class Devices {
	public String name;
	public int power;
enum Facttype  {Konia("Good"), GL,SVM
private String factory;
Facttype(){
	factory=f;
	
	
}
}

	public Devices createDevices(int type, int power) {
		Devices res = null;
		switch (type) {
		case 1:
			res = new Comp();
			break;
		case 2:
			res = new Nout();
			break;
		case 3:
			res = new Server();
			break;
		case 4:
			res = new ELT();
			break;
		}
		res.setPower(power);
		return res;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public int setPower(int power) {
		return this.power = power;
	}
//public static int getCountProc() {
	// return getCountProc;
//public int id;
//public static int nextid;

	int sum = 0;

	public int countPW(Devices dev[]) {

		for (int i = 0; i < dev.length; i++) {
			sum = sum + dev[i].getPower();
		}
		return (sum);

	}

	int count = 0;

	public int countMem(Devices dev[]) {

		for (int i = 0; i < dev.length; i++) {
			if (dev[i] instanceof Comp) {
				count = count + ((Comp) dev[i]).getMem();
			}

		}
		return (count);
	}

	public int comper(Devices d1,Devices d2) {
		if (d1 instanceof Comp && d2 instanceof Comp) {
//			if ((Comp)d1).getMem ==((Comp)d2).getMem))
		}
//			if ((Comp)d1).getMem >((Comp)d2).getMem))
//return 1;
//else {
	return -1;
	}
	}

