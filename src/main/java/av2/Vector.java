package av2;

public class Vector {

    private double vector[];
    private int dimension;

    public Vector(int dim, double[] elements) {
        vector = new double[dim];
        this.dimension = dim;

        for (int i = 0; i < dim; i++) {
            vector[i] = elements[i];
            //System.out.println("elemento Vetor: " + vector[i]);
        }
    }

    public double get(int index) {

        return vector[index];
    }

    public void set(int index, double element) {

        vector[index] = element;

    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void printVector() {
        System.out.print("[ ");
        for (int i = 0; i < dimension; i++) {
            System.out.print(vector[i]);
            if (i < dimension - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
