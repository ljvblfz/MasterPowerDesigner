/***********************************************************************
 * Module:  进货单明细.java
 * Author:  Administrator
 * Purpose: Defines the Class 进货单明细
 ***********************************************************************/

import java.util.*;

/** @pdOid b2fea798-b2ff-4852-983f-0cf0020f1201 */
public class 进货单明细 {
   /** @pdOid fa92f1b8-9fa6-4aac-82c8-7ea6dbb9f727 */
   public java.lang.String 进货明细编号;
   /** @pdOid 2bf2c3b1-7dc8-4eba-930c-dc8f9720b633 */
   public double 进货数量;
   /** @pdOid d10c02d4-595e-4b56-94eb-c6e5b2710805 */
   public double 进价;
   /** @pdOid 723b235d-87a0-40d3-938e-35c34de1b445 */
   public double 总价;
   /** @pdOid 60945267-441a-48fb-8595-e8549a9c4f51 */
   public double 扣率;
   /** @pdOid f1aa20f5-5567-4337-bad3-8a3a30857d10 */
   public double 税率;
   /** @pdOid f73051e0-e8e7-4a19-96b5-b20b18625c0f */
   public double 不含税价;
   /** @pdOid 22c3c707-1709-463b-8947-7fd0446ab076 */
   public double 税额;
   /** @pdOid 1252271a-1aa3-4ae3-9864-ba897dd43c3e */
   public java.lang.String 货物质量;
   
   /** @pdRoleInfo migr=no name=仓库 assc=仓库进货单明细 mult=0..1 side=A */
   public 仓库 仓库;
   /** @pdRoleInfo migr=no name=商品 assc=商品进货单明细 mult=1..1 side=A */
   public 商品 商品;
   /** @pdRoleInfo migr=no name=进货单 assc=进货单进货单明细 mult=1..1 side=A */
   public 进货单 进货单;
   
   
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
            old仓库.remove进货单明细(this);
         }
         if (new仓库 != null)
         {
            this.仓库 = new仓库;
            this.仓库.add进货单明细(this);
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
            old商品.remove进货单明细(this);
         }
         if (new商品 != null)
         {
            this.商品 = new商品;
            this.商品.add进货单明细(this);
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
            old进货单.remove进货单明细(this);
         }
         if (new进货单 != null)
         {
            this.进货单 = new进货单;
            this.进货单.add进货单明细(this);
         }
      }
   }

}