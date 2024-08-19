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

public val ThinGroup.Footballhelmet: ImageVector
    get() {
        if (_footballhelmet != null) {
            return _footballhelmet!!
        }
        _footballhelmet = Builder(name = "Footballhelmet", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 164.0f)
                close()
                moveTo(228.0f, 176.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(180.0f, 220.0f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, true, -11.51f, -8.6f)
                lineTo(156.83f, 172.0f)
                lineTo(126.55f, 172.0f)
                lineToRelative(5.09f, 17.13f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 0.07f, 0.27f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 204.0f)
                lineTo(72.14f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.26f, -0.7f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 28.0f, 124.0f)
                curveToRelative(0.0f, -52.19f, 42.47f, -95.23f, 94.63f, -96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 220.0f, 124.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(153.35f, 132.0f)
                lineToRelative(9.46f, 32.0f)
                lineTo(216.0f, 164.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 176.0f)
                close()
                moveTo(123.93f, 191.25f)
                lineToRelative(-15.57f, -52.37f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, true, -0.07f, -0.28f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 124.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -89.25f, -88.0f)
                curveTo(74.93f, 36.67f, 36.0f, 76.13f, 36.0f, 124.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 37.39f, 72.0f)
                lineTo(120.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.93f, -4.75f)
                close()
                moveTo(154.46f, 164.0f)
                lineTo(145.0f, 132.0f)
                lineTo(120.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.93f, 4.75f)
                lineToRelative(8.1f, 27.25f)
                close()
                moveTo(220.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(165.17f, 172.0f)
                lineToRelative(11.0f, 37.13f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 180.0f, 212.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _footballhelmet!!
    }

private var _footballhelmet: ImageVector? = null
