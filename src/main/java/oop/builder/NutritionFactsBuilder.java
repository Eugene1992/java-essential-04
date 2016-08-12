package oop.builder;


public class NutritionFactsBuilder {

    private final int servingSize;  // required
    private final int servings;     // required
    private final int calories;     // optional
    private final int fat;          // optional
    private final int sodium;       // optional
    private final int carbohydrate; // optional

    public static class Builder {

        private final int servingSize;
        private final int servings;
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFactsBuilder build() {
            return new NutritionFactsBuilder(this);
        }
    }

    private NutritionFactsBuilder(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFactsBuilder nutritionFacts = new Builder(2, 5)
                .fat(2)
                .carbohydrate(4)
                .build();
    }
}
