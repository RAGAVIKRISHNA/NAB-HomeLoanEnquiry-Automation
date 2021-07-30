Feature: Loan Enquiry
  Enquire about your new loan and request call back

  Background:
    Given If you need to request a new home loan
    When I navigate to "https://www.nab.com.au/" URL
    And Select HomeLoan Option
    When Request for a callback Option
    Then I fill up the request form
      
  Scenario Outline: Home Loan Enquiry from Nab
    And she provides the first name as <firstname>
    And she provides the last name as <lastname> 
    And she provides the phone number as <phone> 
    And she provides the email as <email> 
    And she provides the state as <state>
    And I fill the form and submit
    And I close the browser
    
    Examples:
    | firstname | lastname  | email           | phone        | state |
    | "abc"     |     "def" | "abc@gmail.com" | "0447814324" | "VIC" | 
    | "ghj"     |     "jkl" | "ghj@gmail.com" | "0447814325" | "NSW" | 
    | "hjk"     |     "jjh" | "ghj@gmail.com" | "0447814378" | "NSW" | 
    | "yui"     |     "jkl" | "ghj@gmail.com" | "0447814346" | "NSW" | 
    
       
   
   
     
