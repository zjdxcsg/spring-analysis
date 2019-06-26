package csg;

public abstract class AbstractStandard {

    public static final String B = "222";

    private String a;

    public AbstractStandard(String a) {
        this.a = a;
        say("this is from abstract.");
    }

    public AbstractStandard() {
    }

    protected void say(String str) {}

    public void talk() {
        System.out.println("talk from abstract");
    }
}
