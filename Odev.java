import java.util.Scanner;
/*
 Java ile kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran program:
 Tutar 0 ile 1000 arasında ise KDV oranı % 18 olarak,
 Tutar 1000 ve üzeri ise KDV oranı % 8 olacak şekilde çalışmaktadır.
*/
public class Odev {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ücret tutarını giriniz: ");
		double tutar = scanner.nextDouble();
		double kdvTutar;
		double toplamTutar1 = tutar + tutar * 0.18;
		double toplamTutar2 = tutar + tutar * 0.08;
		
		if (tutar > 0.0 && tutar < 1000) {
			kdvTutar = tutar * 0.18;
			System.out.println("KDV'siz tutar: " + tutar);
			System.out.println("KDV oranı: %18");
			System.out.println("KDV tutarı: " + kdvTutar);
			System.out.println("KDV'li tutar: " + toplamTutar1);
		}
		else if (tutar >= 1000.0) {
			kdvTutar = tutar * 0.08;
			System.out.println("KDV'siz Tutar: " + tutar);
			System.out.println("KDV oranı: %8");
			System.out.println("KDV Tutarı: " + kdvTutar);
			System.out.println("KDV'li Tutar: " + toplamTutar2);
		}
		else {
			System.out.println("Lütfen Tutarı Doğru Giriniz...");
		}
	}

}
