package pac1;

public class TC001_variables {

	private double dblwidth=10;
	private double dblheight=10;
	private double dbldepth=4;
	
	public static int boxid;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TC001_variables box = new TC001_variables();
	        // Call calvolume() using the instance
	        double x = box.calvolume();
	}

	 public double calvolume()
	 {
		 double doutemp=0;
		 doutemp=dblwidth*dblheight*dbldepth;
		 System.out.println(doutemp);
		 return doutemp;
		 
	 }
}
