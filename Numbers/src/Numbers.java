 class Numbers {
    
     public static void main(String args[])
     {
         int sumArgs=0;
         for (int i=0;i<args.length;i++)
             sumArgs++;
         int[] digits = new int[sumArgs];
         int sum=0;
         for (int i = 0; i < args.length; i++) {
			switch (args[i]) {
			case "zero":
				sum=sum+0*(int)Math.pow(10, (sumArgs-(i+1)));
				break;
			case "one":
				sum=sum+1*(int)Math.pow(10, (sumArgs-(i+1)));
				break;
			case "two":
				sum=sum+2*(int)Math.pow(10, (sumArgs-(i+1)));
				break;
			case "three":
				sum=sum+3*(int)Math.pow(10, (sumArgs-(i+1)));
				break;
			case "four":
				sum=sum+4*(int)Math.pow(10, (sumArgs-(i+1)));
				break;
			case "five":
				sum=sum+5*(int)Math.pow(10, (sumArgs-(i+1)));
				break;
			case "six":
				sum=sum+6*(int)Math.pow(10, (sumArgs-(i+1)));
				break;
			case "seven":
				sum=sum+7*(int)Math.pow(10, (sumArgs-(i+1)));
				break;
			case "eight":
				sum=sum+8*(int)Math.pow(10, (sumArgs-(i+1)));
				break;
			case "nine":
				sum=sum+9*(int)Math.pow(10, (sumArgs-(i+1)));
				break;
			default:
				System.out.println("Non-valid argument!");
				break;
		}
            }
         System.out.println(sum);
     }
}
