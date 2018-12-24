/***********************************************************************
 * Module:  退货单.java
 * Author:  Administrator
 * Purpose: Defines the Class 退货单
 ***********************************************************************/

import java.util.*;

/** @pdOid 3add8f4e-930f-4b5d-8773-d324dde73c10 */
public class 退货单 {
   /** @pdOid 70ee4e97-b9d4-4f2e-9a04-ba8e78deb691 */
   public java.lang.String 退货单编号;
   /** @pdOid 3b623f95-7eb4-4edb-abe3-cf192280de3d */
   public java.util.Date 退货日期;
   /** @pdOid 28784b4d-e03e-46da-8a3a-822eba1fcd3a */
   public double 退货数量;
   /** @pdOid e389bd96-8434-44c9-9b2d-bafd2b5d7d62 */
   public double 销售价;
   /** @pdOid f50a85b6-4fff-44c0-8c23-3b2ddbe09ed4 */
   public double 总价;
   /** @pdOid 6dc30fc8-53da-488e-9b90-97c2fbf424b9 */
   public double 扣率;
   /** @pdOid 855ed73c-ac79-4947-b225-12632efc9e73 */
   public double 税率;
   /** @pdOid 18e865b8-331c-4ae9-841d-878df24fe5fb */
   public double 不含税价;
   /** @pdOid ee406c91-6d5e-4a38-a485-18c4a8974adc */
   public double 税额;
   
   /** @pdRoleInfo migr=no name=仓库 assc=仓库退货单 mult=1..1 side=A */
   public 仓库 仓库;
   /** @pdRoleInfo migr=no name=商品 assc=商品退货单 mult=1..1 side=A */
   public 商品 商品;
   /** @pdRoleInfo migr=no name=worker assc=职工退货单 mult=1..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=销售单 assc=销售单退货单 mult=1..1 side=A */
   public 销售单 销售单;
   
   
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
            old仓库.remove退货单(this);
         }
         if (new仓库 != null)
         {
            this.仓库 = new仓库;
            this.仓库.add退货单(this);
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
            old商品.remove退货单(this);
         }
         if (new商品 != null)
         {
            this.商品 = new商品;
            this.商品.add退货单(this);
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
            oldWorker.remove退货单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add退货单(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 销售单 get销售单() {
      return 销售单;
   }
   
   /** @pdGenerated default parent setter
     * @param new销售单 */
   public void set销售单(销售单 new销售单) {
      if (this.销售单 == null || !this.销售单.equals(new销售单))
      {
         if (this.销售单 != null)
         {
            销售单 old销售单 = this.销售单;
            this.销售单 = null;
            old销售单.remove退货单(this);
         }
         if (new销售单 != null)
         {
            this.销售单 = new销售单;
            this.销售单.add退货单(this);
         }
      }
   }

}