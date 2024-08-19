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

public val BoldGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.15f, 179.17f)
                lineToRelative(-46.83f, -46.82f)
                lineToRelative(37.93f, -13.51f)
                lineToRelative(0.76f, -0.3f)
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
                arcToRelative(20.66f, 20.66f, 0.0f, false, false, -3.74f, 0.35f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 112.35f, 162.0f)
                curveToRelative(-0.11f, 0.25f, -0.21f, 0.5f, -0.3f, 0.76f)
                lineTo(100.4f, 195.5f)
                lineTo(54.29f, 54.29f)
                lineToRelative(141.21f, 46.1f)
                lineToRelative(-32.71f, 11.66f)
                curveToRelative(-0.26f, 0.09f, -0.51f, 0.19f, -0.76f, 0.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.17f, 32.48f)
                horizontalLineToRelative(0.0f)
                lineToRelative(48.49f, 48.48f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
