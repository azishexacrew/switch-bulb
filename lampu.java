
public class lampu {
    public static void main(String[] args) {
         boolean[] lampu = new boolean[101];

		for(int i = 1; i < lampu.length; i++){
		    for(int j = 0; j<lampu.length;j+=i){
		        lampu[j] = !lampu[j];
		    }
		}

		for(int i = 1; i<lampu.length;i++){
		    if(lampu[i]){
		        System.out.println(i + ": "+ lampu[i]);
		    }
		}

		int jml = 0; 
		for (int i=0; i<lampu.length; i++) {
		    if (lampu[i]) 
		        jml++;
		}
		System.out.println("# Jumlah Lampu yang menyala:" + jml);
    }
}
