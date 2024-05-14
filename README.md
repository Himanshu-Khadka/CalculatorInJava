## Calculator

This repository contains a simple calculator application implemented in Java using JavaFX. The calculator provides basic arithmetic operations and a user-friendly interface.

### Features

- **Basic Arithmetic Operations**: Supports addition, subtraction, multiplication, and division.
- **User-Friendly Interface**: Intuitive and easy-to-use interface with buttons for digits and operations.
- **Clear Function**: Ability to clear the current input.
- **Error Handling**: Displays an error message for invalid expressions.

### Screenshots
<img width="237" alt="Screenshot 2024-05-14 at 1 44 56 PM" src="https://github.com/Himanshu-Khadka/CalculatorInJava/assets/130685429/9a37a6df-34a4-4b91-a259-852d55053086">


### Usage

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/Himanshu-Khadka/CalculatorInJava.git
   ```

2. **Navigate to the Project Directory**:
   ```sh
   cd src/main/java/himanshukhadka/calculator
   ```

3. **Compile and Run the Application**:
   Make sure you have Java and JavaFX installed. Compile and run the application using your preferred IDE or command line.
   
   To compile:
   ```sh
   javac -d bin -sourcepath src src/main/java/himanshukhadka/calculator
   ```

   To run:
   ```sh
   java -cp bin himanshukhadka.calculator.Calculator
   ```

### Code Overview

#### Main Class: `Calculator`

- **TextField display**: A text field to display the current input and result.
- **start(Stage primaryStage)**: Sets up the user interface with a grid of buttons and a display area.
- **buttonClicked(String text)**: Handles button click events.
  - Clears the display when "C" is clicked.
  - Evaluates the expression when "=" is clicked.
  - Appends the clicked button text to the display for other buttons.
- **evaluate()**: Evaluates the mathematical expression entered in the display.
- **eval(String str)**: A method to evaluate the given mathematical expression using a custom parser.

### Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

