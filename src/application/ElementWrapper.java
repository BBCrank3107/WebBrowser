package application;

import javafx.geometry.Insets;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ElementWrapper
{
	private Map<String, Object> css = new HashMap<>();
	private Element element;
	private ElementWrapper parent;

	public ElementWrapper(Element element, ElementWrapper parent)
	{
		this.element = element;
		this.parent = parent;
	}

	public Element getElement()
	{
		return element;
	}

	public Map<String, Object> getCSSParsed()
	{
		Map<String, Object> returnCSS = new HashMap<>();
		//TODO: Inherited css
		/*if(parent == null)
			returnCSS = new HashMap<>();
		else
			returnCSS = parent.getCSS();*/

		for(Map.Entry<String, Object> defaultCSS : CSSManager.getTagDefaultCSS(element.tagName()).entrySet())
			if(!returnCSS.containsKey(defaultCSS.getKey()))
				returnCSS.put(defaultCSS.getKey(), defaultCSS.getValue());

		returnCSS = CSSManager.cleanCSS(returnCSS);
		returnCSS.putAll(CSSManager.cleanCSS(css));
		return returnCSS;
	}

}
