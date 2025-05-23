package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) {
            return _notSubsetOf!!
        }
        _notSubsetOf = Builder(name = "NotSubsetOf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.38f, 34.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 0.54f)
                lineTo(197.19f, 40.0f)
                horizontalLineTo(128.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 63.16f, 187.43f)
                lineTo(42.08f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, 10.76f)
                lineTo(75.0f, 198.2f)
                arcTo(87.5f, 87.5f, 0.0f, false, false, 128.0f, 216.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(128.0f)
                arcToRelative(71.63f, 71.63f, 0.0f, false, true, -42.18f, -13.7f)
                lineTo(213.92f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.38f, 34.08f)
                close()
                moveTo(56.0f, 128.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, 72.0f, -72.0f)
                horizontalLineToRelative(54.64f)
                lineTo(74.0f, 175.53f)
                arcTo(71.69f, 71.69f, 0.0f, false, true, 56.0f, 128.0f)
                close()
            }
        }
        .build()
        return _notSubsetOf!!
    }

private var _notSubsetOf: ImageVector? = null
