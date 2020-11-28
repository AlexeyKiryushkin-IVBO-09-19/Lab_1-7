package Lab_1_2_3;

public class Human {
    private Head head;
    private Hand hand;
    private Leg leg;
    Human (String headColor, int handLength, int legLength) {
        head = new Head(headColor);
        hand = new Hand(handLength);
        leg = new Leg(legLength);
    }

    public void setHead(String newHeadColor) {
        head = new Head(newHeadColor);
    }

    public void setHand(int newHandLength) {
        hand = new Hand(newHandLength);
    }

    public void setLeg(int newLegLength) {
       leg = new Leg(newLegLength);
    }

    public void getInfo() {
        System.out.println("Head color - " + head.getColor() + ", length of hands - " + hand.getlength() + ", length of legs - " + leg.getlength());
    }

    public String toString() {
        return ("Head color - " + head.getColor() + ", length of hands - " + hand.getlength() + ", length of legs - " + leg.getlength());
    }



}
