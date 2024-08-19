package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Invoice-bold`: ImageVector
    get() {
        if (`_invoice-bold` != null) {
            return `_invoice-bold`!!
        }
        `_invoice-bold` = Builder(name = "Invoice-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(56.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.0f, 100.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -3.38f, -55.79f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 59.3f, 44.0f)
                lineTo(64.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(40.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(56.0f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 3.38f, 55.79f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 36.7f, 132.0f)
                close()
                moveTo(236.0f, 56.0f)
                lineTo(236.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(40.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(156.0f, 188.0f)
                lineTo(156.0f, 164.0f)
                lineTo(88.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(68.0f)
                lineTo(156.0f, 116.0f)
                lineTo(112.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(212.0f, 92.0f)
                lineTo(212.0f, 68.0f)
                lineTo(104.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(224.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 56.0f)
                close()
                moveTo(180.0f, 140.0f)
                horizontalLineToRelative(32.0f)
                lineTo(212.0f, 116.0f)
                lineTo(180.0f, 116.0f)
                close()
                moveTo(212.0f, 188.0f)
                lineTo(212.0f, 164.0f)
                lineTo(180.0f, 164.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return `_invoice-bold`!!
    }

private var `_invoice-bold`: ImageVector? = null
