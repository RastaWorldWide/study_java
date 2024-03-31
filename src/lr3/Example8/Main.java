package lr3.Example8;

public class Main {
    public static void main(String[] args) {
        Example8 list = new Example8();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        System.out.println("Список после добавления:");
        System.out.println(list.toString());

        list.remove(1);

        System.out.println("Список после удаления элемента с индексом 1:");
        System.out.println(list.toString());

        list.addFirst(0);

        System.out.println("Список после добавления элемента в начало:");
        System.out.println(list.toString());

        list.Insert(2, 4);

        System.out.println("Список после вставки элемента на позицию 2:");
        System.out.println(list.toString());

        list.removeFirst();

        System.out.println("Список после удаления первого элемента:");
        System.out.println(list.toString());

        list.removeLast();

        System.out.println("Список после удаления последнего элемента:");
        System.out.println(list.toString());
    }
}

