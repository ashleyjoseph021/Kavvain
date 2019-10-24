/*
 *  ___ = needs done
 */

package kavvain_code;

import java.util.Scanner;

public class Rough_Draft {
	Scanner input = new Scanner(System.in);
    

	public Rough_Draft() {
		print("Welcome to The Keys of Kavvian \n" +
	          "A choose your own adventure game \n" +
			  "\n" );
		//change to ascii art for this instead of just text ___
			  
			  print("~ Entry Level ~ " +
	          "\n" +
		      "You are standing on a familar strret you've walked down this street a thousand times before. \n" + 
			  "You know the layout of the building and side streets like the back of your hand.\n" +
		      "You begin walking down the street. \n" + 
			  "You suddenly stop.\n" +
		      "To your right the building that has always been empty is now what appears to be a restruant. \n" +
			  "The windows have been tinted black and a decorative sign above the french double door reads: \n");
		
		print("???");
		//insert ascci art here for the restaurant sign ___
		
		choice1(input);
	}
	
	
	public void choice1(Scanner input) {
		String choice1_input;
		
		print("      Are you going to? \n" +
		      "	a) continue down street \n\t\t" +
			  "or \n\t" +
			  "b) enter restruant \n" +
			  "" );
		
		choice1_input = input.next();
		switch (choice1_input) {
			
			default: 
			print("Invalid Entry");
			break;
		
			case "a":
				print("You continue down the street and go on with your life \n");
				
				print("??? \n");
				//insert Game Over (100, entry) Ascii ___
				break;
				
				case "b":
				print("You walk into the restruant. \n" +
			          "You are standing in what appears to be a waiting area. \n" +
					  "There are couches on either wall and a counter sits centered between the last couches on either wall. \n" +
			          "You can see back into part of the restruant. \n" +
					  "\n" +
					  "There is a sign near the counter which reads: \n");
				
				print("??? ");
				//insert Sign (by counter) Ascii ___
				
				print("A waitor approaches you and says, \"Welcome, would you like a table?\" \n");
				
				choice2(input);
				
				break;
		
		
			}
		
		}
	
	public void choice2(Scanner input) {
		
		String choice2_input = input.next();
		
		if (choice2_input.equalsIgnoreCase("Yes")) { 
			
			print("The waitor replies" +
			      "\"Excelent Choice\" \n" +
				  "and leads you futrhter into the restruant. \n" +
			      "You notice two men in suits standing behind the edge of the wall. \n" +
				  "You are lead to a small table neart one of the blacked out windows. \n" +
			      "The waitor says, \n" +
				  "\"The menu is on the table. I will be back in a few minutes to take your order. \n" +
			      "You look down at the Menu"
				  );
			
			print("???");
			//insert Menu Art
			
			choice3(input);
			
		}
		
		else if (choice2_input.equalsIgnoreCase("No")) {
			print("The airtor frowns and says, \n" +
		          " \"That's unfortunate\" \n" +
				  "Two men in suits walk into the waiting areas and brab either of your arms. \n" +
				   "The waitor walks over to the wall and pointsat a picture of a group of people sitting around a fire. \n" +
				   "\"This will do\" \n" +
				   "You struggle as the waitro putr a fingure on your forhead and laps the empty chair in the photo. \n" +
				   "A bright light blinds you for a moment and pain flashes through your body. \n" +
				   "The next thing you know you are sitting in the empty chair around the fire. \n" +
				   "You are now forced to sprend enternity watching the waiting area. \n" +
				   "You and the other people who you are trapped with never really figure out what's goint on \n"
					);
			
			print("???");
			//insert Game Over (200, Entry) Art ___
		}
		
		else {
			print("Invalid Entry");
		}
		
	}
	
	public void choice3(Scanner input) {
		
		String choice3_input = input.next();
		
		switch (choice3_input) {
		
			default: 
				print("Invalid Entry");
				
			case "a":
				
				break;
				
			case "b":
				
				break;
				
			case "c": 
				
				
				
				break;
				
				
		}
	}
	
	public void choice4(Scanner input) {
		
	}
	
	
    public void choice5(Scanner input) {
		
	}
    
	
    public void choice6(Scanner input) {
		
	}    

    
    public void choice7(Scanner input) {
		
	}
	
    
    public void choice8(Scanner input) {
		
	}
    
    
    public void choice9(Scanner input) {
		
	}
    
    
    public void choice10(Scanner input) {
		
	}
    
    
    public void choice11(Scanner input) {
		
	}
    
    
    public void choice12(Scanner input) {
		
	}
    
    
    public void choice13(Scanner input) {
		
	}
    
    
    public void choice14(Scanner input) {
		
	}
    
    
    public void choice15(Scanner input) {
		
	}
    
    
    public void choice16(Scanner input) {
		
	}
    
    
    public void choice17(Scanner input) {
		
	}
    
    
    public void choice18(Scanner input) {
		
	}
    
    
    public void choice19(Scanner input) {
		
	}
    
    
    public void choice20(Scanner input) {
		
	}
	
    
	public static void print(Object o) 
	{ 
		System.out.println(o.toString());
	}
	//shortens System.out.println to print - simplifies code
	
	public static void main(String[] args) {
		new Rough_Draft();

	}

}
