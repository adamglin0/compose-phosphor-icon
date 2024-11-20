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

public val ThinGroup.UserGear: ImageVector
    get() {
        if (_userGear != null) {
            return _userGear!!
        }
        _userGear = Builder(name = "UserGear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.17f, 158.84f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -50.34f, 0.0f)
                curveToRelative(-23.76f, 5.46f, -45.18f, 18.69f, -61.89f, 38.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.12f, 5.14f)
                curveTo(48.0f, 177.7f, 76.7f, 164.0f, 108.0f, 164.0f)
                reflectiveCurveToRelative(60.0f, 13.7f, 80.94f, 38.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.12f, -5.14f)
                curveTo(178.35f, 177.53f, 156.93f, 164.3f, 133.17f, 158.84f)
                close()
                moveTo(52.0f, 100.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, 56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 52.0f, 100.0f)
                close()
                moveTo(250.25f, 146.54f)
                lineTo(243.0f, 142.33f)
                arcToRelative(19.78f, 19.78f, 0.0f, false, false, 0.0f, -12.66f)
                lineToRelative(7.29f, -4.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, -6.92f)
                lineToRelative(-7.31f, 4.21f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 228.0f, 116.4f)
                lineTo(228.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(8.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -10.94f, 6.35f)
                lineToRelative(-7.31f, -4.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.0f, 6.92f)
                lineToRelative(7.29f, 4.21f)
                arcToRelative(19.78f, 19.78f, 0.0f, false, false, 0.0f, 12.66f)
                lineToRelative(-7.29f, 4.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 7.46f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 2.0f, -0.54f)
                lineToRelative(7.31f, -4.21f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 220.0f, 155.6f)
                lineTo(220.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(-8.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.94f, -6.35f)
                lineToRelative(7.31f, 4.21f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 2.0f, 0.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -7.46f)
                close()
                moveTo(224.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 224.0f, 148.0f)
                close()
            }
        }
        .build()
        return _userGear!!
    }

private var _userGear: ImageVector? = null
