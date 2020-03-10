package MonsterInfo;

import java.util.Map;

public class Monster {
	
	private String name;
	private Map<String, Map<String, Double>> bodyPartResistance;
	private Map<String, Double> elementalResistance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Map<String, Double>> getBodyPartResistance() {
		return bodyPartResistance;
	}
	public void setBodyPartResistance(Map<String, Map<String, Double>> bodyPartResistance) {
		this.bodyPartResistance = bodyPartResistance;
	}
	public Map<String, Double> getElementalResistance() {
		return elementalResistance;
	}
	public void setElementalResistance(Map<String, Double> elementalResistance) {
		this.elementalResistance = elementalResistance;
	}
	
}
