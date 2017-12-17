package com.rajat.visitorpattern.basicExample;

/**
 * Created by rajat028 on 17/12/17.
 */

public class Child implements Visitable {

    private String childName;
    private String childHealthCondition;

    public Child(String mName, String mHealthCondition) {
        this.childName = mName;
        this.childHealthCondition = mHealthCondition;
    }

    public String getChildName() {
        return childName;
    }


    public String getmHealthCondition() {
        return childHealthCondition;
    }

    @Override
    public void accept(Visitor visitor) {
            visitor.visit(this);
    }
}
