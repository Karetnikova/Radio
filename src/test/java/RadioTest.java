import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void lastTheNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void previouStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void nextpreviouStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void anyStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        int actual = radio.getCurrentStation();
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void reductionVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.reductionVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

}
