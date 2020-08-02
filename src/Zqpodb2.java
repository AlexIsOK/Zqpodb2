/**
 * @author Alexander
 */
public class Zqpodb2 {
    
    //64k stack size
    private static final byte[] STACK = new byte[65536];
    
    private static final char COPY      = 'z'; //copy current byte to clipboard
    private static final char INCREMENT = 'q'; //increment current position on stack by one
    private static final char DECREMENT = 'p'; //decrement current position on stack by one
    private static final char POINTER_L = 'b'; //move the pointer to the left
    private static final char POINTER_R = 'd'; //move the pointer to the right
    private static final char OUTPUT    = 'o'; //output the current byte
    private static final char PASTE     = '2'; //set the current byte to the clipboard
    
    //the address for the stack
    private static int pointer = 0;
    
    //clipboard data
    private static byte clipboard = 0;
    
    //minified hello world
    private static final String MIN = "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqzod2qqqqqqqqqqqqqqqqqqqqqqqqqqqqqzod2qqqqqqqzood2qqqzodqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqodbbbbbzdddd2qqqqqqqqqqqqqqqodbbzddd2zod2qqqodbbbbbbzdddddd2zodbbbbbbbbzdddddddd2po";
    
    //hello world explained
    private static final String TEST_STR = "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqzod" + //H
                                                   "2qqqqqqqqqqqqqqqqqqqqqqqqqqqqqzod" + //e
                                                   "2qqqqqqqzood" + //ll
                                                   "2qqqzod" + //o
                                                   "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqod" + //space
                                                   "bbbbbzdddd2qqqqqqqqqqqqqqqod" + //W
                                                   "bbzddd2zod" + //o
                                                   "2qqqod" + //r
                                                   "bbbbbbzdddddd2zod" + //l
                                                   "bbbbbbbbzdddddddd2po"; //d
    
    
    public static void main(String[] args) {
        for(char c : TEST_STR.toCharArray()) {
            switch (c) {
                case COPY -> clipboard = STACK[pointer];
                case INCREMENT -> STACK[pointer]++;
                case DECREMENT -> STACK[pointer]--;
                case POINTER_L -> pointer--;
                case POINTER_R -> pointer++;
                case OUTPUT -> System.out.print((char) STACK[pointer]);
                case PASTE -> STACK[pointer] = clipboard;
            }
        }
    }
    
}
