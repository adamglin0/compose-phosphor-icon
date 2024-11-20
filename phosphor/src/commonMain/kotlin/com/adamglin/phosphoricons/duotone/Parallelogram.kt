package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) {
            return _parallelogram!!
        }
        _parallelogram = Builder(name = "Parallelogram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(239.29f, 59.28f)
                lineToRelative(-64.8f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.3f, 4.72f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.3f, -11.28f)
                lineToRelative(64.8f, -144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.81f, 48.0f)
                horizontalLineTo(232.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 239.29f, 59.28f)
                close()
            }
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
