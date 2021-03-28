package com.mizha.spring5recipeapp.repositories;

import com.mizha.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long > {
}
