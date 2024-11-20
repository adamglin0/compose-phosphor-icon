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

public val LightGroup.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) {
            return _textSubscript!!
        }
        _textSubscript = Builder(name = "TextSubscript", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, -9.6f)
                lineToRelative(43.17f, -57.56f)
                arcTo(18.0f, 18.0f, 0.0f, true, false, 199.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.31f, -4.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, true, 240.0f, 154.06f)
                lineTo(204.0f, 202.0f)
                horizontalLineToRelative(36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 208.0f)
                close()
                moveTo(147.93f, 51.47f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.46f, 0.6f)
                lineTo(92.0f, 106.84f)
                lineTo(44.53f, 52.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.06f, 7.86f)
                lineTo(84.06f, 116.0f)
                lineTo(35.47f, 172.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.06f, 7.86f)
                lineTo(92.0f, 125.16f)
                lineToRelative(47.47f, 54.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.06f, -7.86f)
                lineTo(99.94f, 116.0f)
                lineToRelative(48.59f, -56.07f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 147.93f, 51.47f)
                close()
            }
        }
        .build()
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
