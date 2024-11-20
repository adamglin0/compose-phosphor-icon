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

public val BoldGroup.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) {
            return _textSubscript!!
        }
        _textSubscript = Builder(name = "TextSubscript", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.6f, -19.2f)
                lineToRelative(43.17f, -57.56f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.35f, -16.82f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 204.68f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.63f, -8.0f)
                arcToRelative(36.3f, 36.3f, 0.0f, false, true, 5.2f, -9.67f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 57.5f, 43.34f)
                lineTo(216.0f, 196.0f)
                horizontalLineToRelative(24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 208.0f)
                close()
                moveTo(151.86f, 46.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.93f, 1.21f)
                lineTo(92.0f, 97.68f)
                lineTo(49.07f, 48.14f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 30.93f, 63.86f)
                lineTo(76.12f, 116.0f)
                lineTo(30.93f, 168.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.14f, 15.72f)
                lineTo(92.0f, 134.32f)
                lineToRelative(42.93f, 49.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 18.14f, -15.72f)
                lineTo(107.88f, 116.0f)
                lineToRelative(45.19f, -52.14f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 151.86f, 46.93f)
                close()
            }
        }
        .build()
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
