package database.model;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class Kdpl_acct_bal_occr {
    private String lglPernCode = "14"; // 'corporate code'
    private String custNum = "00001770513441"; // 'Customer Number'
    private String lbltyAcctNum = "76400081500000006416876"; // 'Liability Account Number'
    private Long detlSerlNum = 0L; // 'Detail serial number'
    private String cardNum = null; // 'Card Number'
    private String custAcctNum = "8156416876"; // 'Account Number'
    private String subAcctSerlNum = "001"; // 'Sub-account serial number'
    private String acctNm = "เธเธฒเธข"; // 'account name'
    private String subAcctNickNm = null; // 'sub-account nickname'
    private String custAcctNumTp = "SA01"; // 'Account Type'
    private String txnRecTp = "A"; // 'trxn record type (A-Principalt, B-Floating Amount, etc.)'
    private String backValDt = ""; // 'Reversal Start Date'
    private String txnEvt = "DP007"; // 'transaction event'
    private String cashTrfrFlg = "1"; // 'Cash Transfer Indicator'
    private String dbCrFlg = "1"; // 'Debit Or Credit Indicator'
    private String txnCcy = "764"; // 'Transaction currency'
    private BigDecimal txnAmt = BigDecimal.ZERO; // 'Transaction Amount'
    private BigDecimal balAftTxn = BigDecimal.ZERO; // 'balance after transaction'
    private BigDecimal acctDeptBal = BigDecimal.ZERO; // 'account deposit balance'
    private BigDecimal acctFltBal = BigDecimal.ZERO; // 'account float balance'
    private BigDecimal acctOvdfBal = BigDecimal.ZERO; // 'account overdraft balance'
    private String prodCode = "120"; // 'Product Code'
    private String termDmdFlg = "0"; // 'Demand Or Fixed Deposit Indicator'
    private String busiAcctgCode = "DP1001"; // 'Accounting code'
    private String acctBlgdOrg = "5045"; // 'account belonged organization'
    private String txnTrgrWay = "0"; // 'Transaction Triggering Method'
    private String balGenlLedgerSycrzFlg = null; // 'Balance GL Sync Flag'
    private String custTp = "1"; // 'Customer type'
    private String chrgCode = ""; // 'Fee Code'
    private String acctgRecFlg = "1"; // 'accounting record flag'
    private String showFlg = "1"; // 'show flag'
    private String cheqTp = ""; // 'Cheque Type'
    private String cheqNum = ""; // 'cheque number'
    private String cntprCustTp = ""; // 'Counterparty customer type'
    private String cntprCustAcctNum = ""; // 'Counterparty Customer Account Number'
    private String cntprAcctNm = ""; // 'Transferor Account Name'
    private String cntprSubAcctSerlNum = null; // 'Counterparty sub account sequence number'
    private String cntprFinclOrgTp = null; // 'Counterparty financial institution type'
    private String cntprFinclOrgCode = ""; // 'counterparty financial institution code'
    private String cntprFinclOrgNm = ""; // 'Counterparty Financial Institution Name'
    private String cntprIntrlAcctNum = null; // 'counterparty internal account number'
    private String cntprIntrlAcctOrg = ""; // 'counterparty internal account institution'
    private String cntprTxnCcy = ""; // 'counterparty transaction currency'
    private BigDecimal cntprTxnAmt = BigDecimal.ZERO; // 'counterparty transaction amount'
    private String mrchtTp = "XO"; // 'merchant type'
    private String mrchtNum = "020140"; // 'merchant number'
    private String mrchtNm = ""; // 'merchant name'
    private String shopNum = ""; // 'Store number'
    private String shopNm = ""; // 'Store Name'
    private String mrchtCntctTel = ""; // 'merchant contact telephone'
    private String custOrderId = "dp6001"; // 'Customer Order ID'
    private String acqFinclOrgCode = "63661098039121570815004166797940"; // 'acquiring financial institution code'
    private String acqFinclOrgNm = "2025081430110000000000000026"; // 'acquiring financial institution name'
    private String acqOrgRungNum = "5045"; // 'acquiring institution running number'
    private String txnRgonCode = ""; // 'trxn region code'
    private String txnRgonDt = "20250814"; // 'trxn region date'
    private Long txnRgonTime = 135304L; // 'trxn region time'
    private BigDecimal txnRgonExchRate = BigDecimal.ZERO; // 'trxn region exchange rate'
    private String relBusiNum = "20241015"; // 'Related business number'
    private String txnRemks = ""; // 'transaction remarks'
    private String custRemks = ""; // 'customer remarks'
    private String scenCodeList = null; // 'List of Scenario Codes'
    private String abstCode = ""; // 'summary code'
    private String abstDsc = ""; // 'summary description'
    private String agntNm = ""; // 'agent name'
    private String agntDocsCatg = ""; // 'agent documents category'
    private String agntDocsNum = ""; // 'agent documents number'
    private String agntIdIssueCty = ""; // 'Third Party ID Issuing Country'
    private String agntCntctTel = ""; // 'agent contact telephone'
    private String txnChnl = "dp6001"; // 'transaction channel'
    private String exteDt = "63661098039121570815004166797940"; // 'external date'
    private String cnsmrSeqNo = "2770"; // 'consumer sequence number'
    private String txnCode = "14"; // 'Transaction code'
    private String glblRungNum = "99999"; // 'Global Transaction Sequence Number'
    private String txnRungNum32 = "66002"; // 'Transaction Journal Number'
    private String txnOrg = "20250814"; // 'Transaction Branch'
    private String txnTlr = "162853451"; // 'Teller lD'
    private String txnDt8 = "2024-10-15"; // 'transaction date'
    private Long txnTm = 1728980933538L; // 'transaction hour'
    private String hostDt = "2024-10-15 16:28:53:538"; // 'host date'
    private String txnTypeId = "O"; // 'transaction type identification'
    private String acctRercNum = "suncbs-report-bat17289809334510081836"; // 'Account Reference Number'
    private String termlNum = null; // 'terminal number'
    private String ipAddr = "1"; // 'IP Address'
    private String txnSte = null; // 'Transaction Status'
    private String errAcctOrigDt = "0"; // 'error account original date'
    private String errAcctOrigTlrRungNum = ""; // 'error account original teller running number'
    private String exteRungNum = ""; // 'external flow'
    private String fileProcId = null; // 'file process id'
    private String tranDesc = "1"; // 'transaction description'
    private String userOprnCode = null; // 'user operation code'
    private String txnLglPernCode = null; // 'Transaction Legal Person Code'
    private String mntncTlr = null; // 'maintenance teller'
    private String mntncOrg = null; // 'maintenance agency'
    private String mntncDt = null; // 'maintenance date'
    private String mntncTm = null; // 'maintenance time'
    private Long tmstp = null; // 'timestamp'
    private String dataCreaTm = null; // 'data create time'
    private String affrSte = null; // 'Affair Status'
    private String glblAffrRungNum = null; // 'Overall Business Log Sheet No.'
    private String affrSteUpdNum = null; // 'Unique Business Status Update No.'
    private String btchGrpNum = null; // 'Batch Group Number'
    private String batchNum = null; // 'batch number'
    private String empeOfRec = null; // 'employee record id (EOR)'
    private String origChnlCode = null; // 'Original channel code'
    private String btchOnlnTxnFlg = null; // 'Batch Online Transaction Flag'
    private String prodGrpCode = null; // 'Product Group Code'

    public String getLglPernCode() {
        return lglPernCode;
    }

    public void setLglPernCode(String lglPernCode) {
        this.lglPernCode = lglPernCode;
    }

    public String getCustNum() {
        return custNum;
    }

    public void setCustNum(String custNum) {
        this.custNum = custNum;
    }

    public String getLbltyAcctNum() {
        return lbltyAcctNum;
    }

    public void setLbltyAcctNum(String lbltyAcctNum) {
        this.lbltyAcctNum = lbltyAcctNum;
    }

    public Long getDetlSerlNum() {
        return detlSerlNum;
    }

    public void setDetlSerlNum(Long detlSerlNum) {
        this.detlSerlNum = detlSerlNum;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCustAcctNum() {
        return custAcctNum;
    }

    public void setCustAcctNum(String custAcctNum) {
        this.custAcctNum = custAcctNum;
    }

    public String getSubAcctSerlNum() {
        return subAcctSerlNum;
    }

    public void setSubAcctSerlNum(String subAcctSerlNum) {
        this.subAcctSerlNum = subAcctSerlNum;
    }

    public String getAcctNm() {
        return acctNm;
    }

    public void setAcctNm(String acctNm) {
        this.acctNm = acctNm;
    }

    public String getSubAcctNickNm() {
        return subAcctNickNm;
    }

    public void setSubAcctNickNm(String subAcctNickNm) {
        this.subAcctNickNm = subAcctNickNm;
    }

    public String getCustAcctNumTp() {
        return custAcctNumTp;
    }

    public void setCustAcctNumTp(String custAcctNumTp) {
        this.custAcctNumTp = custAcctNumTp;
    }

    public String getTxnRecTp() {
        return txnRecTp;
    }

    public void setTxnRecTp(String txnRecTp) {
        this.txnRecTp = txnRecTp;
    }

    public String getBackValDt() {
        return backValDt;
    }

    public void setBackValDt(String backValDt) {
        this.backValDt = backValDt;
    }

    public String getTxnEvt() {
        return txnEvt;
    }

    public void setTxnEvt(String txnEvt) {
        this.txnEvt = txnEvt;
    }

    public String getCashTrfrFlg() {
        return cashTrfrFlg;
    }

    public void setCashTrfrFlg(String cashTrfrFlg) {
        this.cashTrfrFlg = cashTrfrFlg;
    }

    public String getDbCrFlg() {
        return dbCrFlg;
    }

    public void setDbCrFlg(String dbCrFlg) {
        this.dbCrFlg = dbCrFlg;
    }

    public String getTxnCcy() {
        return txnCcy;
    }

    public void setTxnCcy(String txnCcy) {
        this.txnCcy = txnCcy;
    }

    public BigDecimal getTxnAmt() {
        return txnAmt;
    }

    public void setTxnAmt(BigDecimal txnAmt) {
        this.txnAmt = txnAmt;
    }

    public BigDecimal getBalAftTxn() {
        return balAftTxn;
    }

    public void setBalAftTxn(BigDecimal balAftTxn) {
        this.balAftTxn = balAftTxn;
    }

    public BigDecimal getAcctDeptBal() {
        return acctDeptBal;
    }

    public void setAcctDeptBal(BigDecimal acctDeptBal) {
        this.acctDeptBal = acctDeptBal;
    }

    public BigDecimal getAcctFltBal() {
        return acctFltBal;
    }

    public void setAcctFltBal(BigDecimal acctFltBal) {
        this.acctFltBal = acctFltBal;
    }

    public BigDecimal getAcctOvdfBal() {
        return acctOvdfBal;
    }

    public void setAcctOvdfBal(BigDecimal acctOvdfBal) {
        this.acctOvdfBal = acctOvdfBal;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getTermDmdFlg() {
        return termDmdFlg;
    }

    public void setTermDmdFlg(String termDmdFlg) {
        this.termDmdFlg = termDmdFlg;
    }

    public String getBusiAcctgCode() {
        return busiAcctgCode;
    }

    public void setBusiAcctgCode(String busiAcctgCode) {
        this.busiAcctgCode = busiAcctgCode;
    }

    public String getAcctBlgdOrg() {
        return acctBlgdOrg;
    }

    public void setAcctBlgdOrg(String acctBlgdOrg) {
        this.acctBlgdOrg = acctBlgdOrg;
    }

    public String getTxnTrgrWay() {
        return txnTrgrWay;
    }

    public void setTxnTrgrWay(String txnTrgrWay) {
        this.txnTrgrWay = txnTrgrWay;
    }

    public String getBalGenlLedgerSycrzFlg() {
        return balGenlLedgerSycrzFlg;
    }

    public void setBalGenlLedgerSycrzFlg(String balGenlLedgerSycrzFlg) {
        this.balGenlLedgerSycrzFlg = balGenlLedgerSycrzFlg;
    }

    public String getCustTp() {
        return custTp;
    }

    public void setCustTp(String custTp) {
        this.custTp = custTp;
    }

    public String getChrgCode() {
        return chrgCode;
    }

    public void setChrgCode(String chrgCode) {
        this.chrgCode = chrgCode;
    }

    public String getAcctgRecFlg() {
        return acctgRecFlg;
    }

    public void setAcctgRecFlg(String acctgRecFlg) {
        this.acctgRecFlg = acctgRecFlg;
    }

    public String getShowFlg() {
        return showFlg;
    }

    public void setShowFlg(String showFlg) {
        this.showFlg = showFlg;
    }

    public String getCheqTp() {
        return cheqTp;
    }

    public void setCheqTp(String cheqTp) {
        this.cheqTp = cheqTp;
    }

    public String getCheqNum() {
        return cheqNum;
    }

    public void setCheqNum(String cheqNum) {
        this.cheqNum = cheqNum;
    }

    public String getCntprCustTp() {
        return cntprCustTp;
    }

    public void setCntprCustTp(String cntprCustTp) {
        this.cntprCustTp = cntprCustTp;
    }

    public String getCntprCustAcctNum() {
        return cntprCustAcctNum;
    }

    public void setCntprCustAcctNum(String cntprCustAcctNum) {
        this.cntprCustAcctNum = cntprCustAcctNum;
    }

    public String getCntprAcctNm() {
        return cntprAcctNm;
    }

    public void setCntprAcctNm(String cntprAcctNm) {
        this.cntprAcctNm = cntprAcctNm;
    }

    public String getCntprSubAcctSerlNum() {
        return cntprSubAcctSerlNum;
    }

    public void setCntprSubAcctSerlNum(String cntprSubAcctSerlNum) {
        this.cntprSubAcctSerlNum = cntprSubAcctSerlNum;
    }

    public String getCntprFinclOrgTp() {
        return cntprFinclOrgTp;
    }

    public void setCntprFinclOrgTp(String cntprFinclOrgTp) {
        this.cntprFinclOrgTp = cntprFinclOrgTp;
    }

    public String getCntprFinclOrgCode() {
        return cntprFinclOrgCode;
    }

    public void setCntprFinclOrgCode(String cntprFinclOrgCode) {
        this.cntprFinclOrgCode = cntprFinclOrgCode;
    }

    public String getCntprFinclOrgNm() {
        return cntprFinclOrgNm;
    }

    public void setCntprFinclOrgNm(String cntprFinclOrgNm) {
        this.cntprFinclOrgNm = cntprFinclOrgNm;
    }

    public String getCntprIntrlAcctNum() {
        return cntprIntrlAcctNum;
    }

    public void setCntprIntrlAcctNum(String cntprIntrlAcctNum) {
        this.cntprIntrlAcctNum = cntprIntrlAcctNum;
    }

    public String getCntprIntrlAcctOrg() {
        return cntprIntrlAcctOrg;
    }

    public void setCntprIntrlAcctOrg(String cntprIntrlAcctOrg) {
        this.cntprIntrlAcctOrg = cntprIntrlAcctOrg;
    }

    public String getCntprTxnCcy() {
        return cntprTxnCcy;
    }

    public void setCntprTxnCcy(String cntprTxnCcy) {
        this.cntprTxnCcy = cntprTxnCcy;
    }

    public BigDecimal getCntprTxnAmt() {
        return cntprTxnAmt;
    }

    public void setCntprTxnAmt(BigDecimal cntprTxnAmt) {
        this.cntprTxnAmt = cntprTxnAmt;
    }

    public String getMrchtTp() {
        return mrchtTp;
    }

    public void setMrchtTp(String mrchtTp) {
        this.mrchtTp = mrchtTp;
    }

    public String getMrchtNum() {
        return mrchtNum;
    }

    public void setMrchtNum(String mrchtNum) {
        this.mrchtNum = mrchtNum;
    }

    public String getMrchtNm() {
        return mrchtNm;
    }

    public void setMrchtNm(String mrchtNm) {
        this.mrchtNm = mrchtNm;
    }

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum;
    }

    public String getShopNm() {
        return shopNm;
    }

    public void setShopNm(String shopNm) {
        this.shopNm = shopNm;
    }

    public String getMrchtCntctTel() {
        return mrchtCntctTel;
    }

    public void setMrchtCntctTel(String mrchtCntctTel) {
        this.mrchtCntctTel = mrchtCntctTel;
    }

    public String getCustOrderId() {
        return custOrderId;
    }

    public void setCustOrderId(String custOrderId) {
        this.custOrderId = custOrderId;
    }

    public String getAcqFinclOrgCode() {
        return acqFinclOrgCode;
    }

    public void setAcqFinclOrgCode(String acqFinclOrgCode) {
        this.acqFinclOrgCode = acqFinclOrgCode;
    }

    public String getAcqFinclOrgNm() {
        return acqFinclOrgNm;
    }

    public void setAcqFinclOrgNm(String acqFinclOrgNm) {
        this.acqFinclOrgNm = acqFinclOrgNm;
    }

    public String getAcqOrgRungNum() {
        return acqOrgRungNum;
    }

    public void setAcqOrgRungNum(String acqOrgRungNum) {
        this.acqOrgRungNum = acqOrgRungNum;
    }

    public String getTxnRgonCode() {
        return txnRgonCode;
    }

    public void setTxnRgonCode(String txnRgonCode) {
        this.txnRgonCode = txnRgonCode;
    }

    public String getTxnRgonDt() {
        return txnRgonDt;
    }

    public void setTxnRgonDt(String txnRgonDt) {
        this.txnRgonDt = txnRgonDt;
    }

    public Long getTxnRgonTime() {
        return txnRgonTime;
    }

    public void setTxnRgonTime(Long txnRgonTime) {
        this.txnRgonTime = txnRgonTime;
    }

    public BigDecimal getTxnRgonExchRate() {
        return txnRgonExchRate;
    }

    public void setTxnRgonExchRate(BigDecimal txnRgonExchRate) {
        this.txnRgonExchRate = txnRgonExchRate;
    }

    public String getRelBusiNum() {
        return relBusiNum;
    }

    public void setRelBusiNum(String relBusiNum) {
        this.relBusiNum = relBusiNum;
    }

    public String getTxnRemks() {
        return txnRemks;
    }

    public void setTxnRemks(String txnRemks) {
        this.txnRemks = txnRemks;
    }

    public String getCustRemks() {
        return custRemks;
    }

    public void setCustRemks(String custRemks) {
        this.custRemks = custRemks;
    }

    public String getScenCodeList() {
        return scenCodeList;
    }

    public void setScenCodeList(String scenCodeList) {
        this.scenCodeList = scenCodeList;
    }

    public String getAbstCode() {
        return abstCode;
    }

    public void setAbstCode(String abstCode) {
        this.abstCode = abstCode;
    }

    public String getAbstDsc() {
        return abstDsc;
    }

    public void setAbstDsc(String abstDsc) {
        this.abstDsc = abstDsc;
    }

    public String getAgntNm() {
        return agntNm;
    }

    public void setAgntNm(String agntNm) {
        this.agntNm = agntNm;
    }

    public String getAgntDocsCatg() {
        return agntDocsCatg;
    }

    public void setAgntDocsCatg(String agntDocsCatg) {
        this.agntDocsCatg = agntDocsCatg;
    }

    public String getAgntDocsNum() {
        return agntDocsNum;
    }

    public void setAgntDocsNum(String agntDocsNum) {
        this.agntDocsNum = agntDocsNum;
    }

    public String getAgntIdIssueCty() {
        return agntIdIssueCty;
    }

    public void setAgntIdIssueCty(String agntIdIssueCty) {
        this.agntIdIssueCty = agntIdIssueCty;
    }

    public String getAgntCntctTel() {
        return agntCntctTel;
    }

    public void setAgntCntctTel(String agntCntctTel) {
        this.agntCntctTel = agntCntctTel;
    }

    public String getTxnChnl() {
        return txnChnl;
    }

    public void setTxnChnl(String txnChnl) {
        this.txnChnl = txnChnl;
    }

    public String getExteDt() {
        return exteDt;
    }

    public void setExteDt(String exteDt) {
        this.exteDt = exteDt;
    }

    public String getCnsmrSeqNo() {
        return cnsmrSeqNo;
    }

    public void setCnsmrSeqNo(String cnsmrSeqNo) {
        this.cnsmrSeqNo = cnsmrSeqNo;
    }

    public String getTxnCode() {
        return txnCode;
    }

    public void setTxnCode(String txnCode) {
        this.txnCode = txnCode;
    }

    public String getGlblRungNum() {
        return glblRungNum;
    }

    public void setGlblRungNum(String glblRungNum) {
        this.glblRungNum = glblRungNum;
    }

    public String getTxnRungNum32() {
        return txnRungNum32;
    }

    public void setTxnRungNum32(String txnRungNum32) {
        this.txnRungNum32 = txnRungNum32;
    }

    public String getTxnOrg() {
        return txnOrg;
    }

    public void setTxnOrg(String txnOrg) {
        this.txnOrg = txnOrg;
    }

    public String getTxnTlr() {
        return txnTlr;
    }

    public void setTxnTlr(String txnTlr) {
        this.txnTlr = txnTlr;
    }

    public String getTxnDt8() {
        return txnDt8;
    }

    public void setTxnDt8(String txnDt8) {
        this.txnDt8 = txnDt8;
    }

    public Long getTxnTm() {
        return txnTm;
    }

    public void setTxnTm(Long txnTm) {
        this.txnTm = txnTm;
    }

    public String getHostDt() {
        return hostDt;
    }

    public void setHostDt(String hostDt) {
        this.hostDt = hostDt;
    }

    public String getTxnTypeId() {
        return txnTypeId;
    }

    public void setTxnTypeId(String txnTypeId) {
        this.txnTypeId = txnTypeId;
    }

    public String getAcctRercNum() {
        return acctRercNum;
    }

    public void setAcctRercNum(String acctRercNum) {
        this.acctRercNum = acctRercNum;
    }

    public String getTermlNum() {
        return termlNum;
    }

    public void setTermlNum(String termlNum) {
        this.termlNum = termlNum;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getTxnSte() {
        return txnSte;
    }

    public void setTxnSte(String txnSte) {
        this.txnSte = txnSte;
    }

    public String getErrAcctOrigDt() {
        return errAcctOrigDt;
    }

    public void setErrAcctOrigDt(String errAcctOrigDt) {
        this.errAcctOrigDt = errAcctOrigDt;
    }

    public String getErrAcctOrigTlrRungNum() {
        return errAcctOrigTlrRungNum;
    }

    public void setErrAcctOrigTlrRungNum(String errAcctOrigTlrRungNum) {
        this.errAcctOrigTlrRungNum = errAcctOrigTlrRungNum;
    }

    public String getExteRungNum() {
        return exteRungNum;
    }

    public void setExteRungNum(String exteRungNum) {
        this.exteRungNum = exteRungNum;
    }

    public String getFileProcId() {
        return fileProcId;
    }

    public void setFileProcId(String fileProcId) {
        this.fileProcId = fileProcId;
    }

    public String getTranDesc() {
        return tranDesc;
    }

    public void setTranDesc(String tranDesc) {
        this.tranDesc = tranDesc;
    }

    public String getUserOprnCode() {
        return userOprnCode;
    }

    public void setUserOprnCode(String userOprnCode) {
        this.userOprnCode = userOprnCode;
    }

    public String getTxnLglPernCode() {
        return txnLglPernCode;
    }

    public void setTxnLglPernCode(String txnLglPernCode) {
        this.txnLglPernCode = txnLglPernCode;
    }

    public String getMntncTlr() {
        return mntncTlr;
    }

    public void setMntncTlr(String mntncTlr) {
        this.mntncTlr = mntncTlr;
    }

    public String getMntncOrg() {
        return mntncOrg;
    }

    public void setMntncOrg(String mntncOrg) {
        this.mntncOrg = mntncOrg;
    }

    public String getMntncDt() {
        return mntncDt;
    }

    public void setMntncDt(String mntncDt) {
        this.mntncDt = mntncDt;
    }

    public String getMntncTm() {
        return mntncTm;
    }

    public void setMntncTm(String mntncTm) {
        this.mntncTm = mntncTm;
    }

    public Long getTmstp() {
        return tmstp;
    }

    public void setTmstp(Long tmstp) {
        this.tmstp = tmstp;
    }

    public String getDataCreaTm() {
        return dataCreaTm;
    }

    public void setDataCreaTm(String dataCreaTm) {
        this.dataCreaTm = dataCreaTm;
    }

    public String getAffrSte() {
        return affrSte;
    }

    public void setAffrSte(String affrSte) {
        this.affrSte = affrSte;
    }

    public String getGlblAffrRungNum() {
        return glblAffrRungNum;
    }

    public void setGlblAffrRungNum(String glblAffrRungNum) {
        this.glblAffrRungNum = glblAffrRungNum;
    }

    public String getAffrSteUpdNum() {
        return affrSteUpdNum;
    }

    public void setAffrSteUpdNum(String affrSteUpdNum) {
        this.affrSteUpdNum = affrSteUpdNum;
    }

    public String getBtchGrpNum() {
        return btchGrpNum;
    }

    public void setBtchGrpNum(String btchGrpNum) {
        this.btchGrpNum = btchGrpNum;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public String getEmpeOfRec() {
        return empeOfRec;
    }

    public void setEmpeOfRec(String empeOfRec) {
        this.empeOfRec = empeOfRec;
    }

    public String getOrigChnlCode() {
        return origChnlCode;
    }

    public void setOrigChnlCode(String origChnlCode) {
        this.origChnlCode = origChnlCode;
    }

    public String getBtchOnlnTxnFlg() {
        return btchOnlnTxnFlg;
    }

    public void setBtchOnlnTxnFlg(String btchOnlnTxnFlg) {
        this.btchOnlnTxnFlg = btchOnlnTxnFlg;
    }

    public String getProdGrpCode() {
        return prodGrpCode;
    }

    public void setProdGrpCode(String prodGrpCode) {
        this.prodGrpCode = prodGrpCode;
    }
}
