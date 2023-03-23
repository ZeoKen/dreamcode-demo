package org.example.categories;

import java.util.HashSet;
import java.util.Set;

public class Root {

  protected Set<String> keywords = new HashSet<>();

  public Root() {
    // Add category keywords
    keywords.add("SquareTrade");
    keywords.add("Insurance");
    keywords.add("Root");
    keywords.add("Main");
  }

  public Set<String> getKeywords() {
    return keywords;
  }

  public void printKeywords() {
    keywords.stream().forEach(System.out::println);
  }

  public int getLevel() {
    // Get the current class parent
    Class superClass = this.getClass().getSuperclass();

    // If we are in the root class the level is 0
    int level = 0;

    // If the current superclass is Object (Root's parent) we stop, otherwise we go up one class and increase the level counter
    while (!superClass.equals(Object.class)) {
      superClass = superClass.getSuperclass();
      level++;
    }

    return level;
  }
}
