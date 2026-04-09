# 🚀 Customer Service - Order Inventory Management

## 📌 Overview
This microservice is part of the **Order Inventory Management System**.  
It handles all operations related to **Customer Management**.

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- MySQL (or your DB)
- Maven

---

## 📁 Project Structure
The project follows a layered architecture:

- **controller** → Handles REST API requests  
- **entity** → Contains database models  
- **repository** → JPA interfaces for DB operations  
- **service** → Business logic layer  
- **exception** → Custom exception handling  

---

## ⚙️ Features Implemented

- ✅ Create Customer  
- ✅ Get Customer (By ID / All)  
- ✅ Update Customer  
- ✅ Delete Customer  

---

## 🔌 API Endpoints

| Method | Endpoint              | Description              |
|--------|---------------------|--------------------------|
| POST   | /customers          | Create new customer      |
| GET    | /customers          | Get all customers        |
| GET    | /customers/{id}     | Get customer by ID       |
| PUT    | /customers/{id}     | Update customer          |
| DELETE | /customers/{id}     | Delete customer          |

---

## 🧪 Testing
- All endpoints tested using **Postman**
- APIs are working as expected ✅

---

## 🔒 Security
- ❌ Not implemented yet  
- 🔜 Planned: Spring Security + JWT Authentication  

---

## 📊 Current Status
- ✔️ Basic structure completed  
- ✔️ CRUD operations working  
- ✔️ Ready for further enhancements  

---

## 🚀 Next Steps
- Implement Spring Security (JWT)  
- Add validation  
- Improve exception handling  
- Integrate with other microservices  

---

## 👨‍💻 Author
**Vishal**
