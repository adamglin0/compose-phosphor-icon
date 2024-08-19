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

public val LightGroup.Gitlablogo: ImageVector
    get() {
        if (_gitlablogo != null) {
            return _gitlablogo!!
        }
        _gitlablogo = Builder(name = "Gitlablogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.21f, 117.61f)
                lineTo(208.32f, 41.49f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, false, -19.0f, -0.93f)
                lineTo(171.17f, 90.0f)
                lineTo(84.83f, 90.0f)
                lineTo(66.66f, 40.56f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, false, -19.0f, 0.93f)
                lineTo(27.79f, 117.61f)
                arcTo(55.18f, 55.18f, 0.0f, false, false, 49.0f, 176.42f)
                lineToRelative(73.27f, 51.77f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, false, 11.44f, 0.0f)
                lineTo(207.0f, 176.42f)
                arcTo(55.18f, 55.18f, 0.0f, false, false, 228.21f, 117.61f)
                close()
                moveTo(57.65f, 50.82f)
                lineTo(75.0f, 98.07f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 80.64f, 102.0f)
                horizontalLineToRelative(94.72f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 181.0f, 98.07f)
                lineToRelative(17.36f, -47.25f)
                lineToRelative(15.0f, 57.52f)
                lineTo(128.0f, 168.66f)
                lineTo(42.62f, 108.34f)
                close()
                moveTo(39.38f, 120.74f)
                lineTo(117.6f, 176.0f)
                lineTo(93.41f, 193.1f)
                lineTo(55.94f, 166.62f)
                arcTo(43.1f, 43.1f, 0.0f, false, true, 39.38f, 120.74f)
                close()
                moveTo(128.0f, 217.53f)
                lineToRelative(-24.19f, -17.09f)
                lineTo(128.0f, 183.35f)
                lineToRelative(24.19f, 17.09f)
                close()
                moveTo(200.06f, 166.62f)
                lineTo(162.59f, 193.1f)
                lineTo(138.4f, 176.0f)
                lineToRelative(78.22f, -55.26f)
                arcTo(43.1f, 43.1f, 0.0f, false, true, 200.06f, 166.62f)
                close()
            }
        }
        .build()
        return _gitlablogo!!
    }

private var _gitlablogo: ImageVector? = null
