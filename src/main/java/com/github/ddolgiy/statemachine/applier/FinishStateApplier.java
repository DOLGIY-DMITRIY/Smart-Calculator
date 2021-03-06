package com.github.ddolgiy.statemachine.applier;

import com.github.ddolgiy.exception.UnexpectedSymbolException;
import com.github.ddolgiy.expressionhandler.Handler;
import com.github.ddolgiy.expressionhandler.expression.Expression;
import com.github.ddolgiy.statemachine.state.State;

public class FinishStateApplier extends StateApplier {
    public FinishStateApplier() {
        super(new String[]{});
    }

    @Override
    public State apply(Expression expression, Handler handler) throws UnexpectedSymbolException {

        if (!expression.isNotEnd()) {
            return State.FINISH;
        }
        return null;
    }
}
