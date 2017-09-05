package com.starks.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.graphics.Color.CYAN;
import static android.graphics.Color.WHITE;
import static android.graphics.Color.YELLOW;
import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);


        boolean end = false;
        turn = 1;
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b1.getText().toString() == "") {
                    if (turn == 1) {
                        b1.setText("X");
                        b1.setBackgroundColor(CYAN);
                        turn = 2;
                        endgame();
                    } else if (turn == 2) {
                        b1.setText("O");
                        turn = 1;
                        b1.setBackgroundColor(YELLOW);
                        endgame();
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b2.getText().toString() == "") {
                    if (turn == 1) {
                        b2.setText("X");
                        b2.setBackgroundColor(CYAN);
                        turn = 2;
                        endgame();
                    } else if (turn == 2) {
                        b2.setText("O");
                        turn = 1;
                        b2.setBackgroundColor(YELLOW);
                        endgame();
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b3.getText().toString() == "") {
                    if (turn == 1) {
                        b3.setText("X");
                        b3.setBackgroundColor(CYAN);
                        turn = 2;
                        endgame();
                    } else if (turn == 2) {
                        b3.setText("O");
                        turn = 1;
                        b3.setBackgroundColor(YELLOW);
                        endgame();
                    }
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b4.getText().toString() == "") {
                    if (turn == 1) {
                        b4.setText("X");
                        b4.setBackgroundColor(CYAN);
                        turn = 2;
                        endgame();
                    } else if (turn == 2) {
                        b4.setText("O");
                        turn = 1;
                        b4.setBackgroundColor(YELLOW);
                        endgame();
                    }
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b5.getText().toString() == "") {
                    if (turn == 1) {
                        b5.setText("X");
                        b5.setBackgroundColor(CYAN);
                        turn = 2;
                        endgame();
                    } else if (turn == 2) {
                        b5.setText("O");
                        b5.setBackgroundColor(YELLOW);
                        turn = 1;
                        endgame();
                    }
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b6.getText().toString() == "") {
                    if (turn == 1) {
                        b6.setText("X");
                        b6.setBackgroundColor(CYAN);
                        turn = 2;
                        endgame();
                    } else if (turn == 2) {
                        b6.setText("O");
                        b6.setBackgroundColor(YELLOW);
                        turn = 1;
                        endgame();
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b7.getText().toString() == "") {
                    if (turn == 1) {
                        b7.setText("X");
                        b7.setBackgroundColor(CYAN);
                        turn = 2;
                        endgame();
                    } else if (turn == 2) {
                        b7.setText("O");
                        b7.setBackgroundColor(YELLOW);
                        turn = 1;
                        endgame();
                    }
                }
            }
        });
        /*b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                if(b8.getText().toString()==""){
                    if(turn==1){
                        b8.setText("x");
                        turn=2;
                    }
                if(turn==2){
                    b8.setText("O");
                    turn=1;
                }
        }}});*/
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString() == "") {
                    if (turn == 1) {
                        b8.setText("X");
                        b8.setBackgroundColor(CYAN);

                        turn = 2;
                        endgame();
                    } else if (turn == 2) {
                        b8.setText("O");
                        turn = 1;
                        b8.setBackgroundColor(YELLOW);
                        endgame();
                    }
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString() == "") {
                    if (turn == 1) {
                        b9.setText("X");
                        b9.setBackgroundColor(CYAN);
                        turn = 2;
                        endgame();
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                        b9.setBackgroundColor(YELLOW);
                        endgame();
                    }
                }
            }
        });
    }
    void endgame() {

        if (b1.getText().toString() == "X" && b2.getText().toString() == "X" && b3.getText().toString() == "X") {
            Toast.makeText(MainActivity.this, "Player X has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b5.setText("");b5.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b7.setText("");b7.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b9.setText("");b9.setBackgroundColor(WHITE);
        }
        if (b1.getText().toString() == "X" && b4.getText().toString() == "X" && b7.getText().toString() == "X") {
            Toast.makeText(MainActivity.this, "Player X has Won", LENGTH_LONG).show();
            b2.setText("");b2.setBackgroundColor(WHITE);
            b5.setText("");b5.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b3.setText("");b3.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b9.setText("");b9.setBackgroundColor(WHITE);
        }
        if (b1.getText().toString() == "X" && b5.getText().toString() == "X" && b9.getText().toString() == "X") {
            Toast.makeText(MainActivity.this, "Player X has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b2.setText("");b2.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b7.setText("");b7.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b3.setText("");b3.setBackgroundColor(WHITE);
        }
        if (b2.getText().toString() == "X" && b5.getText().toString() == "X" && b8.getText().toString() == "X") {
            Toast.makeText(MainActivity.this, "Player X has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b1.setText("");b1.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b7.setText("");b7.setBackgroundColor(WHITE);
            b3.setText("");b3.setBackgroundColor(WHITE);
            b9.setText("");b9.setBackgroundColor(WHITE);
        }
        if (b3.getText().toString() == "X" && b6.getText().toString() == "X" && b9.getText().toString() == "X") {
            Toast.makeText(MainActivity.this, "Player X has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b5.setText("");b5.setBackgroundColor(WHITE);
            b1.setText("");b1.setBackgroundColor(WHITE);
            b7.setText("");b7.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b2.setText("");b2.setBackgroundColor(WHITE);
        }
        if (b3.getText().toString() == "X" && b5.getText().toString() == "X" && b7.getText().toString() == "X") {
            Toast.makeText(MainActivity.this, "Player X has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b2.setText("");b2.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b1.setText("");b1.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b9.setText("");b9.setBackgroundColor(WHITE);
        }
        if (b4.getText().toString() == "X" && b5.getText().toString() == "X" && b6.getText().toString() == "X") {
            Toast.makeText(MainActivity.this, "Player X has Won", LENGTH_LONG).show();
            b1.setText("");b1.setBackgroundColor(WHITE);
            b2.setText("");b2.setBackgroundColor(WHITE);
            b3.setText("");b3.setBackgroundColor(WHITE);
            b7.setText("");b7.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b9.setText("");b9.setBackgroundColor(WHITE);
        }
        if (b7.getText().toString() == "X" && b8.getText().toString() == "X" && b9.getText().toString() == "X") {
            Toast.makeText(MainActivity.this, "Player X has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b5.setText("");b5.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b1.setText("");b1.setBackgroundColor(WHITE);
            b2.setText("");b2.setBackgroundColor(WHITE);
            b3.setText("");b3.setBackgroundColor(WHITE);
        }


        if (b1.getText().toString() == "O" && b2.getText().toString() == "O" && b3.getText().toString() == "O") {
            Toast.makeText(MainActivity.this, "Player O has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b5.setText("");b5.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b7.setText("");b7.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b9.setText("");b9.setBackgroundColor(WHITE);
        }
        if (b1.getText().toString() == "O" && b4.getText().toString() == "O" && b7.getText().toString() == "O") {
            Toast.makeText(MainActivity.this, "Player O has Won", LENGTH_LONG).show();
            b2.setText("");b2.setBackgroundColor(WHITE);
            b5.setText("");b5.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b3.setText("");b3.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b9.setText("");b9.setBackgroundColor(WHITE);
        }
        if (b1.getText().toString() == "O" && b5.getText().toString() == "O" && b9.getText().toString() == "O") {
            Toast.makeText(MainActivity.this, "Player O has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b2.setText("");b2.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b7.setText("");b7.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b3.setText("");b3.setBackgroundColor(WHITE);
        }
        if (b2.getText().toString() == "O" && b5.getText().toString() == "O" && b8.getText().toString() == "O") {
            Toast.makeText(MainActivity.this, "Player O has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b1.setText("");b1.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b7.setText("");b7.setBackgroundColor(WHITE);
            b3.setText("");b3.setBackgroundColor(WHITE);
            b9.setText("");b9.setBackgroundColor(WHITE);
        }
        if (b3.getText().toString() == "O" && b6.getText().toString() == "O" && b9.getText().toString() == "O") {
            Toast.makeText(MainActivity.this, "Player O has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b5.setText("");b5.setBackgroundColor(WHITE);
            b1.setText("");b1.setBackgroundColor(WHITE);
            b7.setText("");b7.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b2.setText("");b2.setBackgroundColor(WHITE);
        }
        if (b3.getText().toString() == "O" && b5.getText().toString() == "O" && b7.getText().toString() == "O") {
            Toast.makeText(MainActivity.this, "Player O has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b1.setText("");b1.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b2.setText("");b2.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b9.setText("");b9.setBackgroundColor(WHITE);
        }
        if (b4.getText().toString() == "O" && b5.getText().toString() == "O" && b6.getText().toString() == "O") {
            Toast.makeText(MainActivity.this, "Player O has Won", LENGTH_LONG).show();
            b1.setText("");b1.setBackgroundColor(WHITE);
            b2.setText("");b2.setBackgroundColor(WHITE);
            b3.setText("");b3.setBackgroundColor(WHITE);
            b7.setText("");b7.setBackgroundColor(WHITE);
            b8.setText("");b8.setBackgroundColor(WHITE);
            b9.setText("");b9.setBackgroundColor(WHITE);
        }
        if (b7.getText().toString() == "O" && b8.getText().toString() == "O" && b9.getText().toString() == "O") {
            Toast.makeText(MainActivity.this, "Player O has Won", LENGTH_LONG).show();
            b4.setText("");b4.setBackgroundColor(WHITE);
            b5.setText("");b5.setBackgroundColor(WHITE);
            b6.setText("");b6.setBackgroundColor(WHITE);
            b1.setText("");b1.setBackgroundColor(WHITE);
            b2.setText("");b2.setBackgroundColor(WHITE);
            b3.setText("");b3.setBackgroundColor(WHITE);
        }
    }
}





