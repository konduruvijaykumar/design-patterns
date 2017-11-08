/**
 * 
 */
package org.pjay.designpatterns.strategy.example1;

/**
 * @author Vijay
 *
 */
public class Operation {
	private OperationStrategy operationStrategy;

	public Operation(OperationStrategy operationStrategy) {
		this.operationStrategy = operationStrategy;
	}

	public int executeStrategy(int num1, int num2) {
		return operationStrategy.doOperation(num1, num2);
	}
}