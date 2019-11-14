public class InsertionSort{

	private static int[] data = {5,2,4,6,1,3};
	
	public static void sort(int data[]){
		for(int j=1; j<data.length; j++){

			int key = data[j];
			int i = j-1;

			while(i>=0 && data[i]>key){
				data[i+1] = data[i];
				i = i-1;
			}

			i = i+1;
			data[i] = key;
		}
	}
	public static void main(String[] args){
		sort(data);
		for (int i : data)System.out.println(i);		
	}
}