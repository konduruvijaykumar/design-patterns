/**
 * 
 */
package org.pjay.designpatterns.strategy.example1;

/**
 * @author Vijay
 *
 */
public class OperationSubstract implements OperationStrategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}