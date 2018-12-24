/***********************************************************************
 * Module:  入库.java
 * Author:  Administrator
 * Purpose: Defines the Class 入库
 ***********************************************************************/

import java.util.*;

/** @pdOid a1017379-136b-476e-af6d-cdbbb2eb688e */
public class 入库 {
   /** @pdOid 0e62da47-95c3-4ad6-9ffb-c60fcea60d8f */
   public java.lang.String 入库编号;
   /** @pdOid 7b0baf28-6b0b-4e8d-857d-c0cfb7d51edf */
   public double 单价;
   /** @pdOid 2ff3676b-bbd3-42e4-a081-355560446b57 */
   public java.util.Date 入库时间;
   /** @pdOid d2bc9abb-d560-4b16-be27-025fcd6f610c */
   public double 数量;
   
   /** @pdRoleInfo migr=no name=商品 assc=商品入库 mult=1..1 side=A */
   public 商品 商品;
   /** @pdRoleInfo migr=no name=worker assc=职工入库 mult=1..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=仓库 assc=仓库入库 mult=1..1 side=A */
   public 仓库 仓库;
   
   
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
            old商品.remove入库(this);
         }
         if (new商品 != null)
         {
            this.商品 = new商品;
            this.商品.add入库(this);
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
            oldWorker.remove入库(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add入库(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 仓库 get仓库() {
      return 仓库;
   }
   
   /** @pdGenerated default parent setter
     * @param new仓库 */
   public void set仓库(仓库 new仓库) {
      if (this.仓库 == null || !this.仓库.equals(new仓库))
      {
         if (this.仓库 != null)
         {
            仓库 old仓库 = this.仓库;
            this.仓库 = null;
            old仓库.remove入库(this);
         }
         if (new仓库 != null)
         {
            this.仓库 = new仓库;
            this.仓库.add入库(this);
         }
      }
   }

}