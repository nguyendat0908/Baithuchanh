import java.util.Scanner;

public class Bai6 {
public static void main(String[] args) {
	int n,giaithua=1;
	Scanner sc = new Scanner(System.in);
	do{
		System.out.println("Nhap so nguyen duong: ");
		n=sc.nextInt();
	}while(n<0);
	for(int i=1;i<=n;i++){
		giaithua=giaithua*i;
	}
	System.out.println(n+"! = " +(giaithua));
}
}