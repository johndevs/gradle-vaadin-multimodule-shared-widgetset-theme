package com.example.client;

import com.google.gwt.user.client.ui.Label;

/**
 * Client side widget. Can extend any GWT widget.
 */
public class MyLabelWidget extends Label {

	// Style name used for theming
    public static final String CLASSNAME = "mylabel";

    public MyLabelWidget() {
        setStyleName(CLASSNAME);
    	setText("It works!");
    }
}