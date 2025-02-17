package utilitarias;

public class FiltroCharacterTextField {
    public static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    public static final String UPPERCASE_NO_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_SPECIAL = "áâéíõúçãàêóôü";
    public static final String UPPERCASE_SPECIAL = "ÁÂÉÍÕÚÇÃÀÊÓÔÜ";
    public static final String ALPHA = LOWERCASE + UPPERCASE; 
    public static final String NUMERIC = "0123456789";
    public static final String DECIMAL = NUMERIC + "," + ".";
    public static final String PONTO = ".";
    public static final String UPPERCASE_NUMERIC_PONTO = UPPERCASE + NUMERIC + PONTO;
    public static final String UPPERCASE_NUMERIC = UPPERCASE + NUMERIC;
    public static final String UPPERCASE_NUMERIC_NO_SPACE = UPPERCASE_NO_SPACE + NUMERIC;
    public static final String LOWERCASE_NUMERIC = LOWERCASE + NUMERIC;
    public static final String ALPHA_NUMERIC = ALPHA + NUMERIC;
    public static final String ALPHA_NUMERIC_UPPERCASE = UPPERCASE + NUMERIC;
    public static final String SPECIAL = "ºª";
    public static final String ENDERECO = UPPERCASE.trim() + DECIMAL + LOWERCASE;
    public static String FULL = ALPHA_NUMERIC + LOWERCASE_SPECIAL + UPPERCASE_SPECIAL + SPECIAL;
    /* TIPOS PRÉ DEFINIDOS */
    public static final String DATE = NUMERIC + "/";
    public static final String CEP = NUMERIC + "-";
    public static final String EMAIL = "abcdefghijklmnopqrstuvwxyz" +  NUMERIC + "_@-.+";
}
