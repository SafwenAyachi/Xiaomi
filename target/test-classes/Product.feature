#Author: Ayachi
Feature: Maison connectee 

  Scenario: verify chosen product
    Given user in on product page
    When user clicks on product "Mi Door Window Sensor 2"
    Then user is redirected to the page of "Mi Door Window Sensor 2"
