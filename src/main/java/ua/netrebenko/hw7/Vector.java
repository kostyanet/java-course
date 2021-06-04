package ua.netrebenko.hw7;

import java.util.Random;

public class Vector {
    float x;
    float y;
    float z;

    public Vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static double getLength(Vector vector) {
        return Math.sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z);
    }

    public static Vector[] getRandVectorArray(short length) {
        Random generator = new Random(5);
        Vector[] vectors = new Vector[length];

        for (int i = 0; i < length; i++) {
            vectors[i] = new Vector(generator.nextFloat(), generator.nextFloat(), generator.nextFloat());
        }

        return vectors;
    }

    public double getLength() {
        return Vector.getLength(this);
    }

    public Vector getVectorProduct(Vector vector) {
        return new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    public double getCos(Vector vector) {
        double scalarProduct = x * vector.x + y * vector.y + z * vector.z;
        return scalarProduct / (getLength() * Vector.getLength(vector));
    }

    public Vector addVector(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector subtractVector(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }
}
