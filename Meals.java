interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto Meal";
    }
}

class Meal<T extends MealPlan> {
    private T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    void displayMeal() {
        System.out.println("Meal Plan: " + meal.getMealType());
    }

    static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generating plan for: " + meal.getMealType());
    }
}

public class Meals {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());

        vegMeal.displayMeal();
        veganMeal.displayMeal();
        ketoMeal.displayMeal();

        Meal.generateMealPlan(new VegetarianMeal());
        Meal.generateMealPlan(new KetoMeal());
    }
}
