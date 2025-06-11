# Carnage E-Commerce Automation Test

This project is an automation test script written in Java using **Selenium WebDriver** and **TestNG**.  
It is designed to test the T-shirt and Shorts purchase flow on the [https://incarnage.com](https://incarnage.com) website.

## About the Project

The test simulates a real user going through the process of:
- Navigating the site
- Selecting a T-shirt and a short
- Choosing color and size
- Adding them to the cart
- Validating the cart content

The main goal of this test is to make sure that the product selection and cart features are working as expected.

## Daily Test Logic

If this script is scheduled to run daily, the test includes **checks for product availability** to avoid failures.  
The logic is:

1. Check if the **T-shirt product is available** on the page.
   - If not, print: `"T-shirt not available"` and skip further steps.
2. Check if the **selected color is available**.
   - If not, print: `"Color not available"` and skip further steps.
3. Check if the **selected size is available**.
   - If not, print: `"Size not available"` and skip further steps.
4. If all three are available:
   - Proceed to click, select color and size, add to cart.
   - Validate product in cart (name, price, color, size).

This logic helps avoid test failure due to stock issues and makes it reliable for daily use.

## Technologies Used

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **ChromeDriver**

## How to Run the Test

1. Install JDK 8 or above
2. Add ChromeDriver to your system path (matching your browser version)
3. Open the project in IntelliJ or Eclipse
4. Run the `CarnageTest.java` file as a TestNG test

## Key Features

- T-shirt and shorts selection test
- Handles out-of-stock or unavailable product cases
## 🙋‍♂️ Author
Email: sahantheekshana65@gmail.com  
GitHub: https://github.com/sahantheekshana

