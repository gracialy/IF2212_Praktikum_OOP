public class Perari extends Car {
    private int averageSpeed;
    private boolean isInsuranced;

    public Perari(int numberOfWheels,int engineCapacity, int averageSpeed, boolean isInsuranced) {
        super(numberOfWheels, engineCapacity);
        this.averageSpeed = averageSpeed;
        this.isInsuranced = isInsuranced;
    }

    public int getAverageSpeed() {
        return this.averageSpeed;
    }
    public boolean getInsuranceStatus() {
        return this.isInsuranced;
    }

    public String sound() {
        return "Brmmmm";
    }
    public String honk() {
        return "Siuuu";
    }

    public String printDescription() {
        if (this.isInsuranced) return String.format(
            "Mobil ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kecepatan rata-rata %d km/h, dan sedang dalam perlindungan asuransi",
            super.getNumberOfWheels(), super.getEngineCapacity(), this.averageSpeed);
        else return String.format(
            "Mobil ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kecepatan rata-rata %d km/h, dan sedang tidak dalam perlindungan asuransi",
            super.getNumberOfWheels(), super.getEngineCapacity(), this.averageSpeed);
    }
}
