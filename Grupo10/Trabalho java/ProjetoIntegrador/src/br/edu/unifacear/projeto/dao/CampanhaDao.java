package br.edu.unifacear.projeto.dao;

public class CampanhaDao extends Dao{
	private String SQL_INSERT ="INSERT INTO TB_CAMPANHA(idCampanha,datainicio,datafim,nomeCampanha, status)values(?,?,?,?,?);";
	private String SQL_UPDATE ="UPDATE TB_CAMPANHA SET datainicio =?, datafim = ?, nomeCampanha = ?, status = ? WHERE cpf = ?;";
	private String SQL_DELETE ="UPDATE TB_CAMPANHA SET status = ? WHERE cpf = ?;";
	private String SQL_SELECT ="SELECT * FROM TB_CAMPANHA;";
	

}
