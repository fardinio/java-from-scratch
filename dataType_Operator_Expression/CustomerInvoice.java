public class CustomerInvoice {
    public static void main(String[] args) {

        String invoice = """
                +------------------------------------------------------------+
                |                     CUSTOMER INVOICE                       |
                +------------------------------------------------------------+
                | Invoice No : INV-1001        Date : 14-06-2026             |
                | Customer   : Md Fardin       Phone: 017XXXXXXXX            |
                | Address    : Dhaka, Bangladesh                             |
                +------------------------------------------------------------+
                | SL | Item Name        | Qty | Unit Price | Discount |Total |
                +------------------------------------------------------------+
                | 01 | Wireless Mouse   |  2  |    500     |    50    | 950  |
                | 02 | Mechanical Keybd |  1  |   2200     |   200    |2000  |
                | 03 | Headphone        |  1  |   1500     |     0    |1500  |
                | 04 | USB Cable        |  3  |    200     |     0    | 600  |
                +------------------------------------------------------------+
                | Sub Total                                      :  5050     |
                | VAT 5%                                         :   253     |
                | Delivery Charge                                :    80     |
                | Discount                                       :   250     |
                +------------------------------------------------------------+
                | GRAND TOTAL                                    :  5133     |
                +------------------------------------------------------------+
                | Payment Method : Cash                                        |
                | Payment Status : Paid                                        |
                | Served By      : Sales Executive                             |
                +------------------------------------------------------------+
                |              Thank you for shopping with us!                 |
                +------------------------------------------------------------+
                """;

        System.out.println(invoice);
    }
}