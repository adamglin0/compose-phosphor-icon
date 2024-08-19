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

public val LightGroup.Paypallogo: ImageVector
    get() {
        if (_paypallogo != null) {
            return _paypallogo!!
        }
        _paypallogo = Builder(name = "Paypallogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.54f, 94.77f)
                arcTo(53.84f, 53.84f, 0.0f, false, false, 198.0f, 78.66f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 144.0f, 26.0f)
                lineTo(84.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 70.42f, 36.6f)
                lineToRelative(-36.0f, 144.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 48.0f, 198.0f)
                lineTo(78.07f, 198.0f)
                lineToRelative(-3.65f, 14.6f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 88.0f, 230.0f)
                horizontalLineToRelative(31.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.58f, -10.6f)
                lineToRelative(9.0f, -35.88f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 144.0f, 182.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 42.56f, -87.23f)
                close()
                moveTo(79.51f, 186.0f)
                lineTo(48.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.94f, -2.49f)
                lineToRelative(36.0f, -144.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 84.0f, 38.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 41.69f, 36.87f)
                arcTo(54.57f, 54.57f, 0.0f, false, false, 176.0f, 74.0f)
                lineTo(120.0f, 74.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.59f, 10.6f)
                lineToRelative(-25.0f, 99.89f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 79.51f, 186.0f)
                close()
                moveTo(185.37f, 87.05f)
                curveToRelative(-0.18f, 1.0f, -0.39f, 2.09f, -0.65f, 3.14f)
                arcTo(41.94f, 41.94f, 0.0f, false, true, 144.0f, 122.0f)
                lineTo(109.44f, 122.0f)
                lineToRelative(8.62f, -34.48f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 120.0f, 86.0f)
                horizontalLineToRelative(56.0f)
                arcTo(42.43f, 42.43f, 0.0f, false, true, 185.37f, 87.05f)
                close()
                moveTo(216.72f, 138.19f)
                arcTo(41.94f, 41.94f, 0.0f, false, true, 176.0f, 170.0f)
                lineTo(144.0f, 170.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.58f, 10.6f)
                lineToRelative(-9.0f, 35.89f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.94f, 1.51f)
                lineTo(88.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.94f, -2.49f)
                lineToRelative(20.0f, -80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -1.52f)
                horizontalLineToRelative(36.0f)
                arcToRelative(53.92f, 53.92f, 0.0f, false, false, 52.38f, -40.9f)
                curveToRelative(0.14f, -0.55f, 0.25f, -1.1f, 0.36f, -1.64f)
                arcToRelative(42.06f, 42.06f, 0.0f, false, true, 20.0f, 46.73f)
                close()
            }
        }
        .build()
        return _paypallogo!!
    }

private var _paypallogo: ImageVector? = null
