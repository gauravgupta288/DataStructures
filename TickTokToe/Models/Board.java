package TickTokToe.Models;

import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> cell;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getCell() {
        return cell;
    }

    public void setCell(List<List<Cell>> cell) {
        this.cell = cell;
    }


}
