package com.app.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button[] numbers, symbols;
    TextView answerBar, formulaBar, formulaText;
    View view;
    String op, number1, number2;
    StringBuilder formula;
    boolean firstSymbol = true, opTurn = false;
    int ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbers = new Button[9];
        symbols = new Button[3];
        view = findViewById(R.id.calcLayout);
        formula = new StringBuilder();
        formulaBar = findViewById(R.id.formulaBar);
        answerBar = findViewById(R.id.answerBar);
        formulaText = findViewById(R.id.formulaText);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = view.findViewWithTag("num" + (i + 1));
            Button btn = numbers[i];
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String num = btn.getText().toString();
                    formula.append(num);
                    formulaBar.setText(formula);
                    formulaText.append(num);
                    opTurn = true;
                }
            });
        }

        for (int i = 0; i < symbols.length; i++) {
            symbols[i] = view.findViewWithTag("sym" + i);
            Button btn = symbols[i];
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (opTurn) {
                        opTurn = false;
                        if (firstSymbol) {
                            op = btn.getText().toString();
                            formula = new StringBuilder();
                            number1 = formulaBar.getText().toString();
                            formula.append(number1);
                            answerBar.setText(formula);
                            formula.append(op);
                            formulaText.setText(formula);
                            formulaBar.setText(null);
                            formula = new StringBuilder();
                            firstSymbol = false;
                        } else {
                            number2 = formulaBar.getText().toString();
                            switch (op) {
                                case "+":
                                    ans = Integer.parseInt(number1) + Integer.parseInt(number2);
                                    number1 = String.valueOf(ans);
                                    break;
                                case "-":
                                    ans = Integer.parseInt(number1) - Integer.parseInt(number2);
                                    number1 = String.valueOf(ans);
                                    break;
                                case "*":
                                    ans = Integer.parseInt(number1) * Integer.parseInt(number2);
                                    number1 = String.valueOf(ans);
                                    break;
                                case "/":
                                    ans = Integer.parseInt(number1) / Integer.parseInt(number2);
                                    number1 = String.valueOf(ans);
                                    break;
                            }
                            op = btn.getText().toString();
                            formula = new StringBuilder();
                            formula.append(number1);
                            answerBar.setText(formula);
                            formula.append(op);
                            formulaText.setText(formula);
                            formulaBar.setText(null);
                            formula = new StringBuilder();
                        }
                    } else {
                        if (!firstSymbol) {
                            op = btn.getText().toString();
                            formula = new StringBuilder();
                            formula.append(number1);
                            answerBar.setText(formula);
                            formula.append(op);
                            formulaText.setText(formula);
                            formulaBar.setText(null);
                            formula = new StringBuilder();
                        } else {
                        }
                    }
                }
            });
        }
    }
}