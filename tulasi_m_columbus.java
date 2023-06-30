import java.util.*;
public class Singer {
   
    public static boolean canSingSong(String[] songNotes, String lowestNote, String highestNote) {
        // Convert the lowest and highest notes to their respective numeric values
        int lowestPitch = lowestNote.charAt(0) - 'C';
        int lowestOctave = Integer.parseInt(lowestNote.substring(1));
        int highestPitch = highestNote.charAt(0) - 'C';
        int highestOctave = Integer.parseInt(highestNote.substring(1));

        // Iterate over the notes in the song and check if any note is out of range
        for (String note : songNotes) {
            int pitch = note.charAt(0) - 'C';
            int octave = Integer.parseInt(note.substring(1));

            if (octave < lowestOctave || octave > highestOctave) {
                return false;  // Note is outside the singer's range
            }

            if (octave == lowestOctave && pitch < lowestPitch) {
                return false;  // Note is lower than the singer's lowest note
            }

            if (octave == highestOctave && pitch > highestPitch) {
                return false;  // Note is higher than the singer's highest note
            }
        }

        return true;  // All notes are within the singer's range
    }
    
    
    
    
     public static void main(String[] argv) {
    String[] song1 = {"F4", "B4", "C5"};
    String[] song2 = {"C3", "E3", "G3", "C4", "E4", "G4", "C5"};
    String[] song3 = {"B4", "F5", "B5" };
    String[] song4 = {"B4", "E4", "G4", "G4", "A4", "B4", "E4", 
                      "B4", "E4", "G4", "G4", "A4", "C5", "B4", 
                      "E5", "G4", "G4", "A4", "B4", "C5", "D5", 
                      "C5", "B4", "C5", "E5", "D5", "C5", "C5", 
                      "B4", "B4", "E5", "E4", "G4", "G4", "A4", 
                      "B4", "B4", "B4", "C5", "E5", "A5", "E5", 
                      "C5", "A4", "E5", "D5", "C5", "B4"};
    String[] song5={"F4"};
    
System.out.println(canSingSong(song1, "F4", "C5"));
System.out.println(canSingSong(song1, "A4", "C5"));
System.out.println(canSingSong(song2, "B2", "C5")); 
System.out.println(canSingSong(song2, "C3", "B4") );
System.out.println(canSingSong(song3, "B4", "B5")); 
System.out.println(canSingSong(song3, "B4", "C5")); 
System.out.println(canSingSong(song4, "D4", "A5") );
System.out.println(canSingSong(song4, "D4", "G5")); 
System.out.println(canSingSong(song4, "D4", "C6")); 
System.out.println(canSingSong(song4, "F4", "C6")); 
System.out.println(canSingSong(song5, "D4", "E4"));
 } 
 
}
