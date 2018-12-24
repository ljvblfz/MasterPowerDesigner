/***********************************************************************
 * Module:  出库.java
 * Author:  Administrator
 * Purpose: Defines the Class 出库
 ***********************************************************************/

import java.util.*;

/** @pdOid b41cdef5-551f-42c0-a870-c3ea7fb2e8ae */
public class 出库 {
   /** @pdOid 77ea8b34-33c4-4aeb-98eb-b891cfab4166 */
   public java.lang.String 出库编号;
   /** @pdOid 4d573848-b9c8-4276-8f2a-52425d715db4 */
   public double 单价;
   /** @pdOid cddc4062-1039-4ef8-9e38-e5da3e622de9 */
   public java.util.Date 出库时间;
   /** @pdOid aed25660-05d0-47c7-868d-b98f5f645e85 */
   public double 数量;
   
   /** @pdRoleInfo migr=no name=商品 assc=商品出库 mult=1..1 side=A */
   public 商品 商品;
   /** @pdRoleInfo migr=no name=worker assc=职工出库 mult=1..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=仓库 assc=仓库出库 mult=1..1 side=A */
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
            old商品.remove出库(this);
         }
         if (new商品 != null)
         {
            this.商品 = new商品;
            this.商品.add出库(this);
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
            oldWorker.remove出库(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add出库(this);
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
            old仓库.remove出库(this);
         }
         if (new仓库 != null)
         {
            this.仓库 = new仓库;
            this.仓库.add出库(this);
         }
      }
   }

}