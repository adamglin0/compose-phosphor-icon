package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) {
            return _parallelogram!!
        }
        _parallelogram = Builder(name = "Parallelogram", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.43f, 47.31f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 232.0f, 40.0f)
                horizontalLineTo(88.81f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -14.59f, 9.43f)
                lineToRelative(-64.8f, 144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 216.0f)
                horizontalLineTo(167.19f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.59f, -9.43f)
                lineToRelative(64.8f, -144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 245.43f, 47.31f)
                close()
                moveTo(167.19f, 200.0f)
                horizontalLineTo(24.0f)
                lineTo(88.81f, 56.0f)
                horizontalLineTo(232.0f)
                close()
            }
        }
        .build()
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
