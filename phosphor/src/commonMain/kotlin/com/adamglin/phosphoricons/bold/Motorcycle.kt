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

public val BoldGroup.Motorcycle: ImageVector
    get() {
        if (_motorcycle != null) {
            return _motorcycle!!
        }
        _motorcycle = Builder(name = "Motorcycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 112.0f)
                curveToRelative(-0.57f, 0.0f, -1.13f, 0.0f, -1.69f, 0.0f)
                lineToRelative(-3.5f, -11.8f)
                curveToRelative(1.71f, -0.15f, 3.44f, -0.24f, 5.19f, -0.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(195.63f, 75.96f)
                lineToRelative(-8.12f, -27.41f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 40.0f)
                lineTo(144.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(23.0f)
                lineToRelative(3.56f, 12.0f)
                lineTo(152.0f, 76.0f)
                curveToRelative(-19.44f, 0.0f, -35.32f, 4.62f, -45.92f, 13.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.56f, 1.52f)
                curveToRelative(-13.13f, -6.0f, -57.19f, -25.0f, -61.65f, -26.89f)
                lineTo(26.6f, 61.76f)
                reflectiveCurveTo(22.4f, 60.0f, 20.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.61f, 23.08f)
                curveToRelative(1.72f, 0.73f, 43.67f, 18.5f, 68.2f, 29.66f)
                arcToRelative(36.25f, 36.25f, 0.0f, false, false, 15.0f, 3.23f)
                arcToRelative(35.78f, 35.78f, 0.0f, false, false, 22.78f, -8.09f)
                curveToRelative(5.74f, -4.73f, 15.58f, -7.48f, 27.89f, -7.84f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -24.4f, 48.0f)
                lineTo(94.48f, 148.04f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 24.0f)
                lineTo(136.0f, 172.04f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 31.8f, -52.94f)
                lineToRelative(3.5f, 11.8f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 208.0f, 112.0f)
                close()
                moveTo(48.0f, 172.0f)
                lineTo(68.77f, 172.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -24.0f)
                lineTo(48.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(208.0f, 184.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -17.4f, -40.5f)
                lineToRelative(5.89f, 19.91f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 172.0f)
                arcToRelative(12.28f, 12.28f, 0.0f, false, false, 3.41f, -0.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.1f, -14.92f)
                lineToRelative(-5.91f, -19.92f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 208.0f, 184.0f)
                close()
            }
        }
        .build()
        return _motorcycle!!
    }

private var _motorcycle: ImageVector? = null
