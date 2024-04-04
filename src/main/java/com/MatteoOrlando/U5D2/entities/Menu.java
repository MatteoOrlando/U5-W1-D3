package com.MatteoOrlando.U5D2.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
	private List<Pizza> pizzaList;
	private List<Drink> drinkList;
	private List<Topping> toppingList;

	
//ho aggiunto un metodo per calcolare le calorie
public int totalCalories() {
	int totalCalories = 0;
	if (pizzaList != null) {
		for (Pizza pizza : pizzaList) {
			totalCalories += pizza.getCalories();
		}
	}
	if (drinkList != null) {
		for (Drink drink : drinkList) {
			totalCalories += drink.getCalories();
		}
	}
	if (toppingList != null) {
		for (Topping topping : toppingList) {
			totalCalories += topping.getCalories();
		}
	}
	return totalCalories;

                            }

}

