/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rustem Azimov
 */
public class PasswordFactory {
    private int wordLength = 0;
    private char[] charBase = new char[62];
    private SecureRandom random = new SecureRandom();

    public PasswordFactory(int wordLength) {
        this.wordLength = wordLength;
        initCharBase();
    }
    private void initCharBase() {
        List<Character> base = genbase();
        for (int i = 0; i < this.charBase.length; i++) {
            this.charBase[i] = base.get(i);
        }
    }
    private List<Character> genbase(){
        List<Character> base = new ArrayList<>(63);
        for (int i = 48; i <= 57; i++) {
            base.add((char) i);
        }
        for (int i = 65; i <= 90; i++) {
            base.add((char) i);
        }
        for (int i = 97; i <= 122; i++) {
            base.add((char) i);
        }
        //base.add(' ');
        return base;
    }
    public String generatePassword() {
    	StringBuilder sB = new StringBuilder(this.wordLength);
    	for(int i = 0; i < this.wordLength ; i++) {
    		sB.append(generateChar());
    	}
    	return sB.toString();
    }
    private char generateChar() {
    	return (char) (this.charBase[this.random.nextInt(1_000_000_000) % this.charBase.length]);
    }
}
