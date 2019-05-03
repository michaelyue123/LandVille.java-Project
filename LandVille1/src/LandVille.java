// import Scanner class for main method
import java.util.Scanner;

// create a java class called LandVille
class LandVille {
// create a 2D array called land
	private int[][] land;
	
// create a Boolean variable hasHouse
	boolean hasHouse; 
	
// create a LandVille class that takes 2 parameters
	private LandVille (int row, int col) {
		
// row, column initialization 
		land = new int[row][col];
		
		for (int i=0; i<land.length; i++) {
			for (int j=0; j<land[0].length; j++) {
				land[i][j]=0;
			}
		}
		hasHouse = false;
	}
	
// create a method called displayLand()
	public void displayLand() {
		for (int i=0; i<land.length; i++) {
			for (int j=0; j<land[0].length; j++) {
				System.out.format("%3d",land[i][j]);
			}
			System.out.println();
		}
	}

// create a method called clearLand()
	public void clearLand() {
		for (int i=0; i<land.length; i++) {
			for (int j=0; j<land[0].length; j++) {
				land[i][j]=0;
			}
		}
		hasHouse = false;
// Statement that land is cleared
        System.out.println("Land Cleared");
	}

// create a method called buildHouse()
	public void buildHouse (int rows, int cols) {
		if (land.length - rows >= 2 && land[0].length - cols >=2) {
// Conditions according to the row and column provided for setting the wall of the house
			for (int i=0; i<=rows+1; i++) {
				for (int j=0; j<=cols+1; j++) {
					land[i][j]=1;
				}
			}
			
// Conditions according to the row and column provided to build a house			
			for (int i=1; i<=rows; i++) {
				for (int j=1; j<=cols; j++) {
					land[i][j]=8;
				}
			}
			hasHouse = true;
			
			displayLand();
		}
		else {
			System.out.println("Error building house, your house is bigger than the land\n");
		}
	}
	
// create a menu list under main method
	public static void main(String[]args){ 
        Scanner input = new Scanner(System.in);
        
        int land_rows, land_cols, hse_rows, hse_cols, option;
        
        System.out.println("Rows and Columns must between 0 and 10");
        System.out.println("Enter the rows for the land: ");
        
        land_rows = input.nextInt();
        
        while (land_rows <= 0 || land_rows > 10){
            System.out.println("Row should be less than 10 or greater than equal to 0");
            land_rows = input.nextInt(); 
        }
        
        System.out.println("Enter the columns for the land: ");
        land_cols = input.nextInt();
        
        while (land_cols <= 0 || land_cols > 10){
            System.out.println("Column should be less than 10 or greater than equal to 0");// the error information to be displayed
            land_cols = input.nextInt(); 
        }

// create an object of LandVille class from main method
       LandVille landObj = new LandVille(land_rows,land_cols);
            displayMenu();
            option = input.nextInt();
// condition to end the program gracefully
        while(option!=4)
        {
// condition should be the option should be between 1 and 4
            if (option < 0 || option >= 4) {
                System.out.println("Invalid Input. \nChoose an option from the Menu below: ");
            }
            
            switch (option) {
                case 1:
                    if (landObj.hasHouse) {
                        System.out.println("A house already Exists");
//created a function instead of writing same thing again
                        displayMenu();
                        option = input.nextInt();

                        while (option <= 0 || option > 4) {
                            System.out.println("Invalid Input. \nChoose an option from the Menu below: ");
                            displayMenu();
                            option = input.nextInt();
                        }

                    }         
                    else {
                        System.out.println("Enter the rows for the house: ");
                        hse_rows = input.nextInt();

                        System.out.println("Enter the columns for the house: ");
                        hse_cols = input.nextInt();

                        landObj.buildHouse(hse_rows, hse_cols);
                        displayMenu();
                        option = input.nextInt();

                        while (option <= 0 || option > 4) {
                            System.out.println("Invalid Input. \nChoose an option from the Menu below: ");
                            displayMenu();
                            option = input.nextInt();
                        }
                    }

                case 2:
                    landObj.displayLand();
                    break;

                case 3:
                    landObj.clearLand();
                    break;

                case 4:
                    break;

            }
            displayMenu();
            option = input.nextInt();
        }
      // when option 4 is chosen
        System.out.println("Program Ends");
	System.exit.(0);
	input.close();
    }

// function to display the menu and reducing the duplicacy of the code
    private static void displayMenu() {
        System.out.println("\nChoose from the menu:");
        System.out.println(" 1. Build a house");
        System.out.println(" 2. Display land");
        System.out.println(" 3. Clear the land");
        System.out.println(" 4. Quit");
    }
}

