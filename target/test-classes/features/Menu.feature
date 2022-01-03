@menu
Feature: Verify menus and subMenus

  Scenario: Verify all menus are clickable

    Given User is on the main page
    Then the user should see following options
      | JEAN       |
      | KADIN      |
      | ERKEK      |
      | OUTLET     |
      | YENİ SEZON |
      | JEAN GUIDE |

    And Verify the number of products of each menu


