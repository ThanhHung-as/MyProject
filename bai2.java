import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		int[] A = new int[n];
		int i,nto = 0,fi = 0,cp = 0,ht = 0,d = 0, Snt = 0, Scp = 0, Sfi = 0, Sht = 0, Sd = 0;
		System.out.println("NHAP MANG: ");
		for(i = 0; i < n; i++)
		{
			System.out.printf("A[%d] = ", i);
			A[i] = sc.nextInt();
		}
		System.out.println("XUAT MANG: ");
		for(i = 0; i < n ; i++)
			System.out.printf("%d  ",i,A[i]);
		System.out.print("SO NGUYEN TO: ");
		for(i = 0; i < n; i++)
		{
				int dem = 0;
				for(int j = 1; j<=A[i]; j++)
					if(A[i]%j==0)
						dem++;
					if(dem==2)
					{
						System.out.print(" " +A[i]);
						nto++;
						Snt = Snt + A[i];
					}
		}
		if(nto == 0)
			System.out.print("Khong co");
		else
			System.out.print("\nTong so nguyen to: " + Snt);
		System.out.print("\nSO CHINH PHUONG: ");
		for(i = 0; i < n; i++)
			if(Math.sqrt(A[i])%1==0 && A[i]>0)
			{
				System.out.print(" " + A[i]);
				cp++;
				Scp = Scp + A[i];
			}
		if(cp==0)
			System.out.print("Khong co");
		else
			System.out.print("\nTong so chinh phuong: " + Scp);
		System.out.print("\nSO FIBONACI: ");
		for(i = 0; i<n;i++)
		{
			int a = 0, b = 1;
			do
			{
				if(A[i]==a || A[i] == b)
				{
					System.out.print(" " + A[i]);
					fi++;
					Sfi = Sfi + A[i];
					break;
				}
				int c;
				c = b;
				b = a + b;
				a = c;
			}
			while(b<=A[i]);
		}
		if(fi==0)
			System.out.print("Khong co");
		else
			System.out.print("\nTong Fibonaci: " + Sfi);
		System.out.print("\nSO HOAN THIEN: ");
		for(i = 0; i < n; i++)
		{
			int x = 1, S = 0;
			while(x<=A[i]/2)
			{
				if(A[i]%x==0)
					S = S + x;
				if(S == A[i])
				{
					System.out.print(" "+ A[i]);
					ht++;
					Sht = Sht + A[i];
					break;
				}
				x++;
			}
		}
		if(ht==0)
			System.out.print("Khong co");
		else
			System.out.print("\nTong so hoan thien: "+ Sht);
		System.out.print("\nSO DUONG: ");
		for(i = 0; i<n;i++)
			if(A[i]>0)
			{
				System.out.print(" "+ A[i]);
				d++;
				Sd = Sd +A[i];
			}
		if(d==0)
			System.out.print("Khong co");
		else
			System.out.print("\nTong so duong: " + Sd);
		int min;
		for(i = 0; i<n-1;i++)
		{
			 min = i;
			for(int j = i+1;j<n;j++)
				if(A[j]<A[i])
					min = j;
			if(min!=i)
			{
				int t;
				t = A[i];
				A[i] = A[min];
				A[min] = t;
			}
		}
		System.out.print("\nDay so da sap xep tu nho -> lon (chon): ");
		for(i = 0; i<n;i++)
			System.out.print(" " + A[i]);
		int max;
		for(i = 0; i<n; i++)
		{
			max = A[i];
			int j = i-1;
			while(j>=0 && A[j] < max)
			{
				A[j+1] = A[j];
				j = j-1;
			}
			A[j+1] = max;
		}
		System.out.print("\nDay so da sap xep tu lon -> nho (chen): ");
		for(i = 0; i<n;i++)
			System.out.print(" " + A[i]);
		int l = 0, r = n-1;
		while(true)
		{
			int x = A[(l+r)/2];
			i = l;
			int j = r;
				while(A[i] < x)
					i++;
				while(A[j] > x)
					j--;
				if(i<j)
				{
					int t = A[i];
					A[i] = A[j];
					A[j] = t;
				}
				else
					break;		
			
		}
		System.out.print("\nDay so da sap xep tu nho -> lon (nhanh): ");
		for(i = 0; i<n;i++)
			System.out.print(" " + A[i]);
}
}
