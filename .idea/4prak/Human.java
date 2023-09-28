public class Human {
    private String  Head;
    private String Leg;
    private String Hand;
    public Human(String Head, String Leg, String Hand) {
        this.Head = Head;
        this.Leg = Leg;
        this.Hand = Hand;
    }
    public Human(String n){
        Head = n;
        Leg = n;
        Hand = n;
    }
    public Human(){
        Head = "big";
        Leg = "right";
        Hand = "left";
    }

    public String getHead() {
        return Head;
    }

    public void setHead(String Head) {
        this.Head = Head;
    }

    public String getLeg() {
        return Leg;
    }

    public void setLeg(String Leg) {
        this.Leg = Leg;
    }
    public String getHand() {
        return Hand;
    }

    public void setHand(String Hand) {
        this.Hand = Hand;
    }

    public String toString() {
        return "Head: " + this.Head + ", Leg: " + this.Leg + ", Hand: " + this.Hand;
    }
}
