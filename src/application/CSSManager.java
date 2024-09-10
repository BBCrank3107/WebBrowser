package application;

import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.util.HashMap;
import java.util.Map;

public class CSSManager
{
	public static final Map<String, Object> CSS_DEFAULTS = new HashMap<>();
	public static final Map<String, Map<String, Object>> TAG_CSS_DEFAULTS = new HashMap<>();

	static
	{
		CSS_DEFAULTS.put("color", "black");
		CSS_DEFAULTS.put("font-size", "medium");
		CSS_DEFAULTS.put("height", "auto");
		CSS_DEFAULTS.put("margin", "0");
		CSS_DEFAULTS.put("margin-top", "0");
		CSS_DEFAULTS.put("margin-bottom", "0");
		CSS_DEFAULTS.put("margin-left", "0");
		CSS_DEFAULTS.put("margin-right", "0");
		CSS_DEFAULTS.put("max-height", "none");
		CSS_DEFAULTS.put("max-width", "none");
		CSS_DEFAULTS.put("min-height", "0");
		CSS_DEFAULTS.put("min-width", "0");
		CSS_DEFAULTS.put("width", "auto");

		Map<String, Object> values = new HashMap<>();

		values.put("color", "blue");
		values.put("text-decoration", "underline");
		values.put("cursor", "auto");
		TAG_CSS_DEFAULTS.put("a", values);
		TAG_CSS_DEFAULTS.put("a:link", values);

		values = new HashMap<>();
		values.put("color", "purple");
		values.put("text-decoration", "underline");
		values.put("cursor", "auto");
		TAG_CSS_DEFAULTS.put("a:visited", values);

		values = new HashMap<>();
		values.put("color", "dark-blue");
		TAG_CSS_DEFAULTS.put("a:link:active", values);

		values = new HashMap<>();
		values.put("color", "dark-purple");
		TAG_CSS_DEFAULTS.put("a:visited:active", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("font-style", "italic");
		TAG_CSS_DEFAULTS.put("address", values);

		values = new HashMap<>();
		values.put("display", "none");
		TAG_CSS_DEFAULTS.put("area", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("article", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("aside", values);

		values = new HashMap<>();
		values.put("font-weight", "bold");
		TAG_CSS_DEFAULTS.put("b", values);

		values = new HashMap<>();
		values.put("unicode-bidi", "bidi-override");
		TAG_CSS_DEFAULTS.put("bdo", values);

		values = new HashMap<>();
		values.put("display", "bid");
		values.put("margin-top", "1em");
		values.put("margin-bottom", "1em");
		values.put("margin-left", "40px");
		values.put("margin-right", "40px");
		TAG_CSS_DEFAULTS.put("blockquote", values);

		values = new HashMap<>();
		values.put("display", "bid");
		values.put("margin", "8px");
		TAG_CSS_DEFAULTS.put("body", values);

		values = new HashMap<>();
		values.put("outline", "none");
		TAG_CSS_DEFAULTS.put("body:focus", values);

		values = new HashMap<>();
		values.put("display", "table-caption");
		values.put("text-align", "center");
		TAG_CSS_DEFAULTS.put("caption", values);

		values = new HashMap<>();
		values.put("font-style", "italic");
		TAG_CSS_DEFAULTS.put("cite", values);

		values = new HashMap<>();
		values.put("font-family", "monospace");
		TAG_CSS_DEFAULTS.put("code", values);

		values = new HashMap<>();
		values.put("display", "table-column");
		TAG_CSS_DEFAULTS.put("col", values);

		values = new HashMap<>();
		values.put("display", "none");
		TAG_CSS_DEFAULTS.put("datalist", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("margin-left", "40px");
		TAG_CSS_DEFAULTS.put("dd", values);

		values = new HashMap<>();
		values.put("text-decoration", "line-through");
		TAG_CSS_DEFAULTS.put("del", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("details", values);

		values = new HashMap<>();
		values.put("font-style", "italic");
		TAG_CSS_DEFAULTS.put("dfn", values);

		values = new HashMap<>();
		values.put("font-style", "italic");
		TAG_CSS_DEFAULTS.put("dfn", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("div", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("margin-top", "1em");
		values.put("margin-bottom", "1em");
		values.put("margin-left", "0");
		values.put("margin-right", "0");
		TAG_CSS_DEFAULTS.put("dl", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("dt", values);

		values = new HashMap<>();
		values.put("font-style", "italic");
		TAG_CSS_DEFAULTS.put("em", values);

		values = new HashMap<>();
		values.put("outline", "none");
		TAG_CSS_DEFAULTS.put("embed:focus", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("margin-left", "2px");
		values.put("margin-right", "2px");
		values.put("padding-top", "0.35em");
		values.put("padding-bottom", "0.625em");
		values.put("padding-left", "0.75em");
		values.put("padding-right", "0.75em");
		values.put("border", "2px groove black");
		TAG_CSS_DEFAULTS.put("fieldset", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("figcaption", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("margin-top", "1em");
		values.put("margin-bottom", "1em");
		values.put("margin-left", "40px");
		values.put("margin-right", "40px");
		TAG_CSS_DEFAULTS.put("figure", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("footer", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("margin-top", "0em");
		TAG_CSS_DEFAULTS.put("form", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("font-size", "2em");
		values.put("margin-top", "0.67em");
		values.put("margin-bottom", "0.67em");
		values.put("margin-left", "0");
		values.put("margin-right", "0");
		values.put("font-weight", "bold");
		TAG_CSS_DEFAULTS.put("h1", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("font-size", "1.5em");
		values.put("margin-top", "0.83em");
		values.put("margin-bottom", "0.83em");
		values.put("margin-left", "0");
		values.put("margin-right", "0");
		values.put("font-weight", "bold");
		TAG_CSS_DEFAULTS.put("h2", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("font-size", "1.17em");
		values.put("margin-top", "1em");
		values.put("margin-bottom", "1em");
		values.put("margin-left", "0");
		values.put("margin-right", "0");
		values.put("font-weight", "bold");
		TAG_CSS_DEFAULTS.put("h3", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("margin-top", "1.33em");
		values.put("margin-bottom", "1.33em");
		values.put("margin-left", "0");
		values.put("margin-right", "0");
		values.put("font-weight", "bold");
		TAG_CSS_DEFAULTS.put("h4", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("font-size", "0.83em");
		values.put("margin-top", "1.67em");
		values.put("margin-bottom", "1.67em");
		values.put("margin-left", "0");
		values.put("margin-right", "0");
		values.put("font-weight", "bold");
		TAG_CSS_DEFAULTS.put("h5", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("font-size", "0.67em");
		values.put("margin-top", "2.33em");
		values.put("margin-bottom", "2.33em");
		values.put("margin-left", "0");
		values.put("margin-right", "0");
		values.put("font-weight", "bold");
		TAG_CSS_DEFAULTS.put("h6", values);

		values = new HashMap<>();
		values.put("display", "none");
		TAG_CSS_DEFAULTS.put("head", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("header", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("margin-top", "0.5em");
		values.put("margin-bottom", "0.5em");
		values.put("margin-left", "auto");
		values.put("margin-right", "auto");
		values.put("border-style", "inset");
		values.put("border-width", "1px");
		TAG_CSS_DEFAULTS.put("hr", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("html", values);

		values = new HashMap<>();
		values.put("outline", "none");
		TAG_CSS_DEFAULTS.put("html:focus", values);

		values = new HashMap<>();
		values.put("font-style", "italic");
		TAG_CSS_DEFAULTS.put("i", values);

		values = new HashMap<>();
		values.put("outline", "none");
		TAG_CSS_DEFAULTS.put("iframe:focus", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("iframe[seamless]", values);

		values = new HashMap<>();
		values.put("display", "inline-block");
		TAG_CSS_DEFAULTS.put("img", values);

		values = new HashMap<>();
		values.put("text-decoration", "underline");
		TAG_CSS_DEFAULTS.put("ins", values);

		values = new HashMap<>();
		values.put("font-family", "monospace");
		TAG_CSS_DEFAULTS.put("kbd", values);

		values = new HashMap<>();
		values.put("cursor", "default");
		TAG_CSS_DEFAULTS.put("label", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("padding-left", "2px");
		values.put("padding-right", "2px");
		values.put("border", "none");
		TAG_CSS_DEFAULTS.put("legend", values);

		values = new HashMap<>();
		values.put("display", "list-item");
		TAG_CSS_DEFAULTS.put("li", values);

		values = new HashMap<>();
		values.put("display", "none");
		TAG_CSS_DEFAULTS.put("link", values);

		values = new HashMap<>();
		values.put("display", "inline");
		TAG_CSS_DEFAULTS.put("map", values);

		values = new HashMap<>();
		values.put("background-color", "yellow");
		values.put("color", "black");
		TAG_CSS_DEFAULTS.put("color", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("list-style-type", "disc");
		values.put("margin-top", "1em");
		values.put("margin-bottom", "1em");
		values.put("margin-left", "0");
		values.put("margin-right", "0");
		values.put("padding-left", "40px");
		TAG_CSS_DEFAULTS.put("menu", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("nav", values);

		values = new HashMap<>();
		values.put("outline", "none");
		TAG_CSS_DEFAULTS.put("object:focus", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("list-style-type", "decimal");
		values.put("margin-top", "1em");
		values.put("margin-bottom", "1em");
		values.put("margin-left", "0");
		values.put("margin-right", "0");
		values.put("padding-left", "40px");
		TAG_CSS_DEFAULTS.put("ol", values);

		values = new HashMap<>();
		values.put("display", "inline");
		TAG_CSS_DEFAULTS.put("output", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("margin-top", "1em");
		values.put("margin-bottom", "1em");
		values.put("margin-left", "0");
		values.put("margin-right", "0");
		TAG_CSS_DEFAULTS.put("p", values);

		values = new HashMap<>();
		values.put("display", "none");
		TAG_CSS_DEFAULTS.put("param", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("font-family", "monospace");
		values.put("white-space", "pre");
		values.put("margin", "1em 0");
		TAG_CSS_DEFAULTS.put("param", values);

		values = new HashMap<>();
		values.put("display", "inline");
		TAG_CSS_DEFAULTS.put("q", values);

		values = new HashMap<>();
		values.put("content", "open-quote");
		TAG_CSS_DEFAULTS.put("q::before", values);

		values = new HashMap<>();
		values.put("content", "close-quote");
		TAG_CSS_DEFAULTS.put("q::after", values);

		values = new HashMap<>();
		values.put("line-height", "normal");
		TAG_CSS_DEFAULTS.put("rt", values);

		values = new HashMap<>();
		values.put("text-decoration", "line-through");
		TAG_CSS_DEFAULTS.put("s", values);

		values = new HashMap<>();
		values.put("font-family", "monospace");
		TAG_CSS_DEFAULTS.put("samp", values);

		values = new HashMap<>();
		values.put("display", "none");
		TAG_CSS_DEFAULTS.put("script", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("section", values);

		values = new HashMap<>();
		values.put("font-size", "smaller");
		TAG_CSS_DEFAULTS.put("small", values);

		values = new HashMap<>();
		values.put("text-decoration", "line-through");
		TAG_CSS_DEFAULTS.put("strike", values);

		values = new HashMap<>();
		values.put("font-weight", "bold");
		TAG_CSS_DEFAULTS.put("strong", values);

		values = new HashMap<>();
		values.put("display", "none");
		TAG_CSS_DEFAULTS.put("style", values);

		values = new HashMap<>();
		values.put("vertical-align", "sub");
		values.put("font-size", "smaller");
		TAG_CSS_DEFAULTS.put("sub", values);

		values = new HashMap<>();
		values.put("display", "block");
		TAG_CSS_DEFAULTS.put("summary", values);

		values = new HashMap<>();
		values.put("vertical-align", "super");
		values.put("font-size", "smaller");
		TAG_CSS_DEFAULTS.put("sup", values);

		values = new HashMap<>();
		values.put("display", "table");
		values.put("foborder-collapse", "separate");
		values.put("border-spacing", "2px");
		values.put("border-color", "gray");
		TAG_CSS_DEFAULTS.put("table", values);

		values = new HashMap<>();
		values.put("display", "table-row-group");
		values.put("vertical-align", "middle");
		values.put("border-color", "inherit");
		TAG_CSS_DEFAULTS.put("tbody", values);

		values = new HashMap<>();
		values.put("display", "table-cell");
		values.put("vertical-align", "inherit");
		TAG_CSS_DEFAULTS.put("td", values);

		values = new HashMap<>();
		values.put("display", "table-footer-group");
		values.put("vertical-align", "middle");
		values.put("border-color", "inherit");
		TAG_CSS_DEFAULTS.put("tfoot", values);

		values = new HashMap<>();
		values.put("display", "table-cell");
		values.put("vertical-align", "inherit");
		values.put("font-weight", "bold");
		values.put("text-align", "center");
		TAG_CSS_DEFAULTS.put("th", values);

		values = new HashMap<>();
		values.put("display", "table-header-group");
		values.put("vertical-align", "middle");
		values.put("border-color", "inherit");
		TAG_CSS_DEFAULTS.put("thead", values);

		values = new HashMap<>();
		values.put("display", "none");
		TAG_CSS_DEFAULTS.put("title", values);

		values = new HashMap<>();
		values.put("display", "table-row");
		values.put("vertical-align", "inherit");
		values.put("border-color", "inherit");
		TAG_CSS_DEFAULTS.put("tr", values);

		values = new HashMap<>();
		values.put("text-decoration", "underline");
		TAG_CSS_DEFAULTS.put("u", values);

		values = new HashMap<>();
		values.put("display", "block");
		values.put("list-style-type", "disc");
		values.put("margin-top", "1em");
		values.put("margin-bottom", "1em");
		values.put("margin-left", "0");
		values.put("margin-right", "0");
		values.put("padding-left", "40px");
		TAG_CSS_DEFAULTS.put("ul", values);

		values = new HashMap<>();
		values.put("font-style", "italic");
		TAG_CSS_DEFAULTS.put("var", values);
	}

	public static Map<String, Object> getTagDefaultCSS(String tag)
	{
		return TAG_CSS_DEFAULTS.getOrDefault(tag, new HashMap<>());
	}

	public static Insets computeMargin(Map<String, Object> css)
	{
		double top = parseValue(css.getOrDefault("margin-top", 0), 0);
		double bottom = parseValue(css.getOrDefault("margin-bottom", 0), 0);
		double left = parseValue(css.getOrDefault("margin-left", 0), 0);
		double right = parseValue(css.getOrDefault("margin-right", 0), 0);

		return new Insets(top, right, bottom, left);
	}

	public static Font computeFont(Map<String, Object> css)
	{
		String style = parseString(css.getOrDefault("font-style", "regular"), "regular");
		//double variant = parseValue(css.getOrDefault("margin-bottom", 0), 0);
		String weight = parseString(css.getOrDefault("font-weight", "normal"), "normal");
		double size = parseValue(css.getOrDefault("font-size", 16), 16);
		String family = parseString(css.getOrDefault("font-family", "Times New Roman"), "Times New Roman");
		return Font.font(family, FontWeight.findByName(weight), FontPosture.findByName(style), size);
	}

	public static Insets parseMargin(Object marginObj)
	{
		if(marginObj instanceof String)
		{
			String[] parts = ((String) marginObj).split(" ");
			if(parts.length == 1)
				return new Insets(parseValue(parts[0], 0));
			else if(parts.length == 2)
				return new Insets(parseValue(parts[0], 0), parseValue(parts[1], 0), parseValue(parts[0], 0), parseValue(parts[1], 0));
			else if(parts.length == 3)
				return new Insets(parseValue(parts[0], 0), parseValue(parts[1], 0), parseValue(parts[2], 0), parseValue(parts[1], 0));
			else if(parts.length == 4)
				return new Insets(parseValue(parts[0], 0), parseValue(parts[1], 0), parseValue(parts[2], 0), parseValue(parts[3], 0));
		}
		return new Insets(0, 0, 0, 0);
	}

	public static String parseString(Object value, String defaultVal)
	{
		if(value instanceof String)
			return (String) value;
		return defaultVal;
	}

	public static double parseValue(Object value, double defaultVal)
	{
		//TODO: Check other types?
		if(value instanceof Double)
			return (Double) value;
		if(value instanceof String)
			return parseValue((String) value, defaultVal);
		return defaultVal;
	}

	public static double parseValue(String value, double defaultVal)
	{
		if(value.contains("px"))
			return Double.parseDouble(value.replace("px", ""));
		else if(value.contains("em"))
			return 16 * Double.parseDouble(value.replace("em", ""));
		//TODO: Rest and not use 16 for em
		return defaultVal;
	}

	public static Map<String, Object> cleanCSS(Map<String, Object> css)
	{
		Map<String, Object> returnCSS = new HashMap<>(css);

		if(returnCSS.containsKey("margin"))
		{
			returnCSS.remove("margin");
			Insets margin = CSSManager.parseMargin(css.get("margin"));
			returnCSS.put("margin-top", margin.getTop());
			returnCSS.put("margin-bottom", margin.getBottom());
			returnCSS.put("margin-left", margin.getLeft());
			returnCSS.put("margin-right", margin.getRight());
		}

		//TODO: Font clean

		//TODO: Make dynamic based on "writing-mode" https://developer.mozilla.org/en-US/docs/Web/CSS/margin-block-start
		if(returnCSS.containsKey("margin-block-start"))
		{
			returnCSS.remove("margin-block-start");
			returnCSS.put("margin-top", CSSManager.parseValue(returnCSS.get("margin-block-start"), 0));
		}

		if(returnCSS.containsKey("margin-block-end"))
		{
			returnCSS.remove("margin-block-end");
			returnCSS.put("margin-bottom", CSSManager.parseValue(returnCSS.get("margin-block-end"), 0));
		}

		if(returnCSS.containsKey("margin-inline-start"))
		{
			returnCSS.remove("margin-inline-start");
			returnCSS.put("margin-left", CSSManager.parseValue(returnCSS.get("margin-inline-start"), 0));
		}

		if(returnCSS.containsKey("margin-inline-end"))
		{
			returnCSS.remove("margin-inline-end");
			returnCSS.put("margin-right", CSSManager.parseValue(returnCSS.get("margin-inline-end"), 0));
		}

		return returnCSS;
	}
}
