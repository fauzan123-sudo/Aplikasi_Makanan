package com.example.aplikasimakanan.view.home;

import com.example.aplikasimakanan.model.Categories;
import com.example.aplikasimakanan.model.Meals;

import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
