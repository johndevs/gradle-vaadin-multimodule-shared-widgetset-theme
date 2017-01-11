package com.example.myapp;

import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.Label;
import com.vaadin.annotations.Theme;

@Theme("Myapp")
@Widgetset("com.example.MyWidgetset")
public class MyappUI extends UI{
	
	@Override
	protected void init(VaadinRequest request){
		Label lbl = new Label("Hello vaadin");
		setContent(lbl);
	}
}
