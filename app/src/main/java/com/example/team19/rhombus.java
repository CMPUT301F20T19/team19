package com.example.team19;

public class rhombus extends Shape {
    private int side_x;
    private int side_y;
    private int perimter;
    private String name;

    rhombus(int x, int y, String name){

    }

    public rhombus(int side_x, int side_y, int perimter, String name) {
        this.side_x = side_x;
        this.side_y = side_y;
        this.perimter = perimter;
        this.name = name;
    }

    public void setSide_x(int side_x) {
        this.side_x = side_x;
    }

    public void setSide_y(int side_y) {
        this.side_y = side_y;
    }

    public void setPerimter(int perimter) {
        this.perimter = perimter;
    }

    public void setName(String name) {
        this.name = name;
    }
}
