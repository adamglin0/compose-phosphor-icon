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

public val BoldGroup.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) {
            return _heartbeat!!
        }
        _heartbeat = Builder(name = "Heartbeat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.76f, 148.0f)
                horizontalLineTo(31.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f)
                horizontalLineTo(65.33f)
                lineToRelative(12.45f, -18.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.0f, 0.0f)
                lineToRelative(22.0f, 33.0f)
                lineToRelative(6.0f, -9.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.0f, -5.34f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, 24.0f)
                horizontalLineToRelative(-17.6f)
                lineToRelative(-12.46f, 18.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.0f, 0.0f)
                lineToRelative(-22.0f, -33.0f)
                lineToRelative(-6.0f, 9.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 71.76f, 148.0f)
                close()
                moveTo(177.91f, 36.0f)
                curveToRelative(-20.12f, 0.0f, -38.0f, 7.93f, -50.07f, 21.56f)
                curveTo(115.74f, 43.93f, 97.89f, 36.0f, 77.76f, 36.0f)
                arcTo(66.0f, 66.0f, 0.0f, false, false, 12.07f, 94.68f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 97.32f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 77.76f, 60.0f)
                curveToRelative(17.83f, 0.0f, 32.75f, 9.4f, 38.95f, 24.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.25f, 0.0f)
                curveTo(145.16f, 69.4f, 160.08f, 60.0f, 177.91f, 60.0f)
                arcTo(42.08f, 42.08f, 0.0f, false, true, 220.0f, 102.0f)
                curveToRelative(0.0f, 29.42f, -25.86f, 57.77f, -47.56f, 76.36f)
                arcToRelative(329.0f, 329.0f, 0.0f, false, true, -44.58f, 31.81f)
                curveToRelative(-10.87f, -6.45f, -35.37f, -22.0f, -56.51f, -42.73f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -16.84f, 17.12f)
                curveToRelative(30.39f, 29.81f, 66.15f, 49.2f, 67.66f, 50.0f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, 11.39f, 0.0f)
                curveTo(138.0f, 232.14f, 244.0f, 174.34f, 244.0f, 102.0f)
                arcTo(66.12f, 66.12f, 0.0f, false, false, 177.91f, 36.0f)
                close()
            }
        }
        .build()
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
