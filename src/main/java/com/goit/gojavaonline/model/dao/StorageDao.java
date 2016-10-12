package com.goit.gojavaonline.model.dao;

import com.goit.gojavaonline.model.Ingredient;
import com.goit.gojavaonline.model.IngredientsStorage;

import java.util.List;


public interface StorageDao {
    void insertIngredientToStorage(IngredientsStorage ingredientsStorage);
    void deleteIngredientFromStorage(int id);
    void changeIngredientQuantity(int id, float newQuantity);
    IngredientsStorage getIngredientFromStorage(String name);
    List<IngredientsStorage> getAll();
    Ingredient getIngredientByName(String name);
    void removeAll();
}
