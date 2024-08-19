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

public val BoldGroup.Questionmark: ImageVector
    get() {
        if (_questionmark != null) {
            return _questionmark!!
        }
        _questionmark = Builder(name = "Questionmark", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 96.0f)
                curveToRelative(0.0f, 29.47f, -24.21f, 54.05f, -56.0f, 59.06f)
                lineTo(140.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                curveToRelative(24.26f, 0.0f, 44.0f, -16.15f, 44.0f, -36.0f)
                reflectiveCurveToRelative(-19.74f, -36.0f, -44.0f, -36.0f)
                reflectiveCurveTo(84.0f, 76.15f, 84.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                curveToRelative(0.0f, -33.08f, 30.5f, -60.0f, 68.0f, -60.0f)
                reflectiveCurveTo(196.0f, 62.92f, 196.0f, 96.0f)
                close()
                moveTo(128.0f, 188.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 128.0f, 188.0f)
                close()
            }
        }
        .build()
        return _questionmark!!
    }

private var _questionmark: ImageVector? = null
