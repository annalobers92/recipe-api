package com.example.testing.rest;


import com.example.testing.IngredientRequest;
import com.example.testing.dto.Ingredient;
import com.example.testing.service.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/ingredient")
public class IngredientEndpoint {

    @Autowired
    private IngredientRepository ingredientRepository;

    @PostMapping()
    public void saveIngredient(@RequestBody IngredientRequest request){

        Ingredient ingredient = new Ingredient();
        ingredient.setName(request.getName());
        ingredient.setType(request.getType());

        ingredientRepository.save(ingredient);
    }
}
