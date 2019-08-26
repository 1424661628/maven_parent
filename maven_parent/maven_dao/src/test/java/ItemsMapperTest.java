import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lvmen on 2019/8/26
 */
public class ItemsMapperTest {

    @Test
    public void testFindItemsById() {
//获取 spring 容器
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
//获取 Mapper
        ItemsDao itemsMapper =
                applicationContext.getBean(ItemsDao.class);
//调用 Mapper 方法
        Items items = itemsMapper.findById(1);
        System.out.println(items);
    }
}
