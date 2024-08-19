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

public val ThinGroup.Pepper: ImageVector
    get() {
        if (_pepper != null) {
            return _pepper!!
        }
        _pepper = Builder(name = "Pepper", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.79f, 44.14f)
                arcTo(36.06f, 36.06f, 0.0f, false, false, 128.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 27.73f, 24.17f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 100.0f, 104.0f)
                curveToRelative(0.0f, 48.75f, -26.71f, 81.34f, -79.4f, 96.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.33f, 23.36f)
                arcTo(260.42f, 260.42f, 0.0f, false, false, 66.69f, 228.0f)
                arcToRelative(256.53f, 256.53f, 0.0f, false, false, 34.83f, -2.3f)
                curveToRelative(33.23f, -4.59f, 60.2f, -15.41f, 80.19f, -32.18f)
                curveTo(207.12f, 172.21f, 220.0f, 142.09f, 220.0f, 104.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 163.79f, 44.14f)
                close()
                moveTo(160.0f, 52.0f)
                arcToRelative(52.08f, 52.08f, 0.0f, false, true, 50.19f, 38.44f)
                lineTo(192.0f, 99.54f)
                lineTo(161.79f, 84.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f)
                lineTo(128.0f, 99.54f)
                lineToRelative(-18.19f, -9.1f)
                arcTo(52.08f, 52.08f, 0.0f, false, true, 160.0f, 52.0f)
                close()
                moveTo(176.57f, 187.39f)
                curveToRelative(-25.47f, 21.37f, -80.88f, 41.77f, -153.24f, 29.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.47f, -7.81f)
                curveTo(78.56f, 192.14f, 108.0f, 156.0f, 108.0f, 104.0f)
                arcToRelative(53.28f, 53.28f, 0.0f, false, true, 0.28f, -5.39f)
                lineToRelative(17.93f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f)
                lineTo(160.0f, 92.48f)
                lineToRelative(30.21f, 15.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f)
                lineToRelative(17.93f, -9.0f)
                arcTo(53.28f, 53.28f, 0.0f, false, true, 212.0f, 104.0f)
                curveTo(212.0f, 139.62f, 200.08f, 167.67f, 176.57f, 187.39f)
                close()
            }
        }
        .build()
        return _pepper!!
    }

private var _pepper: ImageVector? = null
