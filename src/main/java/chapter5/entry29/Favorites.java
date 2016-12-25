package chapter5.entry29;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>This entry is quit important. I don't totally understand.</p>
 * @author jacka
 * @version 1.0 on 12/24/2016.
 */
public class Favorites {
  private Map<Class<?>, Object> favorites = new HashMap<>();

  public <T> void putFavorite(Class<T> type, T instance) {
    if (type == null) {
      throw new NullPointerException("Type is null");
    }
    favorites.put(type, instance);

  }

  public <T> T getFavorite(Class<T> type) {
    return type.cast(favorites.get(type));
  }
}
