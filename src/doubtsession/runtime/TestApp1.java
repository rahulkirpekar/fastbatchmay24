package doubtsession.runtime;

public class TestApp1 
{
	//						  Upcasting
	public static void getInfo(Vehicle v) 
	{
		v.getSpec();
		
		// Downcasting--->instanceof
		
		if (v instanceof TwVehicle) 
		{
			TwVehicle tw = (TwVehicle)v;// v--tw
			tw.getTwInfo();
			
		} else if(v instanceof LmvVehicle) 
		{
			LmvVehicle lmv = (LmvVehicle)v;// v--lmv
			lmv.getLmvInfo();	
			
		}else if(v instanceof HmvVehicle) 
		{
			HmvVehicle hmv = (HmvVehicle)v;// v--hmv
			hmv.getHmvInfo();			
		}
	}
	
//	public static void getInfo(TwVehicle tw) 
//	{
//
//	}
//	public static void getInfo(LmvVehicle tw) 
//	{
//
//	}
//	public static void getInfo(HmvVehicle tw) 
//	{
//
//	}
	public static void main(String[] args) 
	{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
//		TwVehicle tw = new TwVehicle();
////		LmvVehicle lmv = new LmvVehicle();
//		HmvVehicle hmv = new HmvVehicle();
		
		
		
//		getInfo(tw);
	}
}
