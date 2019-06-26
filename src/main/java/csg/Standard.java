package csg;

public class Standard extends AbstractStandard {

    private static final String A = "111";

    @Override
    protected void say (String str) {
        System.out.println("this is from standard.");
        talk();
    }


}
