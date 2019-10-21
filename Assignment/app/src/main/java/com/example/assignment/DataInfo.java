package com.example.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DataInfo {
    public static Data getDataById(int dataID){
        return data.get(dataID);
    }

    public static Data getDataByName (int dataID){
        return data.get(dataID);
    }

    public static ArrayList<Data> getAllData(){
        return new ArrayList<Data>((List) Arrays.asList(data.values().toArray()));
    }

    private static final HashMap<Integer, Data> data = new HashMap<>();

    static{
        data.put(1, new Data(
                1,
                "Beef Burger",
                "A hamburger (short: burger) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, or flame broiled.",
                7.88,
                R.drawable.burger1
        ));
        data.put(2, new Data(
                2,
                "Fish Burger",
                "Serve these tasty fish burgers with oven baked chips and lemon wedges for a complete mid-week meal.",
                 6.34,
                R.drawable.burger2
        ));
        data.put(3, new Data(
                3,
                "Cheese pizza",
                "The most popular cheeses used in the preparation of pizza are mozzarella (accounting for about 30%), provolone, cheddar and Parmesan. Emmental, Romano and ricotta are often used as toppings.",
                9.37,
                R.drawable.c_pizza
        ));
        data.put(4, new Data(
                4,
                "Coke",
                "Classic Coca Cola",
                3.50,
                R.drawable.coke
        ));
        data.put(5, new Data(
                5,
                "Crispy Buffalo Chicken Wings",
                "These Crispy Buffalo Chicken Wings are exactly what they claim to be. C.R.I.S.P.Y. Without deep frying? WHAT IS THIS MADNESS! Using a special ingredient you have in your kitchen pantry already! Tossed in a delicious Buffalo Sauce, these wings are a hit and a reader favourite!",
                9.99,
                R.drawable.cripsy
        ));
        data.put(6, new Data(
                6,
                "Fried Fish",
                "Fried fish refers to any fish or shellfish that has been prepared by frying. Often, the fish is covered in batter, egg and breadcrumbs, flour, or herbs and spices before being fried and served, often with a slice of lemon. Fish is fried in many parts of the world, and fried fish is an important food in many cuisines.",
                5.56,
                R.drawable.fish
        ));
        data.put(7, new Data(
                7,
                "Fried Chicken Wings",
                "Alex soaks chicken twice in the egg-milk mixture and double-dredges in the highly seasoned flour for a superior crust. Taste it!",
                6.66,
                R.drawable.fried_wings
        ));
        data.put(8, new Data(
                8,
                "Iced Chocolate",
                "Decadent and perfect for summer, this chocolate drink is perfect for company or just for a summer night.",
                5.4,
                R.drawable.ice_choc
        ));
        data.put(9, new Data(
                9,
                "Latte",
                "A typical latte is made with six to eight ounces of steamed milk and one shot of espresso. The beverage also be topped with foam for both flavor and presentation.",
                5.3,
                R.drawable.latte
        ));
        data.put(10, new Data(
                10,
                "Nuggets",
                "A chicken nugget is a chicken product made from chicken meat that is breaded or battered, then deep-fried or baked. Fast food restaurants usually fry their nuggets in vegetable oil.",
                9.90,
                R.drawable.nuggets
        ));
        data.put(11, new Data(
                11,
                "Onion Rings",
                "They consist of a ring of cross-sectional Onions dipped in batter or breadcrumbs and then Fried; The other is made with onion sauce.",
                6.43,
                R.drawable.onion

        ));
        data.put(12, new Data(
                12,
                "Original Pizza",
                "Pizza is a savory dish of Italian origin, consisting of a round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients",
                10.01,
                R.drawable.pizza
        ));
        data.put(13, new Data(
                13,
                "Salmon Salad",
                "It is loaded with all of the best ingredients; crunchy cucumber, crisp lettuce and juicy pan seared salmon. The fresh lemon dill dressing and gives this salad amazing flavor.",
                8.35,
                R.drawable.salmon_salad
        ));
        data.put(14, new Data(
                14,
                "Fires",
                "Fries, is fried potato chips, potatoes from Australia's most nutritious potatoes. It's a fried, thin, salted potato chip, worth trying.",
                6.45,
                R.drawable.fries
        ));
        data.put(15, new Data(
                15,
                "Sprite",
                "Sprite is a colorless, caffeine-free, lemon and lime-flavored soft drink created by The Coca-Cola Company. ",
                3.6,
                R.drawable.sprite
        ));
        data.put(16, new Data(
                16,
                "Vegetables Salad",
                "Served with a variety of nutritious vegetables, great for vegetarians and fitness enthusiasts.",
                7.35,
                R.drawable.vegie_salad
        ));
    }
}
