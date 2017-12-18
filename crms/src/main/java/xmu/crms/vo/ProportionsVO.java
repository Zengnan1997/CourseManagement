package xmu.crms.vo;
/**
 * @author ZhangChuBing
 * @date 2017-12-3
 */
public class ProportionsVO {
    private int report;
    private int presentation;
    private int a;
    private int b;
    private int c;

    public ProportionsVO(int report, int presentation, int a, int b, int c) {
        this.report = report;
        this.presentation = presentation;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "ProportionsVO{" +
                "report=" + report +
                ", presentation=" + presentation +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int getReport() {
        return report;
    }

    public void setReport(int report) {
        this.report = report;
    }

    public int getPresentation() {
        return presentation;
    }

    public void setPresentation(int presentation) {
        this.presentation = presentation;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
