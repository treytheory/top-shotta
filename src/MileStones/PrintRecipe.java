package MileStones;

// Importing the ArrayList class for storing user import as an Array 
import java.util.ArrayList;
import java.util.Scanner;


/** 
 * The PrintRecipe class prints the recipe values 
 * collected from the unit tests or the user, to the console. 
 */
public class PrintRecipe {

    // Initializing private variables that will be used in the constructor
    /*
     * variable recipeName to store the name of the recipe
     *
     * varable 'servings' to store how many people the recipe will feed
     *
     * ArrayList variable 'recipeIngredients' to store the text for the      
     * names (recipeName) each recipe ingredient added
     *
     * variable totalRecipeCalories to store the total calories for the recipe 
     *
     */
    private String recipeName;
    private ArrayList<String> recipeIngredients;
    private ArrayList<Ingredient> recipeIngredientObjects;
    private String setUnitOfMeasurement; 
    private int servings;
    private double totalRecipeCalories;

    // public variables used for calculating calories 
    public double totolCalories;
    public double caloriesPerServing;

    /**
     * Default constructor 
     */
 
    public PrintRecipe() {
    }

    /*
     * Adding mutators and accessors for the class variables
     */
    public void setRecipeName(String setRecipeName) {
        this.recipeName = setRecipeName;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setServings(int setServings) {
        this.servings = setServings;
    }

    public int getServings() {
        return servings;
    }

    public void setRecipeIngredients(ArrayList<String> setRecipeIngredients) {
        this.recipeIngredients = setRecipeIngredients;
    }

    public ArrayList<String> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setIngredientList(ArrayList<Ingredient> ingredientList) {
        this.recipeIngredientObjects = ingredientList;
    }

    public ArrayList<Ingredient> getIngredeientList() {
        return this.recipeIngredientObjects;
    }

    public void setTotalRecipeCalories(double setTotalRecipeCalories) {
        totalRecipeCalories = setTotalRecipeCalories;
    }

    public double getTotalRecipeCalories() {
        return totalRecipeCalories;
    }

    /** 
     * @param setRecipeName sets the recipe name 
     * @param setServings sets the amount of servings for the recipe 
     * @param setUnitOfMeasurement sets the unit of measurement for the user 
     * @param setRecipeIngredients sets an array of ingredients 
     * @param setTotalRecipeCalories sets the total recipe calories 
     */
    
    public PrintRecipe(String setRecipeName, int setServings, String setUnitOfMeasurement, ArrayList<String> setRecipeIngredients, double setTotalRecipeCalories) //<-- use appropriate data type for the ArrayList and the setServings arguments
    {
        this.recipeName = setRecipeName;
        this.servings = setServings;
        this.setUnitOfMeasurement = setUnitOfMeasurement;
        this.recipeIngredients = setRecipeIngredients;
        this.totalRecipeCalories = setTotalRecipeCalories;
    }

    /**
     * The printRecipe method prints the recipe output to the console 
     */
    
    public void printRecipe() {

        /*
         *
         * Declaring an int variable caloriesPerServing and assigning 
         * the totalRecipeCalories divided by the servings.
         *
         */
        caloriesPerServing = (getTotalRecipeCalories() / getServings());

        /*
         * Printing the following recipe information: 
         * Recipe, Servings, Ingredients, Calories per Serving, Total calories.
         */
        System.out.println("\nRecipe Name: " + getRecipeName());
        System.out.println("Serving size: " + getServings());
        System.out.println("Calories Per Serving: " + caloriesPerServing);
        System.out.println("Total Calories: " + getTotalRecipeCalories());

        // Using a for loop to iterate through the ingredients
        System.out.println("\nList of ingredients:");
        for (int i = 0; i < recipeIngredients.size(); ++i) {
            System.out.println(recipeIngredients.get(i));

        }
        System.out.println("");
    }

    /** 
     * The printRecipe2() method prints the recipe output to the console 
     */
    
    public void printRecipe2() {

        /*
         * Printing the following recipe information: 
         * Recipe name, Servings.
         */
        
        // Initializing an ArrayList that accepts objects 
        ArrayList<Ingredient> tempIngredeientList = getIngredeientList();
        int j = 0;

        System.out.println("\nRecipe Name: "  + tempIngredeientList.get(j).getRecipeName());
        System.out.println("Serving Size: " + tempIngredeientList.get(j).getServingAmount() + "\n");
        System.out.println("Unit of measurement: " + tempIngredeientList.get(j).getUnitMeasurement() + "\n");

        // Using a for loop to iterate through the ingredient objects 
        System.out.println("List of Ingredients:");
        for (int i = 0; i < tempIngredeientList.size(); ++i) {

            System.out.println("Ingredient(" + (i + 1) + ") Name: " + tempIngredeientList.get(i).getIngredientName());
            System.out.println("Number of " + tempIngredeientList.get(0).getUnitMeasurement() + ": " + tempIngredeientList.get(i).getIngredientAmount());
            System.out.println("Ingredient Calories: " + tempIngredeientList.get(i).getCalories());

            // calculating the total calories from the tempIngredeientList object
            totolCalories = totolCalories + (tempIngredeientList.get(i).getCalories());
            System.out.println("");
        }
        System.out.println("Total Recipe Calories: " + totolCalories);

        // dividing total calories by servings to get calories per serving 
        for (int i = 0; i < tempIngredeientList.size(); ++i) {
            caloriesPerServing = totolCalories / tempIngredeientList.get(i).getServingAmount();
        }
        System.out.println("Calories Per Serving: " + caloriesPerServing);
    }
        
    
    public void printRecipe3() {

        /*
         * Printing the following recipe information: 
         * Recipe name, Servings.
         */
        
        // Initializing an ArrayList that accepts objects 
        ArrayList<Ingredient> tempIngredeientList = getIngredeientList();
        int j = 0;

        System.out.println("\nRecipe Name: "  + tempIngredeientList.get(j).getRecipeName());
        System.out.println("Serving Size: " + tempIngredeientList.get(j).getServingAmount() + "\n");
        System.out.println("Unit of measurement: " + tempIngredeientList.get(j).getUnitMeasurement() + "\n");

        // Using a for loop to iterate through the ingredient objects 
        System.out.println("List of Ingredients:");
        for (int i = 1; i < tempIngredeientList.size(); ++i) {

            System.out.println("Ingredient(" + (i + 1) + ") Name: " + tempIngredeientList.get(i).getIngredientName());
            System.out.println("Number of " + tempIngredeientList.get(j).getUnitMeasurement() + ": " + tempIngredeientList.get(i).getIngredientAmount());
            System.out.println("Ingredient Calories: " + tempIngredeientList.get(1).getCalories());

            // calculating the total calories from the tempIngredeientList object
            totolCalories = totolCalories + (tempIngredeientList.get(i).getCalories());
            System.out.println("");
        }
        System.out.println("Total Recipe Calories: " + totolCalories);

        // dividing total calories by servings to get calories per serving 
        for (int i = 1; i < tempIngredeientList.size(); ++i) {
            caloriesPerServing = totolCalories / tempIngredeientList.get(0).getServingAmount();
        }
        System.out.println("Calories Per Serving: " + caloriesPerServing);
    }
}
