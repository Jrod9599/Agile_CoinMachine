package com;

public class CoinBox {

    private int numQ = 0;
    private int numD = 0;
    private int numN = 0;

    private double totalValue = 0;

    public CoinBox(){}

    public void insertCoin(Coin coin){
        totalValue += coin.getCoinValue();
        if(coin.getCoinValue() == Coin.getQUARTER()){
            numQ++;
        }
        else if(coin.getCoinValue() == Coin.getDIME()){
            numD++;
        }
        else if(coin.getCoinValue() == Coin.getNICKEL()){
            numN++;
        }
    }

    public int getNumQ() {
        return numQ;
    }

    public int getNumD() {
        return numD;
    }

    public int getNumN() {
        return numN;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setNumQ(int numQ) {
        this.numQ = numQ;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }

    public void setNumN(int numN) {
        this.numN = numN;
    }
    public String getIndividualCoincounts() {
        String IndividualCoincounts= (numQ+"number of quarters"+numD+"number of Dimes"+numN+"number of nickels");
        return  IndividualCoincounts;}





}
