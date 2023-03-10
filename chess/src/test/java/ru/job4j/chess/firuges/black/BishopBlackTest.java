package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.chess.firuges.Cell.*;

class BishopBlackTest {

    @org.junit.jupiter.api.Test
    public void whenPositionF8() {
        BishopBlack bishopBlack = new BishopBlack(F8);
        assertThat(bishopBlack.position(), is(F8));
    }

    @org.junit.jupiter.api.Test
    public void whenCopyToC5() {
        BishopBlack bishopBlack = new BishopBlack(F8);
        Figure newBishopB = bishopBlack.copy(C5);
        assertThat(newBishopB.position(), is(C5));
    }

    @Test
    public void whenWayC1ToG5() {
        Cell[] way = new Cell[] {D2, E3, F4, G5};
        BishopBlack bishopBlack = new BishopBlack(C1);
        Cell[] finish = bishopBlack.way(G5);
        assertThat(finish,is(way));
    }
}