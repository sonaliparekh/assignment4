import java.util.*;

public class ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sonali";
		char[] a = str.toCharArray();
		char[] b = new char[str.length()+2];
		int j,i;
		for( i=(a.length)-1,j=0;i>=0;i--,j++)
		{
			b[j] = a[i];
			
		}
		b[j]='\0';
		String str1 = new String(b);
		System.out.println(str1);
	}

}
