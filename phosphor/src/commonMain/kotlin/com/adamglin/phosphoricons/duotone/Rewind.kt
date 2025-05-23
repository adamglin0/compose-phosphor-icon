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

public val DuotoneGroup.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 71.85f)
                verticalLineToRelative(112.3f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, true, -12.18f, 6.59f)
                lineToRelative(-88.19f, -56.15f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 0.0f, -13.18f)
                lineToRelative(88.19f, -56.15f)
                arcTo(7.91f, 7.91f, 0.0f, false, true, 224.0f, 71.85f)
                close()
                moveTo(107.82f, 65.26f)
                lineTo(19.63f, 121.41f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.0f, 13.18f)
                lineToRelative(88.19f, 56.15f)
                arcTo(7.91f, 7.91f, 0.0f, false, false, 120.0f, 184.15f)
                verticalLineTo(71.85f)
                arcTo(7.91f, 7.91f, 0.0f, false, false, 107.82f, 65.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.77f, 58.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.25f, 0.53f)
                lineTo(128.0f, 109.14f)
                lineTo(128.0f, 71.84f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 103.52f, 58.5f)
                lineTo(15.33f, 114.66f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 0.0f, 26.68f)
                lineToRelative(88.19f, 56.16f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 128.0f, 184.16f)
                verticalLineToRelative(-37.3f)
                lineToRelative(79.52f, 50.64f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 232.0f, 184.16f)
                lineTo(232.0f, 71.84f)
                arcTo(15.83f, 15.83f, 0.0f, false, false, 223.77f, 58.0f)
                close()
                moveTo(112.0f, 183.93f)
                lineTo(24.18f, 128.0f)
                lineTo(112.0f, 72.06f)
                close()
                moveTo(216.0f, 183.93f)
                lineTo(128.18f, 128.0f)
                lineTo(216.0f, 72.06f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
