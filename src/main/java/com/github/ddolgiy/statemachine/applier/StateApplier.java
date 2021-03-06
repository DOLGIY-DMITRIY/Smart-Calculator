package com.github.ddolgiy.statemachine.applier;

import com.github.ddolgiy.exception.UnexpectedSymbolException;
import com.github.ddolgiy.expressionhandler.Handler;
import com.github.ddolgiy.expressionhandler.expression.Expression;
import com.github.ddolgiy.statemachine.state.State;

abstract public class StateApplier {

    protected String[] characters;
    protected String function;

    public StateApplier(String[] characters){
        this.characters = characters;
    }

    public StateApplier(String function){
        this.function = function;
    }

    public abstract State apply(Expression expression, Handler handler) throws UnexpectedSymbolException;

    public boolean contains(String character){
        for (String c : characters){
            if (c.equals(character)){
                return true;
            }
        }
        return false;
    }
}
