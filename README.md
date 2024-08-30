# 📚 Logic for Programming III Course

**Instructor**: Marcio Michelluzzi

## 📋 Object-Oriented Programming (OOP) Exercise List

### 1. 🧍‍♂️ Person
Create a class to represent a `Person` with the following attributes:
- `name` (private)
- `birth date` (private)
- `height` (private)

Methods:
- `getters and setters` for the attributes
- `printDetails`: prints all the person's details
- `calculateAge`: calculates the person's age

### 2. 💳 BankAccount
Implement a class `BankAccount` with the following attributes:
- `account number`
- `account holder's name`
- `balance` (optional, default value is zero)

Methods:
- `changeName`
- `deposit`
- `withdraw`

### 3. ⛽ FuelPump
Develop a class `FuelPump` with the following attributes:
- `fuel type`
- `price per liter`
- `fuel quantity`

Methods:
- `refuelByValue`: informs the amount of liters for the given value
- `refuelByLiters`: calculates the price for the given liters
- `changePrice`: changes the price per liter
- `changeFuelType`: changes the fuel type
- `changeFuelQuantity`: changes the remaining fuel quantity

### 4. 🏢 Elevator
Create a class `Elevator` with the following attributes:
- `current floor` (initially ground floor = 0)
- `total floors` (excluding the ground floor)
- `elevator capacity`
- `number of people inside`

Methods:
- `initialize`: receives capacity and total floors as parameters
- `enter`: adds a person to the elevator (if there is space)
- `exit`: removes a person from the elevator (if there is someone inside)
- `goUp`: moves up one floor (if not already on the top floor)
- `goDown`: moves down one floor (if not already on the ground floor)

### 5. 🎓 Student
Implement a class `Student` with the following attributes:
- `enrollment number`
- `name`
- `2 exam scores`
- `1 assignment score`

Methods:
- `calculateAverage`: calculates the final average (exam weight: 2.5, assignment weight: 2)
- `finalExam`: calculates the score needed for the final exam (returns zero if not required)

### 6. 🛒 Invoice
Create a class `Invoice` to represent an invoice with the following attributes:
- `item number`
- `item description`
- `quantity purchased`
- `price per item`

Methods:
- `getters and setters`
- `getInvoiceAmount`: calculates the total invoice amount

### 7. 👷‍♂️ Employee
Create a class `Employee` with the following attributes:
- `first name`
- `last name`
- `monthly salary`

Methods:
- `getters and setters`
- If the salary is not positive, set it to 0.0.
- Create a method to calculate the annual salary and increase it by 10%.

### 8. 📅 Date
Write a class `Date` that represents a date with the following methods:
- `Constructor`: sets the date, verifies its validity
- `compare`: compares with another date object (returns 0, 1, or -1)
- `getDay`, `getMonth`, `getYear`
- `getMonthName`: returns the month name
- `isLeapYear`: checks if the year is a leap year
- `clone`: clones itself

### 9. ✈️ Flight
Create a class `Flight` to represent a flight with the following attributes:
- `flight number`
- `date` (use the `Date` class)
- `100 passengers` (maximum)

Methods:
- `nextFreeSeat`: returns the next available seat number
- `checkSeat`: checks if a seat is occupied
- `occupySeat`: occupies a seat and returns true if successful, false otherwise
- `availableSeats`: returns the number of free seats
- `getFlightNumber`: returns the flight number

### 10. ⚽ SoccerPlayer
Create a class `SoccerPlayer` with the following attributes:
- `name`
- `position`
- `birth date`
- `nationality`
- `height`
- `weight`

Methods:
- `getters and setters`
- `printDetails`: prints all the player’s details
- `calculateAge`: calculates the player’s age
- `retirementTime`: calculates the time left until retirement, based on the player’s position.

### 11. 🎟️ Ticket and VIP Ticket
Implement a class `Ticket` with:
- `price`

Methods:
- `printPrice`

Create a class `VIPTicket`, which inherits from `Ticket` and has:
- `additional price`

Methods:
- `getVIPPrice`: returns the total VIP ticket price

### 12. 📖 AddressBook
Create a class `AddressBook` to store up to 10 people. Methods:
- `storePerson(name, age, height)`
- `removePerson(name)`
- `findPerson(name)`: returns the position in the address book
- `printAll`: prints all people’s details
- `printPerson(index)`: prints the details of the person at position `index`

### 13. ➕ Calculator and Scientific Calculator
Implement a class `Calculator` for basic operations:
- `addition`
- `subtraction`
- `division`
- `multiplication`

Create a class `ScientificCalculator` that inherits from `Calculator` and adds:
- `squareRoot`
- `power`

### 14. 💻 Invoice
Create a class `Invoice` to represent an invoice with the following attributes:
- `number`
- `description`
- `quantity`
- `price per item`

Methods:
- `getTotalInvoice`: calculates the total invoice value

### 15. 👨‍💼 Employee with Counter
Create a class `Employee` to represent an employee with the following attributes:
- `first name`
- `last name`
- `monthly salary`

Add a class variable to count the number of employees.

### 16. 🚗 Car
Develop a class `Car` to represent a car with:
- `fuel tank`: maximum of 50 liters
- `consumption`: 15 km/liter

Methods:
- `refuel`
- `move`
- `getRemainingFuel`
- `getDistanceTravelled`

### 17. 📅 Appointment Scheduling
Create a class to manage appointments with the following attributes:
- `appointment type`
- `date`
- `participant name`
- `phone number`

Methods:
- `schedule`
- `remove`
- `modify`
- `displayByParticipant`
- `displayByDate`
