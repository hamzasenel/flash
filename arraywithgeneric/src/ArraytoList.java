

public class ArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final int len = 5;
        // creating an integer array 
        Generic_Array<String> int_Array = new Generic_Array();
        //System.out.print("Generic Array <Integer>:" + " ");
        int_Array.add("hamza");
        int_Array.add("senel");
        for (int i = 0; i <int_Array.len; i++)
         //int_Array.set(i, i * 2);
        System.out.println(int_Array.get(i));
        
	}

	public static void elemanekle(String s) {
		String[] dizii = {};
		String ekle="ekle";
		
		String[] diziy=new String[dizii.length+1];
		for (String a : dizii) {
			int sayac=0;
			diziy[sayac]=a;
			sayac++;
		}
		diziy[dizii.length]=s;
		for (String b : diziy) {
			System.out.println(b);
		}
	}

}
