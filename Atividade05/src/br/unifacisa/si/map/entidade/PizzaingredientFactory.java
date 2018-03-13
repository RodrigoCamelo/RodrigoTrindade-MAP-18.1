package br.unifacisa.si.map.entidade;

public interface PizzaingredientFactory {
	
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
	
}
