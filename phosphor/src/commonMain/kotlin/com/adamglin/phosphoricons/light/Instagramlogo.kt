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

public val LightGroup.Instagramlogo: ImageVector
    get() {
        if (_instagramlogo != null) {
            return _instagramlogo!!
        }
        _instagramlogo = Builder(name = "Instagramlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 82.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, false, 128.0f, 82.0f)
                close()
                moveTo(128.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 128.0f, 162.0f)
                close()
                moveTo(176.0f, 26.0f)
                lineTo(80.0f, 26.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 26.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, 54.0f, 54.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, 54.0f, -54.0f)
                lineTo(230.0f, 80.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 176.0f, 26.0f)
                close()
                moveTo(218.0f, 176.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f)
                lineTo(80.0f, 218.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, -42.0f)
                lineTo(38.0f, 80.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 80.0f, 38.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, 42.0f)
                close()
                moveTo(190.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 190.0f, 76.0f)
                close()
            }
        }
        .build()
        return _instagramlogo!!
    }

private var _instagramlogo: ImageVector? = null
