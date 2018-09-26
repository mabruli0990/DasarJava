
public class Matematika {
	float luas;
	float tinggi;
	
		
		public double luasSegitiga(float alas, float tinggi){
//			this.luas = luas;
//			this.tinggi = tinggi;
//			
			double luas = 0.5 * alas * tinggi ;
//			
//			System.out.println("luasnya adalah : " + luas);
			
			
			
			return luas;
		}
		

		
		
		public static void main(String[] args){
			Matematika mt = new Matematika();
			
			mt.luasSegitiga(10.3f, 20.3f);
			
		}
	
	
}
