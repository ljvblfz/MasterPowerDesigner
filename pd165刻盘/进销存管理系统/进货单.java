/***********************************************************************
 * Module:  进货单.java
 * Author:  Administrator
 * Purpose: Defines the Class 进货单
 ***********************************************************************/

import java.util.*;

/** @pdOid 195e3bb3-072e-4683-9e6a-bb7d95186f66 */
public class 进货单 {
   /** @pdOid 77b29303-7a46-4bb5-852a-6f896c7e150e */
   public java.lang.String 进货单号;
   /** @pdOid 79e863f4-ae90-4e6e-aa61-096fed12a82c */
   public java.util.Date 进货日期;
   /** @pdOid be448ec3-7d24-4616-9730-dc27b8349564 */
   public double 总价;
   /** @pdOid 15c6b1a0-17f5-482b-ac6f-c8a84a46e59f */
   public double 不含税价;
   /** @pdOid 5028f770-632f-4666-aca5-ad020dc35567 */
   public double 税额;
   
   /** @pdRoleInfo migr=no name=付款单 assc=进货单付款单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<付款单> 付款单;
   /** @pdRoleInfo migr=no name=进货单明细 assc=进货单进货单明细 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<进货单明细> 进货单明细;
   /** @pdRoleInfo migr=no name=供应商 assc=供应商进货单 mult=1..1 side=A */
   public 供应商 供应商;
   /** @pdRoleInfo migr=no name=worker assc=职工进货单 mult=0..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=采购订单 assc=进货单采购订单 mult=0..1 side=A */
   public 采购订单 采购订单;
   /** @pdRoleInfo migr=no name=worker assc=reference41 mult=0..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=worker assc=reference42 mult=0..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=worker assc=reference43 mult=0..1 side=A */
   public worker worker;
   
   
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
         new付款单.set进货单(this);      
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
            old付款单.set进货单((进货单)null);
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
            old付款单.set进货单((进货单)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<进货单明细> get进货单明细() {
      if (进货单明细 == null)
         进货单明细 = new java.util.HashSet<进货单明细>();
      return 进货单明细;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator进货单明细() {
      if (进货单明细 == null)
         进货单明细 = new java.util.HashSet<进货单明细>();
      return 进货单明细.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new进货单明细 */
   public void set进货单明细(java.util.Collection<进货单明细> new进货单明细) {
      removeAll进货单明细();
      for (java.util.Iterator iter = new进货单明细.iterator(); iter.hasNext();)
         add进货单明细((进货单明细)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new进货单明细 */
   public void add进货单明细(进货单明细 new进货单明细) {
      if (new进货单明细 == null)
         return;
      if (this.进货单明细 == null)
         this.进货单明细 = new java.util.HashSet<进货单明细>();
      if (!this.进货单明细.contains(new进货单明细))
      {
         this.进货单明细.add(new进货单明细);
         new进货单明细.set进货单(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old进货单明细 */
   public void remove进货单明细(进货单明细 old进货单明细) {
      if (old进货单明细 == null)
         return;
      if (this.进货单明细 != null)
         if (this.进货单明细.contains(old进货单明细))
         {
            this.进货单明细.remove(old进货单明细);
            old进货单明细.set进货单((进货单)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll进货单明细() {
      if (进货单明细 != null)
      {
         进货单明细 old进货单明细;
         for (java.util.Iterator iter = getIterator进货单明细(); iter.hasNext();)
         {
            old进货单明细 = (进货单明细)iter.next();
            iter.remove();
            old进货单明细.set进货单((进货单)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 供应商 get供应商() {
      return 供应商;
   }
   
   /** @pdGenerated default parent setter
     * @param new供应商 */
   public void set供应商(供应商 new供应商) {
      if (this.供应商 == null || !this.供应商.equals(new供应商))
      {
         if (this.供应商 != null)
         {
            供应商 old供应商 = this.供应商;
            this.供应商 = null;
            old供应商.remove进货单(this);
         }
         if (new供应商 != null)
         {
            this.供应商 = new供应商;
            this.供应商.add进货单(this);
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
            oldWorker.remove进货单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add进货单(this);
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
            oldWorker.remove进货单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add进货单(this);
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
            oldWorker.remove进货单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add进货单(this);
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
            oldWorker.remove进货单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add进货单(this);
         }
      }
   }

}