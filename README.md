# Microservices exercise

1. SERVICE REGISTRY: Create a Eureka Service Registry and Registry and register all services
2. INVENTORY SERVICE: Create a SQL database with the following table

| serial_number | quantity |
| ----------- | ----------- |
| 1 | 50 |
| 2 | 10 |
| 3 | 15 |

3. INVENTORY SERVICE: Using JPA, create a simple service with a GET route that gets the quantity of an item by id.
4. PRICE SERVICE: Create a SQL database with the following table

| serial_number | product_name | price |
| ----------- | ----------- | ----------- |
| 1 | shirt | 15.00 |
| 2 | pants | 30.00 |
| 3 | socks | 1.50 |

5. PRICE SERVICE: Using JPA, create a simple service with a GET route that gets the productName and price of an item by id.
