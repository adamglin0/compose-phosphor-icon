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

public val LightGroup.Cursorclick: ImageVector
    get() {
        if (_cursorclick != null) {
            return _cursorclick!!
        }
        _cursorclick = Builder(name = "Cursorclick", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.0f, 24.0f)
                lineTo(90.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(16.0f, 102.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(16.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(125.32f, 37.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.05f, -2.69f)
                lineToRelative(8.0f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.74f, -5.37f)
                lineToRelative(-8.0f, 16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 125.32f, 37.37f)
                close()
                moveTo(29.32f, 122.63f)
                lineTo(13.32f, 130.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 10.74f)
                lineToRelative(16.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.36f, -10.74f)
                close()
                moveTo(217.9f, 185.41f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 19.8f)
                lineTo(205.21f, 217.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -19.8f, 0.0f)
                lineTo(134.1f, 166.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.21f, 0.54f)
                lineToRelative(-17.75f, 46.24f)
                arcToRelative(2.44f, 2.44f, 0.0f, false, false, -0.1f, 0.24f)
                arcTo(13.85f, 13.85f, 0.0f, false, true, 100.26f, 222.0f)
                curveToRelative(-0.23f, 0.0f, -0.45f, 0.0f, -0.68f, 0.0f)
                arcTo(13.85f, 13.85f, 0.0f, false, true, 87.0f, 212.38f)
                lineTo(34.7f, 52.3f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 52.3f, 34.7f)
                lineTo(212.38f, 87.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 213.61f, 113.0f)
                lineToRelative(-0.24f, 0.09f)
                lineToRelative(-46.25f, 17.76f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.53f, 3.21f)
                close()
                moveTo(209.41f, 193.9f)
                lineTo(158.1f, 142.59f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 4.32f, -22.74f)
                lineToRelative(0.24f, -0.1f)
                lineTo(208.91f, 102.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.26f, -3.61f)
                lineTo(48.58f, 46.11f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, false, -0.65f, -0.11f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.82f, 2.58f)
                lineTo(98.38f, 208.65f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, false, 1.77f, 1.35f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, false, 1.84f, -1.09f)
                lineToRelative(17.76f, -46.25f)
                lineToRelative(0.1f, -0.24f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 22.74f, -4.32f)
                lineToRelative(51.31f, 51.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.83f, 0.0f)
                lineToRelative(12.68f, -12.68f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 209.41f, 193.9f)
                close()
            }
        }
        .build()
        return _cursorclick!!
    }

private var _cursorclick: ImageVector? = null
