package av2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //rotate2D
//        Vector vetor = new Vector(2, new int[]{3, 4});
//        System.out.print("Vetor original: ");
//        vetor.printVector();
//        Vector vetorRotacionado90 = Transformations.rotation2D(vetor, 90);
//        System.out.print("Vetor rotacionado (90 graus): ");
//        vetorRotacionado90.printVector();

        //rotate3DX
//        Vector vetor = new Vector(3, new int[]{1, 2, 3});
//        System.out.print("Vetor original: ");
//        vetor.printVector();
//        Vector vetorRotacionado90 = Transformations.rotation3DX(vetor, 90);
//        System.out.print("Vetor rotacionado (90 graus): ");
//        vetorRotacionado90.printVector();

        //rotate3DY
//        Vector vetor = new Vector(3, new int[]{1, 2, 3});
//        System.out.print("Vetor original: ");
//        vetor.printVector();
//        Vector vetorRotacionado90 = Transformations.rotation3DY(vetor, 90);
//        System.out.print("Vetor rotacionado (90 graus): ");
//        vetorRotacionado90.printVector();

        //rotate3DZ
//        Vector vetor = new Vector(3, new int[]{1, 2, 3});
//        System.out.print("Vetor original: ");
//        vetor.printVector();
//        Vector vetorRotacionado90 = Transformations.rotation3DZ(vetor, 90);
//        System.out.print("Vetor rotacionado (90 graus): ");
//        vetorRotacionado90.printVector();

        //reflexão
        //reflexao2DX
//        Vector vetor = new Vector(2, new double[]{3, 4});
//        System.out.print("Vetor original: ");
//        vetor.printVector();
//        Vector vetorRefletido = Transformations.reflection2DX(vetor);
//        System.out.print("Vetor refletido: ");
//        vetorRefletido.printVector();

        //reflexao2DY
//        Vector vetor = new Vector(2, new double[]{3, 4});
//        System.out.print("Vetor original: ");
//        vetor.printVector();
//        Vector reflectedV = Transformations.reflection2DY(vetor);
//        System.out.print("Vetor refletido: ");
//        reflectedV.printVector();


        //reflexao3DX
//        Vector vetor = new Vector(3, new double[]{1, 2, 3});
//        System.out.print("Vetor original: ");
//        vetor.printVector();
//        Vector reflectedV = Transformations.reflection3DX(vetor);
//        System.out.print("Vetor refletido: ");
//        reflectedV.printVector();

        //reflexao3DY
//        Vector vetor = new Vector(3, new double[]{1, 2, 3});
//
//        System.out.print("Vetor original: ");
//        vetor.printVector();
//
//        Vector reflectedV = Transformations.reflection3DY(vetor);
//
//        // Print the reflected vector
//        System.out.print("Vetor refletido: ");
//        reflectedV.printVector();

        //reflexao3DZ
//        Vector vetor = new Vector(3, new double[]{1, 2, 3});
//
//        System.out.print("Vetor original: ");
//        vetor.printVector();
//
//        Vector reflectedV = Transformations.reflection3DZ(vetor);
//
//        System.out.print("Vetor refletido: ");
//        reflectedV.printVector();

//        //Projeção
//        Vector v2D = new Vector(2, new double[]{3, 4});
//        System.out.print("vetor original");
//        v2D.printVector();
//
//        //projeção eixo x
//        Vector projX2D = Transformations.projection2DX(v2D);
//        System.out.print("projeção do vetor no eixo x");
//        projX2D.printVector();
//
//        //projeção eixo y
//        Vector projY2D = Transformations.projection2DY(v2D);
//        System.out.print("projeção do vetor no eixo y");
//        projY2D.printVector();
//
//        Vector v3D = new Vector(3, new double[]{1, 2, 3});
//        System.out.print("vetor original");
//        v3D.printVector();
//
//        //projeção eixo x
//        Vector projX3D = Transformations.projection3DX(v3D);
//        System.out.print("projeção do vetor no eixo x");
//        projX3D.printVector();
//
//        //projeção no eixo y
//        Vector projY3D =Transformations.projection3DY(v3D);
//        System.out.print("projeção do vetor no eixo y");
//        projY3D.printVector();
//
//        //projeção no eixo z
//        Vector projZ3D = Transformations.projection3DZ(v3D);
//        System.out.print("projeção do vetor no eixo z");
//        projZ3D.printVector();

        //Shearing
        double[] elements = {2, 3};
        Vector vetorOriginal = new Vector(2, elements);

        System.out.print("vetor original");
        vetorOriginal.printVector();

        Vector shearedVector = Transformations.shearing(vetorOriginal, 1.5, 0.5);

        System.out.print("vetor cisilhado: ");
        shearedVector.printVector();
    }
}
