package com.sda.she_likes_java.polymorphism;

public class TryToOverrideFinalMethod
extends WithFinalMethod
{
    @Override
    public final void notToOverride() {

    }

    public void doSth() {
        notToOverride();
    }
}
