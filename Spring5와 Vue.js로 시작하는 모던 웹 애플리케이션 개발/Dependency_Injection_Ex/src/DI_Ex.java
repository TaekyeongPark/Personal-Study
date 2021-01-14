public class DI_Ex {
    public static void main(String[] args){
        /*
            의존성 주입을 통해 의존 요소들을 쉽게 갈아끼울 수 있다.
            이 예제에서는 player 객체의 weapon이라는 의존성 주입을 세터를 통해 수행
        */
        Player player = new Player();

        player.setWeapon(new Gun());
        player.usePlayerWeapon();

        player.setWeapon(new Knife());
        player.usePlayerWeapon();

        player.setWeapon(new Spike());
        player.usePlayerWeapon();

    }
}
