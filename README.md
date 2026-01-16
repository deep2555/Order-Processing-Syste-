#🚀 MINI PROJECT: Multithreaded File-Based Order Processing System-
---
building a backend order processing system that reads orders from a file, processes them concurrently, updates inventory safely, logs results, and handles failures gracefully.
---
### 🚀OBJECTIVES
✔ OOP design
✔ Thread safety
✔ Correct use of Executor framework
✔ Proper synchronization
✔ Exception handling
✔ File I/O
✔ Logical thinking & reasoning
✔ Clean code
---
UML Design 
+----------------+        +----------------+
|     Order      |------->|      Item      |
+----------------+        +----------------+
| - orderId      |        | - itemId       |
| - quantity     |        | - itemName     |
| - item         |        +----------------+
+----------------+        | +getItemId()   |
| +getOrderId()  |        | +getItemName() |
| +getItem()     |        | +equals()      |
| +getQuantity() |        | +hashCode()    |
+----------------+        +----------------+
       |
       |    
+----------------+
|   Inventory    |◇-----------------> Item
+----------------+
| - stockMap     |
+----------------+
| +checkAndUpdateStock(order: Order) : OrderResult |
+----------------+

+----------------+
|  OrderResult   |--------> Order
+----------------+
| - orderId      |
| - status       |
| - reason       |
+----------------+
| +getOrderId()  |
| +getStatus()   |
| +getReason()   |
+----------------+

+----------------+
|  OrderStatus   |
+----------------+
| SUCCESS        |
| FAILED         |
+----------------+

