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

public val LightGroup.Dooropen: ImageVector
    get() {
        if (_dooropen != null) {
            return _dooropen!!
        }
        _dooropen = Builder(name = "Dooropen", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 218.0f)
                lineTo(206.0f, 218.0f)
                lineTo(206.0f, 40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(64.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 40.0f)
                lineTo(50.0f, 218.0f)
                lineTo(24.0f, 218.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(232.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(194.0f, 40.0f)
                lineTo(194.0f, 218.0f)
                lineTo(174.0f, 218.0f)
                lineTo(174.0f, 38.0f)
                horizontalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 194.0f, 40.0f)
                close()
                moveTo(62.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(98.0f)
                lineTo(162.0f, 218.0f)
                lineTo(62.0f, 218.0f)
                close()
                moveTo(142.0f, 132.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 142.0f, 132.0f)
                close()
            }
        }
        .build()
        return _dooropen!!
    }

private var _dooropen: ImageVector? = null
