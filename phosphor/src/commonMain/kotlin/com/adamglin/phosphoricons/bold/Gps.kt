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

public val BoldGroup.Gps: ImageVector
    get() {
        if (_gps != null) {
            return _gps!!
        }
        _gps = Builder(name = "Gps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 116.0f)
                horizontalLineTo(219.22f)
                arcTo(92.21f, 92.21f, 0.0f, false, false, 140.0f, 36.78f)
                verticalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(36.78f)
                arcTo(92.21f, 92.21f, 0.0f, false, false, 36.78f, 116.0f)
                horizontalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(36.78f)
                arcTo(92.21f, 92.21f, 0.0f, false, false, 116.0f, 219.22f)
                verticalLineTo(240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(219.22f)
                arcTo(92.21f, 92.21f, 0.0f, false, false, 219.22f, 140.0f)
                horizontalLineTo(240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, -68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 196.0f)
                close()
            }
        }
        .build()
        return _gps!!
    }

private var _gps: ImageVector? = null
