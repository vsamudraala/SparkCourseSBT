package TelsukoScala

object basics {

  def main(args: Array[String]): Unit = {
    //
    //    println("Reference video \nhttps://www.youtube.com/watch?v=i9o70PMqMGY&t=261s")
    //    println(" Class is created using case class in Scala \n ")
    //
    //    //General Student Class
    //    //case class Student(var rollNo, var name, var marks)
    //    //General Student Class with Deault values assigned
    //    case class Student(var rollNo: Int = 1, var name: String = "Venkatesh", var marks: Int = 83) {
    //
    //      def show1 = {
    //        println("gbm mmm")
    //      }
    //    }
    //
    //    println("Creating object")
    //    var s1 = Student(name = "Sma")
    //    s1.show1
    //    println("\nCreating method in scala \nwe use 'def' keyword and '=' operator while creating a method in scala")
    //
    //  }

    //    println("LIST AND LAMBDA EXPRESSIONS IN SCALA")
    //
    //        var nums = List(1, true, 4,3,5, 6)
    //
    //        nums.foreach { i: AnyVal  => println(i) }
    //
    //        val v2=nums.drop(2)
    //        println(v2)

    case class Student(Id: Int, Name: String, rNo: Int)
    var students = List(Student(1, "Venkatesh", 97), Student(2, "Sushma", 83), Student(3, "Chow", 109), Student(4, "Kantilo", 111), Student(5, "Ashok", 93))

    //println(students)
    //
    //val topper = students.filter(s=>s.Name.equals("Chow"))
    //    println("Topper is : " +topper)

    //    val (part1, part2) =students.partition(s => s.rNo <= 100)
    //    println("1st Partition is : " +part1, "2nd Partition is : "+part2)
    //    println("\n Reverse the elements")
    //    var l1=nums.reverse
    //    println(l1)
    //
    //    println("TUPLES")
    //    val part1 = partitions._1
    //    println(part1)
    //
    //    val part2 = partitions._2
    //    println(part2)

  }
}