import java.util.StringTokenizer;

class Birthday {

	public static void main(String args[]){
		String bday = "18/04/1986";
		StringTokenizer st = new StringTokenizer(bday,"/");
		System.out.println("Token 1: "+st.nextToken());
		System.out.println("Token 2: "+st.nextToken());
		System.out.println("Token 3: "+st.nextToken());
	}
}

