# 🎒 College Lost & Found Portal

A full-stack Spring Boot web application designed to help students report, search, and recover lost belongings inside college campuses.

---

## 📌 Problem Statement

Students frequently lose important items such as:

- 🪪 ID Cards
- 🎧 Earphones
- 🧮 Calculators
- 👛 Wallets
- 🔌 Chargers

Most colleges do not have a centralized digital system to manage lost and found items efficiently.

---

## 💡 Solution

The **College Lost & Found Portal** provides a centralized platform where students can:

- Report lost items
- Report found items
- Search matching items
- Contact item owners
- Verify claims
- Manage reports through admin moderation

---

## 🚀 Features

### 👤 User Features
- Report Lost Items
- Report Found Items
- Search & Filter Items
- Claim Verification
- Contact Item Owner
- Image Upload Support
- Email Notification Support *(Optional)*

### 🛡️ Admin Features

- Admin Moderation
- Remove Fake Reports
- Manage Users & Listings

---

## 🛠️ Technologies Used

### Backend
- Java
- Spring Boot
- Spring Data JPA
- REST API

### Frontend
- HTML
- CSS
- JavaScript

### Database
- MySQL

### Other Tools
- Git & GitHub
- STS (Spring Tool Suite)

---

## 📂 Project Structure

```bash
src/
 ├── main/
 │   ├── java/
 │   │   └── com/aniket/lostfoundportal/
 │   │       ├── controller/
 │   │       ├── entity/
 │   │       └── repository/
 │   └── resources/
 │       ├── static/
 │       └── application.properties
```

---

## ⚙️ Configuration

### Database Configuration

+----------------+--------------+------+-----+---------+----------------+
| Field          | Type         | Null | Key | Default | Extra          |
+----------------+--------------+------+-----+---------+----------------+
| id             | bigint       | NO   | PRI | NULL    | auto_increment |
| contact_number | varchar(255) | YES  |     | NULL    |                |
| description    | varchar(255) | YES  |     | NULL    |                |
| item_name      | varchar(255) | YES  |     | NULL    |                |
| location       | varchar(255) | YES  |     | NULL    |                |
| owner_name     | varchar(255) | YES  |     | NULL    |                |
+----------------+--------------+------+-----+---------+----------------+
```

---

### Request Body

```json
{
  "itemName": "Wallet",
  "description": "Black leather wallet",
  "location": "Library",
  "ownerName": "Aniket",
  "contactNumber": "9876543210"
}
```

---

## 📜 Sample Entity Class

```java
@Entity
public class LostItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    private String description;
    private String location;
    private String ownerName;
    private String contactNumber;
}
```

---

### 1️⃣ Clone Repository

```bash
git clone https://github.com/Aniket8112005/College-Lost-And-Found-Portal.git
```

### 2️⃣ Open in STS / IntelliJ

Import as Maven Project.

### 3️⃣ Configure MySQL Database

Create database:

```sql
CREATE DATABASE lost_found_db;
```

Update credentials in:

```properties
application.properties
```

### 4️⃣ Run Application

Run:

```bash
LostfoundportalApplication.java
```

Application starts at:

```bash
http://localhost:8080
```

---

## 🎯 Future Improvements

- JWT Authentication
- AI-based Item Matching
- Real-time Chat System
- Mobile App Integration
- QR-based Claim Verification
- Cloud Image Storage

---

## 👨‍💻 Developer

### Aniket

B.Tech Information Technology Student  
Passionate about Full Stack Development & Spring Boot Projects

---

## ⭐ GitHub Repository

If you like this project, give it a ⭐ on GitHub!
