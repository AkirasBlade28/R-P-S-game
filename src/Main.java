	///////////////////////////////////////////////////////////////////
p	// 1) Gen.  ran. num. from 1 to 3
	// 2) Assign (or relate) value 1 as char R, 2 char P, 3 char S| 
	//    		(1 and 2 in separate method or function)
	// 3) Prompt the user to enter one valid char
	// 4) Check if input is valid (legal char r,p,s)
	// 5) Invoke random throw of input for the computer| (1, 2)
	// 6) Check how inputs corresponds to set of rules the game has
	// 7) Count scores for user and the machine
	// 8) Count total tries
	/////////////////////////////////////////////////////////////////

	//r>s && r<p                    
	//p>r && p<s   \\rules// ||> wins to||< loses to|| (6)
	//s>p && s<r   

	

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")

	public static void main(String[] args) {
		
	
	Scanner in = new Scanner (System.in);
	
	
	// actual flow//
	String userIn="User input: ";
	String compIn="Computer input: ";
	String userWins="User wins!";
	String compWins="Computer wins!";
	int compScore=0;
	int userScore=0;
	
	
	
	System.out.println("Wellcome to 'Rock, Paper, Scissors' Game!\n\n");
	System.out.println("To play the game with the computer\n"
			+ "input R, P, or S for the inicials\n"
			+ "of Rock, Paper or Scissors.\n\n");
	
	
	
	for(int totTries = 1;  ; ++totTries) //loop without condition to terminate+check num of inputs
	{                                                    //config if u want the game to have  limit of tries
			char userInput=in.next().charAt(0); // prompt for input
		
		
		
			switch(userInput) { 
			
			case 'R','r':
				 System.out.println(userIn+"rock.");
				 
				 switch(compInput()) {
				 
				 case 'R':
					 System.out.println(compIn+"rock.");
					 System.out.println("Eaven!\n"); 
				 break; 
				 
				 case 'P':
					 System.out.println(compIn+"paper.");
					 System.out.println(compWins+"\n");
					 ++compScore;
				 break;
					 
				 case 'S':
					 System.out.println(compIn+"scissors");
					 System.out.println(userWins+"\n");
					 ++userScore;
					 break;
				 }
			break;
				
			case 'P','p':
				System.out.println(userIn+"peper.");
			
				switch(compInput()) {
				 
				case 'R':
					 System.out.println(compIn+"rock.");
					 System.out.println(userWins+"\n");
					 ++userScore;
				 break; 
				 
				 case 'P':
					 System.out.println(compIn+"paper.");
					 System.out.println("Eaven!\n");
				 break;
					 
				 case 'S':
					 System.out.println(compIn+"scissors");
					 System.out.println(compWins+"\n");
					 ++compScore;
					 break;
				 }
			break;
			case 'S','s':
				System.out.println(userIn+"scissors.");
			
			    switch(compInput()) {
			 
			    case 'R':
			    	System.out.println(compIn+"rock.");
			    	System.out.println(compWins+"\n");
			    	++compScore;
			    break; 
			 
			    case 'P':
			    	System.out.println(compIn+"peper");
			    	System.out.println(userWins+"\n");
			    	++userScore;
			    	
			    break;
				 
			    case 'S':
			    	System.out.println(compIn+"scissors.");
			    	System.out.println("Eaven!\n");
				break;
			 }
			break;
			default:
				System.out.println("Error: invalid input!");
			}
		
			System.out.println("User scores: "+userScore+".\n");
			System.out.println("Computer scores: "+compScore+".\n");
			System.out.println("Total inputs: "+totTries+".\n");//test, print total tries	
		
	}
	
	}
	static int compInput() // (1, 2)
	{
		
		double ranNumber=Math.random()*3;//if (int)Math.Random() is used to convert from double to int straight ahead
		int ranNumber00=(int)ranNumber; // the random number wont be 'truly' random. It'll be stuck to one number only
		switch (ranNumber00) {
		case 0:
			return 'R';
		case 1:
			return 'P';
		case 2:
			return 'S';
		
		default:		//this will return 'white space' if Math.random() hits 'run time error'
			return ' ';
			
		}
	
	}
}

