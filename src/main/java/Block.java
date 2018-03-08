import java.util.LinkedList;
import java.util.List;

/**
 * Created by Valentin on 08.03.2018.
 */
public class Block {

    private int previousHash;
    private List<Transaction> transactions;

    public Block(int previousHash, List<Transaction> transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public int hashCode() {
        return 31*previousHash+(transactions!=null?transactions.hashCode():0);
    }

    @Override
    public boolean equals(Object o) {

        if(o==this)return true;
        if(o==null||o.getClass()!=this.getClass())return false;

        Block block=(Block) o;

        if(previousHash!=block.previousHash)return false;
        return transactions!=null?transactions.equals(block.transactions):block.transactions==null;

    }
}
