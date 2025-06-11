# 🧪 Carnage E-Commerce Automation Suite

Welcome to the **CarnageTest** Project!  
This project is a **TestNG + Selenium** based automation framework designed to **test and validate the shopping experience** on [Incarnage](https://incarnage.com/), focusing specifically on T-Shirts and Shorts.

---

## 🚀 Project Highlights

- ✅ Automates real-user flow on [https://incarnage.com](https://incarnage.com)
- 👕 Validates product details like **name, price, color, size**
- 🔍 Checks availability before performing actions
- 🛒 Automates **add-to-cart** and **cart validation**
- 🧠 Smart logic for handling **out-of-stock or unavailable items**
- ⏰ Designed for **daily scheduled execution**

---

## 🧰 Tech Stack

| Tool/Framework  | Description                     |
|-----------------|---------------------------------|
| Selenium WebDriver | Browser automation            |
| TestNG          | Test orchestration and assertions |
| Java            | Core programming language       |
| ChromeDriver    | WebDriver for Google Chrome     |
| Maven (optional) | Dependency management           |

---

## 🧑‍💻 How to Run

### 📦 Prerequisites

- Java JDK 8 or above
- Chrome Browser installed
- ChromeDriver (same version as your browser)
- TestNG installed (if using IDE like IntelliJ or Eclipse)

### ▶️ Execution Steps

1. Clone the repo:
    ```bash
    git clone https://github.com/yourusername/CarnageTest.git
    cd CarnageTest
    ```

2. Add `chromedriver` to your system path or place it in the project root.

3. Open the project in your IDE.

4. Run the test:
    - Right-click on `CarnageTest.java` > Run
    - Or use terminal with TestNG XML if integrated

---

## 🔄 Test Workflow

### ✅ Product Validation Flow

1. **Navigate** to "T-Shirts" via hover menu
2. **Check availability** of:
   - Product
   - Color
   - Size
3. **Add to Cart**
4. **Navigate** to "Shorts"
5. **Repeat** steps for shorts
6. **Validate cart details** for T-shirt:
   - Name
   - Color
   - Size
   - Price

---

## 🧠 Out-of-Stock Handling Logic

Before interacting with any element:
- Checks whether the **T-shirt**, **color**, and **size** are present
- If **not available**, prints a message and **skips that test**
- Ensures **automation does not fail** due to product unavailability
- Improves **reliability** for scheduled test runs

---

## 🖼️ Sample Console Output

```bash
T-shirt is available
Color is available
Size is available
Adding to cart...
Validating cart...
Assertion passed: All values matched!
