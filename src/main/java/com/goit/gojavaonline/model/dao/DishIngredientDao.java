package com.goit.gojavaonline.model.dao;

import com.goit.gojavaonline.model.DishIngredient;

import java.util.List;


public interface DishIngredientDao {
    void save(DishIngredient dishIngredient);
    void delete(int ingredientId, int dishId);
    List<DishIngredient> getIngredientsByDishName(String dish);

    void removeAll();
}
