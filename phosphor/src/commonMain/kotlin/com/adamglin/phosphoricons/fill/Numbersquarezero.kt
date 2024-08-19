package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Numbersquarezero: ImageVector
    get() {
        if (_numbersquarezero != null) {
            return _numbersquarezero!!
        }
        _numbersquarezero = Builder(name = "Numbersquarezero", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 128.0f)
                curveToRelative(0.0f, 14.86f, -5.9f, 40.0f, -28.0f, 40.0f)
                reflectiveCurveToRelative(-28.0f, -25.14f, -28.0f, -40.0f)
                reflectiveCurveToRelative(5.9f, -40.0f, 28.0f, -40.0f)
                reflectiveCurveTo(156.0f, 113.14f, 156.0f, 128.0f)
                close()
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(172.0f, 128.0f)
                curveToRelative(0.0f, -14.25f, -3.56f, -27.53f, -10.0f, -37.39f)
                curveTo(154.0f, 78.44f, 142.23f, 72.0f, 128.0f, 72.0f)
                reflectiveCurveToRelative(-26.0f, 6.44f, -34.0f, 18.61f)
                curveToRelative(-6.47f, 9.86f, -10.0f, 23.14f, -10.0f, 37.39f)
                reflectiveCurveToRelative(3.56f, 27.53f, 10.0f, 37.39f)
                curveToRelative(8.0f, 12.17f, 19.74f, 18.61f, 34.0f, 18.61f)
                reflectiveCurveToRelative(26.0f, -6.44f, 34.0f, -18.61f)
                curveTo(168.44f, 155.53f, 172.0f, 142.25f, 172.0f, 128.0f)
                close()
            }
        }
        .build()
        return _numbersquarezero!!
    }

private var _numbersquarezero: ImageVector? = null
