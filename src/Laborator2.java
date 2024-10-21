public class Laborator2 {

    class Student {
        long nrMatricol;
        String nume;
        String prenume;
        double medieFinala;

        public Student(long nrMatricol, String nume, String prenume, double medieFinala) {
            this.nrMatricol = nrMatricol;
            this.nume = nume;
            this.prenume = prenume;
            this.medieFinala = medieFinala;
        }

        long getNrMatricol() {
            return this.nrMatricol;
        }

        void setNrMatricol(long nrMatricol) {
            this.nrMatricol = nrMatricol;
        }

        String getNume() {
            return this.nume;
        }

        void setNume(String nume) {
            this.nume = nume;
        }

        String getPrenume() {
            return this.prenume;
        }

        void setPrenume(String prenume) {
            this.prenume = prenume;
        }

        double getMedieFinala() {
            return this.medieFinala;
        }

        void setMedieFinala(double medieFinala) {
            this.medieFinala = medieFinala;
        }

        String detaliiStudent() {
            return "[" + nrMatricol + "] " + prenume + " " + nume + ": " + medieFinala;
        }
    }

    class Doctor {
        private String nume;
        private double medieRating;
        private int ratings[];

        Doctor() {
            this.nume = " ";
            this.ratings = new int[10];
            this.medieRating = 0.0;
        }

        Doctor(String nume) {
            this.nume = nume;
            this.ratings = new int[10];
            this.medieRating = 0.0;
        }

        String getNume() {
            return this.nume;
        }

        void setNume(String nume) {
            this.nume = nume;
        }

        private void calculeazaMedieRating() {
            int suma = 0;
            int numarRatinguri = 0;
            for (int rating : ratings) {
                if (rating != 0) {
                    suma += rating;
                    numarRatinguri++;
                }
            }
            if (numarRatinguri > 0) {
                this.medieRating = (double) suma / numarRatinguri;
            } else {
                this.medieRating = 0.0;
            }
        }
    }

    class Pacient {
        private static int nextId = 1;
        private String nume;
        private Integer id;

        public Pacient() {
            this.nume = " ";
            this.id = nextId++;
        }

        public Pacient(String nume, Integer id) {
            this.nume = nume;
            this.id = nextId++;
        }

        String getNume() {
            return this.nume;
        }

        void setNume(String nume) {
            this.nume = nume;
        }

        Integer getId() {
            return this.id;
        }

        void setId(Integer id) {
            this.id = id;
        }

        public String detaliiPacient() {
            return "[" + id + "] " + nume;
        }
    }

    public static void main(String[] args) {
        Laborator2 lab = new Laborator2();

        Student student1 = lab.new Student(1, "Ion", "Ionescu", 9.8);
        Student student2 = lab.new Student(2, "Maria", "Popescu", 9.5);
        Student student3 = lab.new Student(3, "Alex", "Georgescu", 9.7);

        Student[] studenti = {student1, student2, student3};

        for (Student student : studenti) {
            System.out.println(student.detaliiStudent());
        }

        double sumaMedii = 0;
        for (Student student : studenti) {
            sumaMedii += student.getMedieFinala();
        }
        double mediaStudentilor = sumaMedii / studenti.length;

        System.out.println("Media studenților este: " + mediaStudentilor);

        Pacient pacient1 = lab.new Pacient("Ion Ionescu", 1);
        Pacient pacient2 = lab.new Pacient("Maria Popescu", 2);
        Pacient pacient3 = lab.new Pacient("Alex Georgescu", 3);

        Pacient[] pacienti = {pacient1, pacient2, pacient3};

        for (Pacient pacient : pacienti) {
            System.out.println(pacient.detaliiPacient());
        }
    }
}
