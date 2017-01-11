package com.example.myapp;

import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.annotations.Theme;
import com.example.MyLabel;

@Theme("Myapp")
@Widgetset("com.example.MyWidgetset")
public class MyappUI extends UI{
	
	@Override
	protected void init(VaadinRequest request){
		MyLabel lbl = new MyLabel();
		setContent(lbl);
	}
}
