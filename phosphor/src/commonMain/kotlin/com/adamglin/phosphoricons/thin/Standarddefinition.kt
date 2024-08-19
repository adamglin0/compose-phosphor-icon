package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Standarddefinition: ImageVector
    get() {
        if (_standarddefinition != null) {
            return _standarddefinition!!
        }
        _standarddefinition = Builder(name = "Standarddefinition", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -104.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f)
                lineTo(148.0f, 172.0f)
                lineTo(148.0f, 84.0f)
                horizontalLineToRelative(20.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 212.0f, 128.0f)
                close()
                moveTo(28.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(224.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(32.0f, 52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 48.0f)
                close()
                moveTo(228.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(32.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(224.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 208.0f)
                close()
                moveTo(108.0f, 152.0f)
                curveToRelative(0.0f, -12.58f, -11.79f, -16.92f, -29.78f, -22.11f)
                curveTo(63.0f, 125.51f, 45.78f, 120.54f, 45.78f, 104.0f)
                curveToRelative(0.0f, -16.0f, 14.71f, -28.0f, 34.22f, -28.0f)
                curveToRelative(14.21f, 0.0f, 26.3f, 6.46f, 31.55f, 16.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.13f, 3.61f)
                curveTo(100.53f, 88.78f, 91.17f, 84.0f, 80.0f, 84.0f)
                curveToRelative(-15.0f, 0.0f, -26.22f, 8.6f, -26.22f, 20.0f)
                curveToRelative(0.0f, 9.81f, 10.07f, 13.43f, 26.66f, 18.21f)
                reflectiveCurveTo(116.0f, 132.46f, 116.0f, 152.0f)
                curveToRelative(0.0f, 15.44f, -16.15f, 28.0f, -36.0f, 28.0f)
                reflectiveCurveToRelative(-36.0f, -12.56f, -36.0f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                curveToRelative(0.0f, 11.0f, 12.56f, 20.0f, 28.0f, 20.0f)
                reflectiveCurveTo(108.0f, 163.0f, 108.0f, 152.0f)
                close()
            }
        }
        .build()
        return _standarddefinition!!
    }

private var _standarddefinition: ImageVector? = null
