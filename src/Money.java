public class Money {

    public int amount;

    public Money(){
        this.amount = 1000;
    }


    public void setAmount(int amount){
        if(this.amount<0)
            this.amount=0;
        else
            this.amount+=amount;
    }

    public int getAmount(){
        return this.amount;
    }
    }

