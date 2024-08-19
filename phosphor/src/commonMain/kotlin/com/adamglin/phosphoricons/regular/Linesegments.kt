package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Linesegments: ImageVector
    get() {
        if (_linesegments != null) {
            return _linesegments!!
        }
        _linesegments = Builder(name = "Linesegments", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.64f, 33.36f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 45.26f)
                curveToRelative(0.29f, 0.29f, 0.6f, 0.57f, 0.9f, 0.85f)
                lineToRelative(-26.63f, 49.46f)
                arcToRelative(32.19f, 32.19f, 0.0f, false, false, -23.9f, 3.5f)
                lineToRelative(-20.18f, -20.18f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -50.2f, -38.89f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 45.26f)
                curveToRelative(0.29f, 0.29f, 0.59f, 0.57f, 0.89f, 0.85f)
                lineTo(47.63f, 168.94f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -30.27f, 8.44f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 45.26f, 0.0f)
                curveToRelative(-0.29f, -0.29f, -0.6f, -0.57f, -0.9f, -0.85f)
                lineToRelative(26.63f, -49.46f)
                arcTo(32.4f, 32.4f, 0.0f, false, false, 96.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 16.25f, -4.41f)
                lineToRelative(20.18f, 20.18f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 50.2f, -6.38f)
                curveToRelative(-0.29f, -0.29f, -0.59f, -0.57f, -0.89f, -0.85f)
                lineToRelative(26.63f, -49.46f)
                arcTo(32.33f, 32.33f, 0.0f, false, false, 216.0f, 88.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 22.63f, -54.62f)
                close()
                moveTo(51.3f, 211.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, -22.64f)
                horizontalLineToRelative(0.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 51.3f, 211.33f)
                close()
                moveTo(84.68f, 107.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.63f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.63f)
                close()
                moveTo(171.32f, 171.33f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, -22.63f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.63f)
                close()
                moveTo(227.32f, 67.33f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 204.7f, 44.67f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.64f)
                close()
            }
        }
        .build()
        return _linesegments!!
    }

private var _linesegments: ImageVector? = null
