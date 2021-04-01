package interview.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LambdaTask {

	private final List<Widget> widgets;

	public LambdaTask() {
		widgets = new ArrayList<>();
		widgets.add(new Widget("hammer", "red", 10));
		widgets.add(new Widget("spanner", "blue", 5.6));
		widgets.add(new Widget("spanner", "green", 11.9));
		widgets.add(new Widget("nail", "blue", 1));
		widgets.add(new Widget("screw", "red", 0.3));
	}

	public List<Widget> getWidgetsByColour(String colour) {
		// TODO
		return List.of();
	}

	public List<String> getAlphabeticUniqueWidgetNames() {
		// TODO
		return List.of();
	}

	public Map<String, Double> getTotalWeightByColour() {
		// TODO
		return Map.of();
	}

	public Widget getHeaviestWidget() {
		// TODO
		return null;
	}

}
