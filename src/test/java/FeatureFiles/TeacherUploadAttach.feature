Feature: Assignments Functionality

  Background: Teacher Login Functionality
    Given Navigate to Campus
    When Enter valid teacher username and password then click login button
    Then User should login successfully

    Scenario: Create PDF files as Attach as Homework

      And Click on the element in page
         | assignments |
         | add Button  |

      Then Create a Homework

      And Click on the element in page
          | Save         |
          | Apply        |
          | Save&Publish |
          | ConfirmYes   |

      Then Success message should be displayed

    Scenario: Create PNG files as Attach as Project

      And Click on the element in page
        | assignments |
        | add Button  |

      Then Create a Project

      And Click on the element in page
        | Save         |
        | Apply        |
        | Save&Publish |
        | ConfirmYes   |

      Then Success message should be displayed

    Scenario: Create XLSX files as Attach as Other

    And Click on the element in page
      | assignments |
      | add Button  |

    Then Create an Other

    And Click on the element in page
      | Save         |
      | Apply        |
      | Save&Publish |
      | ConfirmYes   |

    Then Success message should be displayed

      











