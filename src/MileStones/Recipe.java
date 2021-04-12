package MileStones;

/**
 *
 * @author trey fortes
 */

/* 
 * Java program to create a new recipe from user input. 
 * The following class illustrates a custom Arraylist in Java.
 */
// impoting ArrayList and Scanner class 
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

/** 
 * The Recipe class builds a new recipe based on user input.
 * 
 */

public class Recipe {

    private ArrayList<Ingredient> listOfIngredients;
    private ArrayList<String> listOfInstructions = new ArrayList<>();

    // defining class variables 
    private String recipeName;
    private int servingAmount;
    private double totalCost;

    // @param Default constructor 
    public Recipe() {

    }

    // @param Paramaterized constructor 
    public Recipe(String name, int amount, double cost) {
        this.recipeName = name;
        this.servingAmount = amount;
        this.totalCost = cost;
    }

    public boolean addMoreIngredients = true;
    public boolean addMoreInstructions = true;

    // the mutators (setters) and accessors (getters)
    public ArrayList<Ingredient> getListOfIngredients() {
        return listOfIngredients;
    }

    public void setListOfIngredients(ArrayList<Ingredient> listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getServingAmount() {
        return servingAmount;
    }

    public void setServingAmount(int servingAmount) {
        this.servingAmount = servingAmount;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float cost) {
        this.totalCost = cost;
    }

    /**
     * creating a CreateNewRecipe() method to collect user input and send the
     * values to the PrintRecipe() class.
     */
    public void CreateNewRecipe() {

        int newAmount = 0;
        double newCalories = 0.0;
        double Ingredientcost = 0;
        String unitMeasurement = "";

        PrintRecipe print = new PrintRecipe();
        listOfIngredients = new ArrayList();

        Scanner scnr = new Scanner(System.in);

        // Getting the recipe name from the user    
        System.out.println("\nPlease enter the recipe name: ");
        recipeName = scnr.next();

        // Getting the number of servings from the user
        System.out.println("\nPlease enter the number of servings: ");
        servingAmount = scnr.nextInt();

        // Asking the user to set the unit of measurement 
        System.out.println("\nPlease enter the unit of measurement (Cups, Ounces, Tablespoons, etc.): ");

        unitMeasurement = scnr.next();


        // do while loop to get the ingredient name and iterate until the user types "end"
        do {
            System.out.println("\nPlease enter the ingredient name or "
                    + "type \"end\" if you are finished entering ingredients: ");

            String newIngredient = scnr.next();

            // keeping the boolean value set to true unless the user types "end"
            if (newIngredient.toLowerCase().equals("end")) {
                addMoreIngredients = false;
                
                // calling the printRecipe2() method since the user typed "end" 

                print.printRecipe2();

            } else {

                // getting the ingredient amount from the user 
                System.out.println("\nPlease enter the number of " + unitMeasurement + ":");
                newAmount = scnr.nextInt();

                // getting the ingredient calories from the user  
                System.out.println("\nPlease enter the calories for " + newAmount + " " + unitMeasurement + " of " + newIngredient + ":");
                newCalories = scnr.nextInt();
                
                // getting the recipe cost from the user
                System.out.println("\nPlease enter the cost for " + newAmount + " " + unitMeasurement + " of " + newIngredient + " in (USD):");
                Ingredientcost = scnr.nextInt();

                totalCost = (totalCost + Ingredientcost);

                listOfIngredients.add(new Ingredient(recipeName, servingAmount, unitMeasurement, newIngredient, newAmount, newCalories));
            }

            // passing the users input to the constructor in the PrintRecipe() class
            print.setIngredientList(listOfIngredients);

            //continue the loop while the boolean value is true
        } while (addMoreIngredients);

    }

}
