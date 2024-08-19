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

public val ThinGroup.`Road-horizon-thin`: ImageVector
    get() {
        if (`_road-horizon-thin` != null) {
            return `_road-horizon-thin`!!
        }
        `_road-horizon-thin` = Builder(name = "Road-horizon-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.49f, 190.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.53f, 5.45f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, -2.0f, 0.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.49f, -2.0f)
                lineTo(157.66f, 68.0f)
                lineTo(132.0f, 68.0f)
                lineTo(132.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 68.0f)
                lineTo(98.34f, 68.0f)
                lineTo(27.49f, 194.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 196.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, -2.0f, -0.51f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.51f, 190.0f)
                lineTo(89.16f, 68.0f)
                lineTo(24.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(232.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(166.84f, 68.0f)
                close()
                moveTo(128.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 116.0f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 176.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 172.0f)
                close()
            }
        }
        .build()
        return `_road-horizon-thin`!!
    }

private var `_road-horizon-thin`: ImageVector? = null
