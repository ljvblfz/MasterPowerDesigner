/***********************************************************************
 * Module:  采购订单.java
 * Author:  Administrator
 * Purpose: Defines the Class 采购订单
 ***********************************************************************/

import java.util.*;

/** @pdOid f6784f6d-8e0f-4343-b0c6-9dfd32c28be7 */
public class 采购订单 {
   /** @pdOid 69b207c8-bc49-453e-bc7d-55dcc602ba3a */
   public java.lang.String 采购订单号;
   /** @pdOid 0f3aa0b3-c9fd-4695-8104-1feec657c862 */
   public java.util.Date 订货日期;
   /** @pdOid 9c4d0d01-65ce-4814-9427-da3488691dad */
   public java.util.Date 截止日期;
   /** @pdOid 766bd99f-7252-4e59-87fd-2d393b592caa */
   public double 总价;
   /** @pdOid 93c0fe67-44c7-43ee-bf68-4a629cec388a */
   public double 不含税价;
   /** @pdOid f84c5090-1453-4ab3-bb44-9c26c59f880f */
   public double 税额;
   
   /** @pdRoleInfo migr=no name=采购订单明细 assc=采购订单采购订单明细 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<采购订单明细> 采购订单明细;
   /** @pdRoleInfo migr=no name=进货单 assc=进货单采购订单 mult=0..1 */
   public 进货单 进货单;
   /** @pdRoleInfo migr=no name=供应商 assc=供应商采购订单 mult=1..1 side=A */
   public 供应商 供应商;
   /** @pdRoleInfo migr=no name=worker assc=职工采购订单 mult=0..1 side=A */
   public worker worker;
   /** @pdRoleInfo migr=no name=worker assc=reference40 mult=0..1 side=A */
   public worker worker;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<采购订单明细> get采购订单明细() {
      if (采购订单明细 == null)
         采购订单明细 = new java.util.HashSet<采购订单明细>();
      return 采购订单明细;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator采购订单明细() {
      if (采购订单明细 == null)
         采购订单明细 = new java.util.HashSet<采购订单明细>();
      return 采购订单明细.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new采购订单明细 */
   public void set采购订单明细(java.util.Collection<采购订单明细> new采购订单明细) {
      removeAll采购订单明细();
      for (java.util.Iterator iter = new采购订单明细.iterator(); iter.hasNext();)
         add采购订单明细((采购订单明细)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new采购订单明细 */
   public void add采购订单明细(采购订单明细 new采购订单明细) {
      if (new采购订单明细 == null)
         return;
      if (this.采购订单明细 == null)
         this.采购订单明细 = new java.util.HashSet<采购订单明细>();
      if (!this.采购订单明细.contains(new采购订单明细))
      {
         this.采购订单明细.add(new采购订单明细);
         new采购订单明细.set采购订单(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old采购订单明细 */
   public void remove采购订单明细(采购订单明细 old采购订单明细) {
      if (old采购订单明细 == null)
         return;
      if (this.采购订单明细 != null)
         if (this.采购订单明细.contains(old采购订单明细))
         {
            this.采购订单明细.remove(old采购订单明细);
            old采购订单明细.set采购订单((采购订单)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll采购订单明细() {
      if (采购订单明细 != null)
      {
         采购订单明细 old采购订单明细;
         for (java.util.Iterator iter = getIterator采购订单明细(); iter.hasNext();)
         {
            old采购订单明细 = (采购订单明细)iter.next();
            iter.remove();
            old采购订单明细.set采购订单((采购订单)null);
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
            old供应商.remove采购订单(this);
         }
         if (new供应商 != null)
         {
            this.供应商 = new供应商;
            this.供应商.add采购订单(this);
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
            oldWorker.remove采购订单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add采购订单(this);
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
            oldWorker.remove采购订单(this);
         }
         if (newWorker != null)
         {
            this.worker = newWorker;
            this.worker.add采购订单(this);
         }
      }
   }

}