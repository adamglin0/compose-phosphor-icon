package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Lock-laminated-open-light`: ImageVector
    get() {
        if (`_lock-laminated-open-light` != null) {
            return `_lock-laminated-open-light`!!
        }
        `_lock-laminated-open-light` = Builder(name = "Lock-laminated-open-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 82.0f)
                lineTo(94.0f, 82.0f)
                lineTo(94.0f, 56.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 34.0f, -34.0f)
                curveToRelative(16.3f, 0.0f, 31.0f, 11.69f, 34.12f, 27.19f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.76f, -2.38f)
                curveTo(169.55f, 25.48f, 150.26f, 10.0f, 128.0f, 10.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, false, 82.0f, 56.0f)
                lineTo(82.0f, 82.0f)
                lineTo(48.0f, 82.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 96.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 96.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 82.0f)
                close()
                moveTo(46.0f, 126.0f)
                lineTo(210.0f, 126.0f)
                verticalLineToRelative(20.0f)
                lineTo(46.0f, 146.0f)
                close()
                moveTo(46.0f, 158.0f)
                lineTo(210.0f, 158.0f)
                verticalLineToRelative(20.0f)
                lineTo(46.0f, 178.0f)
                close()
                moveTo(48.0f, 94.0f)
                lineTo(208.0f, 94.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                lineTo(46.0f, 114.0f)
                lineTo(46.0f, 96.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 48.0f, 94.0f)
                close()
                moveTo(208.0f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 190.0f)
                lineTo(210.0f, 190.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f)
                close()
            }
        }
        .build()
        return `_lock-laminated-open-light`!!
    }

private var `_lock-laminated-open-light`: ImageVector? = null
