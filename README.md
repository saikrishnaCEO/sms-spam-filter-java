# 📱 SMS Spam Filter - Java Project

A simple yet powerful Java-based SMS Spam Filter that detects whether an SMS message is spam or not using rule-based keyword matching. This project demonstrates core Java skills like string manipulation, collections (Map), object-oriented programming, and modular class design — all without using machine learning.

---

## 🚀 Features

- ✅ Rule-based spam detection
- ✅ Keyword dictionary for scoring messages
- ✅ Score threshold to classify as spam or not
- ✅ Clean object-oriented structure
- ✅ Beginner-friendly, Core Java only (no external libraries)

---

## 🛠️ Technologies Used

- Java (Core Java)
- Eclipse IDE
- Java Collections Framework (`Map`, `ArrayList`)
- File I/O (if extended)

---

## 🧠 How It Works

1. A keyword map assigns weights to suspicious words like `win`, `free`, `offer`, `urgent`, etc.
2. The user enters an SMS message.
3. The system calculates a score based on matched keywords.
4. If the score crosses a defined threshold, the message is marked as **SPAM**.

---

## 📁 Project Structure

SMS-Spam-Filter/
│
├── com.sms.mainapp/
│ ├── SpamDetector.java // Core logic for spam detection
│ └── KeywordDictionary.java // Contains weighted keyword map
│
└── Main.java // Runs the project (optional)

---

## 💻 How to Run

1. Clone the repo or download the project
2. Open in **Eclipse** or any Java IDE
3. Run `Main.java`
4. Enter sample SMS messages to test spam detection

---

## 📷 Screenshots

> screenshot attached to the project.

---

## 🧩 Future Improvements

- Switch to ML-based detection (Naive Bayes, NLP)
- GUI-based input for SMS
- Save spam messages to log file
- Add JUnit test cases for unit testing

---

## 🧑‍💻 Author

- **Douluri SaiKrishna**  
  [LinkedIn](https://www.linkedin.com/in/doulurisai) | [GitHub](https://github.com/saikrishnaCEO)

---

## 📜 License

This project is licensed under the MIT License. Feel free to use, modify, and share it.


