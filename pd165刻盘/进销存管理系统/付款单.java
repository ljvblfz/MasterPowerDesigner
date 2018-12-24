/***********************************************************************
 * Module:  付款单.java
 * Author:  Administrator
 * Purpose: Defines the Class 付款单
 ***********************************************************************/

import java.util.*;

/** @pdOid 7ce5846e-5a18-46dc-922f-91c3c5504efd */
public class 付款单 {
   /** @pdOid 51f63e92-880e-421c-bb4d-441746194dda */
   public java.lang.String 付款单编号;
   /** @pdOid f6df31a7-d808-4720-ac7c-d0837d9a2ecf */
   public java.lang.String 发票号;
   /** @pdOid 2c7be86f-4619-4865-b7df-47d7aef38b72 */
   public java.util.Date 填票日期;
   /** @pdOid 0675b3fc-76fe-405d-b9f3-353d0bd0dac1 */
   public double 数量;
   /** @pdOid 1e5de252-ed10-4d70-8e08-360c05d591c9 */
   public double 进货单价;
   /** @pdOid 3a93d879-be08-4771-8c3e-f92e832089a9 */
   public double 金额;
   /** @pdOid 434c5837-df33-43e9-a0fd-61ce03c840c6 */
   public java.util.Date 付款日期;
   /** @pdOid 721bf1bd-2bca-4855-a666-3ee5ea08dfdc */
   public java.util.Date 进货日期;
   /** @pdOid 46250f50-c46c-487e-878a-ee49e96717a3 */
   public java.lang.String 备注;
   
   /** @pdRoleInfo migr=no name=供应商 assc=供应商付款单 mult=1..1 side=A */
   public 供应商 供应商;
   /** @pdRoleInfo migr=no name=商品 assc=商品付款单 mult=1..1 side=A */
   public 商品 商品;
   /** @pdRoleInfo migr=no name=worker assc=职工付款单 mult=1..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=进货单 assc=进货单付款单 mult=1..1 side=A */
   public 进货单 进货单;
   
   
   /** @pdGenerated default parent getter */
   public 供应商 get供应商() {
      return 供应商;
   }
   
   /** @pdGenerated default parent setter
     * @param new供应商 */
   public void set供应商(供应商 new供应商) {
      if (this.供应商 == null || !this.供应商.equals(new供应商))
      {
         if (this.供应商 != null)
         {
            供应商 old供应商 = this.供应商;
            this.供应商 = null;
            old供应商.remove付款单(this);
         }
         if (new供应商 != null)
         {
            this.供应商 = new供应商;
            this.供应商.add付款单(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 商品 get商品() {
      return 商品;
   }
   
   /** @pdGenerated default parent setter
     * @param new商品 */
   public void set商品(商品 new商品) {
      if (this.商品 == null || !this.商品.equals(new商品))
      {
         if (this.商品 != null)
         {
            商品 old商品 = this.商品;
            this.商品 = null;
            old商品.remove付款单(this);
         }
         if (new商品 != null)
         {
            this.商品 = new商品;
            this.商品.add付款单(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public worker getWorker() {
      return worker;
   }
   
   /** @pdGenerated default parent setter
     * @param newWorker */
   public void setWorker(worker newWorker) {
      if (this.worker == null || !this.worker.equals(newWorker))
      {
         if (this.worker != null)
         {
            worker oldWorker = this.worker;
            this.worker = null;
            oldWorker.remove付款单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add付款单(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 进货单 get进货单() {
      return 进货单;
   }
   
   /** @pdGenerated default parent setter
     * @param new进货单 */
   public void set进货单(进货单 new进货单) {
      if (this.进货单 == null || !this.进货单.equals(new进货单))
      {
         if (this.进货单 != null)
         {
            进货单 old进货单 = this.进货单;
            this.进货单 = null;
            old进货单.remove付款单(this);
         }
         if (new进货单 != null)
         {
            this.进货单 = new进货单;
            this.进货单.add付款单(this);
         }
      }
   }

}