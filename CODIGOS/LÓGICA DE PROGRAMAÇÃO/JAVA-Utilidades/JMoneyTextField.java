package utilidades;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Campo para a inserção de números com base em um formato.
 *
 * @author Dyorgio da Silva Nascimento
 */
public class JMoneyTextField extends JTextField {

    private static final long serialVersionUID = -7506506392528621022L;
    private static final NumberFormat MONETARY_FORMAT = new DecimalFormat("R$ #,##0.00");
    private NumberFormat numberFormat;
    private int limit = -1;

    public JMoneyTextField(int casasDecimais) {
        this(new DecimalFormat((casasDecimais == 0 ? "#,##0" : "#,##0.") + makeZeros(casasDecimais)));
    }

    public JMoneyTextField() {
        this(MONETARY_FORMAT);
        setText("0"); //formato inicial
    }

    public JMoneyTextField(NumberFormat format) {
        // define o formato do número 
        numberFormat = format;
        initComponents();
    }

    //Inicia as propriedades do textfield
    private void initComponents() {

        setText("0"); //formato inicial
        setForeground(new Color(153, 153, 153)); //inicia o texto com cinza
        setCaretPosition(getText().length()); //posição do caret sempre no final do texto
        setHorizontalAlignment(LEFT);//inicia o texto a esquerda 

        // documento responsável pela formatação do campo 
        setDocument(new PlainDocument() {
            private static final long serialVersionUID = 1L;

            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                String text = new StringBuilder(JMoneyTextField.this.getText().replaceAll("[^0-9]", "")).append(str.replaceAll("[^0-9]", "")).toString();
                super.remove(0, getLength());
                if (text.isEmpty()) {
                    text = "0";
                } else {
                    text = new BigInteger(text).toString();
                }
                super.insertString(0, numberFormat.format(new BigDecimal(getLimit() > 0 == text.length() > getLimit() ? text.substring(0, getLimit()) : text).divide(new BigDecimal(Math.pow(10, numberFormat.getMaximumFractionDigits())))), a);
            }

            @Override
            public void remove(int offs, int len) throws BadLocationException {
                super.remove(offs, len);
                if (len != getLength()) {
                    insertString(0, "", null);
                }
            }
        }); // fim do setDocument()

        //mantém o cursor no final do texto
        addCaretListener(new CaretListener() {
            boolean update = false;

            @Override
            public void caretUpdate(CaretEvent e) {
                if (!update) {
                    update = true;
                    setCaretPosition(getText().length());
                    update = false;
                }
            }
        });

        //limpa o campo se apertar DELETE 
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) { //muda a cor se o texto for diferente de 0 ao digitar qualquer tecla
                if (getValueBigDecimal() != BigDecimal.valueOf(0)) {
                    setForeground(Color.BLACK);
                } else {
                    setForeground(new Color(153, 153, 153));
                }
            }
        });

        //Muda as cores do texto ao entrar no campo e ao sair do campo se o valor for 0
        addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                //setForeground(Color.black);
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) { //muda a cor se o texto for igual a 0 ao sair do campo
                if (getValueBigDecimal() == BigDecimal.valueOf(0.00)) {
                    setForeground(new Color(153, 153, 153));
                }
            }
        });

    } //fim do método initComponents

    /**
     * *
     * Define um valor BigDecimal ao campo**
     *
     * @param value
     */
    public void setValue(BigDecimal value) {
        super.setText(numberFormat.format(value));
    }

    /**
     * *
     * Recupera um valor do textfield no formato BigDecimal (somente os
     * números)**
     *
     * @return
     */
    public final BigDecimal getValueBigDecimal() {
        return new BigDecimal(getText().replaceAll("[^0-9]", "")).divide(new BigDecimal(Math.pow(10, numberFormat.getMaximumFractionDigits())));
    }

    /**
     * Recupera o valor do textfield no formato float a partir do método
     * getValueBigDecimal()
     *
     */
    public final float getValueFloat() {
        BigDecimal valorBigDecimal = new BigDecimal(getValueBigDecimal().toString());
        return valorBigDecimal.floatValue(); //convert bigdecimal para float
    }

    /**
     * *
     * Recupera o formatador atual do campo**
     *
     * @return
     */
    public NumberFormat getNumberFormat() {
        return numberFormat;
    }

    /**
     * *
     * Define o formatador do campo** @param numberFormat
     */
    public void setNumberFormat(NumberFormat numberFormat) {
        this.numberFormat = numberFormat;
    }

    /**
     * *
     * Preenche um StringBuilder com zeros** @param zeros*
     *
     * @return
     */
    private static final String makeZeros(int zeros) {
        if (zeros >= 0) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < zeros; i++) {
                builder.append('0');
            }
            return builder.toString();
        } else {
            throw new RuntimeException("Número de casas decimais inválida (" + zeros + ")");
        }
    }

    /**
     * *
     * Recupera o limite do campo.** @return
     */
    public int getLimit() {
        return limit;
    }

    /**
     * *
     * Define o limite do campo, limit < 0 para deixar livre (default) Ignora os
     * pontos e virgulas do formato, conta* somente com os números** @param
     * limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    // Esse main é apenas para testes (pode ser removido) é opcional
    public static void main(String[] args) {
        JFrame frame = new JFrame("Teste do campo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new JMoneyTextField(new DecimalFormat("R$ 0.00")) {
            {// limita a 4 
                // caracteres 
                setLimit(6);
            }
        });
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
