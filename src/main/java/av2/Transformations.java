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
        int x = vector.get(0);
        int y = vector.get(1);

        //Elementos transladados
        int[] translatedElements = new int[2];
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
        int x = vector.get(0);
        int y = vector.get(1);
        int z = vector.get(2);

        //Elementos transladados
        int[] translatedElements = new int[3];
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

        int x = vector.get(0);
        int y = vector.get(1);

        double xRotacionado = x * Math.cos(radianos) - y * Math.sin(radianos);
        double yRotacionado = x * Math.sin(radianos) + y * Math.cos(radianos);

        int[] elementosRotacionados = new int[2];

        elementosRotacionados[0] = (int) Math.round(xRotacionado);
        elementosRotacionados[1] = (int) Math.round(yRotacionado);

        return new Vector(2, elementosRotacionados);
    }

    public static Vector rotation3DX(Vector vector, double angulo) {
        if (vector.getDimension() != 3) {
            throw new IllegalArgumentException("Para rotação 3D o vetor precisa ter 3 elementos.");
        }
        double radianos = Math.toRadians(angulo);

        int x = vector.get(0);
        int y = vector.get(1);
        int z = vector.get(2);

        int xRotacionado = x;
        double yRotacionado = y * Math.cos(radianos) - z * Math.sin(radianos);
        double zRotacionado = y * Math.sin(radianos) + z * Math.cos(radianos);

        int[] elementosRotacionados = new int[3];

        elementosRotacionados[0] = xRotacionado;
        elementosRotacionados[1] = (int) Math.round(yRotacionado);
        elementosRotacionados[2] = (int) Math.round(zRotacionado);

        return new Vector(3, elementosRotacionados);

    }

    public static Vector rotation3DY(Vector vetor, double angulo) {
        if (vetor.getDimension() != 3) {
            throw new IllegalArgumentException("Para rotação 3D o vetor precisa ter 3 elementos.");
        }
        double radianos = Math.toRadians(angulo);

        int x = vetor.get(0);
        int y = vetor.get(1);
        int z = vetor.get(2);

        double xRotacionado = x * Math.cos(radianos) + z * Math.sin(radianos);
        int yRotacionado = y;
        double zRotacionado = -x * Math.sin(radianos) + z * Math.cos(radianos);

        int[] elementosRotacionados = new int[3];

        elementosRotacionados[0] = (int) Math.round(xRotacionado);
        elementosRotacionados[1] = yRotacionado;
        elementosRotacionados[2] = (int) Math.round(zRotacionado);

        return new Vector(3, elementosRotacionados);
    }

    public static Vector rotation3DZ(Vector vetor, double angulo) {
        if (vetor.getDimension() != 3) {
            throw new IllegalArgumentException("Para rotação 3D o vetor precisa ter 3 elementos.");
        }
        double radianos = Math.toRadians(angulo);

        int x = vetor.get(0);
        int y = vetor.get(1);
        int z = vetor.get(2);

        double xRotacionado = x * Math.cos(radianos) - y * Math.sin(radianos);
        double yRotacionado = x * Math.sin(radianos) + y * Math.cos(radianos);
        int zRotacionado = z;

        int[] elementosRotacionados = new int[3];

        elementosRotacionados[0] = (int) Math.round(xRotacionado);
        elementosRotacionados[1] = (int) Math.round(yRotacionado);
        elementosRotacionados[2] = zRotacionado;

        return new Vector(3, elementosRotacionados);
    }



}
