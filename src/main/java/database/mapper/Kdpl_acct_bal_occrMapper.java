package database.mapper;

import database.model.Kdpl_acct_bal_occr;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface Kdpl_acct_bal_occrMapper {
    // 使用注解方式插入数据
    @Insert("INSERT INTO dmb_i_kdpl_acct_bal_occr (" +
            "lgl_pern_code, cust_num, lblty_acct_num, detl_serl_num, card_num, cust_acct_num, " +
            "sub_acct_serl_num, acct_nm, sub_acct_nick_nm, cust_acct_num_tp, txn_rec_tp, " +
            "back_val_dt, txn_evt, cash_trfr_flg, db_cr_flg, txn_ccy, txn_amt, bal_aft_txn, " +
            "acct_dept_bal, acct_flt_bal, acct_ovdf_bal, prod_code, term_dmd_flg, busi_acctg_code, " +
            "acct_blgd_org, txn_trgr_way, bal_genl_ledger_sycrz_flg, cust_tp, chrg_code, acctg_rec_flg, " +
            "show_flg, cheq_tp, cheq_num, cntpr_cust_tp, cntpr_cust_acct_num, cntpr_acct_nm, " +
            "cntpr_sub_acct_serl_num, cntpr_fincl_org_tp, cntpr_fincl_org_code, cntpr_fincl_org_nm, " +
            "cntpr_intrl_acct_num, cntpr_intrl_acct_org, cntpr_txn_ccy, cntpr_txn_amt, mrcht_tp, " +
            "mrcht_num, mrcht_nm, shop_num, shop_nm, mrcht_cntct_tel, cust_order_id, acq_fincl_org_code, " +
            "acq_fincl_org_nm, acq_org_rung_num, txn_rgon_code, txn_rgon_dt, txn_rgon_time, " +
            "txn_rgon_exch_rate, rel_busi_num, txn_remks, cust_remks, scen_code_list, abst_code, " +
            "abst_dsc, agnt_nm, agnt_docs_catg, agnt_docs_num, agnt_id_issue_cty, agnt_cntct_tel, " +
            "txn_chnl, exte_dt, cnsmr_seq_no, txn_code, glbl_rung_num, txn_rung_num_32, txn_org, txn_tlr, " +
            "txn_dt_8, txn_tm, host_dt, txn_type_id, acct_rerc_num, terml_num, ip_addr, txn_ste, " +
            "err_acct_orig_dt, err_acct_orig_tlr_rung_num, exte_rung_num, file_proc_id, tran_desc, " +
            "user_oprn_code, txn_lgl_pern_code, mntnc_tlr, mntnc_org, mntnc_dt, mntnc_tm, tmstp, " +
            "data_crea_tm, affr_ste, glbl_affr_rung_num, affr_ste_upd_num, btch_grp_num, batch_num, " +
            "empe_of_rec, orig_chnl_code, btch_onln_txn_flg, prod_grp_code) " +
            "VALUES (#{lglPernCode}, #{custNum}, #{lbltyAcctNum}, #{detlSerlNum}, #{cardNum}, #{custAcctNum}, " +
            "#{subAcctSerlNum}, #{acctNm}, #{subAcctNickNm}, #{custAcctNumTp}, #{txnRecTp}, " +
            "#{backValDt}, #{txnEvt}, #{cashTrfrFlg}, #{dbCrFlg}, #{txnCcy}, #{txnAmt}, #{balAftTxn}, " +
            "#{acctDeptBal}, #{acctFltBal}, #{acctOvdfBal}, #{prodCode}, #{termDmdFlg}, #{busiAcctgCode}, " +
            "#{acctBlgdOrg}, #{txnTrgrWay}, #{balGenlLedgerSycrzFlg}, #{custTp}, #{chrgCode}, #{acctgRecFlg}, " +
            "#{showFlg}, #{cheqTp}, #{cheqNum}, #{cntprCustTp}, #{cntprCustAcctNum}, #{cntprAcctNm}, " +
            "#{cntprSubAcctSerlNum}, #{cntprFinclOrgTp}, #{cntprFinclOrgCode}, #{cntprFinclOrgNm}, " +
            "#{cntprIntrlAcctNum}, #{cntprIntrlAcctOrg}, #{cntprTxnCcy}, #{cntprTxnAmt}, #{mrchtTp}, " +
            "#{mrchtNum}, #{mrchtNm}, #{shopNum}, #{shopNm}, #{mrchtCntctTel}, #{custOrderId}, #{acqFinclOrgCode}, " +
            "#{acqFinclOrgNm}, #{acqOrgRungNum}, #{txnRgonCode}, #{txnRgonDt}, #{txnRgonTime}, " +
            "#{txnRgonExchRate}, #{relBusiNum}, #{txnRemks}, #{custRemks}, #{scenCodeList}, #{abstCode}, " +
            "#{abstDsc}, #{agntNm}, #{agntDocsCatg}, #{agntDocsNum}, #{agntIdIssueCty}, #{agntCntctTel}, " +
            "#{txnChnl}, #{exteDt}, #{cnsmrSeqNo}, #{txnCode}, #{glblRungNum}, #{txnRungNum32}, #{txnOrg}, #{txnTlr}, " +
            "#{txnDt8}, #{txnTm}, #{hostDt}, #{txnTypeId}, #{acctRercNum}, #{termlNum}, #{ipAddr}, #{txnSte}, " +
            "#{errAcctOrigDt}, #{errAcctOrigTlrRungNum}, #{exteRungNum}, #{fileProcId}, #{tranDesc}, " +
            "#{userOprnCode}, #{txnLglPernCode}, #{mntncTlr}, #{mntncOrg}, #{mntncDt}, #{mntncTm}, #{tmstp}, " +
            "#{dataCreaTm}, #{affrSte}, #{glblAffrRungNum}, #{affrSteUpdNum}, #{btchGrpNum}, #{batchNum}, " +
            "#{empeOfRec}, #{origChnlCode}, #{btchOnlnTxnFlg}, #{prodGrpCode})")
    void insertKABO(Kdpl_acct_bal_occr entity);
}
