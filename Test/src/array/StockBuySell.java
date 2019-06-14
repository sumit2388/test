package array;

public class StockBuySell {

	public static void main(String[] args) {
		int [] ar = {100, 180, 260, 310, 40, 535, 695};
		int i=0;
		int min=0;
		int max=0;
		boolean flag = false;
		
		while(i<ar.length){
			if(ar[i]<ar[i+1]){
				i++;
				continue;
			}else{
				max=i;
				i++;
				flag = true;
			}
			if(flag){
				System.out.println(min+" "+max);
			}
			
		}
		

}
}
