var name: String = ""
var phone: String = ""
var address: String = ""
var squareFeet: Double = 0.0
var seniorDiscount: Boolean = false
var multipleProperties: Boolean = false
var propertyName: String = ""

fun main() {

//Ask user which type of customer they are
    println("Are you a residential of business customer? \n 1 -> Residential \n 2 -> Business")
    print("Choice: ")
    val choice = readLine()!!.toInt()

    basicInfo()
    //Validate and run specific functions
    when (choice) {
        1 -> {
            residentInfo()
            val resident = Residential(name, phone, address, squareFeet, seniorDiscount)
            resident.weeklyCharges()
        }
        2 -> {
            commercialInfo()
            val commercial = Commercial(name, phone, address, squareFeet, propertyName, multipleProperties)
            commercial.weeklyCharges()
        }
        !in 1..2 -> println("INVALID CHOICE")
    }
}

fun basicInfo() {
    print("Please enter your name : ")
    name = readLine()!!.toString()
    print("Please enter your address: ")
    address = readLine()!!.toString()
    print("Please enter your phone number: ")
    phone = readLine()!!.toString()
    print("Please enter your square footage : ")
    squareFeet = readLine()!!.toDouble()
}

fun residentInfo() {
    seniorDiscount = false
    print("Are you a senior citizen? yes or no: ")
    val senior = readLine()!!.toString()
    if (senior.equals("yes", ignoreCase = true))
        seniorDiscount = true
}

fun commercialInfo() {
    multipleProperties = false
    print("What is the name of your property: ")
    propertyName = readLine()!!.toString()
    print("Do you have multiple properties? yes or no: ")
    val multiResult = readLine()!!.toString()
    if (multiResult.equals("yes", ignoreCase = true))
        multipleProperties = true
}