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

public val FillGroup.Airplanelanding: ImageVector
    get() {
        if (_airplanelanding != null) {
            return _airplanelanding!!
        }
        _airplanelanding = Builder(name = "Airplanelanding", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(104.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(248.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 216.0f)
                close()
                moveTo(232.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(240.0f, 148.32f)
                arcToRelative(40.13f, 40.13f, 0.0f, false, false, -29.28f, -38.54f)
                lineToRelative(-60.84f, -17.0f)
                lineToRelative(-22.5f, -53.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.85f, -4.5f)
                lineToRelative(-5.47f, -1.82f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 48.0f)
                lineTo(96.0f, 77.39f)
                lineTo(66.13f, 68.88f)
                lineTo(55.52f, 39.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, -4.87f)
                lineToRelative(-5.47f, -1.82f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 48.0f)
                verticalLineToRelative(55.72f)
                arcToRelative(40.12f, 40.12f, 0.0f, false, false, 29.21f, 38.52f)
                lineTo(229.84f, 191.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 192.0f)
                close()
            }
        }
        .build()
        return _airplanelanding!!
    }

private var _airplanelanding: ImageVector? = null
