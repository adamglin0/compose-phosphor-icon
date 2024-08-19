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

public val LightGroup.Numbersquarezero: ImageVector
    get() {
        if (_numbersquarezero != null) {
            return _numbersquarezero!!
        }
        _numbersquarezero = Builder(name = "Numbersquarezero", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 74.0f)
                curveToRelative(-13.52f, 0.0f, -24.69f, 6.12f, -32.29f, 17.71f)
                curveTo(89.45f, 101.24f, 86.0f, 114.13f, 86.0f, 128.0f)
                reflectiveCurveToRelative(3.45f, 26.76f, 9.7f, 36.29f)
                curveTo(103.31f, 175.88f, 114.47f, 182.0f, 128.0f, 182.0f)
                reflectiveCurveToRelative(24.69f, -6.12f, 32.29f, -17.71f)
                curveToRelative(6.26f, -9.53f, 9.71f, -22.42f, 9.71f, -36.29f)
                reflectiveCurveToRelative(-3.45f, -26.76f, -9.7f, -36.29f)
                curveTo(152.69f, 80.12f, 141.52f, 74.0f, 128.0f, 74.0f)
                close()
                moveTo(128.0f, 170.0f)
                curveToRelative(-20.72f, 0.0f, -30.0f, -21.09f, -30.0f, -42.0f)
                reflectiveCurveToRelative(9.28f, -42.0f, 30.0f, -42.0f)
                reflectiveCurveToRelative(30.0f, 21.09f, 30.0f, 42.0f)
                reflectiveCurveTo(148.72f, 170.0f, 128.0f, 170.0f)
                close()
                moveTo(208.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(210.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _numbersquarezero!!
    }

private var _numbersquarezero: ImageVector? = null
