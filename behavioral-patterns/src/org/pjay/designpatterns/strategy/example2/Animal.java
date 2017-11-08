/**
 * 
 */
package org.pjay.designpatterns.strategy.example2;

/**
 * @author Vijay
 *
 */
public abstract class Animal {

	private Integer weight;
	private String name;
	private Fly flyingType;
	
	public String tryToFly(){
		if(null != flyingType){
			return flyingType.fly();
		}else{
			return "I am not sure if i can fly";
		}
	}
	public Fly getFlyingType() {
		return flyingType;
	}
	public void setFlyingType(Fly flyingType) {
		this.flyingType = flyingType;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// This can increase duplication for overriding this method in all animals objects we create and define its behaviour.
	// This can be solved by following Strategy Pattern, which is done in this example.
	// public abstract String fly();
	
}
