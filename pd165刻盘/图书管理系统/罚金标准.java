/***********************************************************************
 * Module:  罚金标准.java
 * Author:  Administrator
 * Purpose: Defines the Class 罚金标准
 ***********************************************************************/

import java.util.*;

/** @pdOid dfc647b0-8f28-4407-ac53-f3819a33569f */
public class 罚金标准 {
   /** @pdOid 6069be5c-1689-4ac9-b9e8-a4d6fcd97e21 */
   public java.lang.String 罚金类别;
   /** @pdOid 642f3f75-48c9-4a60-8d58-b64029e89e17 */
   public java.lang.String 罚金名称;
   /** @pdOid 9af0a097-e9ae-493b-8ff4-82b48ff67a31 */
   public double 单位金额;
   /** @pdOid fe25066a-dfdf-46ec-9a52-44125bad1d67 */
   public java.lang.String 单位描述;
   
   /** @pdRoleInfo migr=no name=读者 assc=读者罚金 coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<读者> 读者_罚金;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<读者> get读者_罚金() {
      if (读者_罚金 == null)
         读者_罚金 = new java.util.HashSet<读者>();
      return 读者_罚金;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator读者_罚金() {
      if (读者_罚金 == null)
         读者_罚金 = new java.util.HashSet<读者>();
      return 读者_罚金.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new读者_罚金 */
   public void set读者_罚金(java.util.Collection<读者> new读者_罚金) {
      removeAll读者_罚金();
      for (java.util.Iterator iter = new读者_罚金.iterator(); iter.hasNext();)
         add读者_罚金((读者)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new读者 */
   public void add读者_罚金(读者 new读者) {
      if (new读者 == null)
         return;
      if (this.读者_罚金 == null)
         this.读者_罚金 = new java.util.HashSet<读者>();
      if (!this.读者_罚金.contains(new读者))
      {
         this.读者_罚金.add(new读者);
         new读者.add读者_罚金(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old读者 */
   public void remove读者_罚金(读者 old读者) {
      if (old读者 == null)
         return;
      if (this.读者_罚金 != null)
         if (this.读者_罚金.contains(old读者))
         {
            this.读者_罚金.remove(old读者);
            old读者.remove读者_罚金(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll读者_罚金() {
      if (读者_罚金 != null)
      {
         读者 old读者;
         for (java.util.Iterator iter = getIterator读者_罚金(); iter.hasNext();)
         {
            old读者 = (读者)iter.next();
            iter.remove();
            old读者.remove读者_罚金(this);
         }
      }
   }

}