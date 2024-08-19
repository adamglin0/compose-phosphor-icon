package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Road-horizon-fill`: ImageVector
    get() {
        if (`_road-horizon-fill` != null) {
            return `_road-horizon-fill`!!
        }
        `_road-horizon-fill` = Builder(name = "Road-horizon-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.0f, 188.08f)
                lineTo(173.68f, 72.0f)
                horizontalLineToRelative(58.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 240.0f, 64.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 56.0f)
                lineTo(24.27f, 56.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 16.0f, 63.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 72.0f)
                lineTo(82.32f, 72.0f)
                lineTo(17.0f, 188.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.17f, 9.43f)
                arcToRelative(8.24f, 8.24f, 0.0f, false, false, 6.0f, 2.49f)
                lineTo(116.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(120.0f, 176.27f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(91.77f)
                arcToRelative(8.24f, 8.24f, 0.0f, false, false, 6.0f, -2.49f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 239.0f, 188.08f)
                close()
                moveTo(136.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 124.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(136.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_road-horizon-fill`!!
    }

private var `_road-horizon-fill`: ImageVector? = null
