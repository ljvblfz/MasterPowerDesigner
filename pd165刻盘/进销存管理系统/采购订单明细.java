/***********************************************************************
 * Module:  采购订单明细.java
 * Author:  Administrator
 * Purpose: Defines the Class 采购订单明细
 ***********************************************************************/

import java.util.*;

/** @pdOid bba398b3-1b53-4f16-9cf4-cd3c737aabd2 */
public class 采购订单明细 {
   /** @pdOid 668f11fd-9c2e-47c1-a4d3-650b7f2d593d */
   public java.lang.String 采购明细编号;
   /** @pdOid e5f7cbac-0aa1-4511-891d-bb1c04104550 */
   public double 订货数量;
   /** @pdOid 787854c3-a34a-4dfa-8373-ba6019fa9874 */
   public double 进价;
   /** @pdOid 8412b74b-0f78-43ed-b854-60c98f92db50 */
   public double 总价;
   /** @pdOid 6996df5b-83cc-4ba8-9c22-ea53d508b075 */
   public double 扣率;
   /** @pdOid fcbca733-fdcc-49f6-9f74-234ae2059490 */
   public double 税率;
   /** @pdOid 71476dd2-f40b-4c91-be13-ff10c3524c22 */
   public double 不含税价;
   /** @pdOid bf794ca6-2b78-4bf8-bb8c-dde64f45c0d6 */
   public double 税额;
   
   /** @pdRoleInfo migr=no name=商品 assc=商品采购订单明细 mult=1..1 side=A */
   public 商品 商品;
   /** @pdRoleInfo migr=no name=采购订单 assc=采购订单采购订单明细 mult=1..1 side=A */
   public 采购订单 采购订单;
   
   
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
            old商品.remove采购订单明细(this);
         }
         if (new商品 != null)
         {
            this.商品 = new商品;
            this.商品.add采购订单明细(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 采购订单 get采购订单() {
      return 采购订单;
   }
   
   /** @pdGenerated default parent setter
     * @param new采购订单 */
   public void set采购订单(采购订单 new采购订单) {
      if (this.采购订单 == null || !this.采购订单.equals(new采购订单))
      {
         if (this.采购订单 != null)
         {
            采购订单 old采购订单 = this.采购订单;
            this.采购订单 = null;
            old采购订单.remove采购订单明细(this);
         }
         if (new采购订单 != null)
         {
            this.采购订单 = new采购订单;
            this.采购订单.add采购订单明细(this);
         }
      }
   }

}