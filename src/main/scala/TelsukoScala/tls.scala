package TelsukoScala
import org.apache.log4j.Logger

object tls {
  def main(args: Array[String]): Unit = {

    case class Employees(EID: Int, EName: String, Sal: Int)
    var EmpList = List(Employees(1, "emp1", 150),
      Employees(2, "emp2", 200),
      Employees(3, "emp3", 250),
      Employees(4, "emp4", 300),
      Employees(5, "emp5", 150))

    //var partitions = EmpList.partition(s => s.Sal <220)

    //println(partitions)

    var (p1, p2)= EmpList.partition(s =>s.Sal <300)



  }
}