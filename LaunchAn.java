

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

@interface CricketPlayer{

	int age() default 34;
	String country() default "India";	
}

@CricketPlayer

class Virat{
	@CricketPlayer
	int runs;
	int innings;
	

@CricketPlayer
public void setRuns(int runs) {
	this.runs=runs;
}

public void setInnings(int innings) {
	this.innings=innings;
} 

public int getRuns() {
	return runs;
}

public int getInnings() {
	return innings;
}

public class LaunchAn {
public static void main(String arg[]) {
Virat v = new Virat();
v.setRuns(100);
v.setInnings(250); 

System.out.println(v.getRuns());
System.out.println(v.getInnings());

System.out.println("Annotation values are fetched below:");

Class c = v.getClass();
Annotation an = c.getAnnotation(CricketPlayer.class); 
CricketPlayer cp = (CricketPlayer ) an;
System.out.println("Age:"+cp.age());
System.out.println("Country:"+cp.country());

}
}
}
