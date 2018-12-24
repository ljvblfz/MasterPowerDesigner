/***********************************************************************
 * Module:  销售订单.java
 * Author:  Administrator
 * Purpose: Defines the Class 销售订单
 ***********************************************************************/

import java.util.*;

/** @pdOid e70ac6bd-432c-429c-ad5c-3003eb9524d0 */
public class 销售订单 {
   /** @pdOid bd9a511f-a080-4f2b-846c-bb7e8bf8d211 */
   public java.lang.String 销售订单号;
   /** @pdOid 002c9649-e2a4-499b-8420-b78ffca0035d */
   public java.util.Date 销售日期;
   /** @pdOid 8e53ffff-8f6b-49ad-b8f9-ee3cdaff8b97 */
   public java.util.Date 截止日期;
   /** @pdOid bda62da3-9480-4682-b745-ce8e7dc64d66 */
   public double 总价;
   /** @pdOid f83ed60f-ac82-4c31-8db8-a7a6404f0ac2 */
   public double 不含税价;
   /** @pdOid 7c0517c4-c53a-41a9-909c-9acc5b14a0bf */
   public double 税额;
   
   /** @pdRoleInfo migr=no name=销售单 assc=销售订单销售单 mult=0..1 */
   public 销售单 销售单;
   /** @pdRoleInfo migr=no name=销售订单明细 assc=销售订单销售订单明细 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售订单明细> 销售订单明细;
   /** @pdRoleInfo migr=no name=客户 assc=客户销售订单 mult=1..1 side=A */
   public 客户 客户;
   /** @pdRoleInfo migr=no name=worker assc=职工销售订单 mult=0..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=worker assc=reference44 mult=0..1 side=A */
   public worker worker;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<销售订单明细> get销售订单明细() {
      if (销售订单明细 == null)
         销售订单明细 = new java.util.HashSet<销售订单明细>();
      return 销售订单明细;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator销售订单明细() {
      if (销售订单明细 == null)
         销售订单明细 = new java.util.HashSet<销售订单明细>();
      return 销售订单明细.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new销售订单明细 */
   public void set销售订单明细(java.util.Collection<销售订单明细> new销售订单明细) {
      removeAll销售订单明细();
      for (java.util.Iterator iter = new销售订单明细.iterator(); iter.hasNext();)
         add销售订单明细((销售订单明细)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new销售订单明细 */
   public void add销售订单明细(销售订单明细 new销售订单明细) {
      if (new销售订单明细 == null)
         return;
      if (this.销售订单明细 == null)
         this.销售订单明细 = new java.util.HashSet<销售订单明细>();
      if (!this.销售订单明细.contains(new销售订单明细))
      {
         this.销售订单明细.add(new销售订单明细);
         new销售订单明细.set销售订单(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old销售订单明细 */
   public void remove销售订单明细(销售订单明细 old销售订单明细) {
      if (old销售订单明细 == null)
         return;
      if (this.销售订单明细 != null)
         if (this.销售订单明细.contains(old销售订单明细))
         {
            this.销售订单明细.remove(old销售订单明细);
            old销售订单明细.set销售订单((销售订单)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll销售订单明细() {
      if (销售订单明细 != null)
      {
         销售订单明细 old销售订单明细;
         for (java.util.Iterator iter = getIterator销售订单明细(); iter.hasNext();)
         {
            old销售订单明细 = (销售订单明细)iter.next();
            iter.remove();
            old销售订单明细.set销售订单((销售订单)null);
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
            old客户.remove销售订单(this);
         }
         if (new客户 != null)
         {
            this.客户 = new客户;
            this.客户.add销售订单(this);
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
            oldWorker.remove销售订单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add销售订单(this);
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
            oldWorker.remove销售订单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add销售订单(this);
         }
      }
   }

}