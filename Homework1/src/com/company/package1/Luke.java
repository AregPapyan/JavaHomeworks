package com.company.package1;

public class Luke {
    public static String relationToLuke(String relative)
    {
        switch (relative)
        {
            case "Darth Vader":
                return "Luke, I am your father.";
            case "Leia":
                return "Luke, I am your sister.";
            case "Han":
                return "Luke, I am your brother in law.";
            case "R2D2":
                return "Luke, I am your droid.";
            default:
                return "Is not a relative";
        }
    }
}
