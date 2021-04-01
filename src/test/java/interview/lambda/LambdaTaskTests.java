package interview.lambda;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class LambdaTaskTests {

	private final LambdaTask task = new LambdaTask();

	@Test
	void getWidgetsByColour() {

		final List<Widget> widgets = task.getWidgetsByColour("red");

		assertNotNull(widgets);
		assertEquals(2, widgets.size());

	}

	@Test
	void getAlphabeticUniqueWidgetNames() {

		final List<String> names = task.getAlphabeticUniqueWidgetNames();

		assertNotNull(names);
		assertEquals(List.of("hammer", "nail", "screw", "spanner"), names);

	}

	@Test
	void getWidgetWeightsByColour() {

		final Map<String, Double> weights = task.getTotalWeightByColour();
		assertNotNull(weights);
		assertEquals(6.6d, weights.get("blue"), 0.0001);
		assertEquals(11.9d, weights.get("green"), 0.0001);
		assertEquals(10.3d, weights.get("red"), 0.0001);

	}

	@Test
	void getHeaviestWidget() {
		final Widget heaviest = task.getHeaviestWidget();
		assertNotNull(heaviest);
		assertEquals("spanner", heaviest.getName());
	}
}
