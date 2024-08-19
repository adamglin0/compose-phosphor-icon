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

public val BoldGroup.Vignette: ImageVector
    get() {
        if (_vignette != null) {
            return _vignette!!
        }
        _vignette = Builder(name = "Vignette", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                close()
                moveTo(81.43f, 166.05f)
                curveTo(94.0f, 175.05f, 110.56f, 180.0f, 128.0f, 180.0f)
                reflectiveCurveToRelative(34.0f, -4.95f, 46.57f, -13.95f)
                curveTo(188.19f, 156.32f, 196.0f, 142.45f, 196.0f, 128.0f)
                reflectiveCurveToRelative(-7.81f, -28.32f, -21.43f, -38.0f)
                curveTo(162.0f, 81.0f, 145.44f, 76.0f, 128.0f, 76.0f)
                reflectiveCurveTo(94.0f, 81.0f, 81.43f, 90.0f)
                curveTo(67.81f, 99.68f, 60.0f, 113.55f, 60.0f, 128.0f)
                reflectiveCurveTo(67.81f, 156.32f, 81.43f, 166.05f)
                close()
                moveTo(128.0f, 100.0f)
                curveToRelative(23.85f, 0.0f, 44.0f, 12.82f, 44.0f, 28.0f)
                reflectiveCurveToRelative(-20.15f, 28.0f, -44.0f, 28.0f)
                reflectiveCurveToRelative(-44.0f, -12.82f, -44.0f, -28.0f)
                reflectiveCurveTo(104.15f, 100.0f, 128.0f, 100.0f)
                close()
            }
        }
        .build()
        return _vignette!!
    }

private var _vignette: ImageVector? = null
