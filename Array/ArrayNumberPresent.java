package Array;

public class ArrayNumberPresent {

	public static void main(String[] args) {
		int roll_no[]=new int[4];
		roll_no[0]=90;
		roll_no[1]=89;
		roll_no[2]=6;
		roll_no[3]=45;
		int number_to_check=6;
		for(int i=0;i<roll_no.length;i++)
		{
			if(roll_no[i]==number_to_check)
			{
				System.out.println("we found the number "+number_to_check +" At the index position " +i);
			}
			else
			{
				System.out.println("we cannot found the number "+number_to_check +" At the index position " +i);
			}
		}

	}

}
