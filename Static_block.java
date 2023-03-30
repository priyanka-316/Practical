// till jdk 1.6 it is possible that main we can execute static block
//jdk 1.7 onwards it is possible to execute a javacode withput main().
package packageeg;

public class Static_block {
	static
	{
		System.out.println("Static block executed");
	}

}
