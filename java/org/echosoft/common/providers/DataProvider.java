package org.echosoft.common.providers;

import org.echosoft.common.data.db.Query;

/**
 * Данный интерфейс должны реализовывать все поставщики данных для построителя отчетов.
 *
 * @author Anton Sharapov
 */
public interface DataProvider<T> {

    /**
     * Выполняет поиск запрашиваемых данных. Результат поиска оформляется в виде итератора который по окончании использования должен быть обязательно закрыт.
     *
     * @param query опциональный параметр который может использоваться для уточнения критериев отбора или сортировки запрашиваемых данных.
     * @return "ленивый" итератор по всем данным которые удовлетворяют заданным критериям.
     */
    public BeanIterator<T> execute(Query query) throws Exception;
}
