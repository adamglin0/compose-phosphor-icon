package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Wind-fill`: ImageVector
    get() {
        if (`_wind-fill` != null) {
            return `_wind-fill`!!
        }
        `_wind-fill` = Builder(name = "Wind-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 104.0f)
                lineTo(24.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 24.27f, 88.0f)
                lineTo(112.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 111.73f, 72.0f)
                lineTo(92.29f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.58f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 120.0f, 104.0f)
                close()
                moveTo(239.92f, 101.71f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -63.59f, -2.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.58f)
                horizontalLineToRelative(19.44f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 8.25f, 7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.53f)
                lineTo(32.27f, 120.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 24.0f, 127.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 136.0f)
                lineTo(208.0f, 136.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 239.92f, 101.71f)
                close()
                moveTo(152.0f, 152.0f)
                lineTo(40.27f, 152.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 32.0f, 159.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 168.0f)
                lineTo(143.73f, 168.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 8.25f, 7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.53f)
                lineTo(124.29f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.58f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 152.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_wind-fill`!!
    }

private var `_wind-fill`: ImageVector? = null
