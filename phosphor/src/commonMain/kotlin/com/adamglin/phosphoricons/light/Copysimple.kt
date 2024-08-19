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

public val LightGroup.Copysimple: ImageVector
    get() {
        if (_copysimple != null) {
            return _copysimple!!
        }
        _copysimple = Builder(name = "Copysimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 66.0f)
                lineTo(40.0f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(34.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(184.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(190.0f, 72.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 184.0f, 66.0f)
                close()
                moveTo(178.0f, 210.0f)
                lineTo(46.0f, 210.0f)
                lineTo(46.0f, 78.0f)
                lineTo(178.0f, 78.0f)
                close()
                moveTo(222.0f, 40.0f)
                lineTo(222.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(210.0f, 46.0f)
                lineTo(72.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(216.0f, 34.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 40.0f)
                close()
            }
        }
        .build()
        return _copysimple!!
    }

private var _copysimple: ImageVector? = null
