package mark.java_demo;

import java.util.List;

import com.sun.jna.Structure;
import com.sun.jna.Structure.FieldOrder;

@FieldOrder({"r1","r2","r3","r4","r5","r6","L7"})
public class Level_8  extends Structure{
	public static class ByReference extends Level_8 implements Structure.ByReference 
	{
	}
	public static class ByValue extends Level_8 implements Structure.ByValue 
	{
	}
	public double r1;
	public double r2;
	public double r3;
	public double r4;
	public double r5;
	public double r6;
	
	public Level_7.ByValue L7 = new Level_7.ByValue();
}
