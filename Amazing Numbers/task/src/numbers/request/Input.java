package numbers.request;

import java.math.BigInteger;
import java.util.Objects;

public class Input {
    BigInteger number;
    int noOfNum;

    public Input(BigInteger number, int noOfNum) {
        this.number = number;
        this.noOfNum = noOfNum;
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

    @Override
    public String toString() {
        return "Input{" +
                "number=" + number +
                ", noOfNum=" + noOfNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Input input = (Input) o;
        return noOfNum == input.noOfNum && number.equals(input.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, noOfNum);
    }
}
