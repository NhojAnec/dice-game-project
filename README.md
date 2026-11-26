# Dice Roll & Guessing Game (โปรแกรมทอยลูกเต๋า)

A desktop dice rolling and guessing game built in Java Swing, paired with a flat-file user registration and login system.

**Portfolio page:** https://nhojanec.github.io/dice-game-project/

The page walks through every original Swing window with screenshots, lets you play an interactive replica of the GUI directly in your browser, maps out the two packages and flat files, and documents the coursework bugs left in the code when the project closed.

## What's in this repo

| Path | What it is |
| --- | --- |
| `index.html`, `shots/` | The portfolio page and screenshots of the real Java Swing windows |
| `Java_FinalProject/` | The NetBeans / Ant Java project, kept as finished (with personal names/IDs removed from comments) |
| `Java_FinalProject/src/user.txt` | Sample registered accounts (`id,displayName,username,password`) |
| `Java_FinalProject/src/Main/HistoryLog.txt` | Saved roll history (`username;type;result`) |

The Java logic is kept as it was at submission. Known bugs and unfinished parts are documented on the portfolio page rather than fixed.

## Run it yourself

 GitHub Pages can't run desktop Java windows directly, so the page includes an in-browser replica. To run the real Swing app on your computer:

### Option 1: NetBeans (JDK 8)
1. Open the `Java_FinalProject` folder in NetBeans.
2. Run the project (`F6`), which launches `frmLogin` from the project root so `"src/user.txt"` and `"src/Main/HistoryLog.txt"` resolve properly.

### Option 2: Command line (JDK 9+)
Newer JDKs restrict `sun.swing.table.DefaultTableCellHeaderRenderer` (used by `History.java`), so pass `--add-exports` and run from inside `Java_FinalProject`:

```bash
cd Java_FinalProject
java -Dfile.encoding=UTF-8 --add-exports java.desktop/sun.swing.table=ALL-UNNAMED -cp build/classes frmLogin
```

## Built with

Java 8, Java Swing (`JFrame`, `JDialog`, `JTable`, `JOptionPane`, Nimbus Look & Feel), NetBeans Form Editor (`GroupLayout`), and flat-file I/O (`BufferedReader`, `BufferedWriter`, `Scanner`, `Formatter`).
