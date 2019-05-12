package geektime.spring.data.errorcodedemo;

import org.springframework.dao.DuplicateKeyException;

/**
 * Created by Administrator on 2019/5/1.
 */
public class CustomDuplicatedKeyException extends DuplicateKeyException{
    public CustomDuplicatedKeyException(String msg) {
        super(msg);
    }

    public CustomDuplicatedKeyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
