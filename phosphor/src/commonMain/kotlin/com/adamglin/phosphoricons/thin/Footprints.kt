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

public val ThinGroup.Footprints: ImageVector
    get() {
        if (_footprints != null) {
            return _footprints!!
        }
        _footprints = Builder(name = "Footprints", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 188.0f)
                lineTo(152.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                lineTo(212.0f, 192.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 188.0f)
                close()
                moveTo(204.0f, 204.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(104.0f, 164.0f)
                lineTo(48.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                lineTo(108.0f, 168.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 164.0f)
                close()
                moveTo(100.0f, 180.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(76.0f, 20.0f)
                curveToRelative(-9.82f, 0.0f, -20.07f, 9.75f, -28.12f, 26.75f)
                curveToRelative(-13.39f, 28.27f, -18.0f, 70.05f, -0.23f, 91.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.1f, 1.47f)
                horizontalLineToRelative(50.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.1f, -1.47f)
                curveToRelative(17.79f, -21.73f, 13.16f, -63.51f, -0.23f, -91.78f)
                curveTo(96.08f, 29.75f, 85.83f, 20.0f, 76.0f, 20.0f)
                close()
                moveTo(99.3f, 132.0f)
                lineTo(52.71f, 132.0f)
                curveToRelative(-13.8f, -19.0f, -9.79f, -56.08f, 2.4f, -81.82f)
                curveTo(61.59f, 36.5f, 69.59f, 28.0f, 76.0f, 28.0f)
                reflectiveCurveToRelative(14.42f, 8.5f, 20.9f, 22.18f)
                curveTo(109.09f, 75.92f, 113.1f, 113.0f, 99.3f, 132.0f)
                close()
                moveTo(154.74f, 164.0f)
                horizontalLineToRelative(50.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.1f, -1.47f)
                curveToRelative(17.79f, -21.73f, 13.16f, -63.51f, -0.23f, -91.78f)
                curveTo(200.07f, 53.75f, 189.82f, 44.0f, 180.0f, 44.0f)
                reflectiveCurveToRelative(-20.08f, 9.75f, -28.13f, 26.75f)
                curveToRelative(-13.39f, 28.27f, -18.0f, 70.05f, -0.23f, 91.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 154.74f, 164.0f)
                close()
                moveTo(159.1f, 74.18f)
                curveTo(165.58f, 60.5f, 173.58f, 52.0f, 180.0f, 52.0f)
                reflectiveCurveToRelative(14.41f, 8.5f, 20.89f, 22.18f)
                curveToRelative(12.19f, 25.74f, 16.2f, 62.82f, 2.4f, 81.82f)
                lineTo(156.7f, 156.0f)
                curveTo(142.9f, 137.0f, 146.91f, 99.92f, 159.1f, 74.18f)
                close()
            }
        }
        .build()
        return _footprints!!
    }

private var _footprints: ImageVector? = null
