package numbers.request;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Objects;

public class Input {
    BigInteger number;
    int noOfNum;
    ArrayList<String> property;

    public Input(BigInteger number, int noOfNum, ArrayList<String> property) {
        this.number = number;
        this.noOfNum = noOfNum;
        this.property = property;
    }

    public BigInteger getNumber() {
        return number;
    }

    public void setNumber(BigInteger number) {
        this.number = number;
    }

    public int getNoOfNum() {
        return noOfNum;
    }

    public void setNoOfNum(int noOfNum) {
        this.noOfNum = noOfNum;
    }

    public ArrayList<String> getProperty() {
        return property;
    }

    public void setProperty(ArrayList<String> property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Input{" +
                "number=" + number +
                ", noOfNum=" + noOfNum +
                ", property='" + String.join(", ", property) + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Input input = (Input) o;
        return noOfNum == input.noOfNum && Objects.equals(number, input.number) && Objects.equals(property, input.property);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, noOfNum, property);
    }
}
