/**
 * Created by Valentin on 08.03.2018.
 */
public class Transaction {


    String transmitter;
    String resiver;
    Long sum;


    public Transaction(String transmitter, String resiver, Long sum) {
        this.transmitter = transmitter;
        this.resiver = resiver;
        this.sum = sum;
    }

    public String getTransmitter() {
        return transmitter;
    }

    public void setTransmitter(String transmitter) {
        this.transmitter = transmitter;
    }

    public String getResiver() {
        return resiver;
    }

    public void setResiver(String resiver) {
        this.resiver = resiver;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    @Override
    public int hashCode() {
        int result = transmitter != null ? transmitter.hashCode() : 0;
        result = 31 * result + (resiver != null ? resiver.hashCode() : 0);
        result = 31 * result + (sum!=null ? sum.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (transmitter != null ? !transmitter.equals(that.transmitter) : that.transmitter != null) return false;
        if (resiver != null ? !resiver.equals(that.resiver) : that.resiver != null)
            return false;
        return sum != null ? sum.equals(that.sum) : that.sum == null;
    }
}
