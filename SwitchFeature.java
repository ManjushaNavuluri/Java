//Explore Java's switch-case statements with examples demonstrating traditional, multi-label, and yield-based approaches.
//The program illustrates efficient ways to handle conditional logic using Java's switch feature.
//The use of yield showcases modern syntax for returning values directly from switch expressions, 
//enhancing code clarity and functional-style programming practices.
package examplesPrograms;
import java.util.*;
class SwitchFeature {

	public static void main(String[] args) {
		int i=2;
		//using traditional switch case
		switch(i) {
		case 1 :System.out.println("1");
		break;
		case 2 :System.out.println("1");
		break;
		case 3 :System.out.println("1");
		break;
		default :System.out.println("-1");
		break;
		}
		//using multi-label switch case
		switch(i) {
		case 1,2,3:System.out.println("1");
		break;
		default:System.out.println("-1");
		break;
		}
		//using yield
		//Yield will return the value to the switch case
		int data = switch(i) {
		case 1,2,3 : yield i;
		default : yield -1;
		};
		System.out.println(data);
	}
}
