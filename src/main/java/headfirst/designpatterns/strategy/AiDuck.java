/*
 * © 2021 iteratec GmbH
 *
 * This file is distributed under the 3-clause BSD license.
 * See file LICENSE.md for details.
 */
package headfirst.designpatterns.strategy;

public class AiDuck extends Duck{
    public AiDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyTheAiWay();

    }

    public void display() {
        System.out.println("I'm an AI_duck");
    }
}
