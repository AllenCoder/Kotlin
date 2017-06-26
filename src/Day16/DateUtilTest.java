package Day16;


/**
 * 文 件 名: DateUtilTest
 * 创 建 人: Allen
 * 创建日期: 2017/5/15 14:35
 * 修改时间：
 * 修改备注：
 */
public class DateUtilTest {
    //    @`Test.kt`
//    public void testCalcTime() throws Exception {
//        System.out.println("2017-05-15 14:49:11 = " + DateUtil.calcTime("2017-05-15 14:54:11",new Date().getTime()));
//        System.out.println("2017-05-15 14:49:11 = " + DateUtil.calcTime("2017-05-15 14:29:11",new Date().getTime()));
//        System.out.println("2017-05-15 14:49:11 = " + DateUtil.calcTime("2017-05-15 10:49:11",new Date().getTime()));
//        System.out.println("2017-05-11 14:37:11 = " + DateUtil.calcTime("2017-05-13 14:37:11",new Date().getTime()));
//        System.out.println("2016-05-13 14:37:11 = " + DateUtil.calcTime("2016-05-13 14:37:11",new Date().getTime()));
//    }

    public static void main(String[] args) {


        System.out.println("args = " + test("","1","","","") );;
        System.out.println("args = " + test("","1","2","","") );;
        System.out.println("args = " + test("","1","2","3",""));;
        System.out.println("args = " + test("","1","2","3","4") );;

        System.out.println("args = " + test("1","","","","") );;
        System.out.println("args = " + test("1","","2","","") );;
        System.out.println("args = " + test("1","","2","3",""));;
        System.out.println("args = " + test("1","","2","3","4") );;


        System.out.println("args = " + test("1","","2","","") );
        System.out.println("args = " + test("1","","","3","") );
        System.out.println("args = " + test("1","","","","4") );
        System.out.println("args = " + test("1","","","3","4"));
        System.out.println("args = " + test("1","","2","3",""));
        System.out.println("args = " + test("1","","2","","4"));


        System.out.println("args = " + test("","","2","","") );
        System.out.println("args = " + test("","","2","3","") );
        System.out.println("args = " + test("","","2","3","4") );
        System.out.println("args = " + test("","","","3",""));
        System.out.println("args = " + test("","","","3","4"));
        System.out.println("args = " + test("","","","","4"));

        System.out.println("args = " + test("1","2","3","4","5") );;
    }

    public static String test(String rqspf,
                              String spf,
                              String bifen,
                              String zjq,
                              String bqc) {

        StringBuffer select = new StringBuffer();

        if (!TextUtils.isEmpty(rqspf.toString())) {
            select.append(spf.toString()).append("|").append(rqspf.toString());
        } else {
            select.append(spf.toString());
        }
        if (!TextUtils.isEmpty(bifen.toString())) {
            select.append(";").append(bifen.toString());
        }
        if (!TextUtils.isEmpty(zjq.toString())) {
            if (!TextUtils.isEmpty(bifen.toString())) {
                select.append(";").append(zjq.toString());
            } else {
                select.append(";;").append(zjq.toString());
            }
        }
        if (!TextUtils.isEmpty(bqc.toString())) {
            if (!TextUtils.isEmpty(zjq.toString())) {
                select.append(";").append(bqc.toString());
            } else {
                if (!TextUtils.isEmpty(bifen.toString())) {
                    select.append(";;").append(bqc.toString());
                } else {
                    select.append(";;;").append(bqc.toString());
                }
            }
        }
        return select.toString();
    }

}
