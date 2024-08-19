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

public val BoldGroup.Cursorclick: ImageVector
    get() {
        if (_cursorclick != null) {
            return _cursorclick!!
        }
        _cursorclick = Builder(name = "Cursorclick", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.15f, 179.17f)
                lineToRelative(-46.82f, -46.82f)
                lineToRelative(37.92f, -13.51f)
                curveToRelative(0.26f, -0.09f, 0.51f, -0.19f, 0.76f, -0.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -1.76f, -37.27f)
                lineTo(54.16f, 29.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 29.0f, 54.16f)
                lineTo(81.27f, 214.24f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 118.54f, 216.0f)
                curveToRelative(0.11f, -0.25f, 0.21f, -0.5f, 0.3f, -0.76f)
                lineToRelative(13.51f, -37.92f)
                lineToRelative(46.83f, 46.82f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f)
                lineToRelative(16.69f, -16.68f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.15f, 179.17f)
                close()
                moveTo(193.32f, 204.34f)
                lineTo(144.84f, 155.86f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 130.7f, 150.0f)
                arcToRelative(20.47f, 20.47f, 0.0f, false, false, -3.73f, 0.35f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 112.35f, 162.0f)
                curveToRelative(-0.11f, 0.25f, -0.2f, 0.5f, -0.3f, 0.76f)
                lineTo(100.4f, 195.5f)
                lineTo(54.29f, 54.29f)
                lineTo(195.5f, 100.4f)
                lineToRelative(-32.71f, 11.65f)
                curveToRelative(-0.25f, 0.09f, -0.51f, 0.19f, -0.76f, 0.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.16f, 32.48f)
                horizontalLineToRelative(0.0f)
                lineToRelative(48.48f, 48.48f)
                close()
                moveTo(84.0f, 16.0f)
                lineTo(84.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(12.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(120.62f, 24.21f)
                lineToRelative(4.0f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.77f, 7.58f)
                lineToRelative(-4.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.77f, -7.58f)
                close()
                moveTo(39.39f, 128.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.59f, 15.17f)
                lineToRelative(-12.0f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -7.59f, -22.76f)
                lineToRelative(12.0f, -4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 39.39f, 128.21f)
                close()
            }
        }
        .build()
        return _cursorclick!!
    }

private var _cursorclick: ImageVector? = null
