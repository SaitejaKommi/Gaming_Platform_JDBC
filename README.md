🎮 Gaming Platform JDBC Project
📘 Project Description
This project is a gaming platform backend system built using Java + JDBC that connects to a MySQL database.
It allows you to manage users, games, achievements, reviews, purchases, leaderboards, and more — simulating core features of a real gaming ecosystem.

🎯 Learning Goals
This project was built to strengthen the following skills:

✅ Relational Database Schema Design
✅ Writing SQL Queries with Foreign Keys & Constraints
✅ JDBC Integration with Java
✅ Object-Oriented Programming Principles (DAO + Model Layers)
✅ Git and GitHub for Version Control

🚀 How to Run This Project
1️⃣ Step 1: Create MySQL Database
Open MySQL Workbench or terminal and create the schema:

sql
Copy
Edit
CREATE DATABASE Gaming_platform;
2️⃣ Step 2: Create Tables
Use the provided SQL schema (or write manually in Workbench) to create all tables like:

users, games, achievements

reviews, friends, leaderboards

purchases, subscriptions, etc.

Make sure table names and constraints match your code.

3️⃣ Step 3: Compile Java Code
Open terminal inside the project folder and run:

bash
Copy
Edit
javac -cp ".;lib/mysql-connector-java-9.4.0.jar" -d out src/**/*.java
(Use : instead of ; on Mac/Linux)

4️⃣ Step 4: Run the Program
bash
Copy
Edit
java -cp ".;lib/mysql-connector-java-9.4.0.jar;out" Main
🔌 Database Connection
All DB connection details are handled in DBConnection.java:

java
Copy
Edit
URL      = jdbc:mysql://localhost:3306/Gaming_platform
USERNAME = root
PASSWORD = your_password
Update your_password with your actual MySQL root password.

🧠 Core Functionality
Once the app runs, it connects to MySQL and allows operations like:

👤 Add New Users
java
Copy
Edit
User user = new User(0, "gamer123", "gamer@example.com", "hash_pass");
userDAO.addUser(user);
📋 View All Users
Fetch all users from the users table using getAllUsers() and print their details.

📊 Extendable to:
Insert/retrieve games and reviews

Show top leaderboard scores

Track achievements per user

Manage subscriptions

🗃️ Key Tables in Schema
Table	Purpose
users	Stores user info
games	Game metadata
reviews	User reviews for games
leaderboards	Scoreboards for games
purchases	Game purchase tracking
achievements	Unlockable items for games
user_achievements	Maps users to unlocked achievements
user_subscriptions	Premium tracking per user
messages	Messaging between users

🧾 Inputs & Testing
You can test your setup by:

Adding users via the Main class

Verifying inserts in MySQL using:

sql
Copy
Edit
SELECT * FROM users;
Use your own test data or let me know if you want seed data (SQL insert scripts).

☕ Final Words
Thanks for checking out this project!
Feel free to expand it with login systems, GUIs, or game APIs.

Have fun building, and happy coding! 💻🕹️🔥
— Saiteja Kommi
