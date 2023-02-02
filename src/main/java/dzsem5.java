import java.util.*;
import java.util.HashMap;
//Создать словарь HashMap. Обобщение <Integer, String>.
// Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
// Изменить значения сделав пол большой буквой.
// Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
public class dzsem5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Иванов Иван Иванович 26 м");
        hashMap.put(2, "Сидоров Сидр Сидорович 18 м");
        hashMap.put(3, "Петрова Петра Петровна 37 ж");
        hashMap.put(4, "Игнатова Лидия Викторовна 15 ж");
        hashMap.put(5, "Васильев Василий Васильевич 45 м");
        hashMap.forEach((k, v) -> System.out.println(k + " " + v));

        int j=1;
        String str="";
        while(j<=5 && j>=1){
            String tmp = hashMap.get(j);
            String[] text = tmp.split("\r\n");
            for (int i = 0; i < text.length; i++) {
                String[] sb = text[i].split(" ");
                tmp=sb[0]+" "+sb[1]+" "+sb[2]+" "+Integer.valueOf(sb[3])+" " + sb[4].toUpperCase(Locale.ROOT);
                str=sb[0]+" "+sb[1].charAt(0) + ". "+sb[2].charAt(0);
                System.out.println(str);
                hashMap.replace(j,tmp);
                j++;
            }
        }
        System.out.println(hashMap);

        }

    }
