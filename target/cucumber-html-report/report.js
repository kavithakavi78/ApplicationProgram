$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("JpetApp.feature");
formatter.feature({
  "line": 3,
  "name": "User test the Jpet application Functionality",
  "description": "",
  "id": "user-test-the-jpet-application-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "User register the jpet application",
  "description": "",
  "id": "user-test-the-jpet-application-functionality;user-register-the-jpet-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User launch the Jpet Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User register his details",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User check sign in process",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_Jpet_Application()"
});
formatter.result({
  "duration": 32548843740,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_register_his_details()"
});
formatter.result({
  "duration": 37098080453,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_check_sign_in_process()"
});
formatter.result({
  "duration": 14839884361,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User Check the Search functionality",
  "description": "",
  "id": "user-test-the-jpet-application-functionality;user-check-the-search-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User launches Jpet Application",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User login with his credentials",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User searches the item in search tag",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_Jpet_Application()"
});
formatter.result({
  "duration": 12779942680,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_login_with_his_credentials()"
});
formatter.result({
  "duration": 4841115119,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_searches_the_item_in_search_tag()"
});
formatter.result({
  "duration": 10309395104,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User Check the place order functionality",
  "description": "",
  "id": "user-test-the-jpet-application-functionality;user-check-the-place-order-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User launches the pet Application",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User login the application with credentials",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User Searching the pet in search box",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User add the pet in cart",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User placed the order",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_pet_Application()"
});
formatter.result({
  "duration": 9831286977,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_login_the_application_with_credentials()"
});
formatter.result({
  "duration": 5291661439,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Searching_the_pet_in_search_box()"
});
formatter.result({
  "duration": 6590611423,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_add_the_pet_in_cart()"
});
formatter.result({
  "duration": 12312367996,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_placed_the_order()"
});
formatter.result({
  "duration": 21916979850,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User Check the update cart function",
  "description": "",
  "id": "user-test-the-jpet-application-functionality;user-check-the-update-cart-function",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User launching the pet application",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "User logged in with valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User select the pets",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User update the cart",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User add one more item in cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launching_the_pet_application()"
});
formatter.result({
  "duration": 12019374675,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_logged_in_with_valid_credentials()"
});
formatter.result({
  "duration": 4965213011,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_pets()"
});
formatter.result({
  "duration": 20413914795,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_update_the_cart()"
});
formatter.result({
  "duration": 8411403359,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_add_one_more_item_in_cart()"
});
formatter.result({
  "duration": 17837429246,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "User Check the remove functionality",
  "description": "",
  "id": "user-test-the-jpet-application-functionality;user-check-the-remove-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@tag5"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "User launching the Jept application",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "User login with valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User search the item and add to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "User click remove option in cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launching_the_Jept_application()"
});
formatter.result({
  "duration": 15822061734,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_login_with_valid_credentials()"
});
formatter.result({
  "duration": 6239735365,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_search_the_item_and_add_to_the_cart()"
});
formatter.result({
  "duration": 19020697596,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_remove_option_in_cart_page()"
});
formatter.result({
  "duration": 7266236019,
  "status": "passed"
});
});