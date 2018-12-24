/***********************************************************************
 * Module:  销售单.java
 * Author:  Administrator
 * Purpose: Defines the Class 销售单
 ***********************************************************************/

import java.util.*;

/** @pdOid b10209a6-a270-46f8-a24b-f04e64a0300c */
public class 销售单 {
   /** @pdOid f3d45cf3-dd6c-4816-8ce0-f3c52ac99e0c */
   public java.lang.String 销售单号;
   /** @pdOid 06744501-a8f1-4e51-b988-f7941de69091 */
   public java.util.Date 销售日期;
   /** @pdOid 98a7788e-f3dc-4076-9778-eb47ffc9eaa7 */
   public double 总价;
   /** @pdOid 8287d8e1-5d8f-40c1-b9f2-4017b4d29028 */
   public double 不含税价;
   /** @pdOid 3f90498f-4152-468b-b988-10b2480fa7e0 */
   public double 税额;
   
   /** @pdRoleInfo migr=no name=收款单 assc=销售单收款单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<收款单> 收款单;
   /** @pdRoleInfo migr=no name=退货单 assc=销售单退货单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<退货单> 退货单;
   /** @pdRoleInfo migr=no name=销售单明细 assc=销售单销售单明细 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售单明细> 销售单明细;
   /** @pdRoleInfo migr=no name=客户 assc=客户销售单 mult=1..1 side=A */
   public 客户 客户;
   /** @pdRoleInfo migr=no name=worker assc=职工销售单 mult=0..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=销售订单 assc=销售订单销售单 mult=0..1 side=A */
   public 销售订单 销售订单;
   /** @pdRoleInfo migr=no name=worker assc=reference45 mult=0..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=worker assc=reference46 mult=0..1 side=A */
   public worker worker;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<收款单> get收款单() {
      if (收款单 == null)
         收款单 = new java.util.HashSet<收款单>();
      return 收款单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator收款单() {
      if (收款单 == null)
         收款单 = new java.util.HashSet<收款单>();
      return 收款单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new收款单 */
   public void set收款单(java.util.Collection<收款单> new收款单) {
      removeAll收款单();
      for (java.util.Iterator iter = new收款单.iterator(); iter.hasNext();)
         add收款单((收款单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new收款单 */
   public void add收款单(收款单 new收款单) {
      if (new收款单 == null)
         return;
      if (this.收款单 == null)
         this.收款单 = new java.util.HashSet<收款单>();
      if (!this.收款单.contains(new收款单))
      {
         this.收款单.add(new收款单);
         new收款单.set销售单(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old收款单 */
   public void remove收款单(收款单 old收款单) {
      if (old收款单 == null)
         return;
      if (this.收款单 != null)
         if (this.收款单.contains(old收款单))
         {
            this.收款单.remove(old收款单);
            old收款单.set销售单((销售单)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll收款单() {
      if (收款单 != null)
      {
         收款单 old收款单;
         for (java.util.Iterator iter = getIterator收款单(); iter.hasNext();)
         {
            old收款单 = (收款单)iter.next();
            iter.remove();
            old收款单.set销售单((销售单)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<退货单> get退货单() {
      if (退货单 == null)
         退货单 = new java.util.HashSet<退货单>();
      return 退货单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator退货单() {
      if (退货单 == null)
         退货单 = new java.util.HashSet<退货单>();
      return 退货单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new退货单 */
   public void set退货单(java.util.Collection<退货单> new退货单) {
      removeAll退货单();
      for (java.util.Iterator iter = new退货单.iterator(); iter.hasNext();)
         add退货单((退货单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new退货单 */
   public void add退货单(退货单 new退货单) {
      if (new退货单 == null)
         return;
      if (this.退货单 == null)
         this.退货单 = new java.util.HashSet<退货单>();
      if (!this.退货单.contains(new退货单))
      {
         this.退货单.add(new退货单);
         new退货单.set销售单(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old退货单 */
   public void remove退货单(退货单 old退货单) {
      if (old退货单 == null)
         return;
      if (this.退货单 != null)
         if (this.退货单.contains(old退货单))
         {
            this.退货单.remove(old退货单);
            old退货单.set销售单((销售单)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll退货单() {
      if (退货单 != null)
      {
         退货单 old退货单;
         for (java.util.Iterator iter = getIterator退货单(); iter.hasNext();)
         {
            old退货单 = (退货单)iter.next();
            iter.remove();
            old退货单.set销售单((销售单)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<销售单明细> get销售单明细() {
      if (销售单明细 == null)
         销售单明细 = new java.util.HashSet<销售单明细>();
      return 销售单明细;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator销售单明细() {
      if (销售单明细 == null)
         销售单明细 = new java.util.HashSet<销售单明细>();
      return 销售单明细.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new销售单明细 */
   public void set销售单明细(java.util.Collection<销售单明细> new销售单明细) {
      removeAll销售单明细();
      for (java.util.Iterator iter = new销售单明细.iterator(); iter.hasNext();)
         add销售单明细((销售单明细)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new销售单明细 */
   public void add销售单明细(销售单明细 new销售单明细) {
      if (new销售单明细 == null)
         return;
      if (this.销售单明细 == null)
         this.销售单明细 = new java.util.HashSet<销售单明细>();
      if (!this.销售单明细.contains(new销售单明细))
      {
         this.销售单明细.add(new销售单明细);
         new销售单明细.set销售单(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old销售单明细 */
   public void remove销售单明细(销售单明细 old销售单明细) {
      if (old销售单明细 == null)
         return;
      if (this.销售单明细 != null)
         if (this.销售单明细.contains(old销售单明细))
         {
            this.销售单明细.remove(old销售单明细);
            old销售单明细.set销售单((销售单)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll销售单明细() {
      if (销售单明细 != null)
      {
         销售单明细 old销售单明细;
         for (java.util.Iterator iter = getIterator销售单明细(); iter.hasNext();)
         {
            old销售单明细 = (销售单明细)iter.next();
            iter.remove();
            old销售单明细.set销售单((销售单)null);
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
            old客户.remove销售单(this);
         }
         if (new客户 != null)
         {
            this.客户 = new客户;
            this.客户.add销售单(this);
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
            oldWorker.remove销售单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add销售单(this);
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
            oldWorker.remove销售单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add销售单(this);
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
            oldWorker.remove销售单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add销售单(this);
         }
      }
   }

}