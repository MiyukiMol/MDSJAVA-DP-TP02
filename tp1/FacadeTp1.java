package com.tactfactory.designpatternniveau1.facade.tp1;

import com.tactfactory.designpatternniveau1.facade.tp1.ShapeMaker;
/**
*
* @author tactfactory
*
* - Sans modifier le point d'entr�e de l'application cr�er les classes n�cessaire pour que le programme
*     affiche en sortie :
*         Circle::draw()
*         Rectangle::draw()
*         Square::draw()
*         Circle::draw()
*         Circle::draw()
* - Vous devez r�soudre cet exercice � l'aide du design pattern "Facade"
* - Vous devez cr�er les classes Rectangle, Square et Circle comme �tant des Shape
*/
public class FacadeTp1 {
  public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();

    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();

    //Derive from facade use
    ShapeMaker maker = new ShapeMaker(ShapeMaker.CIRCLE);
    maker.draw();

    //Derive from facade use
    ShapeMaker maker1 = new ShapeMaker();
    maker1.draw(ShapeMaker.CIRCLE);
  }
}
