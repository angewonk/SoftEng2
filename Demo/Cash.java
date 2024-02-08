package Demo;
public class Cash implements PaymentType {
    public String calculatePayment(){
        String output = new String();
        output += "\nPayment is Cash\n";
        output += "No incentives";

        return output;

    }
}
