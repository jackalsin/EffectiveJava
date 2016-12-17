package chapter2.entry2;

/**
 * This is the builder pattern in Effective Java 2nd Edition.
 *
 * @author jacka
 * @version 1.0 on 12/16/2016.
 */
public final class NutritionFacts {

  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int sodium;
  private final int fat;
  private final int carbohydrate;


  public static class Builder {
    // Required parameters
    private final int servingSize;
    private final int servings;

    // optional parameters
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

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }

  }

  private NutritionFacts(Builder builder) {
    servingSize = builder.servingSize;
    servings = builder.servings;
    calories = builder.calories;
    sodium = builder.sodium;
    fat = builder.fat;
    carbohydrate = builder.carbohydrate;
  }
}
