/***********************************************************************
 * Module:  仓库.java
 * Author:  Administrator
 * Purpose: Defines the Class 仓库
 ***********************************************************************/

import java.util.*;

/** @pdOid 65cb0855-abe3-4458-ac67-1a76e6122de4 */
public class 仓库 {
   /** @pdOid bf8b71d9-6b94-49d8-9a10-34d0761eef7b */
   public java.lang.String 仓库号;
   /** @pdOid 25dc1865-57cb-4f4b-891c-bf892c8311e7 */
   public java.lang.String 仓库名;
   /** @pdOid 49542e52-0a18-428c-b517-cf08fafaefb6 */
   public java.lang.String 类别;
   /** @pdOid f01c88a3-2506-434c-a68b-3a7c7e4a0b27 */
   public java.lang.String 备注;
   
   /** @pdRoleInfo migr=no name=进货单明细 assc=仓库进货单明细 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<进货单明细> 进货单明细;
   /** @pdRoleInfo migr=no name=退货单 assc=仓库退货单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<退货单> 退货单;
   /** @pdRoleInfo migr=no name=销售单明细 assc=仓库销售单明细 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售单明细> 销售单明细;
   /** @pdRoleInfo migr=no name=出库 assc=仓库出库 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<出库> 出库;
   /** @pdRoleInfo migr=no name=入库 assc=仓库入库 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<入库> 入库;
   /** @pdRoleInfo migr=no name=worker assc=职工仓库 mult=1..1 side=A */
   public worker worker;
   
   
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
         new进货单明细.set仓库(this);      
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
            old进货单明细.set仓库((仓库)null);
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
            old进货单明细.set仓库((仓库)null);
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
         new退货单.set仓库(this);      
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
            old退货单.set仓库((仓库)null);
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
            old退货单.set仓库((仓库)null);
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
         new销售单明细.set仓库(this);      
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
            old销售单明细.set仓库((仓库)null);
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
            old销售单明细.set仓库((仓库)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<出库> get出库() {
      if (出库 == null)
         出库 = new java.util.HashSet<出库>();
      return 出库;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator出库() {
      if (出库 == null)
         出库 = new java.util.HashSet<出库>();
      return 出库.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new出库 */
   public void set出库(java.util.Collection<出库> new出库) {
      removeAll出库();
      for (java.util.Iterator iter = new出库.iterator(); iter.hasNext();)
         add出库((出库)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new出库 */
   public void add出库(出库 new出库) {
      if (new出库 == null)
         return;
      if (this.出库 == null)
         this.出库 = new java.util.HashSet<出库>();
      if (!this.出库.contains(new出库))
      {
         this.出库.add(new出库);
         new出库.set仓库(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old出库 */
   public void remove出库(出库 old出库) {
      if (old出库 == null)
         return;
      if (this.出库 != null)
         if (this.出库.contains(old出库))
         {
            this.出库.remove(old出库);
            old出库.set仓库((仓库)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll出库() {
      if (出库 != null)
      {
         出库 old出库;
         for (java.util.Iterator iter = getIterator出库(); iter.hasNext();)
         {
            old出库 = (出库)iter.next();
            iter.remove();
            old出库.set仓库((仓库)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<入库> get入库() {
      if (入库 == null)
         入库 = new java.util.HashSet<入库>();
      return 入库;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator入库() {
      if (入库 == null)
         入库 = new java.util.HashSet<入库>();
      return 入库.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new入库 */
   public void set入库(java.util.Collection<入库> new入库) {
      removeAll入库();
      for (java.util.Iterator iter = new入库.iterator(); iter.hasNext();)
         add入库((入库)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new入库 */
   public void add入库(入库 new入库) {
      if (new入库 == null)
         return;
      if (this.入库 == null)
         this.入库 = new java.util.HashSet<入库>();
      if (!this.入库.contains(new入库))
      {
         this.入库.add(new入库);
         new入库.set仓库(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old入库 */
   public void remove入库(入库 old入库) {
      if (old入库 == null)
         return;
      if (this.入库 != null)
         if (this.入库.contains(old入库))
         {
            this.入库.remove(old入库);
            old入库.set仓库((仓库)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll入库() {
      if (入库 != null)
      {
         入库 old入库;
         for (java.util.Iterator iter = getIterator入库(); iter.hasNext();)
         {
            old入库 = (入库)iter.next();
            iter.remove();
            old入库.set仓库((仓库)null);
         }
      }
   }

}