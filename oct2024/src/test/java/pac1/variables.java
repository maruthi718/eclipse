package pac1;

public class variables {
		private static double dblwidth=10;
		private static double dblheight=20;
		private static double dbldepth=5;
		private static int boxid;

		public static void main(String[] args) {
			
			calvolume();
		}
		public static double calvolume()
		{
			double doutemp=0;
			doutemp=dblwidth*dblheight*dbldepth;
			System.out.println(doutemp);
			return doutemp;
		}

	}

