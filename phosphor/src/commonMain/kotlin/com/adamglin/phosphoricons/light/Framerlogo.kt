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

public val LightGroup.Framerlogo: ImageVector
    get() {
        if (_framerlogo != null) {
            return _framerlogo!!
        }
        _framerlogo = Builder(name = "Framerlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.0f, 104.0f)
                lineTo(206.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(56.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.0f, 10.48f)
                lineTo(112.22f, 98.0f)
                lineTo(56.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.76f, 4.24f)
                lineToRelative(72.0f, 72.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 134.0f, 240.0f)
                lineTo(134.0f, 174.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.0f, -10.48f)
                lineTo(143.78f, 110.0f)
                lineTo(200.0f, 110.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 206.0f, 104.0f)
                close()
                moveTo(184.22f, 162.0f)
                lineTo(128.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(57.51f)
                lineToRelative(-60.0f, -60.0f)
                lineTo(62.0f, 110.0f)
                horizontalLineToRelative(63.72f)
                close()
                moveTo(194.0f, 98.0f)
                lineTo(130.28f, 98.0f)
                lineTo(71.78f, 46.0f)
                lineTo(194.0f, 46.0f)
                close()
            }
        }
        .build()
        return _framerlogo!!
    }

private var _framerlogo: ImageVector? = null
