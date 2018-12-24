/***********************************************************************
 * Module:  销售订单明细.java
 * Author:  Administrator
 * Purpose: Defines the Class 销售订单明细
 ***********************************************************************/

import java.util.*;

/** @pdOid 69e99878-290e-4715-807b-80bbddc1a612 */
public class 销售订单明细 {
   /** @pdOid 2ff582b7-3a1b-4faf-a8a8-c60908750f48 */
   public java.lang.String 销售订单明细编号;
   /** @pdOid fa015a73-f9d6-460f-a5fd-78e13073ae82 */
   public double 销售数量;
   /** @pdOid b38b5b77-e1f3-49a1-a885-d083656dcebb */
   public double 销售价;
   /** @pdOid bea33328-21f3-4f96-8067-edaf4af9a77f */
   public double 总价;
   /** @pdOid 81d9d33d-f08e-4093-a9ba-0f2cd1411e01 */
   public double 扣率;
   /** @pdOid f89d0cea-6892-4f77-a13c-1ba8607bf4cf */
   public double 税率;
   /** @pdOid 6c5e9e6b-279e-4e2e-86af-424cbb143055 */
   public double 不含税价;
   /** @pdOid 1dff9eaa-b110-472a-836d-ef9998806f69 */
   public double 税额;
   
   /** @pdRoleInfo migr=no name=商品 assc=商品销售订单明细 mult=1..1 side=A */
   public 商品 商品;
   /** @pdRoleInfo migr=no name=销售订单 assc=销售订单销售订单明细 mult=1..1 side=A */
   public 销售订单 销售订单;
   
   
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
            old商品.remove销售订单明细(this);
         }
         if (new商品 != null)
         {
            this.商品 = new商品;
            this.商品.add销售订单明细(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 销售订单 get销售订单() {
      return 销售订单;
   }
   
   /** @pdGenerated default parent setter
     * @param new销售订单 */
   public void set销售订单(销售订单 new销售订单) {
      if (this.销售订单 == null || !this.销售订单.equals(new销售订单))
      {
         if (this.销售订单 != null)
         {
            销售订单 old销售订单 = this.销售订单;
            this.销售订单 = null;
            old销售订单.remove销售订单明细(this);
         }
         if (new销售订单 != null)
         {
            this.销售订单 = new销售订单;
            this.销售订单.add销售订单明细(this);
         }
      }
   }

}