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

public val BoldGroup.Airplanetaxiing: ImageVector
    get() {
        if (_airplanetaxiing != null) {
            return _airplanetaxiing!!
        }
        _airplanetaxiing = Builder(name = "Airplanetaxiing", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 88.0f)
                lineTo(149.0f, 88.0f)
                lineTo(104.49f, 43.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 40.0f)
                lineTo(88.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 69.0f, 66.33f)
                lineTo(76.27f, 88.0f)
                lineTo(61.0f, 88.0f)
                lineTo(40.49f, 67.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 64.0f)
                lineTo(24.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 4.86f, 89.75f)
                lineToRelative(14.07f, 46.89f)
                arcTo(43.72f, 43.72f, 0.0f, false, false, 61.07f, 168.0f)
                lineTo(240.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(252.0f, 132.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 208.0f, 88.0f)
                close()
                moveTo(228.0f, 144.0f)
                lineTo(61.07f, 144.0f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, true, -19.16f, -14.25f)
                lineTo(30.4f, 91.36f)
                lineToRelative(17.12f, 17.13f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 112.0f)
                horizontalLineToRelative(36.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 104.3f, 96.21f)
                lineTo(94.83f, 67.79f)
                lineToRelative(40.69f, 40.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 112.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(228.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 204.0f)
                close()
                moveTo(132.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 132.0f, 204.0f)
                close()
            }
        }
        .build()
        return _airplanetaxiing!!
    }

private var _airplanetaxiing: ImageVector? = null
