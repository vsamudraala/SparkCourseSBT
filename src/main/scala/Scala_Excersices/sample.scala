package Scala_Excersices

object sample {

  def main (args:Array[String])
  {
//val a=scala.io.StdIn.readInt()
//println("The value of a is "+ a)
    def Even (number : Int) = number % 2 == 0

    def Odd (number : Int) = !Even(number)

    val numList = Array(1,2,3,4);

    for (n <- numList) {
      print(n);
      if (Even(n)) {
        println( "EVen");
      }
      if (Odd(n)) {
        println( "Odd" );

      }
    }
  }

}



/*


SELECT MAX(e.name) AS name, MAX(e.department) AS department
FROM emp e
  LEFT OUTER JOIN emp e2
    ON (e.department = e2.department AND e.salary >= e2.salary)
GROUP BY e.salary
HAVING COUNT(*) <= 3
ORDER BY department;

-----
Select * From (SELECT    A.*,

(SELECT COUNT(DISTINCT(B.salary))
FROM Employee B
WHERE B.salary >= A.salary and A.departmentID=B.departmentID) as Rank FROM  Employee A) Emp
Where Emp.Rank <=3

 */