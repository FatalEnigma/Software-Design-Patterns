package lab9_flyweight;

import java.awt.Color;
import java.awt.font.LineMetrics;
import java.util.HashMap;
import java.util.Map;

public class LineFactory {
	
	private static Map<Color, Line> lineMap = new HashMap<Color, Line>();
	
	public static Line getLine(Color colour) {
		Line line = lineMap.get(colour);

		if (line == null) {
			line = new Line(colour);
			lineMap.put(colour, line);
			System.out.println("Creating " + colour + " line");
		}
		return line;
	}

}