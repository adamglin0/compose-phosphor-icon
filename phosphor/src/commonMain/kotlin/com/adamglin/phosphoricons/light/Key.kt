package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.15f, 40.85f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 86.2f, 121.31f)
                lineToRelative(-56.1f, 56.1f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, 9.9f)
                verticalLineTo(216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(206.0f)
                horizontalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(182.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, -1.76f)
                lineToRelative(10.45f, -10.44f)
                arcTo(77.59f, 77.59f, 0.0f, false, false, 160.0f, 174.0f)
                horizontalLineToRelative(0.1f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 215.15f, 40.85f)
                close()
                moveTo(226.0f, 98.16f)
                curveToRelative(-1.12f, 35.16f, -30.67f, 63.8f, -65.88f, 63.84f)
                arcToRelative(65.93f, 65.93f, 0.0f, false, true, -24.51f, -4.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.64f, 1.26f)
                lineTo(117.51f, 170.0f)
                horizontalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(18.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(18.0f)
                horizontalLineTo(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(187.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.58f, -1.41f)
                lineToRelative(58.83f, -58.83f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.26f, -6.64f)
                arcTo(65.61f, 65.61f, 0.0f, false, true, 94.0f, 95.92f)
                curveTo(94.0f, 60.71f, 122.68f, 31.16f, 157.83f, 30.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 226.0f, 98.16f)
                close()
                moveTo(190.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 190.0f, 76.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
