# Calculator Application

This is a simple calculator application built using Java and Maven. The application provides a user interface for performing basic arithmetic operations such as addition, subtraction, multiplication, and division. It also includes functionality to check if a number is even, odd, or prime.

## Project Structure

```
calculator-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── calculator
│   │   │               ├── Calculator.java
│   │   │               ├── MathOperations.java
│   │   │               └── ui
│   │   │                   └── CalculatorUI.java
│   │   └── resources
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── calculator
│                       └── CalculatorTest.java
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd calculator-app
   ```

2. **Build the project**:
   Ensure you have Maven installed, then run:
   ```
   mvn clean install
   ```

3. **Run the application**:
   You can run the application using the following command:
   ```
   mvn exec:java -Dexec.mainClass="com.example.calculator.ui.CalculatorUI"
   ```

## Usage

- The calculator provides buttons for each arithmetic operation.
- Users can input numbers and select operations to perform calculations.
- The application also allows users to check the type of a number (even, odd, prime).

## Testing

Unit tests for the Calculator class are included in the `src/test/java/com/example/calculator/CalculatorTest.java` file. You can run the tests using:
```
mvn test
```

## Dependencies

This project uses Maven for dependency management. The `pom.xml` file contains all necessary dependencies for the project.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.