public class objcls {
    // Java program to demonstrate working of
// hashCode() and toString()
	static int last_roll = 100;
	int roll_no;


	// Constructor
	objcls()
	{
		roll_no = last_roll;
		last_roll++;
	}

	// Overriding hashCode()
	@Override public int hashCode() { return roll_no; }

	// Driver code
	public static void main(String args[])
	{
		objcls s = new objcls();

		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
	}
}

