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

public val LightGroup.Questionmark: ImageVector
    get() {
        if (_questionmark != null) {
            return _questionmark!!
        }
        _questionmark = Builder(name = "Questionmark", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 96.0f)
                curveToRelative(0.0f, 28.0f, -24.62f, 51.11f, -56.0f, 53.75f)
                lineTo(134.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                curveToRelative(27.57f, 0.0f, 50.0f, -18.84f, 50.0f, -42.0f)
                reflectiveCurveToRelative(-22.43f, -42.0f, -50.0f, -42.0f)
                reflectiveCurveTo(78.0f, 72.84f, 78.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                curveToRelative(0.0f, -29.78f, 27.81f, -54.0f, 62.0f, -54.0f)
                reflectiveCurveTo(190.0f, 66.22f, 190.0f, 96.0f)
                close()
                moveTo(128.0f, 194.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, false, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 128.0f, 194.0f)
                close()
            }
        }
        .build()
        return _questionmark!!
    }

private var _questionmark: ImageVector? = null
