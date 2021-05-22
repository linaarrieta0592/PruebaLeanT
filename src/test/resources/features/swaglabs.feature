#Author: Lina Arrieta Lobo

Feature: Buy thing related physical activity.
  As the user web
  I need navigate for the SwagLabs web
  For make my purchases

  @login
  Scenario: login the user is Swag Labs web
    Given the user is on the Web
    When log in with the information
      | username      | password     |
      | standard_user | secret_sauce |
    Then the user can see the message PRODUCTS


  @loginlock
  Scenario: login lock in Swag Labs web
    Given the user is on the Web
    When log in with the information
      | username      | password     |
      | lock_out_user | secret_sauce |
    Then the user can see failed message Epic sadface: Username and password do not match any user in this service

  @problemuser
  Scenario:  login with problems in Swag Labs web
    Given the user is on the Web
    When log in with the information
      | usernameLock | password     |
      | problem_user | secret_sauce |
    Then the user do logout

  @lowerprice
  Scenario: the user purchase product lower price
    Given the user is on the Web
    When log in with the information
      | username      | password     |
      | standard_user | secret_sauce |
    When select the product lower price
      | name | lastname | postalcode |
      | Juan | Perez    | 12345      |
    Then the user purchase the product with the message THANK YOU FOR YOUR ORDER

  @highprice
  Scenario: the user purchase product highest price
    Given the user is on the Web
    When log in with the information
      | username      | password     |
      | standard_user | secret_sauce |
    When select the product highest price
      | name  | lastname | postalcode |
      | Pedro | Perez    | 67890      |
    Then the user purchase the product highest price with the message THANK YOU FOR YOUR ORDER


