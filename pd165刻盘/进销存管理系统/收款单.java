/***********************************************************************
 * Module:  收款单.java
 * Author:  Administrator
 * Purpose: Defines the Class 收款单
 ***********************************************************************/

import java.util.*;

/** @pdOid cf148041-6c6f-412c-80df-762c7979f5a8 */
public class 收款单 {
   /** @pdOid 3f4a6fcf-0899-4030-bb30-7e31ff405011 */
   public java.lang.String 收款单编号;
   /** @pdOid 3b1339a6-4f50-4e49-9100-7345e42335c1 */
   public java.lang.String 发票号;
   /** @pdOid 4173a1cf-e68e-43d4-901f-fcf4edebaa99 */
   public java.util.Date 填票日期;
   /** @pdOid d501e061-81f0-4b87-96bc-cffe0333d4f6 */
   public double 数量;
   /** @pdOid a7c3adc0-6fd1-43cf-8e5b-42a739f32049 */
   public double 销售价;
   /** @pdOid 4d9da1e6-9660-4f18-8144-6b3ba208e2e5 */
   public double 金额;
   /** @pdOid 6ddec9e7-20bc-4208-96d4-2797d2bec2df */
   public java.util.Date 收款日期;
   /** @pdOid da63640f-d65f-4e8c-aee4-ba4baf9b9fc1 */
   public java.util.Date 销售日期;
   /** @pdOid 24c148e7-e3ce-4bc4-ab9a-1e82234b4d68 */
   public java.lang.String 备注;
   
   /** @pdRoleInfo migr=no name=商品 assc=商品收款单 mult=1..1 side=A */
   public 商品 商品;
   /** @pdRoleInfo migr=no name=客户 assc=客户收款单 mult=1..1 side=A */
   public 客户 客户;
   /** @pdRoleInfo migr=no name=worker assc=职工收款单 mult=1..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=销售单 assc=销售单收款单 mult=1..1 side=A */
   public 销售单 销售单;
   
   
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
            old商品.remove收款单(this);
         }
         if (new商品 != null)
         {
            this.商品 = new商品;
            this.商品.add收款单(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 客户 get客户() {
      return 客户;
   }
   
   /** @pdGenerated default parent setter
     * @param new客户 */
   public void set客户(客户 new客户) {
      if (this.客户 == null || !this.客户.equals(new客户))
      {
         if (this.客户 != null)
         {
            客户 old客户 = this.客户;
            this.客户 = null;
            old客户.remove收款单(this);
         }
         if (new客户 != null)
         {
            this.客户 = new客户;
            this.客户.add收款单(this);
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
            oldWorker.remove收款单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add收款单(this);
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
            old销售单.remove收款单(this);
         }
         if (new销售单 != null)
         {
            this.销售单 = new销售单;
            this.销售单.add收款单(this);
         }
      }
   }

}