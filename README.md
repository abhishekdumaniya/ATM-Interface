# ATM Console Application

This is a simple console-based ATM application written in Java. The application allows users to perform basic banking operations such as viewing transaction history, withdrawing money, depositing money, transferring money, and quitting the application.

## Features

- **Transaction History**: View the history of all transactions.
- **Withdraw**: Withdraw money from your account.
- **Deposit**: Deposit money into your account.
- **Transfer**: Transfer money to another account.
- **Quit**: Exit the application.

## Project Structure

- **src/com/app/Choice.java**: Handles user choices for ATM operations.
- **src/com/app/Deposit.java**: Handles deposit operations.
- **src/com/app/Transfer.java**: Handles transfer operations.
- **src/com/app/Withdraw.java**: Handles withdrawal operations.
- **src/com/app/Main.java**: Contains the main method to start the application.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system.

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/abhishekdumaniya/atm-interface-console-application.git
    ```

2. Navigate to the project directory:
    ```bash
    cd atm-interface-console-application
    ```

3. Compile the Java files:
    ```bash
    javac src/com/app/*.java
    ```

4. Run the application:
    ```bash
    java -cp src.com.app.Main
    ```

## Usage

1. When the application starts, you will be prompted to enter your user id and pin.
2. Upon successful authentication, you can perform the following operations:
    - View Transaction History
    - Withdraw Money
    - Deposit Money
    - Transfer Money
    - Quit the application

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.

---

Feel free to reach out if you have any questions or need further assistance.
