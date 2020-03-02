import java.text.DecimalFormat

class Commercial constructor(
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double,
    propertyName: String,
    multiProperty: Boolean
) : Customer(customerName, customerPhone, customerAddress, squareFootage) {

    private var propertyName: String = ""
    private var multiProperty = false
    private var commercialRate: Double = 0.0
    private var weeklyRate = ""
    private val currency = DecimalFormat("\$###,###,###,###.00")

    init {
        println("Creating a new Commercial Customer..........DONE")
        this.propertyName = propertyName
        this.multiProperty = multiProperty
    }

    fun weeklyCharges() {

        commercialRate = (squareFootage / 1000) * 5
        weeklyRate = currency.format(commercialRate)

        if (multiProperty) {
            commercialRate -= (commercialRate * .10)
            weeklyRate = currency.format(commercialRate)
        }
        super.printAll()
        println("Property Name: $propertyName \nMulti-Property: $multiProperty \nWeekly Charges: $weeklyRate")
    }

}