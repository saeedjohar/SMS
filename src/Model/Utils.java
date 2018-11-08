package Model;

public class Utils {
public static boolean Validate(String str)
{
	if(str.trim()=="")
	{
		return true;
	}
	else
	{
		return false;
	}
	}

public static boolean ValidateTC(String str)
{
	if(str.trim().length()<10)
	{
		return true;
	}
	else
	{
		return false;
	}
	}


}
