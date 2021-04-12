package MileStones;

/**
 *
 * @author Trey Fortes 
 * 
 * The RecipeTest class tests the program by passing predefined values to 
 * the methods that produce output known as unit tests.
 *
 */

// Importing all classes provided by the JAVA framework 
import java.util.*;

/** 
 * The RecipeTest class tests each class and method used to create a new recipe. 
 */
public class RecipeTest {

    // Creating a test method to invoke the programs test bench. 
    public static void test() {

        /* 
         * This first unit test passes String values to an ArrayList and then
         * calls the PrintRecipe() method defined in the PrintRecipe class.
         */
        
        // creating a new object of the PrintRecipe() class called myFirstRecipe.
        PrintRecipe myFirstRecipe = new PrintRecipe();
            
        // initalizing a new ArrayList that accepts String values  
        ArrayList<String> recipeIngredientsOne = new ArrayList();

        
        String ingredientNameOne = "Noodles";

        // Adding test values to the recipeIngredientsOne ArrayList
        String tempIngredientOne = new String(ingredientNameOne);
        recipeIngredientsOne.add(tempIngredientOne);
        
        myFirstRecipe.setRecipeName("Ramen");
        myFirstRecipe.setServings(2);
        myFirstRecipe.setRecipeIngredients(recipeIngredientsOne);
        myFirstRecipe.setTotalRecipeCalories(150);

        /* 
         * The second unit test also passes String values to an ArrayList and 
         * then calls the PrintRecipe() method defined in the PrintRecipe class.
         */
        
        // initalizing a new ArrayList that accepts String values
        ArrayList<String> recipeIngredientsTwo = new ArrayList();
        
        // calling the parameterized constructor in the PrintRecipe class
        PrintRecipe mySecondRecipe = new PrintRecipe("Pizza", 2,"cups",recipeIngredientsTwo, 300);                
        
        String ingredientName = "Anchovies";
        
        // Adding test values to the recipeIngredientsTwo ArrayList
        String tempIngredientTwo = new String(ingredientName);
        recipeIngredientsTwo.add(tempIngredientTwo);
                
        /* 
         * The third unit test passes objects to an ArrayList and then
         * calls the PrintRecipe2() method defined in the PrintRecipe class.
         */
                
        PrintRecipe myThirdRecipe = new PrintRecipe();

        
        /* 
         * initalizing objects of the Ingredient() class to pass vlaues to the
         * classes mutators
         */
        
        Ingredient recipe = new Ingredient();
        Ingredient ingredientOne = new Ingredient();
        Ingredient ingredientTwo = new Ingredient();

        recipe.setRecipeName("Cake");
        recipe.setServingAmount(2);
        recipe.setUnitMeasurement("cups");

        ingredientOne.setIngredientName("Flour");
        ingredientOne.setIngredientAmount(5);
        ingredientOne.setCalories(25);

        ingredientTwo.setIngredientName("Sugar");
        ingredientTwo.setIngredientAmount(3);
        ingredientTwo.setCalories(50);

        // initalizing a new ArrayList that accepts objects
        ArrayList<Ingredient> recipeIngredientsThree = new ArrayList();
        recipeIngredientsThree.add(recipe);
        recipeIngredientsThree.add(ingredientOne);
        recipeIngredientsThree.add(ingredientTwo);

        myThirdRecipe.setIngredientList(recipeIngredientsThree);

        /* 
         * Calling the printRecipe() method defined in the PrintRecipe class
         * with the string values populated in the ArrayList to Print details  
         * for the first two recipes.
         */
        
        myFirstRecipe.printRecipe();
        mySecondRecipe.printRecipe();
        
        /* 
         * Calling the printRecipe3() method which has an ArrayList that accepts 
         * objects of the ingredient class. 
         */
        
        myThirdRecipe.printRecipe3();

    }

}
