import java.util.Arrays;

public class BlueAstronaut extends Player implements Crewmate {
    // Atribut jumlah task yang harus diselesaikan (integer)
    private int numTasks;

    // Atribut kecepatan menyelesaikan task (integer, nonzero positive)
    private int taskSpeed;

    // Atribut untuk mengecek apakah task sudah selesai pertama kali
    private boolean taskComplete = false;

    // Atribut DEFAULT_NUM_TASKS bertipe data int dengan nilai 6
    private static final int DEFAULT_NUM_TASKS = 6;

    // Atribut DEFAULT_TASK_SPEED bertipe data int dengan nilai 10
    private static final int DEFAULT_TASK_SPEED = 10;

    public BlueAstronaut(String name) {
        // Panggil constructor dengan parameter name, DEFAULT_SUS_LEVEL, DEFAULT_NUM_TASKS, dan DEFAULT_TASK_SPEED
        this(name, DEFAULT_SUS_LEVEL, DEFAULT_NUM_TASKS, DEFAULT_TASK_SPEED);
    }

    public BlueAstronaut(String name, int susLevel, int numTasks, int taskSpeed) {
        // Panggil constructor dari superclass dengan parameter name dan susLevel
        // Isi variabel numTasks dan taskSpeed dengan parameter yang sesuai
        super(name, susLevel);
        this.numTasks = numTasks;
        this.taskSpeed = taskSpeed;
    }

    /*

    */
    public void emergencyMeeting() {
        if (this.isFrozen()) return;

        int maxSusLevel = -1;
        int idx = -1;
        boolean foundSame = false;

        for (int i = 0; i < Player.getPlayers().length; i++) {
            if (!Player.getPlayers()[i].isFrozen() && Player.getPlayers()[i] != this) {
                if (Player.getPlayers()[i].getSusLevel() > maxSusLevel) {
                    maxSusLevel = Player.getPlayers()[i].getSusLevel(); 
                    idx = i; 
                    foundSame = false;
                }
                else if (Player.getPlayers()[i].getSusLevel() == maxSusLevel) foundSame = true;
            }
        }

        if (!foundSame && maxSusLevel != -1) Player.getPlayers()[idx].setFrozen(true);

        this.gameOver();
    }

    /*
        * BlueAstronaut yang frozen tidak dapat menyelesaikan tugas.
        * Jika taskSpeed lebih besar dari 20, kurangi numTasks sebanyak 2. Jika tidak, kurangi 1 dari numTasks.
            * Jika numTasks turun di bawah 0, tetapkan menjadi 0
        * Setelah BlueAstronaut selesai dengan tugas mereka, yang berarti numTasks sama dengan 0 (hanya untuk pertama kali),
            * Cetak `"I have completed all my tasks"`
            * Kemudian kurangi susLevel BlueAstronaut sebesar 50% (dibulatkan ke bawah)
        * Tidak mengembalikan apapun.
    */
    public void completeTask() {
        if (this.isFrozen()) return;

        if (this.taskSpeed > 20) this.numTasks -= 2;
        else this.numTasks--;

        if (this.numTasks < 0) this.numTasks = 0;

        if (this.numTasks == 0 && !this.taskComplete) {
            System.out.println("I have completed all my tasks");
            this.setSusLevel((int) (this.getSusLevel() / 2));
            this.taskComplete = true;
        }
    }

    /*
        * Dua BlueAstronaut sama jika mereka keduanya memiliki nama yang sama, frozen, susLevel, numTasks, dan taskSpeed
        * Mengembalikan sebuah boolean.
    */
    public boolean equals(Object o) {
        if (o instanceof BlueAstronaut) {
            BlueAstronaut b = (BlueAstronaut) o;
            return super.equals(o) && this.numTasks == b.numTasks && this.taskSpeed == b.taskSpeed;
        }

        return false;
    }

    /*
        Mengembalikan String yang menggambarkan BlueAstronaut sebagai berikut:
        * `"My name is [name], and I have a `susLevel` of [susLevel]. I am currently (frozen / not frozen). I have [numTasks] left over."`
            * Jika susLevel lebih besar dari 15, kembalikan keluaran dalam huruf kapital semua. (Hint: toUppercase)
            * (Note: gantikan nilai dalam tanda kurung [] dengan nilai sebenarnya)
        * Anda harus menggunakan metode toString() dari kelas Player.
    */
    public String toString() {
        String output = super.toString() + " I have " + this.numTasks + " left over.";
        return this.getSusLevel() > 15 ? output.toUpperCase() : output;
    }
}
