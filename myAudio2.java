
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.sound.sampled.*;
import java.awt.*;


public class myAudio2 {

     int channel = 0;
     int volume = 80; // between 0 et 127
     int duration = 500; // in milliseconds

    public void playMusic(int volume,int noteNumber) throws MidiUnavailableException, InterruptedException {
        //this.volume = volume;
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        channels[channel].noteOn( noteNumber, volume ); // C note
        Thread.sleep( duration );
        channels[channel].noteOff( noteNumber );
        synth.close();

    }

//    public static void main(String[] args) throws MidiUnavailableException, InterruptedException {
//
//        //Player player = new Player();
//        //player.play("C D E F G A B");
////
////         int channel = 0;
////         int volume = 80; // between 0 et 127
////        int duration = 1000; // in milliseconds
////
////        Synthesizer synth = MidiSystem.getSynthesizer();
////        synth.open();
////        MidiChannel[] channels = synth.getChannels();
////        channels[channel].noteOn( 80, volume ); // C note
////        Thread.sleep( duration );
////        channels[channel].noteOff( 80 );
////        synth.close();
//
//        myAudio2 test = new myAudio2();
//        test.playMusic(80,80);
//
//
//        // --------------------------------------
//        // Play a few notes.
//        // The two arguments to the noteOn() method are:
//        // "MIDI note number" (pitch of the note),
//        // and "velocity" (i.e., volume, or intensity).
//        // Each of these arguments is between 0 and 127.
////        channels[channel].noteOn( 60, volume ); // C note
////        Thread.sleep( duration );
////        channels[channel].noteOff( 60 );
////        channels[channel].noteOn( 62, volume ); // D note
////        Thread.sleep( duration );
////        channels[channel].noteOff( 62 );
////        channels[channel].noteOn( 64, volume ); // E note
////        Thread.sleep( duration );
////        channels[channel].noteOff( 64 );
//
//       // Thread.sleep( 500 );
//
//        // --------------------------------------
//        // Play a C major chord.
////        channels[channel].noteOn( 60, volume ); // C
////        channels[channel].noteOn( 64, volume ); // E
////        channels[channel].noteOn( 67, volume ); // G
////        Thread.sleep( 3000 );
////        channels[channel].allNotesOff();
////        Thread.sleep( 500 );
//
//
//
//
//    }



}
