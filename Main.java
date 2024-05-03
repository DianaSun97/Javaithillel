
abstract class MusicStyles {
    // Abstract method
    abstract void playMusic();
}

// Derived classes
class PopMusic extends MusicStyles {
    void playMusic() {
        System.out.println("Playing pop music...");
    }
}

class RockMusic extends MusicStyles {
    void playMusic() {
        System.out.println("Playing rock music...");
    }
}

class ClassicMusic extends MusicStyles {
    void playMusic() {
        System.out.println("Playing classical music...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        MusicStyles[] bands = {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic()
        };

        for (MusicStyles band : bands) {
            band.playMusic();
        }
    }
}
