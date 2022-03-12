public class phraseomaticapp {
    public static void main(String[] args) {
        String [] wordListOne = {"Cool", "Funny", "Boring", "Awesome", "Hard", "Easy", "Ugly"};
        String [] wordListTwo = {"Red", "Green", "Blue", "Yellow", "Orange", "Purple", "White", "Black"};
        String[] wordListThree = {"Hat", "Pen", "Book", "Watch", "Shoes", "Glasses", "Chair"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}
