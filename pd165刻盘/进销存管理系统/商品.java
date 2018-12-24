/***********************************************************************
 * Module:  商品.java
 * Author:  Administrator
 * Purpose: Defines the Class 商品
 ***********************************************************************/

import java.util.*;

/** @pdOid 1d789f3f-9b22-4d6c-aacd-74c7078ff449 */
public class 商品 {
   /** @pdOid 5fd2ba3d-683a-4129-abe0-c0043f2dfe87 */
   public java.lang.String 货号;
   /** @pdOid 8c21c474-c0ba-4d19-bf17-0c80b0a681f4 */
   public java.lang.String 条形码;
   /** @pdOid f5a9bbb6-d3a3-404a-8764-6540a619ee7d */
   public java.lang.String 商品名;
   /** @pdOid cae1b464-707a-43fd-9116-8f76c6649898 */
   public java.lang.String 规格;
   /** @pdOid 84533e37-b218-422c-9572-0f6241286db5 */
   public java.lang.String 单位;
   /** @pdOid e8b0dd22-8ce1-4f9d-8287-12b1fcc1a25f */
   public java.lang.String 产地;
   /** @pdOid 37019087-41d0-4228-8bb5-62e031866d3c */
   public double 进货价;
   /** @pdOid 94c0b5bf-9d06-4a06-aa7d-b008d4011ef1 */
   public double 销售价;
   /** @pdOid a6f01bf9-c115-45b6-8b73-76d1dcf876dd */
   public double 最低售价;
   
   /** @pdRoleInfo migr=no name=付款单 assc=商品付款单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<付款单> 付款单;
   /** @pdRoleInfo migr=no name=收款单 assc=商品收款单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<收款单> 收款单;
   /** @pdRoleInfo migr=no name=进货单明细 assc=商品进货单明细 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<进货单明细> 进货单明细;
   /** @pdRoleInfo migr=no name=退货单 assc=商品退货单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<退货单> 退货单;
   /** @pdRoleInfo migr=no name=采购订单明细 assc=商品采购订单明细 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<采购订单明细> 采购订单明细;
   /** @pdRoleInfo migr=no name=销售单明细 assc=商品销售单明细 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售单明细> 销售单明细;
   /** @pdRoleInfo migr=no name=销售订单明细 assc=商品销售订单明细 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售订单明细> 销售订单明细;
   /** @pdRoleInfo migr=no name=入库 assc=商品入库 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<入库> 入库;
   /** @pdRoleInfo migr=no name=出库 assc=商品出库 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<出库> 出库;
   
   
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
         new付款单.set商品(this);      
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
            old付款单.set商品((商品)null);
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
            old付款单.set商品((商品)null);
         }
      }
   }
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
         new收款单.set商品(this);      
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
            old收款单.set商品((商品)null);
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
            old收款单.set商品((商品)null);
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
         new进货单明细.set商品(this);      
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
            old进货单明细.set商品((商品)null);
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
            old进货单明细.set商品((商品)null);
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
         new退货单.set商品(this);      
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
            old退货单.set商品((商品)null);
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
            old退货单.set商品((商品)null);
         }
      }
   }
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
         new采购订单明细.set商品(this);      
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
            old采购订单明细.set商品((商品)null);
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
            old采购订单明细.set商品((商品)null);
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
         new销售单明细.set商品(this);      
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
            old销售单明细.set商品((商品)null);
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
            old销售单明细.set商品((商品)null);
         }
      }
   }
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
         new销售订单明细.set商品(this);      
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
            old销售订单明细.set商品((商品)null);
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
            old销售订单明细.set商品((商品)null);
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
         new入库.set商品(this);      
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
            old入库.set商品((商品)null);
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
            old入库.set商品((商品)null);
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
         new出库.set商品(this);      
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
            old出库.set商品((商品)null);
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
            old出库.set商品((商品)null);
         }
      }
   }

}