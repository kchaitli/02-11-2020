class VehicleTax{
	public static void main(String args[]){
		
		int vehiclePrize=60000;
		String state = "KL";
		float RoadTax=0;

		switch(state){
				case"KA": RoadTax= vehiclePrize*0.18f;
			        	  System.out.println(RoadTax);
			 		  break;
				case"AP": RoadTax= vehiclePrize*0.15f;
			 		  System.out.println(RoadTax);
					  break;
				case"KL": RoadTax= vehiclePrize*0.20f;
					  System.out.println(RoadTax);
					  break;
				case"TN": RoadTax= vehiclePrize*0.16f;
					  System.out.println(RoadTax);
					  break;
				case"TS": RoadTax= vehiclePrize*0.19f;
					  System.out.println(RoadTax);
					  break;
				case"MP": RoadTax= vehiclePrize*0.21f;
					  System.out.println(RoadTax);
					  break;					
		default:System.out.println("invalid entry");
				}
	}

}