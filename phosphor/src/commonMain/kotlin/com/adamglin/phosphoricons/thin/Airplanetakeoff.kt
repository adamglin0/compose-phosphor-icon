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

public val ThinGroup.Airplanetakeoff: ImageVector
    get() {
        if (_airplanetakeoff != null) {
            return _airplanetakeoff!!
        }
        _airplanetakeoff = Builder(name = "Airplanetakeoff", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(24.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(168.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 216.0f)
                close()
                moveTo(243.93f, 92.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.88f, 2.7f)
                lineToRelative(-147.41f, 88.0f)
                arcToRelative(36.15f, 36.15f, 0.0f, false, true, -18.2f, 4.95f)
                arcToRelative(35.78f, 35.78f, 0.0f, false, true, -24.55f, -9.79f)
                lineTo(15.73f, 142.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.44f, -19.68f)
                lineToRelative(3.07f, -1.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -0.2f)
                lineToRelative(30.0f, 10.13f)
                lineTo(81.5f, 115.8f)
                lineTo(55.91f, 91.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.36f, -19.89f)
                lineToRelative(0.16f, -0.06f)
                lineToRelative(7.15f, -2.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.8f, 0.0f)
                lineTo(125.11f, 88.8f)
                lineTo(178.32f, 57.0f)
                arcToRelative(35.83f, 35.83f, 0.0f, false, true, 46.14f, 8.22f)
                lineToRelative(18.69f, 24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 243.93f, 92.41f)
                close()
                moveTo(234.06f, 90.56f)
                lineTo(218.21f, 70.24f)
                arcToRelative(27.85f, 27.85f, 0.0f, false, false, -35.81f, -6.33f)
                lineTo(127.58f, 96.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.44f, 0.32f)
                lineTo(68.0f, 76.31f)
                lineToRelative(-5.66f, 2.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.0f, 6.62f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, 0.11f, 0.11f)
                lineToRelative(29.35f, 28.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.72f, 6.29f)
                lineTo(57.86f, 139.44f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.35f, 0.37f)
                lineToRelative(-30.23f, -10.2f)
                lineToRelative(-1.67f, 0.82f)
                lineToRelative(-0.18f, 0.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.16f, 6.59f)
                lineTo(57.42f, 172.5f)
                arcToRelative(27.82f, 27.82f, 0.0f, false, false, 33.16f, 3.72f)
                close()
            }
        }
        .build()
        return _airplanetakeoff!!
    }

private var _airplanetakeoff: ImageVector? = null
