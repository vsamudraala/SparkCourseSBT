package Scala_Excersices

object syntaxes {

  def main(args: Array[String]): Unit = {
    println("Reference Website : http://allaboutscala.com/")
    //    //STRING INTERPOLATION

    //    println("String interpolation to print a variable")
    //    val favoriteDonut: String = "Glazed Donut"
    //    println(s"My favorite donut = $favoriteDonut \n s indicates the starting of the println an d \n Dollar sign refers to our variable ")

    //    /******Using String interpolation on object properties*******/
    //    println("Using String interpolation on object properties")
    //    case class Donut(name: String, tasteLevel: String)
    //    val favoriteDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
    //    println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")

    //    /**Using String interpolation to evaluate expressions************/
    //    println("\n3: Using String interpolation to evaluate expressions")
    //    val qtyDonutsToBuy: Int = 10
    //    println(s"Are we buying 10 donuts = ${qtyDonutsToBuy == 10}")

    //    /** Using String interpolation for formatting text ************/
    //    println("\n 4: Using String interpolation for formatting text")
    //    println("To add white spaces infornt of your text, We prepend the text with 'f' and number of white spaces at the end of the string like %20s below")
    //    val donutName: String = "Vanilla Donut"
    //    val donutTasteLevel: String = "Tasty"
    //    println(f"$donutName%20s $donutTasteLevel%20s")

    //    /** Using "f" interpolation to format numbers ************/
    //    println("\n 5: Using f interpolation to format numbers")
    //    val donutPrice: Double = 2.50
    //    println(s"Donut price = $donutPrice")
    //    println(f"Formatted donut price = $donutPrice%.2f")

    //    /** Using Raw interpolation ************/
    //println("\n 6: raw String interpolation will allow you to print any symbols within your String")
    //
    //    println(raw"Rax STring interpolation\tDollar")

    //    /**************/
    //
    //    println("\nStep 2: Using backslash to escape quotes")
    //    val donutJson2: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
    //    println(s"donutJson2 = $donutJson2")
    //    println("Hi \"$" )

    //    /**Using triple quotes """ to escape characters************/
    //    println("\nStep 3: Using triple quotes \"\"\" to escape characters")
    //    val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
    //    println(s"donutJson3 = $donutJson3")
    //
    //    /**Creating multi-line text using stripMargin************/
    //    val donutJson4: String =
    //      """
    //        |{
    //        |"donut_name":"Glazed Donut",
    //        |"taste_level":"Very Tasty",
    //        |"price":2.50
    //        |}
    //      """
    //        .stripMargin
    //    println(donutJson4)
    /** **********************************************************
      * ************SCALA TYPE INFERENCE******************************
      * ***********************************************************
      * **********************************************************
      */
    //    println("\nStep 2: Scala Types")
    //    val numberOfDonuts: Short = 1
    //    val minimumDonutsToSell: String = numberOfDonuts.toString()
    //    println(minimumDonutsToSell + 1)

    //    /**IF ELSE STATEMENT************/
    //
    //    println("\nStep 4: Using if and else clause as expression")
    //    val numberOfPeople = 2
    //    val donutsPerPerson = 2
    //    val defaultDonutsToBuy = 12
    //    val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
    //    println(s"Number of donuts to buy = $numberOfDonutsToBuy")
    //

    //    /**USING LOOP************/
    //    println("Step 1: A simple for loop from 1 to 5 inclusive")
    //    for (numberOfDonuts <- 1 to 5){
    //      println(s"Number of Donuts to buy is " +numberOfDonuts)
    //    }
    ////    for(numberOfDonuts <- 1 to 5){
    ////      println(s"Number of donuts to buy = $numberOfDonuts")
    ////    }

    //for (Donuts <- 1 until 5){
    //  println(s"Donut Number is " +Donuts)
    //}

    //    /** Filter values using if conditions in for loop ******************/
    //    println("\nStep 3: Filter values using if conditions in for loop")
    //    val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
    //    for (ingredient <- donutIngredients if ingredient == "sugar") {
    //      println(s"Found sweetening ingredient = $ingredient")
    //    }

    //    /** Filter values using if conditions in for loop and return the result back using the yield **********/
    //    println("\nStep 4: Filter values using if conditions in for loop and return the result back using the yield keyword")
    //    val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
    //    val sweeteningIngredients = for {
    //      ingredient <- donutIngredients
    //      if (ingredient == "sugar" || ingredient == "syrup")
    //    } yield ingredient
    //    println(s"Sweetening ingredients = $sweeteningIngredients")


    //    /**Using for comprehension to loop through 2-Dimensional array*********/
    //    val twoDimensionalArray = Array.ofDim[String](2,2)
    //    twoDimensionalArray(0)(0) = "flour"
    //    twoDimensionalArray(0)(1) = "sugar"
    //    twoDimensionalArray(1)(0) = "egg"
    //    twoDimensionalArray(1)(1) = "syrup"
    //
    //    for { x <- 0 until 2
    //          y <- 0 until 2
    //    } println(s"Donut ingredient at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")

    //    /*****RANGE **********/
    //    println("\nStep 3: Filter values using if conditions in for loop")
    //    val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
    //    for(ingredient <- donutIngredients if ingredient == "sugar"){
    //      println(s"Found sweetening ingredient = $ingredient")
    //    }

    //    /**3. Create a numeric range from 0 to 10 but increment with multiples of 2****/
    //    println("\nStep 3: Create a numeric range from 0 to 10 but increment with multiples of 2")
    //    for(from0To10By2 <- 0 until 10 by 2)
    //    println(s"Range from 0 to 10 with multiples of 2 = $from0To10By2")
    //
    //

    //    /**Alphabets Range**************/
    //    for ( alphabetRangeFromAToZ <- 's' to 'v')
    //    println(s"Range of alphabets from a to z = $alphabetRangeFromAToZ")

    //      /**Character ranges with user specified increment**********/
    //
    //        println(s"\nStep 5: Character ranges with user specified increment")
    //        for( alphabetRangeFromAToZBy2 <- 'a' to 'z' by 4)
    //        println(s"Range of every other alphabet = " +alphabetRangeFromAToZBy2)
    //

    //    /** **Convert the Scala Range into collections ********/
    //    println("\nStep 6: Storing our ranges into collections")
    //    val listFrom1To5 = (1 to 5).toList
    //    println(s"Range to list = ${listFrom1To5.mkString(" ")}")
    //
    //    val setFrom1To5 = (1 to 5).toSet
    //    println(s"Range to set = ${setFrom1To5.mkString(" ")}")
    //
    //    val sequenceFrom1To5 = (1 to 5).toSeq
    //    println(s"Range to sequence = ${sequenceFrom1To5.mkString(" ")}")
    //
    //    val arrayFrom1To5 = (1 to 5).toArray
    //    println(s"Range to array = `${arrayFrom1To5.mkString(" ")}")

    /** *************************************************************
      * ***************************************************************
      * ******************PATTERN MATCHING*****************************
      * ***************************************************************/

    //    //Pattern matching and return the result
    //    println("\nStep 2: Pattern matching and return the result")
    //    val donutType = "Glazed Donut"
    //    val tasteLevel = donutType match {
    //      case "Glazed Donut" => "Very tasty"
    //      case "Plain Donut" => "Tasty"
    //    }
    //    println(s"Taste level of $donutType = $tasteLevel")

    //    /**Pattern matching using the wildcard operator*********/
    //
    //    println("\nStep 3: Pattern matching using the wildcard operator")
    //    val donutType = "Donut"
    //    val tasteLevel2 = donutType match {
    //      case "Glazed Donut" => "Very tasty"
    //      case "Plain Donut" => "Tasty"
    //      case _ => "Sweet"
    //    }
    //    println(s"Taste level of $donutType = $tasteLevel2")

    ///**4. Pattern matching with two or more items on the same condition***********/
    //    println("\nStep 4: Pattern matching with two or more items on the same condition")
    //    val donutType = "Strawberry Donut"
    //    val tasteLevel3 = donutType match {
    //      case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
    //      case "Plain Donut" => "Tasty"
    //      case _ => "Tasty"
    //    }
    //    println(s"Taste level of $donutType = $tasteLevel3")

    ///**Pattern matching and using if expressions in the case clause*********/
    //    val donutType = "Glazed Donut"
    //    println("\n 5;  matching and using if expressions in the case clause")
    //    val tasteLevel4 = donutType match {
    //      case donut if (donut.contains("Glazed") || donut.contains("Plain")) => "It's a Donut, and it's Tasty"
    //      case _  => println(s"It's not a Donut, Its $donutType")
    //    }
    //    println(s"Taste level of $donutType = $tasteLevel4")


    /** PATTERN MATCHING BY TYPES ***************/
    println("\nStep 6: Pattern matching by types")
    val priceOfDonut: Any = 2
    val priceType = priceOfDonut match {
      case price: Int => "Int"
      case price: Double => "Double"
      case price: Float => "Float"
      case price: String => "String"
      case price: Boolean => "Boolean"
      case price: Char => "Char"
      case price: Long => "Long"
    }
    println(s"Donut price type = $priceType")


  }
}
