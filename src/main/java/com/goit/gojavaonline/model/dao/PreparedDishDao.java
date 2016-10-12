package com.goit.gojavaonline.model.dao;

import com.goit.gojavaonline.model.PreparedDish;

import java.util.List;

public interface PreparedDishDao {
    void insertPreparedDish(PreparedDish preparedDish);
    List<PreparedDish> getAll();
    void removeAll();
}
