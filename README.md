# 🕋 Java Library Management System

A **console-based application** built in **Java** that simulates a simple **Library Management System (LMS)**.
It allows librarians and users to **add books, register users, issue and return books, and view records**.

Designed with **Object-Oriented Programming (OOP)** principles and powered by **Java Collections**, this project models **real-world library workflows** in a lightweight, interactive way.

---

## 🐡 Goals

* Apply **OOP concepts** (Encapsulation, Abstraction, Classes & Objects).
* Build a **menu-driven console interface** for library operations.
* Use **ArrayList** for efficient, dynamic data management.
* Implement a simple **book borrowing and returning system**.

---

## 🐧 Features

### 📖 Book Management

* Add new books.
* View all books (categorized as **Available** or **Issued**).

### 👤 User Management

* Register new users.
* Display list of registered users.

### 🔄 Borrowing System

* **Issue books** to users (updates book status to *Issued*).
* **Return books** (updates book status back to *Available*).

### 🖥️ Interactive Console Menu

* Easy-to-use menu with options **1–5**.
* Loops until user selects **Exit**.

---

## 🧰 Tech Stack & Tools

| Tool / Library            | Purpose                        |
| ------------------------- | ------------------------------ |
| **Java (JDK 17+)**        | Programming language           |
| **ArrayList**             | Store & manage books and users |
| **Scanner**               | Handle user input from console |
| **Switch-case**           | Menu-driven command selection  |
| **VS Code / IntelliJ**    | Development environment        |
| **Terminal / PowerShell** | Compile & run application      |

---

## 🏗️ Project Structure

```
LibraryManagementSystem/
├─ LibraryManagementSystem.java   # Main program file
└─ README.md                      # Documentation
```

---

## ⛷️ Core Classes

### 📘 Book

* **Attributes**: `title`, `author`, `isIssued`.
* **Methods**:

  * `issue()` → mark as issued.
  * `returnBook()` → mark as available.
  * `toString()` → formatted book details.

### 👩‍💼 User

* **Attributes**: `name`, `userId`.
* **Methods**:

  * `toString()` → formatted user details.

### 🏛️ Library

Manages `ArrayList<Book>` and `ArrayList<User>`.

* **Methods**:

  * `addBook(Book book)`
  * `addUser(User user)`
  * `issueBook(String title, int userId)`
  * `returnBook(String title)`
  * `displayBooks()`
  * `displayUsers()`

### 🖥️ Main Program (`main()`)

* Loads **sample books & users**.
* Provides **menu loop** for user interactions.

---

## 🪜 Setup & Run

1. **Compile the program**

   ```bash
   javac LibraryManagementSystem.java
   ```

2. **Run the program**

   ```bash
   java LibraryManagementSystem
   ```

---

## 📺 Example Console Flow

```
----- Library Menu -----
1. Display Books
2. Display Users
3. Issue Book
4. Return Book
5. Exit
Enter your choice: 1
```

---

## 🚩 Example Test Cases

* **Add Book**
  → Add "The Alchemist" → appears in list as *Available*.

* **Issue Book**
  → Issue "Clean Code" to User #1 → status changes to *Issued*.

* **Return Book**
  → Return "Clean Code" → status changes back to *Available*.

* **Invalid Input**
  → Enter choice `9` → displays *"Invalid choice!"*.

---

## 🧁👾 Learning Outcomes

* Modeled **real-world entities** into Java classes.
* Practiced **OOP principles** in a practical project.
* Gained experience with **ArrayList** for data handling.
* Designed a **menu-driven CLI application**.
* Improved skills in **clean, modular, and reusable code**.

---

## 🥤☘️ Author

**Sakshi Bhojraj Sonkusare**
💡 Aspiring Software Developer passionate about building **practical, user-friendly applications**.

* 🔗 [LinkedIn](#)
* 🌐 Portfolio: *Coming Soon*

---

## ❤️ Contributions

Feedback and contributions are always welcome! 🎉

* Fork the repo
* Suggest improvements
* Open pull requests

---
