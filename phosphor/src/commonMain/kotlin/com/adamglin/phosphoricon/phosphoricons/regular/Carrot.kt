package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 64.0f)
                lineTo(203.31f, 64.0f)
                lineToRelative(26.35f, -26.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(192.0f, 52.69f)
                lineTo(192.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(176.0f, 56.57f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -77.2f, 10.12f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-40.1f, 39.39f, -70.25f, 133.08f, -73.19f, 142.45f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 21.26f, 21.26f)
                curveToRelative(9.37f, -2.94f, 103.18f, -33.13f, 142.47f, -73.21f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 199.43f, 80.0f)
                lineTo(232.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(177.88f, 146.0f)
                curveToRelative(-8.94f, 9.12f, -21.25f, 17.8f, -34.85f, 25.73f)
                lineToRelative(-25.38f, -25.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineToRelative(22.09f, 22.09f)
                curveToRelative(-40.87f, 21.19f, -86.32f, 35.42f, -87.0f, 35.63f)
                arcTo(7.93f, 7.93f, 0.0f, false, false, 40.0f, 216.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 0.59f, -1.41f)
                curveToRelative(0.29f, -0.93f, 28.0f, -89.58f, 64.0f, -130.67f)
                lineToRelative(33.77f, 33.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(116.18f, 72.88f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 177.88f, 146.0f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
