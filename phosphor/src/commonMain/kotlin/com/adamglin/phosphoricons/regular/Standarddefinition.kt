package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Standarddefinition: ImageVector
    get() {
        if (_standarddefinition != null) {
            return _standarddefinition!!
        }
        _standarddefinition = Builder(name = "Standarddefinition", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, -112.0f)
                close()
                moveTo(208.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                lineTo(152.0f, 168.0f)
                lineTo(152.0f, 88.0f)
                horizontalLineToRelative(16.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 208.0f, 128.0f)
                close()
                moveTo(24.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(224.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(32.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 48.0f)
                close()
                moveTo(232.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(32.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(224.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 208.0f)
                close()
                moveTo(104.0f, 152.0f)
                curveToRelative(0.0f, -9.48f, -8.61f, -13.0f, -26.88f, -18.26f)
                curveTo(61.37f, 129.2f, 41.78f, 123.55f, 41.78f, 104.0f)
                curveToRelative(0.0f, -18.24f, 16.43f, -32.0f, 38.22f, -32.0f)
                curveToRelative(15.72f, 0.0f, 29.18f, 7.3f, 35.12f, 19.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.27f, 7.22f)
                curveTo(97.64f, 91.93f, 89.65f, 88.0f, 80.0f, 88.0f)
                curveToRelative(-12.67f, 0.0f, -22.22f, 6.88f, -22.22f, 16.0f)
                curveToRelative(0.0f, 7.0f, 9.0f, 10.1f, 23.77f, 14.36f)
                curveTo(97.78f, 123.0f, 120.0f, 129.45f, 120.0f, 152.0f)
                curveToRelative(0.0f, 17.64f, -17.94f, 32.0f, -40.0f, 32.0f)
                reflectiveCurveToRelative(-40.0f, -14.36f, -40.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                curveToRelative(0.0f, 8.67f, 11.0f, 16.0f, 24.0f, 16.0f)
                reflectiveCurveTo(104.0f, 160.67f, 104.0f, 152.0f)
                close()
            }
        }
        .build()
        return _standarddefinition!!
    }

private var _standarddefinition: ImageVector? = null
