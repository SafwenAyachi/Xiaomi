#Author: Ayachi
Feature: Add product to cart

  Scenario: verify product in cart
    Given user on product page
    When clicks "Add To Cart" button
    Then product "Mi Door Window Sensor 2" was succesfuly added to cart
