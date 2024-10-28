package av2;

//Translação (em 2D e em 3D)
//[DONE]○ translate2D(vector, dx, dy)
//[DONE]○ translate3D(vector, dx, dy, dz)

//Rotação (em 2D e em todos os eixos em 3D)
//[DONE] roration2D(vector, angle)
//[DONE] rotation3DX(vector, angle)
//[DONE] rotation3DY(vector, angle)
//[DONE] rotation3DZ(vector, angle)

//● Reflexão (em todos os eixos nas dimensões 2D e 3D)
//○ reflection2DX(vector)
//○ reflection2DY(vector)
//○ reflection3DX(vector)
//○ reflection3DY(vector)
//○ reflection3DZ(vector)

//● Projeção (em todos os eixos em 2D e m 3D)
//○ projection2DX(vector)
//○ projection2DY(vector)
//○ projection3DX(vector)
//○ projection3DY(vector)
//○ projection3DZ(vector)

//● Cisalhamento (apenas em 2D)
//○ shearing(vector, kx, ky


public class Transformations {
    public static Vector traslate2D(Vector vector, int coordenadaX, int coordenadaY) {

        if (vector.getDimension() != 2) {
            throw new IllegalArgumentException("Para transformações de duas dimensões o vetor precisa ter 2 elementos");
        }
        //elementos x e y
        double x = vector.get(0);
        double y = vector.get(1);

        //Elementos transladados
        double[] translatedElements = new double[2];
        translatedElements[0] = x + coordenadaX;
        translatedElements[1] = y + coordenadaY;

        //Vetor transaladado
        return new Vector(2, translatedElements);
    }

    public static Vector traslate3D(Vector vector, int coordenadaX, int coordenadaY, int coordenadaZ) {
        if (vector.getDimension() != 3) {
            throw new IllegalArgumentException("Para transformações de três dimensões o vetor precisa ter 3 elementos");
        }
        //elementos x e y
        double x = vector.get(0);
        double y = vector.get(1);
        double z = vector.get(2);

        //Elementos transladados
        double[] translatedElements = new double[3];
        translatedElements[0] = x + coordenadaX;
        translatedElements[1] = y + coordenadaY;
        translatedElements[2] = z + coordenadaZ;

        //Vetor transaladado
        return new Vector(3, translatedElements);

    }

    public static Vector rotation2D(Vector vector, double angulo) {

        if (vector.getDimension() != 2) {
            throw new IllegalArgumentException("O vetor precisa ter 2 elementos para exercer rotacao bidimensional.");
        }

        double radianos = Math.toRadians(angulo);

        double x = vector.get(0);
        double y = vector.get(1);

        double xRotacionado = x * Math.cos(radianos) - y * Math.sin(radianos);
        double yRotacionado = x * Math.sin(radianos) + y * Math.cos(radianos);

        double[] elementosRotacionados = new double[2];

        elementosRotacionados[0] = Math.round(xRotacionado);
        elementosRotacionados[1] = Math.round(yRotacionado);

        return new Vector(2, elementosRotacionados);
    }

    public static Vector rotation3DX(Vector vector, double angulo) {
        if (vector.getDimension() != 3) {
            throw new IllegalArgumentException("Para rotação 3D o vetor precisa ter 3 elementos.");
        }
        double radianos = Math.toRadians(angulo);

        double x = vector.get(0);
        double y = vector.get(1);
        double z = vector.get(2);

        double xRotacionado = x;
        double yRotacionado = y * Math.cos(radianos) - z * Math.sin(radianos);
        double zRotacionado = y * Math.sin(radianos) + z * Math.cos(radianos);

        double[] elementosRotacionados = new double[3];

        elementosRotacionados[0] = xRotacionado;
        elementosRotacionados[1] = Math.round(yRotacionado);
        elementosRotacionados[2] = Math.round(zRotacionado);

        return new Vector(3, elementosRotacionados);

    }

    public static Vector rotation3DY(Vector vetor, double angulo) {
        if (vetor.getDimension() != 3) {
            throw new IllegalArgumentException("Para rotação 3D o vetor precisa ter 3 elementos.");
        }
        double radianos = Math.toRadians(angulo);

        double x = vetor.get(0);
        double y = vetor.get(1);
        double z = vetor.get(2);

        double xRotacionado = x * Math.cos(radianos) + z * Math.sin(radianos);
        double yRotacionado = y;
        double zRotacionado = -x * Math.sin(radianos) + z * Math.cos(radianos);

        double[] elementosRotacionados = new double[3];

        elementosRotacionados[0] = Math.round(xRotacionado);
        elementosRotacionados[1] = yRotacionado;
        elementosRotacionados[2] = Math.round(zRotacionado);

        return new Vector(3, elementosRotacionados);
    }

    public static Vector rotation3DZ(Vector vetor, double angulo) {
        if (vetor.getDimension() != 3) {
            throw new IllegalArgumentException("Para rotação 3D o vetor precisa ter 3 elementos.");
        }
        double radianos = Math.toRadians(angulo);

        double x = vetor.get(0);
        double y = vetor.get(1);
        double z = vetor.get(2);

        double xRotacionado = x * Math.cos(radianos) - y * Math.sin(radianos);
        double yRotacionado = x * Math.sin(radianos) + y * Math.cos(radianos);
        double zRotacionado = z;

        double[] elementosRotacionados = new double[3];

        elementosRotacionados[0] = Math.round(xRotacionado);
        elementosRotacionados[1] = Math.round(yRotacionado);
        elementosRotacionados[2] = zRotacionado;

        return new Vector(3, elementosRotacionados);
    }

    public static Vector reflection2DX(Vector vetor) {
        if (vetor.getDimension() != 2) {
            throw new IllegalArgumentException("O vetor precisa ter 2 elementos para que a reflexão seja realizada.");
        }

        // Get the current coordinates
        double x = vetor.get(0);
        double y = vetor.get(1);

        double[] reflectedElements = {x, -y};

        return new Vector(2, reflectedElements);
    }

    public static Vector reflection2DY(Vector vetor) {
        if (vetor.getDimension() != 2) {
            throw new IllegalArgumentException("O vetor precisa ter 2 elementos para que a reflexão seja realizada.");
        }

        double x = vetor.get(0);
        double y = vetor.get(1);

        double[] reflectedElements = {-x, y};

        return new Vector(2, reflectedElements);
    }

    public static Vector reflection3DX(Vector vetor) {
        if (vetor.getDimension() != 3) {
            throw new IllegalArgumentException("O vetor precisa ter 3 elementos para que uma reflaxão em tridimensional.");
        }

        double x = vetor.get(0);
        double y = vetor.get(1);
        double z = vetor.get(2);

        double[] reflectedElements = {x, -y, -z};

        return new Vector(3, reflectedElements);
    }

    public static Vector reflection3DY(Vector vetor) {
        if (vetor.getDimension() != 3) {
            throw new IllegalArgumentException("O vetor precisa ter 3 elementos para que uma reflaxão em tridimensional.");
        }
        double x = vetor.get(0);
        double y = vetor.get(1);
        double z = vetor.get(2);

        double[] reflectedElements = {-x, y, -z};

        return new Vector(3, reflectedElements);
    }

    public static Vector reflection3DZ(Vector vetor) {
        if (vetor.getDimension() != 3) {
            throw new IllegalArgumentException("O vetor precisa ter 3 elementos para que uma reflaxão em tridimensional.");
        }

        double x = vetor.get(0);
        double y = vetor.get(1);
        double z = vetor.get(2);

        double[] reflectedElements = {-x, -y, z};

        return new Vector(3, reflectedElements);
    }

    public static Vector projection2DX(Vector vetor) {
        if (vetor.getDimension() != 2) {
            throw new IllegalArgumentException("O vetor precisa ter 2 elementos para que uma projeção em 2 dimensões.");
        }

        double x = vetor.get(0);
        return new Vector(2, new double[]{x, 0});
    }

    public static Vector projection2DY(Vector vetor) {
        if (vetor.getDimension() != 2) {
            throw new IllegalArgumentException("O vetor precisa ter 2 elementos para que uma projeção em 2 dimensões.");
        }
        double y = vetor.get(1);
        return new Vector(2, new double[]{0, y});
    }

    public static Vector projection3DX(Vector vetor) {
        if (vetor.getDimension() != 3) {
            throw new IllegalArgumentException("O vetor precisa ter 3 elementos para que uma projeção  tridimensional.");
        }
        double x = vetor.get(0);
        return new Vector(3, new double[]{x, 0, 0});
    }

    public static Vector projection3DY(Vector vetor) {
        if (vetor.getDimension() != 3) {
            throw new IllegalArgumentException("O vetor precisa ter 3 elementos para que uma projeção  tridimensional.");
        }
        double y = vetor.get(1);
        return new Vector(3, new double[]{0, y, 0});
    }

    public static Vector projection3DZ(Vector vetor) {
        if (vetor.getDimension() != 3) {
            throw new IllegalArgumentException("O vetor precisa ter 3 elementos para que uma projeção  tridimensional.");
        }
        double z = vetor.get(2);
        return new Vector(3, new double[]{0, 0, z});
    }

    public static Vector shearing(Vector vetor, double kx, double ky) {
        if (vetor.getDimension() != 2) {
            throw new IllegalArgumentException("O vetor precisa ter 2 elementos.");
        }

        double x = vetor.get(0);
        double y = vetor.get(1);

        double newX = x + kx * y;
        double newY = y + ky * x;

        double[] shearedElements = {newX, newY};
        return new Vector(2, shearedElements);
    }
}
