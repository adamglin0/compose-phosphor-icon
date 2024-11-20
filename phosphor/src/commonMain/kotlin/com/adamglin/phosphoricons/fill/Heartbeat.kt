package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) {
            return _heartbeat!!
        }
        _heartbeat = Builder(name = "Heartbeat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 102.0f)
                curveToRelative(0.0f, 70.0f, -103.79f, 126.66f, -108.21f, 129.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.58f, 0.0f)
                curveToRelative(-3.35f, -1.8f, -63.55f, -34.69f, -92.68f, -80.89f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 34.92f, 144.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.66f, -3.56f)
                lineToRelative(9.34f, -14.0f)
                lineToRelative(25.34f, 38.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.16f, 3.16f)
                arcToRelative(8.23f, 8.23f, 0.0f, false, false, 4.28f, -3.34f)
                lineTo(140.28f, 144.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, -8.25f, -7.47f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.66f, 3.56f)
                lineToRelative(-9.34f, 14.0f)
                lineToRelative(-25.34f, -38.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.17f, -3.16f)
                arcToRelative(8.25f, 8.25f, 0.0f, false, false, -4.27f, 3.34f)
                lineTo(67.72f, 128.0f)
                horizontalLineTo(23.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.83f, -2.81f)
                arcTo(76.93f, 76.93f, 0.0f, false, true, 16.0f, 102.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, true, 78.0f, 40.0f)
                curveToRelative(20.65f, 0.0f, 38.73f, 8.88f, 50.0f, 23.89f)
                curveTo(139.27f, 48.88f, 157.35f, 40.0f, 178.0f, 40.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, true, 240.0f, 102.0f)
                close()
            }
        }
        .build()
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
