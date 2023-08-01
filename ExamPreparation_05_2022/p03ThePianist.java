package ExamPreparation_05_2022;
<<<<<<< HEAD
import java.util.*;


public class p03ThePianist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPieces = Integer.parseInt(scanner.nextLine());

        //info for pieces

        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int pieces = 1; pieces <= countPieces; pieces++) {

            String pieceData = scanner.nextLine();
            //"{piece}|{composer}|{key}"
            String[] piecesPart = pieceData.split("\\|");
            String piecesName = piecesPart[0];
            String composer = piecesPart[1];
            String tone = piecesPart[2];

            List<String> piecesInfo = new ArrayList<>();
            piecesInfo.add(composer);
            piecesInfo.add(tone);

            piecesMap.put(piecesName, piecesInfo);

        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            //"Add|{piece}|{composer}|{key}":
            if (command.contains("Add")) {
                String pieceName = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String tone = command.split("\\|")[3];

                // има таква пиеса
                if (piecesMap.containsKey(pieceName)) {
                    System.out.println(pieceName + " is already in the collection!%n");
                } else {
                    List<String> info = new ArrayList<>();
                    info.add(composer);
                    info.add(tone);

                    piecesMap.put(pieceName, info);
                    System.out.printf("%s by %s in %s added to the collection!%n", pieceName, composer, tone);
                }

            } else if (command.contains("Remove")) {
                //"Remove|{piece}":
                String removePiece = command.split("\\|")[1];
                if (piecesMap.containsKey(removePiece)) {
                    piecesMap.remove(removePiece);
                    System.out.printf("Successfully removed!%s%n", removePiece);

                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", removePiece);
                }
            } else if (command.contains("ChangeKey")) {
                //"ChangeKey|{piece}|{new key}":
                String pieceName = command.split("\\|")[1];
                String newTone = command.split("\\|")[2];

                if (!piecesMap.containsKey(pieceName)) {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                } else {
                    List<String> currentInfo = piecesMap.get(pieceName);
                    currentInfo.remove(1);
                    currentInfo.add(newTone);
                    piecesMap.put(pieceName, currentInfo);

                    System.out.printf("Changed the key of %s to %s!%n", pieceName, newTone);
                }
            }
            command = scanner.nextLine();
        }
        piecesMap.entrySet().forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
=======

public class p03ThePianist {
>>>>>>> 44dd1839f453246f067a55835254aa96b99907a4
}
