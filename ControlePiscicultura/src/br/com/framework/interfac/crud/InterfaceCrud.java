package br.com.framework.interfac.crud;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public interface InterfaceCrud<T> extends Serializable {

	//salvar os dados
	void save(T obj) throws Exception;
	
	void persist(T obj) throws Exception;
	
	//salvar ou atualizar
	void saveOrUpdate(T obj) throws Exception;
	
	//realiza o update/atualiza��o dos dados
	void update(T obj) throws Exception;
	
	//apaga, exclui os dados
	void delete(T obj) throws Exception;
	
	//salva ou atualiza e retorna objeto em estado persistente
	T merge(T obj) throws Exception;
	
	//carrega a lista de dados de determinada classe
	List<T> findList(Class<T> obj) throws Exception;
	
	Object findById(Class<T> entidades, Long id) throws Exception;
	T findByPorId(Class<T> entidades, Long id) throws Exception;
	
	List<T> findListByQueryDinamica(String s) throws Exception;
	
	//executar update com HQL
	void executeUpdateQueryDinamica(String s) throws Exception;
	
	//executar update com SQL
	void executeUpdateSQLDinamica(String s) throws Exception;
	
	//limpa a sess�o do Hibernate
	void clearSession() throws Exception;
	
	//retira um objeto da sess�o do Hibernate
	void evict(Object obj) throws Exception;
	
	Session getSession() throws Exception;
	
	List<?> getListSQLDinamica(String sql) throws Exception;
	
	//JDBC do spring
	JdbcTemplate getJdbcTemplate();
	
	SimpleJdbcTemplate getSimpleJdbcTemplate();
	
	SimpleJdbcInsert getSimpleJdbcInsert();
	
	Long totalRegistro(String table) throws Exception;
	
	Query obterQuery(String query) throws Exception;
	
	//carregamento dinamico com JSF e PrimeFaces
	List<T> findListByQueryDinamica(String query, int iniciaNoRegistro, int maximoResultado) throws Exception;
	
}
