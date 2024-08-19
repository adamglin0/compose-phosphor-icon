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

public val LightGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.59f, 134.1f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, -0.55f, -1.79f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.08f, -1.42f)
                lineToRelative(46.25f, -17.76f)
                lineToRelative(0.24f, -0.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 212.38f, 87.0f)
                lineTo(52.29f, 34.7f)
                arcTo(13.95f, 13.95f, 0.0f, false, false, 34.7f, 52.29f)
                lineTo(87.0f, 212.38f)
                arcToRelative(13.82f, 13.82f, 0.0f, false, false, 12.6f, 9.6f)
                curveToRelative(0.23f, 0.0f, 0.46f, 0.0f, 0.69f, 0.0f)
                arcTo(13.84f, 13.84f, 0.0f, false, false, 113.0f, 213.61f)
                arcToRelative(2.44f, 2.44f, 0.0f, false, false, 0.1f, -0.24f)
                lineToRelative(17.76f, -46.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.21f, -0.53f)
                lineToRelative(51.31f, 51.31f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(12.69f, -12.69f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.8f)
                close()
                moveTo(209.41f, 196.73f)
                lineTo(196.73f, 209.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineTo(142.59f, 158.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -22.74f, 4.32f)
                arcToRelative(2.44f, 2.44f, 0.0f, false, false, -0.1f, 0.24f)
                lineTo(102.0f, 208.91f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.61f, -0.26f)
                lineTo(46.11f, 48.57f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, 0.47f, -2.0f)
                arcTo(1.92f, 1.92f, 0.0f, false, true, 47.93f, 46.0f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, true, 0.64f, 0.1f)
                lineTo(208.65f, 98.38f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.26f, 3.61f)
                lineToRelative(-46.25f, 17.76f)
                lineToRelative(-0.24f, 0.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -4.32f, 22.74f)
                horizontalLineToRelative(0.0f)
                lineToRelative(51.31f, 51.31f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 209.41f, 196.73f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
