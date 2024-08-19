package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Lock-laminated-open-thin`: ImageVector
    get() {
        if (`_lock-laminated-open-thin` != null) {
            return `_lock-laminated-open-thin`!!
        }
        `_lock-laminated-open-thin` = Builder(name = "Lock-laminated-open-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 84.0f)
                lineTo(92.0f, 84.0f)
                lineTo(92.0f, 56.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                curveToRelative(17.24f, 0.0f, 32.75f, 12.38f, 36.08f, 28.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.84f, -1.6f)
                curveTo(167.78f, 26.81f, 149.31f, 12.0f, 128.0f, 12.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 84.0f, 56.0f)
                lineTo(84.0f, 84.0f)
                lineTo(48.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 96.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 84.0f)
                close()
                moveTo(44.0f, 124.0f)
                lineTo(212.0f, 124.0f)
                verticalLineToRelative(24.0f)
                lineTo(44.0f, 148.0f)
                close()
                moveTo(44.0f, 156.0f)
                lineTo(212.0f, 156.0f)
                verticalLineToRelative(24.0f)
                lineTo(44.0f, 180.0f)
                close()
                moveTo(48.0f, 92.0f)
                lineTo(208.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(44.0f, 116.0f)
                lineTo(44.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 92.0f)
                close()
                moveTo(208.0f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 188.0f)
                lineTo(212.0f, 188.0f)
                verticalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f)
                close()
            }
        }
        .build()
        return `_lock-laminated-open-thin`!!
    }

private var `_lock-laminated-open-thin`: ImageVector? = null
