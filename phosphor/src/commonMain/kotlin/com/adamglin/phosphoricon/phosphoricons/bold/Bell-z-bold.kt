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

public val BoldGroup.`Bell-z-bold`: ImageVector
    get() {
        if (`_bell-z-bold` != null) {
            return `_bell-z-bold`!!
        }
        `_bell-z-bold` = Builder(name = "Bell-z-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(112.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.0f, -18.66f)
                lineTo(121.58f, 104.0f)
                lineTo(112.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.0f, 18.66f)
                lineTo(134.42f, 128.0f)
                lineTo(144.0f, 128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 140.0f)
                close()
                moveTo(225.33f, 186.0f)
                arcTo(19.77f, 19.77f, 0.0f, false, true, 208.0f, 196.0f)
                lineTo(171.82f, 196.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -87.64f, 0.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(19.77f, 19.77f, 0.0f, false, true, -17.31f, -10.0f)
                arcToRelative(20.08f, 20.08f, 0.0f, false, true, 0.05f, -20.06f)
                curveTo(39.39f, 151.0f, 44.0f, 129.58f, 44.0f, 104.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 168.0f, 0.0f)
                curveToRelative(0.0f, 25.57f, 4.59f, 47.0f, 13.27f, 61.93f)
                arcTo(20.08f, 20.08f, 0.0f, false, true, 225.34f, 186.0f)
                close()
                moveTo(147.6f, 196.0f)
                lineTo(108.4f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 39.2f, 0.0f)
                close()
                moveTo(201.34f, 172.0f)
                curveTo(192.49f, 154.0f, 188.0f, 131.13f, 188.0f, 104.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -120.0f, 0.0f)
                curveToRelative(0.0f, 27.14f, -4.48f, 50.0f, -13.33f, 68.0f)
                close()
            }
        }
        .build()
        return `_bell-z-bold`!!
    }

private var `_bell-z-bold`: ImageVector? = null
