public class Main {
    public static void main(String[] args) {
//        Item coke = new Item ("drink ", "coke",  1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("topping", "avocado", 1.50);
//        avocado.printItem();
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.sedDrinkSize("LARGE");
//        regularMeal.printItemizedList();
//        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
//        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.sedDrinkSize("SMALL");
//        secondMeal.printItemizedList();
        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON","LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.sedDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

    }
}
