
public class TestingName {
	private String nama = "ira";
	private int umur = 30;
	
	public static void main(String[] args){
		TestingName tn = new TestingName();
//		TestingName tn = new TestingName("mabruli", 20);
//		TestingName tx = new TestingName("jidan", 100);
	}
	
	public TestingName(){
		setname(nama);
		welcome();
	}
	
	void setname(String param){
		this.nama = param;
	}
	
	void welcome(){
		System.out.println("nama saya adalah " + nama + " umurnya " + umur);
	}
	
//	public TestingName(String nama, int umur){
//		this.nama = nama;
//		this.umur = umur;
//		welcome();
//	}
	
	
}
