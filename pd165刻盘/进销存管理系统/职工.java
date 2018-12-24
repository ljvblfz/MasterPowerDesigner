/***********************************************************************
 * Module:  worker.java
 * Author:  Administrator
 * Purpose: Defines the Class worker
 ***********************************************************************/

import java.util.*;

/** @pdOid 05a397a1-e62c-4688-afc6-935db6ca4b0a */
public class worker {
   /** @pdOid 1a2772d8-9d71-447b-ada0-7f1989faf98e */
   public java.lang.String 职工号;
   /** @pdOid b85b46d0-a500-45fc-816f-af1f28c271d2 */
   public java.lang.String 姓名;
   /** @pdOid caabe57e-ee16-4ea0-8479-9e085b493228 */
   public java.lang.String 性别;
   /** @pdOid d21c4a73-23cc-4541-8c17-a56f5c3270dd */
   public java.lang.String 电话;
   /** @pdOid 520a1998-a640-4528-b429-3b5402a762cc */
   public java.lang.String 手机;
   /** @pdOid 3ee9e91d-5085-42de-8d16-ad7b7c2e2fd1 */
   public java.lang.String 地址;
   /** @pdOid 24729a35-08f4-4afd-b146-9941465e5df3 */
   public java.lang.String 邮编;
   /** @pdOid 33e3f699-11d5-4d04-9a8a-7a419193fa95 */
   public java.lang.String 身份证号;
   /** @pdOid b41196e3-5622-4978-8e7c-2747f339720a */
   public java.lang.String 类别;
   
   /** @pdRoleInfo migr=no name=仓库 assc=职工仓库 mult=0..1 */
   public 仓库 仓库;
   /** @pdRoleInfo migr=no name=付款单 assc=职工付款单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<付款单> 付款单;
   /** @pdRoleInfo migr=no name=收款单 assc=职工收款单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<收款单> 收款单;
   /** @pdRoleInfo migr=no name=进货单 assc=职工进货单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<进货单> 进货单;
   /** @pdRoleInfo migr=no name=退货单 assc=职工退货单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<退货单> 退货单;
   /** @pdRoleInfo migr=no name=采购订单 assc=职工采购订单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<采购订单> 采购订单;
   /** @pdRoleInfo migr=no name=销售单 assc=职工销售单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售单> 销售单;
   /** @pdRoleInfo migr=no name=销售订单 assc=职工销售订单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售订单> 销售订单;
   /** @pdRoleInfo migr=no name=出库 assc=职工出库 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<出库> 出库;
   /** @pdRoleInfo migr=no name=入库 assc=职工入库 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<入库> 入库;
   /** @pdRoleInfo migr=no name=采购订单 assc=reference40 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<采购订单> 采购订单;
   /** @pdRoleInfo migr=no name=进货单 assc=reference41 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<进货单> 进货单;
   /** @pdRoleInfo migr=no name=进货单 assc=reference42 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<进货单> 进货单;
   /** @pdRoleInfo migr=no name=进货单 assc=reference43 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<进货单> 进货单;
   /** @pdRoleInfo migr=no name=销售订单 assc=reference44 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售订单> 销售订单;
   /** @pdRoleInfo migr=no name=销售单 assc=reference45 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售单> 销售单;
   /** @pdRoleInfo migr=no name=销售单 assc=reference46 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售单> 销售单;
   
   
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
         new付款单.setWorker(this);      
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
            old付款单.setWorker((worker)null);
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
            old付款单.setWorker((worker)null);
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
         new收款单.setWorker(this);      
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
            old收款单.setWorker((worker)null);
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
            old收款单.setWorker((worker)null);
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
         new进货单.setWorker(this);      
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
            old进货单.setWorker((worker)null);
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
            old进货单.setWorker((worker)null);
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
         new退货单.setWorker(this);      
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
            old退货单.setWorker((worker)null);
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
            old退货单.setWorker((worker)null);
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
         new采购订单.setWorker(this);      
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
            old采购订单.setWorker((worker)null);
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
            old采购订单.setWorker((worker)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<销售单> get销售单() {
      if (销售单 == null)
         销售单 = new java.util.HashSet<销售单>();
      return 销售单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator销售单() {
      if (销售单 == null)
         销售单 = new java.util.HashSet<销售单>();
      return 销售单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new销售单 */
   public void set销售单(java.util.Collection<销售单> new销售单) {
      removeAll销售单();
      for (java.util.Iterator iter = new销售单.iterator(); iter.hasNext();)
         add销售单((销售单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new销售单 */
   public void add销售单(销售单 new销售单) {
      if (new销售单 == null)
         return;
      if (this.销售单 == null)
         this.销售单 = new java.util.HashSet<销售单>();
      if (!this.销售单.contains(new销售单))
      {
         this.销售单.add(new销售单);
         new销售单.setWorker(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old销售单 */
   public void remove销售单(销售单 old销售单) {
      if (old销售单 == null)
         return;
      if (this.销售单 != null)
         if (this.销售单.contains(old销售单))
         {
            this.销售单.remove(old销售单);
            old销售单.setWorker((worker)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll销售单() {
      if (销售单 != null)
      {
         销售单 old销售单;
         for (java.util.Iterator iter = getIterator销售单(); iter.hasNext();)
         {
            old销售单 = (销售单)iter.next();
            iter.remove();
            old销售单.setWorker((worker)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<销售订单> get销售订单() {
      if (销售订单 == null)
         销售订单 = new java.util.HashSet<销售订单>();
      return 销售订单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator销售订单() {
      if (销售订单 == null)
         销售订单 = new java.util.HashSet<销售订单>();
      return 销售订单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new销售订单 */
   public void set销售订单(java.util.Collection<销售订单> new销售订单) {
      removeAll销售订单();
      for (java.util.Iterator iter = new销售订单.iterator(); iter.hasNext();)
         add销售订单((销售订单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new销售订单 */
   public void add销售订单(销售订单 new销售订单) {
      if (new销售订单 == null)
         return;
      if (this.销售订单 == null)
         this.销售订单 = new java.util.HashSet<销售订单>();
      if (!this.销售订单.contains(new销售订单))
      {
         this.销售订单.add(new销售订单);
         new销售订单.setWorker(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old销售订单 */
   public void remove销售订单(销售订单 old销售订单) {
      if (old销售订单 == null)
         return;
      if (this.销售订单 != null)
         if (this.销售订单.contains(old销售订单))
         {
            this.销售订单.remove(old销售订单);
            old销售订单.setWorker((worker)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll销售订单() {
      if (销售订单 != null)
      {
         销售订单 old销售订单;
         for (java.util.Iterator iter = getIterator销售订单(); iter.hasNext();)
         {
            old销售订单 = (销售订单)iter.next();
            iter.remove();
            old销售订单.setWorker((worker)null);
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
         new出库.setWorker(this);      
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
            old出库.setWorker((worker)null);
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
            old出库.setWorker((worker)null);
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
         new入库.setWorker(this);      
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
            old入库.setWorker((worker)null);
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
            old入库.setWorker((worker)null);
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
         new采购订单.setWorker(this);      
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
            old采购订单.setWorker((worker)null);
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
            old采购订单.setWorker((worker)null);
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
         new进货单.setWorker(this);      
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
            old进货单.setWorker((worker)null);
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
            old进货单.setWorker((worker)null);
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
         new进货单.setWorker(this);      
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
            old进货单.setWorker((worker)null);
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
            old进货单.setWorker((worker)null);
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
         new进货单.setWorker(this);      
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
            old进货单.setWorker((worker)null);
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
            old进货单.setWorker((worker)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<销售订单> get销售订单() {
      if (销售订单 == null)
         销售订单 = new java.util.HashSet<销售订单>();
      return 销售订单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator销售订单() {
      if (销售订单 == null)
         销售订单 = new java.util.HashSet<销售订单>();
      return 销售订单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new销售订单 */
   public void set销售订单(java.util.Collection<销售订单> new销售订单) {
      removeAll销售订单();
      for (java.util.Iterator iter = new销售订单.iterator(); iter.hasNext();)
         add销售订单((销售订单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new销售订单 */
   public void add销售订单(销售订单 new销售订单) {
      if (new销售订单 == null)
         return;
      if (this.销售订单 == null)
         this.销售订单 = new java.util.HashSet<销售订单>();
      if (!this.销售订单.contains(new销售订单))
      {
         this.销售订单.add(new销售订单);
         new销售订单.setWorker(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old销售订单 */
   public void remove销售订单(销售订单 old销售订单) {
      if (old销售订单 == null)
         return;
      if (this.销售订单 != null)
         if (this.销售订单.contains(old销售订单))
         {
            this.销售订单.remove(old销售订单);
            old销售订单.setWorker((worker)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll销售订单() {
      if (销售订单 != null)
      {
         销售订单 old销售订单;
         for (java.util.Iterator iter = getIterator销售订单(); iter.hasNext();)
         {
            old销售订单 = (销售订单)iter.next();
            iter.remove();
            old销售订单.setWorker((worker)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<销售单> get销售单() {
      if (销售单 == null)
         销售单 = new java.util.HashSet<销售单>();
      return 销售单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator销售单() {
      if (销售单 == null)
         销售单 = new java.util.HashSet<销售单>();
      return 销售单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new销售单 */
   public void set销售单(java.util.Collection<销售单> new销售单) {
      removeAll销售单();
      for (java.util.Iterator iter = new销售单.iterator(); iter.hasNext();)
         add销售单((销售单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new销售单 */
   public void add销售单(销售单 new销售单) {
      if (new销售单 == null)
         return;
      if (this.销售单 == null)
         this.销售单 = new java.util.HashSet<销售单>();
      if (!this.销售单.contains(new销售单))
      {
         this.销售单.add(new销售单);
         new销售单.setWorker(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old销售单 */
   public void remove销售单(销售单 old销售单) {
      if (old销售单 == null)
         return;
      if (this.销售单 != null)
         if (this.销售单.contains(old销售单))
         {
            this.销售单.remove(old销售单);
            old销售单.setWorker((worker)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll销售单() {
      if (销售单 != null)
      {
         销售单 old销售单;
         for (java.util.Iterator iter = getIterator销售单(); iter.hasNext();)
         {
            old销售单 = (销售单)iter.next();
            iter.remove();
            old销售单.setWorker((worker)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<销售单> get销售单() {
      if (销售单 == null)
         销售单 = new java.util.HashSet<销售单>();
      return 销售单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator销售单() {
      if (销售单 == null)
         销售单 = new java.util.HashSet<销售单>();
      return 销售单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new销售单 */
   public void set销售单(java.util.Collection<销售单> new销售单) {
      removeAll销售单();
      for (java.util.Iterator iter = new销售单.iterator(); iter.hasNext();)
         add销售单((销售单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new销售单 */
   public void add销售单(销售单 new销售单) {
      if (new销售单 == null)
         return;
      if (this.销售单 == null)
         this.销售单 = new java.util.HashSet<销售单>();
      if (!this.销售单.contains(new销售单))
      {
         this.销售单.add(new销售单);
         new销售单.setWorker(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old销售单 */
   public void remove销售单(销售单 old销售单) {
      if (old销售单 == null)
         return;
      if (this.销售单 != null)
         if (this.销售单.contains(old销售单))
         {
            this.销售单.remove(old销售单);
            old销售单.setWorker((worker)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll销售单() {
      if (销售单 != null)
      {
         销售单 old销售单;
         for (java.util.Iterator iter = getIterator销售单(); iter.hasNext();)
         {
            old销售单 = (销售单)iter.next();
            iter.remove();
            old销售单.setWorker((worker)null);
         }
      }
   }

}