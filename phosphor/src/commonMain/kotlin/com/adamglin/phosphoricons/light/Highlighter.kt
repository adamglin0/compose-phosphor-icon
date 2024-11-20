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

public val LightGroup.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.24f, 107.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(193.41f, 158.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.82f, 0.0f)
                lineTo(105.9f, 73.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.82f)
                lineToRelative(50.34f, -50.35f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(97.41f, 62.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 95.7f, 79.81f)
                lineTo(73.41f, 102.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f)
                lineToRelative(6.1f, 6.1f)
                lineTo(19.76f, 187.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.34f, 9.93f)
                lineToRelative(72.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.14f, -1.45f)
                lineTo(136.0f, 184.49f)
                lineToRelative(6.1f, 6.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(22.28f, -22.29f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.72f, -1.71f)
                lineToRelative(50.34f, -50.35f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 252.24f, 107.76f)
                close()
                moveTo(94.38f, 209.14f)
                lineTo(35.11f, 189.38f)
                lineTo(88.0f, 136.49f)
                lineTo(127.51f, 176.0f)
                close()
                moveTo(153.38f, 182.14f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.82f, 0.0f)
                lineToRelative(-10.35f, -10.34f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-48.0f, -48.0f)
                horizontalLineToRelative(0.0f)
                lineTo(81.9f, 113.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.82f)
                lineTo(104.0f, 88.49f)
                lineTo(175.51f, 160.0f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
