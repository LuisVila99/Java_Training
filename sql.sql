-- https://leetcode.com/problems/combine-two-tables/
-- LEFT JOIN
select firstname, lastname, city, state 
from Person
left join Address
on Person.personId = Address.personId;

-- https://leetcode.com/problems/employees-earning-more-than-their-managers/submissions/ 
-- COMPARE WITHIN SAME TABLE -> INNER JOIN 
select e1.name as Employee
from employee e1 inner join employee e2
where e1.managerId = e2.id and e1.salary > e2.salary;

-- https://leetcode.com/problems/customers-who-never-order/submissions/
select name as Customers
from Customers
left outer join Orders
on Orders.customerId = Customers.id 
where Orders.customerId is null;