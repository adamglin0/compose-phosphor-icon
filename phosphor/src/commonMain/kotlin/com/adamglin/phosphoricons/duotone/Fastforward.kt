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

public val DuotoneGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(144.0f, 128.0f)
                arcToRelative(7.76f, 7.76f, 0.0f, false, true, -3.63f, 6.59f)
                lineTo(52.18f, 190.74f)
                arcTo(7.91f, 7.91f, 0.0f, false, true, 40.0f, 184.15f)
                lineTo(40.0f, 71.85f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, true, 12.18f, -6.59f)
                lineToRelative(88.19f, 56.15f)
                arcTo(7.76f, 7.76f, 0.0f, false, true, 144.0f, 128.0f)
                close()
                moveTo(244.37f, 121.41f)
                lineTo(156.18f, 65.26f)
                arcTo(7.91f, 7.91f, 0.0f, false, false, 144.0f, 71.85f)
                verticalLineToRelative(112.3f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, false, 12.18f, 6.59f)
                lineToRelative(88.19f, -56.15f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 244.37f, 121.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.67f, 114.66f)
                lineTo(160.48f, 58.5f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 136.0f, 71.84f)
                verticalLineToRelative(37.3f)
                lineTo(56.48f, 58.5f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 32.0f, 71.84f)
                lineTo(32.0f, 184.16f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 56.48f, 197.5f)
                lineTo(136.0f, 146.86f)
                verticalLineToRelative(37.3f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, 24.48f, 13.34f)
                lineToRelative(88.19f, -56.16f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 0.0f, -26.68f)
                close()
                moveTo(48.0f, 183.94f)
                lineTo(48.0f, 72.07f)
                lineTo(135.82f, 128.0f)
                close()
                moveTo(152.0f, 183.94f)
                lineTo(152.0f, 72.07f)
                lineTo(239.82f, 128.0f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
