package effectiveJava.overrideEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Description 对称性 这个例子就是违反了对称性,cis.equals(s)=true,反之=false
 * @Author lcc
 * @UpdateDate 2021/3/18 17:30
 * @Param
 * @Return
 */
public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(
                    ((CaseInsensitiveString) o).s);
        }
        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        System.out.println(cis.equals(s));//true
        System.out.println(s.equals(cis));//false

        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(s));
    }

//    // Fixed equals method (Page 40)
//    @Override
//    public boolean equals(Object o) {
//        return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
//    }
}
