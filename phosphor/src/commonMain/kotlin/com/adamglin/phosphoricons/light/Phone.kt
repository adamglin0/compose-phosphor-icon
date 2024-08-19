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

public val LightGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.59f, 160.3f)
                lineToRelative(-47.24f, -21.17f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.28f, 1.22f)
                arcToRelative(4.81f, 4.81f, 0.0f, false, false, -0.56f, 0.42f)
                lineToRelative(-24.69f, 21.0f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -1.68f, 0.06f)
                curveToRelative(-15.87f, -7.66f, -32.31f, -24.0f, -40.0f, -39.65f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, 0.0f, -1.68f)
                lineToRelative(21.07f, -25.0f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, false, 0.42f, -0.58f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 1.12f, -13.27f)
                lineTo(95.73f, 34.49f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.56f, -8.38f)
                arcTo(54.24f, 54.24f, 0.0f, false, false, 34.0f, 80.0f)
                curveToRelative(0.0f, 78.3f, 63.7f, 142.0f, 142.0f, 142.0f)
                arcToRelative(54.25f, 54.25f, 0.0f, false, false, 53.89f, -47.17f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 221.59f, 160.3f)
                close()
                moveTo(176.0f, 210.0f)
                curveTo(104.32f, 210.0f, 46.0f, 151.68f, 46.0f, 80.0f)
                arcTo(42.23f, 42.23f, 0.0f, false, true, 82.67f, 38.0f)
                horizontalLineToRelative(0.23f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.84f, 1.31f)
                lineToRelative(21.1f, 47.11f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 1.67f)
                lineTo(84.73f, 113.15f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, false, -0.43f, 0.57f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -0.91f, 13.73f)
                curveToRelative(8.87f, 18.16f, 27.17f, 36.32f, 45.53f, 45.19f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.77f, -1.0f)
                curveToRelative(0.19f, -0.13f, 0.38f, -0.27f, 0.56f, -0.42f)
                lineToRelative(24.68f, -21.0f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, 1.6f, -0.1f)
                lineToRelative(47.25f, 21.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.21f, 2.0f)
                arcTo(42.24f, 42.24f, 0.0f, false, true, 176.0f, 210.0f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
