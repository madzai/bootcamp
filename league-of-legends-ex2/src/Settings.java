public final class Settings {
        public static final int ARCHER = 0;
        public static final int MAGE = 1;
        public static final int WARRIOR = 2;

        public static final int LEVEL_INIT = 1;

        public static final int[] baseMaxHP = new int[] {100, 100, 100};
        public static final int[] baseMaxMP = new int[] {20, 20, 20};
        public static final int[] consumeMP = new int[] {10, 10, 10};
        public static final int[] basePA = new int[] {30, 30, 30};
        public static final int[] basePD = new int[] {10, 10, 10};
        public static final int[] baseMA = new int[] {40, 40, 40};
        public static final int[] baseMD = new int[] {20, 20, 20};
        public static final int[] baseAG = new int[] {40, 40, 40};
        public static final double[] baseCC = new double[] {0.2, 0.2, 0.2};
        public static final double[] critMultiplier =
                        new double[] {1.2, 1.2, 1.2};

        public static final int[] incMaxHP = new int[] {10, 10, 10};
        public static final int[] incMaxMP = new int[] {10, 10, 10};
        public static final int[] incPA = new int[] {10, 10, 10};
        public static final int[] incMA = new int[] {10, 10, 10};
        public static final int[] incPD = new int[] {10, 10, 10};
        public static final int[] incMD = new int[] {10, 10, 10};
        public static final int[] incAG = new int[] {10, 10, 10};
        public static final double[] incCC = new double[] {0.05, 0.05, 0.05};

        public static final String[] WEAPON_TYPES =
                        new String[] {"Bow", "Stave", "Sword"};

        public static final String[][] WEAPON_NAMES = new String[][] { //
                        {"Recurve", "Archangel", "Doran"}, //
                        {"Guinsoo", "Liandry", "Hexdrinker"} //
        };

        public static final int[][] WEAPON_PA = new int[][] { //
                        {20, 20, 20}, 
                        {30, 30, 30} 
        }
        public static final int[][] WEAPON_MA = new int[][] { //
                        {30, 30, 30}, //
                        {40, 40, 40} //
        };
        public static final double[][] WEAPON_CC = new double[][] { //
                        {0.1, 0.1, 0.1}, //
                        {0.2, 0.2, 0.2} //
        };

        public static final int[][] WEAPON_incPA = new int[][] { //
                        {10, 10, 10}, 
                        {10, 10, 10} 
        }
        public static final int[][] WEAPON_incMA = new int[][] { //
                        {10, 10, 10}, //
                        {10, 10, 10} //
        };
        public static final double[][] WEAPON_incCC = new double[][] { //
                        {0.1, 0.1, 0.1}, //
                        {0.1, 0.1, 0.1} //
        };
}
