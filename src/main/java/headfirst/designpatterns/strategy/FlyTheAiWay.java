/*
 * © 2021 iteratec GmbH
 *
 * This file is distributed under the 3-clause BSD license.
 * See file LICENSE.md for details.
 */
package headfirst.designpatterns.strategy;

public class FlyTheAiWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("My Code is fly");
    }
}
