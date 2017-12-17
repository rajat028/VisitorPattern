package com.rajat.visitorpattern.basicExample;

import android.util.Log;

/**
 * Created by rajat028 on 17/12/17.
 */

public class HealthSpecailist implements Visitor {

    private String mName;

    public HealthSpecailist(String mName) {
        this.mName = mName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public void visit(Visitable mVisitable) {
        Child child= (Child) mVisitable;
        Log.d("Output is : ",child.getChildName()+" is examined by "+ mName+" and the health condition is "+child.getmHealthCondition());

    }
}
