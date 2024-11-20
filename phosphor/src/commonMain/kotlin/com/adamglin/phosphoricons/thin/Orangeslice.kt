package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) {
            return _orangeSlice!!
        }
        _orangeSlice = Builder(name = "OrangeSlice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 84.0f)
                lineTo(8.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(124.0f, 124.0f, 0.0f, false, false, 248.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 248.0f, 84.0f)
                close()
                moveTo(71.53f, 150.13f)
                lineTo(124.0f, 97.66f)
                lineTo(124.0f, 171.9f)
                arcTo(83.67f, 83.67f, 0.0f, false, true, 71.53f, 150.13f)
                close()
                moveTo(65.87f, 144.47f)
                arcTo(83.67f, 83.67f, 0.0f, false, true, 44.1f, 92.0f)
                horizontalLineToRelative(74.24f)
                close()
                moveTo(132.0f, 97.66f)
                lineToRelative(52.47f, 52.47f)
                arcTo(83.67f, 83.67f, 0.0f, false, true, 132.0f, 171.9f)
                close()
                moveTo(190.13f, 144.47f)
                lineTo(137.66f, 92.0f)
                lineTo(211.9f, 92.0f)
                arcTo(83.67f, 83.67f, 0.0f, false, true, 190.13f, 144.47f)
                close()
                moveTo(128.0f, 204.0f)
                arcTo(116.14f, 116.14f, 0.0f, false, true, 12.07f, 92.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 183.82f, 0.0f)
                horizontalLineToRelative(24.0f)
                arcTo(116.14f, 116.14f, 0.0f, false, true, 128.0f, 204.0f)
                close()
            }
        }
        .build()
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
