/***********************************************************************
 * Module:  供应商.java
 * Author:  Administrator
 * Purpose: Defines the Class 供应商
 ***********************************************************************/

import java.util.*;

/** @pdOid 7f6438d0-c025-46b9-a3c2-da9708d6cccd */
public class 供应商 {
   /** @pdOid 4ea7edb3-b533-42d7-b480-803a9124c48e */
   public java.lang.String 供应商号;
   /** @pdOid 1e341d32-0724-414c-99a4-35018ed5825a */
   public java.lang.String 简称;
   /** @pdOid 8a46bd5c-c099-4208-8eb7-408886aa1793 */
   public java.lang.String 名称;
   /** @pdOid 85a60990-8a3b-4f2c-93f1-7335e54e1346 */
   public java.lang.String 地址;
   /** @pdOid 3cb91466-cf38-4957-a52f-a34a66c62eb6 */
   public java.lang.String 邮编;
   /** @pdOid 31dea07f-2ea7-47b7-bda5-77b7dd86271b */
   public java.lang.String 区号;
   /** @pdOid 47febec7-a40f-43fc-94b0-6a7f16dab79d */
   public java.lang.String 地区;
   /** @pdOid 1ea14dec-b088-4621-ba84-6d8d92d7802b */
   public java.lang.String 类型;
   /** @pdOid 30481f8f-9e04-417d-a320-6cff29fd26d3 */
   public java.lang.String 电话;
   /** @pdOid 75fefe01-aa90-4f30-9029-fd9245c9c6a4 */
   public java.lang.String 传真;
   /** @pdOid 01184249-a5f0-445b-8c70-ccef9f115b36 */
   public java.lang.String 开户行;
   /** @pdOid 61577d98-1938-4cb5-8b16-992b9e089663 */
   public java.lang.String 开户行邮编;
   /** @pdOid 9d0785fb-c35a-4d1b-b3bf-2cf93bdfe11b */
   public java.lang.String 银行账号;
   /** @pdOid 70228236-315c-417b-a5ad-cb37b42aefeb */
   public java.lang.String 税号;
   /** @pdOid 473fd83b-4985-4feb-90d8-cc05f73a1244 */
   public java.lang.String 库房地址;
   /** @pdOid cdd6cfbf-7fb1-4f41-bafe-0bb42b60c665 */
   public java.lang.String 库房电话;
   /** @pdOid 31f25594-abba-47e0-a087-a74b20924dff */
   public java.lang.String 业务部门;
   
   /** @pdRoleInfo migr=no name=付款单 assc=供应商付款单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<付款单> 付款单;
   /** @pdRoleInfo migr=no name=进货单 assc=供应商进货单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<进货单> 进货单;
   /** @pdRoleInfo migr=no name=采购订单 assc=供应商采购订单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<采购订单> 采购订单;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<付款单> get付款单() {
      if (付款单 == null)
         付款单 = new java.util.HashSet<付款单>();
      return 付款单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator付款单() {
      if (付款单 == null)
         付款单 = new java.util.HashSet<付款单>();
      return 付款单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new付款单 */
   public void set付款单(java.util.Collection<付款单> new付款单) {
      removeAll付款单();
      for (java.util.Iterator iter = new付款单.iterator(); iter.hasNext();)
         add付款单((付款单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new付款单 */
   public void add付款单(付款单 new付款单) {
      if (new付款单 == null)
         return;
      if (this.付款单 == null)
         this.付款单 = new java.util.HashSet<付款单>();
      if (!this.付款单.contains(new付款单))
      {
         this.付款单.add(new付款单);
         new付款单.set供应商(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old付款单 */
   public void remove付款单(付款单 old付款单) {
      if (old付款单 == null)
         return;
      if (this.付款单 != null)
         if (this.付款单.contains(old付款单))
         {
            this.付款单.remove(old付款单);
            old付款单.set供应商((供应商)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll付款单() {
      if (付款单 != null)
      {
         付款单 old付款单;
         for (java.util.Iterator iter = getIterator付款单(); iter.hasNext();)
         {
            old付款单 = (付款单)iter.next();
            iter.remove();
            old付款单.set供应商((供应商)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<进货单> get进货单() {
      if (进货单 == null)
         进货单 = new java.util.HashSet<进货单>();
      return 进货单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator进货单() {
      if (进货单 == null)
         进货单 = new java.util.HashSet<进货单>();
      return 进货单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new进货单 */
   public void set进货单(java.util.Collection<进货单> new进货单) {
      removeAll进货单();
      for (java.util.Iterator iter = new进货单.iterator(); iter.hasNext();)
         add进货单((进货单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new进货单 */
   public void add进货单(进货单 new进货单) {
      if (new进货单 == null)
         return;
      if (this.进货单 == null)
         this.进货单 = new java.util.HashSet<进货单>();
      if (!this.进货单.contains(new进货单))
      {
         this.进货单.add(new进货单);
         new进货单.set供应商(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old进货单 */
   public void remove进货单(进货单 old进货单) {
      if (old进货单 == null)
         return;
      if (this.进货单 != null)
         if (this.进货单.contains(old进货单))
         {
            this.进货单.remove(old进货单);
            old进货单.set供应商((供应商)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll进货单() {
      if (进货单 != null)
      {
         进货单 old进货单;
         for (java.util.Iterator iter = getIterator进货单(); iter.hasNext();)
         {
            old进货单 = (进货单)iter.next();
            iter.remove();
            old进货单.set供应商((供应商)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<采购订单> get采购订单() {
      if (采购订单 == null)
         采购订单 = new java.util.HashSet<采购订单>();
      return 采购订单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator采购订单() {
      if (采购订单 == null)
         采购订单 = new java.util.HashSet<采购订单>();
      return 采购订单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new采购订单 */
   public void set采购订单(java.util.Collection<采购订单> new采购订单) {
      removeAll采购订单();
      for (java.util.Iterator iter = new采购订单.iterator(); iter.hasNext();)
         add采购订单((采购订单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new采购订单 */
   public void add采购订单(采购订单 new采购订单) {
      if (new采购订单 == null)
         return;
      if (this.采购订单 == null)
         this.采购订单 = new java.util.HashSet<采购订单>();
      if (!this.采购订单.contains(new采购订单))
      {
         this.采购订单.add(new采购订单);
         new采购订单.set供应商(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old采购订单 */
   public void remove采购订单(采购订单 old采购订单) {
      if (old采购订单 == null)
         return;
      if (this.采购订单 != null)
         if (this.采购订单.contains(old采购订单))
         {
            this.采购订单.remove(old采购订单);
            old采购订单.set供应商((供应商)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll采购订单() {
      if (采购订单 != null)
      {
         采购订单 old采购订单;
         for (java.util.Iterator iter = getIterator采购订单(); iter.hasNext();)
         {
            old采购订单 = (采购订单)iter.next();
            iter.remove();
            old采购订单.set供应商((供应商)null);
         }
      }
   }

}