package MileStones;

/**
 *
 * @author trey fortes 
 * The ingredient class initializes the accessors and
 * mutators for creating objects of the ingredient class.
 * 
 */

/** 
 * The Ingredient class defines constructors, accessors and mutators for 
 * the list of ingredients. 
 */
public class Ingredient {

    // Initializing private variables that can only be accessed by the class
    private String recipeName;
    private String ingredientName;
    private String unitMeasurement;

    private int servingAmount;
    private int ingredientAmount;
    private double ingredientCalories;

/** 
 * Default constructor 
 */ 
    public Ingredient() {

    }


/** 
 * @param name sets the recipe name from user input 
 * @param amount sets the amount of servings for the recipe 
 * @param calories sets the number of calories for the recipe 
 */ 
    public Ingredient(String name, int amount, double calories) {
        this.ingredientName = name;
        this.ingredientAmount = amount;
        this.ingredientCalories = calories;
    }

    public Ingredient(String recipeName, int servingAmount, String unitMeasurement, String ingredientName, int ingredientAmount, double calories) {
        this.recipeName = recipeName;
        this.servingAmount = servingAmount;
        this.unitMeasurement = unitMeasurement;
        this.ingredientName = ingredientName;
        this.ingredientAmount = ingredientAmount;
        this.ingredientCalories = calories;
    }

    public Ingredient(String recipeName, int servingAmount) {
        this.recipeName = recipeName;
        this.servingAmount = servingAmount;

    }


/** 
 * @param recipeName sets the recipe name 
 */   
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public void setServingAmount(int servingAmount) {
        this.servingAmount = servingAmount;
    }

    public int getServingAmount() {
        return this.servingAmount;
    }

    public void setUnitMeasurement(String unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
    }

    public String getUnitMeasurement() {
        return this.unitMeasurement;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getIngredientName() {
        return this.ingredientName;
    }

    public void setIngredientAmount(int ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    public int getIngredientAmount() {
        return this.ingredientAmount;
    }

    public void setCalories(double ingredientCalories) {
        this.ingredientCalories = ingredientCalories;
    }

    public double getCalories() {
        return ingredientCalories;
    }

}
