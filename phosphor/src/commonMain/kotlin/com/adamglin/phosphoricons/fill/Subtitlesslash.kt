package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.SubtitlesSlash: ImageVector
    get() {
        if (_subtitlesSlash != null) {
            return _subtitlesSlash!!
        }
        _subtitlesSlash = Builder(name = "SubtitlesSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.48f, -0.37f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, -0.14f, 11.38f)
                lineTo(44.46f, 48.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 64.0f)
                lineTo(16.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(189.92f, 208.0f)
                lineToRelative(12.16f, 13.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.33f, 0.51f)
                arcToRelative(8.31f, 8.31f, 0.0f, false, false, 0.3f, -11.51f)
                close()
                moveTo(104.0f, 128.0f)
                horizontalLineToRelative(13.19f)
                lineToRelative(14.54f, 16.0f)
                lineTo(104.27f, 144.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 96.0f, 136.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 128.0f)
                close()
                moveTo(56.0f, 128.0f)
                lineTo(72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.53f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 71.73f, 144.0f)
                lineTo(56.27f, 144.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 48.0f, 136.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 128.0f)
                close()
                moveTo(152.0f, 176.0f)
                lineTo(56.27f, 176.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 48.0f, 168.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 160.0f)
                horizontalLineToRelative(90.28f)
                lineToRelative(11.9f, 13.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 176.0f)
                close()
                moveTo(240.0f, 64.0f)
                lineTo(240.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -5.19f, 11.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.7f, -0.24f)
                lineTo(175.0f, 144.0f)
                horizontalLineToRelative(25.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, -8.25f, -7.47f)
                horizontalLineToRelative(-39.3f)
                lineTo(93.79f, 54.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -6.69f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 64.0f)
                close()
            }
        }
        .build()
        return _subtitlesSlash!!
    }

private var _subtitlesSlash: ImageVector? = null
