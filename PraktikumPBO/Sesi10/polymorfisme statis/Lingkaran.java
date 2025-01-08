class Lingkaran {
    //Method menghitung luas dengan jari-jari
    float luas(float r){
        return (float) (Math.PI * r * r);
    }

    //Method menghitung luas dengan diameter
    double luas(double d) {
        return (double) (1/4 * Math.PI * d);
    }
}
