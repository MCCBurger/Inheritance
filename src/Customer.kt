open class Customer constructor(
    customerName: String,
    customerPhone: String,
    customerAddress: String,
    squareFootage: Double
) {
    //Declare and initialize customer info variables that all customers will have
    private var customerName: String = ""
    private var customerAddress: String = ""
    private var customerPhone: String = ""
    protected var squareFootage: Double = 0.0

    init {
        println("Creating Initial Customer..........DONE")
        this.customerName = customerName
        this.customerAddress = customerAddress
        this.customerPhone = customerPhone
        this.squareFootage = squareFootage
    }

    //Print all function to print basic customer information
    fun printAll() {
        println("Customer: $customerName \nAddress: $customerAddress \nPhone: $customerPhone \nSquare Footage: $squareFootage")
    }

}