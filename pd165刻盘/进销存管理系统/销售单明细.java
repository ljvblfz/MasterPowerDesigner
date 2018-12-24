/***********************************************************************
 * Module:  销售单明细.java
 * Author:  Administrator
 * Purpose: Defines the Class 销售单明细
 ***********************************************************************/

import java.util.*;

/** @pdOid 6b18d4ed-f358-4917-81b6-b9c0134c2eda */
public class 销售单明细 {
   /** @pdOid 89d4a93d-ae89-4995-8b65-a81e634f30df */
   public java.lang.String 销售单明细编号;
   /** @pdOid a72777d0-c2ac-491f-9803-f36e552e987e */
   public double 销售数量;
   /** @pdOid 1bf9e50f-b22e-4972-a09f-68af37141231 */
   public double 销售价;
   /** @pdOid 733ed9f2-a57c-414a-8460-73a5b917ba02 */
   public double 总价;
   /** @pdOid cee84bcc-f4fc-4af5-bc8a-98baec311686 */
   public double 扣率;
   /** @pdOid d82fa488-d54f-4f3f-b9b3-2fac247c0d7a */
   public double 税率;
   /** @pdOid 323596be-df1a-41c1-a366-f664e77849e9 */
   public double 不含税价;
   /** @pdOid 1244d947-8892-4ed3-8b06-601d541f5612 */
   public double 税额;
   
   /** @pdRoleInfo migr=no name=仓库 assc=仓库销售单明细 mult=1..1 side=A */
   public 仓库 仓库;
   /** @pdRoleInfo migr=no name=商品 assc=商品销售单明细 mult=1..1 side=A */
   public 商品 商品;
   /** @pdRoleInfo migr=no name=销售单 assc=销售单销售单明细 mult=1..1 side=A */
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
            old仓库.remove销售单明细(this);
         }
         if (new仓库 != null)
         {
            this.仓库 = new仓库;
            this.仓库.add销售单明细(this);
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
            old商品.remove销售单明细(this);
         }
         if (new商品 != null)
         {
            this.商品 = new商品;
            this.商品.add销售单明细(this);
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
            old销售单.remove销售单明细(this);
         }
         if (new销售单 != null)
         {
            this.销售单 = new销售单;
            this.销售单.add销售单明细(this);
         }
      }
   }

}