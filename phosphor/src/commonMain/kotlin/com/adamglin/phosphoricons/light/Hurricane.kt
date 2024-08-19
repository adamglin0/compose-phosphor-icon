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

public val LightGroup.Hurricane: ImageVector
    get() {
        if (_hurricane != null) {
            return _hurricane!!
        }
        _hurricane = Builder(name = "Hurricane", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 98.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, 30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 98.0f)
                close()
                moveTo(128.0f, 146.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 146.0f)
                close()
                moveTo(155.91f, 46.63f)
                lineTo(165.8f, 9.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.06f, -7.41f)
                arcToRelative(193.94f, 193.94f, 0.0f, false, false, -58.0f, 24.82f)
                curveTo(62.32f, 51.66f, 42.0f, 86.6f, 42.0f, 128.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, 58.09f, 81.37f)
                lineTo(90.2f, 246.45f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.06f, 7.42f)
                arcToRelative(193.94f, 193.94f, 0.0f, false, false, 58.0f, -24.82f)
                curveTo(193.68f, 204.34f, 214.0f, 169.4f, 214.0f, 128.0f)
                arcTo(86.09f, 86.09f, 0.0f, false, false, 155.91f, 46.63f)
                close()
                moveTo(149.05f, 218.76f)
                arcToRelative(187.63f, 187.63f, 0.0f, false, true, -44.55f, 20.67f)
                lineToRelative(8.68f, -32.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.26f, -7.34f)
                arcTo(74.06f, 74.06f, 0.0f, false, true, 54.0f, 128.0f)
                curveToRelative(0.0f, -37.53f, 17.82f, -68.07f, 53.0f, -90.77f)
                arcTo(187.93f, 187.93f, 0.0f, false, true, 151.5f, 16.57f)
                lineToRelative(-8.68f, 32.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.26f, 7.34f)
                arcTo(74.06f, 74.06f, 0.0f, false, true, 202.0f, 128.0f)
                curveTo(202.0f, 165.53f, 184.18f, 196.07f, 149.05f, 218.76f)
                close()
            }
        }
        .build()
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
