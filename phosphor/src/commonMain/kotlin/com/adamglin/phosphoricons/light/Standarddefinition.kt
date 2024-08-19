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

public val LightGroup.Standarddefinition: ImageVector
    get() {
        if (_standarddefinition != null) {
            return _standarddefinition!!
        }
        _standarddefinition = Builder(name = "Standarddefinition", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 0.0f, -108.0f)
                close()
                moveTo(210.0f, 128.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f)
                lineTo(150.0f, 170.0f)
                lineTo(150.0f, 86.0f)
                horizontalLineToRelative(18.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 210.0f, 128.0f)
                close()
                moveTo(26.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(224.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(32.0f, 54.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 26.0f, 48.0f)
                close()
                moveTo(230.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(32.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(224.0f, 202.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 208.0f)
                close()
                moveTo(106.0f, 152.0f)
                curveToRelative(0.0f, -11.21f, -10.7f, -15.1f, -28.33f, -20.18f)
                curveToRelative(-15.89f, -4.58f, -33.89f, -9.77f, -33.89f, -27.82f)
                curveToRelative(0.0f, -17.1f, 15.57f, -30.0f, 36.22f, -30.0f)
                curveToRelative(15.0f, 0.0f, 27.74f, 6.88f, 33.34f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.71f, 5.42f)
                curveTo(99.08f, 90.36f, 90.41f, 86.0f, 80.0f, 86.0f)
                curveToRelative(-13.81f, 0.0f, -24.22f, 7.74f, -24.22f, 18.0f)
                curveToRelative(0.0f, 8.41f, 9.52f, 11.76f, 25.21f, 16.29f)
                curveTo(97.48f, 125.0f, 118.0f, 131.0f, 118.0f, 152.0f)
                curveToRelative(0.0f, 16.54f, -17.0f, 30.0f, -38.0f, 30.0f)
                reflectiveCurveToRelative(-38.0f, -13.46f, -38.0f, -30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                curveToRelative(0.0f, 9.76f, 11.91f, 18.0f, 26.0f, 18.0f)
                reflectiveCurveTo(106.0f, 161.76f, 106.0f, 152.0f)
                close()
            }
        }
        .build()
        return _standarddefinition!!
    }

private var _standarddefinition: ImageVector? = null
