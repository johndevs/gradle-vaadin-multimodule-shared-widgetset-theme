# Shared theme and widgetset example

This project is an example of sharing the compiled widgetset and theme between multiple standalone applications in 
the project. The benefit of using this setup is that you do not have to re-compile both the theme and the widgetset 
per project, instead the widgetset is only compiled when a shared component is modified or a shared theme changed. 
This will speed up your build significantly.

The project is setup in the following way:

####theme-module
This module contains the application theme. The theme is packaged into the jar for the applications to consume.

####widgetset-module
This module contains the components you want to include in the widgetset as well as the pre-compiled widgetset. The
widgetset is included in the jar for the applications to consume.

####app1 and app2
Consumes the widgetset and theme

## Testing the project setup

To try out the project by running first the first app (./gradlew :app1:vaadinRun) and then the second 
app (./gradlew :app2:vaadinRun) and you will notice that when you run the first app everything is compiled but after that 
when you either again run the first or the second app then no widgetset or theme is no longer compiled as they have not 
changed.