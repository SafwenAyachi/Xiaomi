#Author: Ayachi
Feature: xiaomi home page hover and verify targeted menu

  Scenario: click on product
    Given user is in home page
    When user hver mouse over "Smart Home" menu and clicks on "Maison connectée" submenu
    Then user redirects to "Maison Connectée" page
