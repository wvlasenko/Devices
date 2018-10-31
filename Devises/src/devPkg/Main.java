package devPkg;



public class Main {

	public static void main(String[] args) {
	//Comp Computer = new Comp();	
	//Computer.setName("Lenovo");;
	//Nout Nb=new Nout();
	//Nb.setPower(500);
	//System.out.println(Nb.getPower()+ " "+ (Computer.getName()));
	//Comp IBM = new Comp ();
	//int MS = IBM.getMemSize();
	int n=10;	
	Devices obj = new Devices();
	Devices [] dev = new Devices [n];
	dev[0]=obj.createDevices (1,5);
	((Comp)dev[0]).setMem(2);
	dev[1]=obj.createDevices (1,3);
	((Comp)dev[1]).setMem(2);
	dev[2]=obj.createDevices (1,2);
	((Comp)dev[2]).setMem(2);
	dev[3]=obj.createDevices (1,3);
	((Comp)dev[3]).setMem(2);
	dev[4]=obj.createDevices (1,4);
	((Comp)dev[4]).setMem(2);
	System.out.println("Mem"+obj.countMem(dev));
	}
}
