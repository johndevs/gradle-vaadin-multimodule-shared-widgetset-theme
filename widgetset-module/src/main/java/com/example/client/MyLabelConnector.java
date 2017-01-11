package com.example.client;

import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;
import com.example.MyLabel;

/**
 * Connects the server side component with the client side widget
 */
@Connect(MyLabel.class)
public class MyLabelConnector extends AbstractComponentConnector {

    @Override
    public MyLabelWidget getWidget() {
        return (MyLabelWidget) super.getWidget();
    }
}

