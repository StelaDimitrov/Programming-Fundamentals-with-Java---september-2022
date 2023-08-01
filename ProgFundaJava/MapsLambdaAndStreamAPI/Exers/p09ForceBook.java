package MapsLambdaAndStreamAPI.Exers;

import java.util.*;

public class p09ForceBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> map = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")) {

            if (command.contains(" | ")) {

                String group = command.split("\\s+\\|\\s+")[0];
                String user = command.split("\\s+\\|\\s+")[1];
                // има ли такава група
                if (!map.containsKey(group)) {
                    // група - празен списък
                    map.put(group, new ArrayList<>());
                }
                // има такав група - добавяме към групата user, ако го няма вникоя друга група
                boolean isExistUser = false;
                for (List<String> listUsers : map.values()) {
                    if (listUsers.contains(user)) {
                        // user го има в някоя група
                        isExistUser = true;
                        break;
                    }
                }
                if (!isExistUser) {
                    // user го няма в нашата група
                    map.get(group).add(user);
                }

            } else if (command.contains(" -> ")) {

                String user = command.split("\\s+->\\s+")[0];
                String group = command.split("\\s+->\\s+")[1];

                // ако дадения user го има в дадена група го премахваме
                // Запис - група (key) -> списък с users
                map.entrySet().forEach(entry -> entry.getValue().remove(user));

                // проверяваме дали имаме такава група
                if (map.containsKey(group)) {
                    map.get(group).add(user);
                } else {
                    //нямаме такав група и я създаваме
                    map.put(group, new ArrayList<>());
                    map.get(group).add(user);
                }
                System.out.printf("%s joins the %s side!%n", user, group);
            }
            command = scanner.nextLine();
        }

        // записи - група и списък с users
        //филтираме записитем - само тези на който не е празен
        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)//оставяме само списъка със записи
                .forEach(entry -> {

                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! " + user));


                });
    }
}


