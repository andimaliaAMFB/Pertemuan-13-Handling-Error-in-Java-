package demoThrow;

public class DemoThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mahasiswa mhs = new Mahasiswa();
		mhs.setNim(null);
		mhs.setNama("Nadilla");
		System.out.println("\nNIM: "+mhs.getNim());
		System.out.println("Nama: "+mhs.getNama());
	}

}
