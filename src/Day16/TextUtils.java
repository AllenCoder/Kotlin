package Day16;

/**
 * 文 件 名: TextUtils
 * 创 建 人: Allen
 * 创建日期: 2017/6/23 14:12
 * 修改时间：
 * 修改备注：
 */

public class TextUtils {
    public static boolean isEmpty(CharSequence str) {
        if (str == null || str.equals("")) {
            return true;
        }
        return false;
    }
}
