package com.calculator;

import android.widget.Button;

public class ButtonHandler {
    private NumberHandler numberHandler;

    public ButtonHandler (NumberHandler numberHandler) {
        this.numberHandler = numberHandler;
    }

    public String getNumber(Button button) {
        String number = button.getText().toString().toLowerCase();
        if (number == "=") {
            numberHandler.handleEquals();
        } else if (number == "c") {
            numberHandler.handleClear();

        }
        return number;
    }
}
