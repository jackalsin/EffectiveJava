package chapter6.entry33;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author jacka
 * @version 1.0 on 12/25/2016.
 */
public enum Phase {

  SOLID, LIQUID, GAS;

  public enum Transition {
    MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
    BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
    SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

    final Phase src;
    final Phase dst;

    Transition(Phase src, Phase dst) {
      this.src = src;
      this.dst = dst;
    }

    private static final Map<Phase, Map<Phase, Transition>> m = new EnumMap<>(Phase.class);

    static {
      for (Phase p: Phase.values()) {
        m.put(p, new EnumMap<>(Phase.class));
      }

      for (Transition transition: Transition.values()) {
        m.get(transition.src).put(transition.dst, transition);
      }
    }

    public static Transition from(Phase src, Phase dst) {
      return m.get(src).get(dst);
    }
  }
}
