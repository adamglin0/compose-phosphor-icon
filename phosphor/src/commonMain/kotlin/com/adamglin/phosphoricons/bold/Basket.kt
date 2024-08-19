package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 128.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(168.06f, 126.81f)
                lineTo(164.06f, 166.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.75f, 13.13f)
                curveToRelative(0.4f, 0.0f, 0.81f, 0.06f, 1.2f, 0.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.93f, -10.81f)
                lineToRelative(4.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.88f, -2.38f)
                close()
                moveTo(87.94f, 126.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.88f, 2.38f)
                lineToRelative(4.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 180.0f)
                curveToRelative(0.39f, 0.0f, 0.8f, 0.0f, 1.2f, -0.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.75f, -13.13f)
                close()
                moveTo(243.94f, 89.59f)
                lineTo(228.87f, 202.59f)
                arcTo(20.06f, 20.06f, 0.0f, false, true, 209.0f, 220.0f)
                lineTo(47.0f, 220.0f)
                arcToRelative(20.06f, 20.06f, 0.0f, false, true, -19.82f, -17.36f)
                lineToRelative(-15.07f, -113.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 76.0f)
                lineTo(66.55f, 76.0f)
                lineTo(119.0f, 16.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.06f, 0.0f)
                lineTo(189.45f, 76.0f)
                lineTo(232.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.89f, 13.59f)
                close()
                moveTo(98.45f, 76.0f)
                horizontalLineToRelative(59.1f)
                lineTo(128.0f, 42.22f)
                close()
                moveTo(218.29f, 100.0f)
                lineTo(37.71f, 100.0f)
                lineToRelative(12.8f, 96.0f)
                horizontalLineToRelative(155.0f)
                close()
            }
        }
        .build()
        return _basket!!
    }

private var _basket: ImageVector? = null
