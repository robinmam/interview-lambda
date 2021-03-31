package interview.lambda;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class LambdaTasTests {

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

		final Map<String, Double> wieghts = task.getWidgetWeightsByColour();
		assertNotNull(wieghts);
		assertEquals(6.6d, wieghts.get("blue"), 0.0001);
		assertEquals(11.9d, wieghts.get("green"), 0.0001);
		assertEquals(10.3d, wieghts.get("red"), 0.0001);

	}

	@Test
	void getHeaviestWidget() {
		final Widget heaviest = task.getHeaviestWidget();
		assertNotNull(heaviest);
		assertEquals("spanner", heaviest.getName());
	}
}
