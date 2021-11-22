@FooterModule

Feature: Verifying Footer Module

@Links

Scenario: Verifying all links are working in Footer section.

Given Navigating to the Website 
When  Verifying all working links in footer section
Then Condition of links are displayed.

@AffiliatesRegister

Scenario: Verifying the Affiliate Register form.

Given Navigate to Website and Select Affiliate link in Footer section.
And Click on Continue in the New Affiliate Program page.
When Enter all the mandatory fields.
Then Click on Continue button.

@AffiliateTelephone

Scenario: Verifying the Telephone textfield in Register form

Given Entering text in the telephone field
When Click on Continue in Affiliate Register
Then Warning message should be displayed but Account created successfully page gets displayed

@AffiliateLogin

Scenario: Verifying the Affiliate Login page with valid Credentials

Given Navigate to Affiliate Login page
When Enter email and password
Then Click on Submit
And A warning message will be displayed

Scenario: Verifying Affiliate Login with incorrect email address or password

Given navigate to Affiliate Login page1
When Enter either incorrect email address or incorrect password
Then Click on Submit button
And A Warning message should be displayed

Scenario: Verifying the Forgotten Password Link

Given Navigate to Affiliate Login
When Click on Forgotten password link
And Enter email address
Then Click Continue.
And Warning message will be displayed
And Click on Back button

@GiftCertificates

Scenario: Verifying the Gift Certificates Form

Given Navigate to Website and Select Gift Certificates link in Footer section.
When Enter all the credentials in the Gift certificate form.
Then Click on Continue in Gift Certificates form.

@ContactUs

Scenario: Verifying the Contact Us Link in Footer Section

Given Navigate to Website and Select Contact Us link in Footer section.
And Verifying the Contact Us form 
Then Click Continue1.


