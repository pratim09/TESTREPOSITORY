 @tag
Feature: Create a new install order with offnet UNI and verify the NMI Local Access type and Build out option


  Scenario Outline: Check the offnet feature for NMI Local access type and Build out option
    Given As a UWS user open the application
    And enters "<username>" as username
    And  This I am doing for GIT VALIDATION 
    And enters "<password>" as password
    And submit it
    When I enter the "<custname>" as customername and search by customer name
    And Navigates to the customer overview page
    And create new order
    And Navigate to the order quoting page
    When I add the  customeraccountid and productaccounts
    And Add ParamataID as contracts
    And Add Locations as GetExisitngLocations from the list
    And Add Contact as GetExistingContacts
    And Add Party roles for the locations for the added contact
    Then Under Products/Services configure CE services
    And Add Offnet Uni for the selected locations
    Then verify the NMI Local Access type
    And also verify the buildout option for added UNI

    Examples: 
      | username | password | custname       |
      | slstst1  | Link1234 | AAA of Arizona |
