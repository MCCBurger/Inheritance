import java.text.DecimalFormat

class Residential constructor(
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double,
    senior: Boolean
) : Customer(customerName, customerPhone, customerAddress, squareFootage) {
    //Declare and initialize variables specific to a residential customer
    private var senior = false
    private var weeklyRate = ""
    private var residentialRate: Double = 0.0
    private val currency = DecimalFormat("\$###,###,###,###.00")

    init {
        println("Creating a new Residential Customer..........DONE")
        this.senior = senior
    }

    //Calculate weekly charges based on variables and parameters and print all by calling the customer class printAll()
    //and then adding residential specific information
    fun weeklyCharges() {

        residentialRate = (squareFootage / 1000) * 6
        weeklyRate = currency.format(residentialRate)

        if (senior) {
            residentialRate -= (residentialRate * .15)
            weeklyRate = currency.format(residentialRate)
        }
        super.printAll()
        println("Senior: $senior \nWeekly Charges: $weeklyRate")
    }
}