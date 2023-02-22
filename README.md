# Microservices exercise

1. **SERVICE REGISTRY:** Create a Eureka Service Registry and Registry and register all services.
2. **INVENTORY SERVICE:** Create a SQL database with the following table

| serial_number | quantity |
| ----------- | ----------- |
| 1 | 50 |
| 2 | 10 |
| 3 | 15 |

3. **INVENTORY SERVICE:** Using JPA, create a simple service with a GET route that gets the quantity of an item by id.
4. **PRICE SERVICE:** Create a SQL database with the following table

| serial_number | product_name | price |
| ----------- | ----------- | ----------- |
| 1 | shirt | 15.00 |
| 2 | pants | 30.00 |
| 3 | socks | 1.50 |

5. **PRICE SERVICE:** Using JPA, create a simple service with a GET route that gets the productName and price of an item by id.


**EDGE SERVICE**
1. Create an Edge Service using Feign.
2. The Edge Srvice should have 2 client interfaces in the util/feign directory: InventoryClient and PriceClient.
3. The Edge Service should have 3 models:
  - Inventory
    - long: serialNumber
    - int: quantity
  - Price
    - long: serialNumber
    - String: productName
    - double: price
  - ProductDTO
    - long: serialNumber
    - int: quantity
    - String: productName
    - double: price
4. The Edge Service should have 1 GET route thatgets Products by id and returns a ProductDTO.
    
