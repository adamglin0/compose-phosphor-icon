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

public val LightGroup.Subtitlesslash: ImageVector
    get() {
        if (_subtitlesslash != null) {
            return _subtitlesslash!!
        }
        _subtitlesslash = Builder(name = "Subtitlesslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(49.0f, 50.0f)
                lineTo(32.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 64.0f)
                lineTo(18.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(190.8f, 206.0f)
                lineToRelative(12.76f, 14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(32.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(59.89f, 62.0f)
                lineToRelative(61.82f, 68.0f)
                lineTo(104.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(28.62f)
                lineToRelative(18.18f, 20.0f)
                lineTo(56.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(161.71f, 174.0f)
                lineToRelative(18.18f, 20.0f)
                close()
                moveTo(50.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(72.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(56.0f, 142.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 50.0f, 136.0f)
                close()
                moveTo(238.0f, 64.0f)
                lineTo(238.0f, 194.83f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -12.0f, 0.0f)
                lineTo(226.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(105.79f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(224.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 238.0f, 64.0f)
                close()
                moveTo(178.52f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, -12.0f)
                lineTo(200.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return _subtitlesslash!!
    }

private var _subtitlesslash: ImageVector? = null
