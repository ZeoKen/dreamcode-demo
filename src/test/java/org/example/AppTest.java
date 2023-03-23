package org.example;

import java.util.HashSet;
import java.util.Set;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.categories.Root;
import org.example.categories.homeappliances.MajorAppliances;
import org.example.categories.homeappliances.majorappliances.KitchenAppliances;

public class AppTest extends TestCase {

  public void testKitchenAppliancesKeywords() {
    KitchenAppliances kitchen = new KitchenAppliances();

    Set<String> keywords = new HashSet<>();
    keywords.add("SquareTrade");
    keywords.add("Insurance");
    keywords.add("Root");
    keywords.add("Main");
    keywords.add("Home");
    keywords.add("Appliances");
    keywords.add("Major");
    keywords.add("Large");
    keywords.add("Kitchen");
    keywords.add("Cook");
    keywords.add("Knife");

    assertEquals(keywords, kitchen.getKeywords());
  }

  public void testKitchenAppliancesLevel() {
    KitchenAppliances kitchen = new KitchenAppliances();

    assertEquals(3, kitchen.getLevel());
  }
}
