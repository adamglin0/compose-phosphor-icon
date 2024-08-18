package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Unite: ImageVector
    get() {
        if (_unite != null) {
            return _unite!!
        }
        _unite = Builder(name = "Unite", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.63f, 81.37f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.26f, 93.26f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.26f, -93.26f)
                close()
                moveTo(224.0f, 160.0f)
                curveToRelative(0.0f, 1.52f, -0.07f, 3.0f, -0.18f, 4.51f)
                lineToRelative(-50.0f, -50.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 176.0f, 98.0f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 224.0f, 160.0f)
                close()
                moveTo(45.47f, 56.79f)
                lineTo(98.09f, 109.4f)
                arcToRelative(80.5f, 80.5f, 0.0f, false, false, -9.93f, 15.44f)
                lineTo(36.3f, 73.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 45.47f, 56.79f)
                close()
                moveTo(73.0f, 36.3f)
                lineToRelative(51.86f, 51.86f)
                arcToRelative(80.5f, 80.5f, 0.0f, false, false, -15.44f, 9.93f)
                lineTo(56.79f, 45.47f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 73.0f, 36.3f)
                close()
                moveTo(134.46f, 147.13f)
                lineTo(108.89f, 121.56f)
                arcToRelative(64.65f, 64.65f, 0.0f, false, true, 12.69f, -12.69f)
                lineToRelative(25.57f, 25.57f)
                arcTo(64.65f, 64.65f, 0.0f, false, true, 134.44f, 147.13f)
                close()
                moveTo(155.31f, 120.0f)
                lineTo(136.0f, 100.69f)
                arcTo(63.48f, 63.48f, 0.0f, false, true, 160.0f, 96.0f)
                arcTo(63.48f, 63.48f, 0.0f, false, true, 155.31f, 120.0f)
                close()
                moveTo(100.69f, 136.0f)
                lineTo(120.0f, 155.31f)
                arcTo(63.48f, 63.48f, 0.0f, false, true, 96.0f, 160.0f)
                arcTo(63.48f, 63.48f, 0.0f, false, true, 100.69f, 136.0f)
                close()
                moveTo(146.6f, 157.91f)
                lineTo(199.21f, 210.53f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 183.0f, 219.7f)
                lineToRelative(-51.86f, -51.86f)
                arcTo(80.5f, 80.5f, 0.0f, false, false, 146.6f, 157.91f)
                close()
                moveTo(157.91f, 146.6f)
                arcToRelative(80.5f, 80.5f, 0.0f, false, false, 9.93f, -15.44f)
                lineTo(219.7f, 183.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -9.17f, 16.19f)
                close()
                moveTo(158.0f, 80.05f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -16.49f, 2.13f)
                lineToRelative(-50.0f, -50.0f)
                curveTo(93.0f, 32.07f, 94.48f, 32.0f, 96.0f, 32.0f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 158.0f, 80.05f)
                close()
                moveTo(32.0f, 96.0f)
                curveToRelative(0.0f, -1.52f, 0.07f, -3.0f, 0.18f, -4.51f)
                lineToRelative(50.0f, 50.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 80.05f, 158.0f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 32.0f, 96.0f)
                close()
                moveTo(98.0f, 176.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 16.49f, -2.13f)
                lineToRelative(50.0f, 50.0f)
                curveToRelative(-1.49f, 0.11f, -3.0f, 0.18f, -4.51f, 0.18f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 98.0f, 176.0f)
                close()
            }
        }
        .build()
        return _unite!!
    }

private var _unite: ImageVector? = null
