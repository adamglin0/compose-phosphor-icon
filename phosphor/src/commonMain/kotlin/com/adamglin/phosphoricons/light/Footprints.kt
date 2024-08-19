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

public val LightGroup.Footprints: ImageVector
    get() {
        if (_footprints != null) {
            return _footprints!!
        }
        _footprints = Builder(name = "Footprints", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 162.0f)
                lineTo(48.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 68.0f, 0.0f)
                lineTo(110.0f, 168.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 162.0f)
                close()
                moveTo(98.0f, 180.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -44.0f, 0.0f)
                verticalLineToRelative(-6.0f)
                lineTo(98.0f, 174.0f)
                close()
                moveTo(76.0f, 18.0f)
                curveTo(65.2f, 18.0f, 54.56f, 27.91f, 46.0f, 45.9f)
                curveToRelative(-13.66f, 28.82f, -18.29f, 71.53f, 0.0f, 93.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.65f, 2.2f)
                horizontalLineToRelative(50.53f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.65f, -2.2f)
                curveToRelative(18.32f, -22.37f, 13.69f, -65.08f, 0.0f, -93.9f)
                curveTo(97.41f, 27.91f, 86.77f, 18.0f, 76.0f, 18.0f)
                close()
                moveTo(98.23f, 130.0f)
                lineTo(53.74f, 130.0f)
                curveToRelative(-10.09f, -15.18f, -11.69f, -47.65f, 3.14f, -79.0f)
                curveTo(64.24f, 35.51f, 71.77f, 30.0f, 76.0f, 30.0f)
                reflectiveCurveToRelative(11.75f, 5.51f, 19.1f, 21.0f)
                curveTo(109.92f, 82.35f, 108.32f, 114.82f, 98.23f, 130.0f)
                close()
                moveTo(208.0f, 186.0f)
                lineTo(152.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 68.0f, 0.0f)
                lineTo(214.0f, 192.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 186.0f)
                close()
                moveTo(202.0f, 204.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -44.0f, 0.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(44.0f)
                close()
                moveTo(154.73f, 166.0f)
                horizontalLineToRelative(50.53f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.65f, -2.2f)
                curveToRelative(18.32f, -22.37f, 13.69f, -65.08f, 0.0f, -93.9f)
                curveTo(201.44f, 51.91f, 190.8f, 42.0f, 180.0f, 42.0f)
                reflectiveCurveToRelative(-21.43f, 9.91f, -30.0f, 27.9f)
                curveToRelative(-13.66f, 28.82f, -18.29f, 71.53f, 0.0f, 93.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 154.75f, 166.0f)
                close()
                moveTo(160.9f, 75.0f)
                curveToRelative(7.35f, -15.53f, 14.88f, -21.0f, 19.1f, -21.0f)
                reflectiveCurveToRelative(11.74f, 5.51f, 19.1f, 21.0f)
                curveToRelative(14.83f, 31.31f, 13.23f, 63.78f, 3.14f, 79.0f)
                lineTo(157.77f, 154.0f)
                curveTo(147.68f, 138.82f, 146.08f, 106.35f, 160.92f, 75.0f)
                close()
            }
        }
        .build()
        return _footprints!!
    }

private var _footprints: ImageVector? = null
