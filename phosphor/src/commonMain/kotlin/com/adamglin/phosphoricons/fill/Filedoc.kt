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

public val FillGroup.Filedoc: ImageVector
    get() {
        if (_filedoc != null) {
            return _filedoc!!
        }
        _filedoc = Builder(name = "Filedoc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 120.0f)
                lineTo(212.07f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(216.07f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.05f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 120.0f)
                close()
                moveTo(152.0f, 44.0f)
                lineTo(196.0f, 88.0f)
                horizontalLineToRelative(-44.0f)
                close()
                moveTo(52.0f, 144.0f)
                lineTo(36.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(51.33f, 216.0f)
                curveTo(71.0f, 216.0f, 87.55f, 200.52f, 88.0f, 180.87f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 52.0f, 144.0f)
                close()
                moveTo(51.51f, 200.0f)
                lineTo(44.0f, 200.0f)
                lineTo(44.0f, 160.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.77f)
                curveTo(71.59f, 191.59f, 62.35f, 200.0f, 51.52f, 200.0f)
                close()
                moveTo(222.18f, 195.72f)
                arcToRelative(8.26f, 8.26f, 0.0f, false, true, -0.73f, 11.09f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -21.4f, 9.19f)
                curveToRelative(-17.65f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f)
                reflectiveCurveToRelative(14.36f, -36.0f, 32.0f, -36.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 21.4f, 9.19f)
                arcToRelative(8.26f, 8.26f, 0.0f, false, true, 0.73f, 11.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.9f, 0.38f)
                arcTo(14.21f, 14.21f, 0.0f, false, false, 200.06f, 160.0f)
                curveToRelative(-8.82f, 0.0f, -16.0f, 9.0f, -16.0f, 20.0f)
                reflectiveCurveToRelative(7.18f, 20.0f, 16.0f, 20.0f)
                arcToRelative(14.25f, 14.25f, 0.0f, false, false, 10.23f, -4.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 222.19f, 195.72f)
                close()
                moveTo(128.0f, 144.0f)
                curveToRelative(-17.65f, 0.0f, -32.0f, 16.15f, -32.0f, 36.0f)
                reflectiveCurveToRelative(14.37f, 36.0f, 32.0f, 36.0f)
                reflectiveCurveToRelative(32.0f, -16.15f, 32.0f, -36.0f)
                reflectiveCurveTo(145.69f, 144.0f, 128.0f, 144.0f)
                close()
                moveTo(128.0f, 200.0f)
                curveToRelative(-8.83f, 0.0f, -16.0f, -9.0f, -16.0f, -20.0f)
                reflectiveCurveToRelative(7.18f, -20.0f, 16.0f, -20.0f)
                reflectiveCurveToRelative(16.0f, 9.0f, 16.0f, 20.0f)
                reflectiveCurveTo(136.86f, 200.0f, 128.0f, 200.0f)
                close()
            }
        }
        .build()
        return _filedoc!!
    }

private var _filedoc: ImageVector? = null
