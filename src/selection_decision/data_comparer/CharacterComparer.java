package selection_decision.data_comparer;

public class CharacterComparer {
    public static void main(String[] args) {
        char shkronjaPare = 'A';
        char numriFundit = '9';
        char shkronjaEFunditEVogel = 'z';
        char shkronjaAt = '@';

        System.out.printf("A eshte shkronja %c shkronje e madhe: %b %n",
                shkronjaPare,
                shkronjaPare >= 'A' && shkronjaPare <= 'Z'
        );
        System.out.printf("A eshte karakteri %c nje numer: %b %n",
                numriFundit,
                numriFundit >= '0' && numriFundit <= '9'
        );
        System.out.printf("A eshte karakteri %c nje shkronje e vogel: %b %n",
                shkronjaEFunditEVogel,
                shkronjaEFunditEVogel >= 'a' && shkronjaEFunditEVogel <= 'z'
        );
        System.out.printf("A eshte shkronja %c shkronje e madhe: %b %n",
                shkronjaAt,
                shkronjaAt >= 'A' && shkronjaAt <= 'Z'
        );


    }
}











