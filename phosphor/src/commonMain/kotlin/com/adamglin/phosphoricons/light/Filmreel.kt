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

public val LightGroup.FilmReel: ImageVector
    get() {
        if (_filmReel != null) {
            return _filmReel!!
        }
        _filmReel = Builder(name = "FilmReel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 218.0f)
                lineTo(176.0f, 218.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, true, false, -48.0f, 12.0f)
                lineTo(232.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(38.0f, 128.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, 90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(128.0f, 102.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, -22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 128.0f, 102.0f)
                close()
                moveTo(128.0f, 70.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 128.0f, 70.0f)
                close()
                moveTo(150.0f, 176.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, -22.0f, 22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 150.0f, 176.0f)
                close()
                moveTo(118.0f, 176.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 118.0f, 176.0f)
                close()
                moveTo(176.0f, 150.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, -22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 176.0f, 150.0f)
                close()
                moveTo(176.0f, 118.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 176.0f, 118.0f)
                close()
                moveTo(80.0f, 106.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 22.0f, 22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 80.0f, 106.0f)
                close()
                moveTo(80.0f, 138.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 80.0f, 138.0f)
                close()
            }
        }
        .build()
        return _filmReel!!
    }

private var _filmReel: ImageVector? = null
