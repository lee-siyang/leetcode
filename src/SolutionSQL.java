/**
 * Created by lisiyang on 17/6/5.
 */
public class SolutionSQL {
    //595. Big Countries
    //SELECT name,population,area FROM World WHERE area > 3000000 OR population > 25000000;

    //182. Duplicate Emails
    //SELECT Email FROM Person GROUP by Email having count(Email)>1

    /*
    175. Combine Two Tables
    Select FirstName, LastName, City, State
    from Person
    left join Address
    on Person.PersonId = Address.PersonId
     */

    /*
    181. Employees Earning More Than Their Managers
    select a.Name as Employee
    from Employee a,Employee b
    where a.ManagerId = b.Id and a.Salary>b.Salary
     */

    /*
    183. Customers Who Never Order
    select name as Customers
    from Customers
    where Customers.Id not in (select Orders.CustomerID from Orders)
     */

    /*
    197. Rising Temperature
    select a.Id
    from Weather a,Weather b
    where datediff(a.Date,b.Date)=1 and a.Temperature>b.Temperature
     */

    /*
    196. Delete Duplicate Emails
    delete from Person
    where id not in(
    select Person.min_id from (select min(id) as min_id from Person group by email) Person
    )
     */

    /*
    176. Second Highest Salary
    select max(Salary) as SecondHighestSalary
    from Employee
    where Salary not in (select max(Salary) from Employee )
     */

    /*
    596. Classes More Than 5 Students
    select class
    from courses
    group by class
    having count(distinct student)>=5;
     */
}
