package fil.iagl.opl.rendu.two.insert.impl;

import fil.iagl.opl.rendu.two.insert.Insertion;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtTry;
import spoon.reflect.declaration.CtElement;

public class TryInsert implements Insertion {

  @Override
  public boolean match(CtElement element) {
    return element instanceof CtTry;
  }

  @Override
  public void apply(CtElement element, CtStatement statementToInsert) {
    CtTry ctTry = (CtTry) element;
    statementToInsert.setParent(ctTry.getBody());
    ctTry.getBody().getStatements().add(0, statementToInsert);
  }

}