package ua.netrebenko.hw11;

/**
 * Создать PlanetEnum с методом возвращающим количество естественных спутников планеты.
 */
public enum PlanetEnum {
    SATURN(0),
    MOON(0),
    EARTH(1),
    JUPITER(7),
    MERCURY(2);

    private int satelliteNumber;

    PlanetEnum() {}

    PlanetEnum(int satelliteNumber) {
        this.satelliteNumber = satelliteNumber;
    }

    public int getSatelliteNumber() {
        return satelliteNumber;
    }
}
