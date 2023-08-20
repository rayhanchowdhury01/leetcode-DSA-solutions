# Write your MySQL query statement below

SELECT name AS Customers FROM Customers Var1
WHERE NOT EXISTS (SELECT name FROM Orders Var2 WHERE Var1.Id = Var2.CustomerId)
