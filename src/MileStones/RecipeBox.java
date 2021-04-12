package MileStones;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * The RecipeBox class presents options to the user for navigating the program.
 *
 */
public class RecipeBox {

    /**
     * @author Trey Fortes
     * @version Recipe Collection Manager Program (V1.1)
     * @see Final Project Requirements "https://snhu.edu"
     *
     * The following program manages a collection of recipes for the user.
     */
    /*
     * Declaring instance variables: a private ArrayList of the type Recipe
     * class named listOfRecipes
     *
     */
    private ArrayList<Recipe> listOfRecipes;

    /**
     * Add accessors and mutators for the RecipeBox()
     *
     */
    private void setRecipeList(ArrayList<Recipe> recipeList) {
        this.listOfRecipes = recipeList;
    }

    private ArrayList<Recipe> getRecipeList() {
        return this.listOfRecipes;
    }

    /**
     * Add constructors for the RecipeBox()
     *
     */
    public RecipeBox() {
        if (null == listOfRecipes) {
            this.listOfRecipes = new ArrayList<>();
        }
    }

    /**
     *
     * Adding a addRecipe() method to create a new Recipe and add it to the
     * listOfRecipes object
     *
     */
    public void addRecipe() {
        Recipe recipe = new Recipe();
        recipe.CreateNewRecipe();

        listOfRecipes.add(recipe);
        System.out.println("");
    }

    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Creating a new RecipeBox instance
        RecipeBox myRecipeBox = new RecipeBox();

        // Creating a new PrintRecipe instance
        PrintRecipe myRecipe = new PrintRecipe();

        Scanner menuScnr = new Scanner(System.in);

        /**
         * Print a menu for the user to select one of the four options:
         *
         */
        System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names and Cost\n" + "4. Run The Test Program\n" + "5. Delete A Recipe\n" + "6. End the program\n" + "\nPlease select a menu item:");
        while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {

            int input = menuScnr.nextInt();
            boolean inputValidation = false;
            
            // a loop to force the user to enter valid input 
            do {
                if (input > 0 && input < 7) {
                    inputValidation = true;
                } else {
                    System.out.println("Oops, please enter a valid option: ");
                    input = menuScnr.nextInt();
                }
            } while (!inputValidation);

            // if user selects 1 the program calls the CreateNewRecipe method
            if (input == 1) {
                myRecipeBox.addRecipe();

                /**
                 * if user selects 2 the program passes the listOfRecipes object
                 * to the setIngredientList mutator in the PrintRecipe class
                 *
                 */
            } else if (input == 2) {
                System.out.println("Enter recipe name to print details\n");
                PrintRecipe printRecipe = new PrintRecipe();
                String userInput = menuScnr.next();

                int j = 0;
                for (int i = 0; i < myRecipeBox.listOfRecipes.size(); i++) {
                    if (myRecipeBox.listOfRecipes.get(i).getRecipeName().equalsIgnoreCase(userInput)) {
                        printRecipe.setIngredientList(myRecipeBox.listOfRecipes.get(i).getListOfIngredients());
                        printRecipe.printRecipe2();
                        ++j;
                    }

                }
                if (j == 0) {
                    System.out.println("No match found. Returning to main menu.");
                }
                
                // if user selects 3 the program iterates through the Array to print the recipe name and servings 
            } else if (input == 3) {
                NumberFormat fmt = NumberFormat.getCurrencyInstance();
                for (Recipe recipe : myRecipeBox.getRecipeList()) {
                    System.out.println("Recipe Name: " + recipe.getRecipeName());
                    System.out.println("Serving Amount: " + recipe.getServingAmount());
                    System.out.println("Recipe Cost: " + (fmt.format(recipe.getTotalCost())));
                    System.out.println("");
                }
                
                // if user selects 4 the unit test is invoked  
            } else if (input == 4) {
                RecipeTest.test();

                // if user selects 5 the user can delete a recipe from the list
                Scanner scnr = new Scanner(System.in);
                for (int i = 0; i < myRecipeBox.listOfRecipes.size(); i++) {
                    System.out.println((i + 1) + ": " + myRecipeBox.listOfRecipes.get(i).getRecipeName());
                }
                System.out.println("");
                System.out.println("Enter the number to delete: ");
                int deleteRecipe = scnr.nextInt();
                myRecipeBox.listOfRecipes.remove(deleteRecipe - 1);

                // if user selects 6 the program terminates
            } else if (input == 6) {
                System.exit(0);
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names and Cost\n" + "4. Run The Test Program\n" + "5. Delete A Recipe\n" + "6. End the program\n" + "\nPlease select a menu item:");

            }

            System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names and Cost\n" + "4. Run The Test Program\n" + "5. Delete A Recipe\n" + "6. End the program\n" + "\nPlease select a menu item:");
        }
    }

}
