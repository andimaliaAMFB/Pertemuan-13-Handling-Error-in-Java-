package eksepsiTes;

public class MultiEksepsi {

	public static void cobaEksepsi(int pembilang, int penyebut)
	{
		try {
			int hasil = pembilang/ penyebut;
			System.out.println("Hasil bagi: "+ hasil);
		}
		catch(ArithmeticException eksepsi1) {
			System.out.println("Terdapat pembagian dengan 0");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cobaEksepsi(4,0);// menimbulkan rithmeticException
		System.out.println();
		
		cobaEksepsi(12,4);
	}

}
