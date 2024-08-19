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

public val BoldGroup.Lego: ImageVector
    get() {
        if (_lego != null) {
            return _lego!!
        }
        _lego = Builder(name = "Lego", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.36f, 77.28f)
                horizontalLineToRelative(0.0f)
                lineTo(203.74f, 56.45f)
                curveTo(201.38f, 40.24f, 183.0f, 28.0f, 160.0f, 28.0f)
                curveToRelative(-24.67f, 0.0f, -44.0f, 14.06f, -44.0f, 32.0f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, 2.69f, 11.24f)
                lineToRelative(-9.4f, 4.7f)
                curveTo(101.56f, 71.0f, 91.35f, 68.0f, 80.0f, 68.0f)
                curveToRelative(-24.67f, 0.0f, -44.0f, 14.06f, -44.0f, 32.0f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, 2.69f, 11.24f)
                lineToRelative(-28.06f, 14.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 4.0f, 136.0f)
                lineTo(4.0f, 136.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.63f, 10.73f)
                lineToRelative(64.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.74f, 0.0f)
                lineToRelative(160.0f, -80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 252.0f, 144.0f)
                lineTo(252.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 245.36f, 77.28f)
                close()
                moveTo(80.0f, 154.58f)
                lineTo(42.83f, 136.0f)
                lineToRelative(15.81f, -7.9f)
                arcTo(58.2f, 58.2f, 0.0f, false, false, 80.0f, 132.0f)
                curveToRelative(24.67f, 0.0f, 44.0f, -14.06f, 44.0f, -32.0f)
                arcToRelative(25.39f, 25.39f, 0.0f, false, false, -0.4f, -4.38f)
                lineToRelative(15.0f, -7.52f)
                arcTo(58.2f, 58.2f, 0.0f, false, false, 160.0f, 92.0f)
                curveToRelative(14.72f, 0.0f, 27.53f, -5.0f, 35.47f, -12.85f)
                lineTo(213.17f, 88.0f)
                close()
                moveTo(160.0f, 52.0f)
                curveToRelative(12.91f, 0.0f, 20.0f, 6.0f, 20.0f, 8.0f)
                reflectiveCurveToRelative(-7.09f, 8.0f, -20.0f, 8.0f)
                reflectiveCurveToRelative(-20.0f, -6.0f, -20.0f, -8.0f)
                reflectiveCurveTo(147.09f, 52.0f, 160.0f, 52.0f)
                close()
                moveTo(80.0f, 92.0f)
                curveToRelative(12.91f, 0.0f, 20.0f, 6.0f, 20.0f, 8.0f)
                reflectiveCurveToRelative(-7.09f, 8.0f, -20.0f, 8.0f)
                reflectiveCurveToRelative(-20.0f, -6.0f, -20.0f, -8.0f)
                reflectiveCurveTo(67.09f, 92.0f, 80.0f, 92.0f)
                close()
                moveTo(28.0f, 155.42f)
                lineToRelative(40.0f, 20.0f)
                verticalLineToRelative(29.16f)
                lineToRelative(-40.0f, -20.0f)
                close()
                moveTo(92.0f, 204.58f)
                lineTo(92.0f, 175.42f)
                lineToRelative(136.0f, -68.0f)
                verticalLineToRelative(29.16f)
                close()
            }
        }
        .build()
        return _lego!!
    }

private var _lego: ImageVector? = null
