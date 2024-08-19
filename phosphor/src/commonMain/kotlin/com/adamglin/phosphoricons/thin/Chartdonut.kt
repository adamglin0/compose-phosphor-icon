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

public val ThinGroup.Chartdonut: ImageVector
    get() {
        if (_chartdonut != null) {
            return _chartdonut!!
        }
        _chartdonut = Builder(name = "Chartdonut", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(124.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -31.18f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.47f, -5.47f)
                lineToRelative(-48.5f, -28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 41.39f, 78.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 28.0f)
                close()
                moveTo(46.38f, 85.5f)
                lineToRelative(41.67f, 24.0f)
                arcToRelative(43.86f, 43.86f, 0.0f, false, false, -3.4f, 25.93f)
                lineTo(38.18f, 147.93f)
                arcToRelative(92.19f, 92.19f, 0.0f, false, true, 8.2f, -62.43f)
                close()
                moveTo(40.25f, 155.65f)
                lineTo(86.71f, 143.2f)
                arcTo(44.11f, 44.11f, 0.0f, false, false, 124.0f, 171.81f)
                verticalLineToRelative(48.1f)
                arcTo(92.17f, 92.17f, 0.0f, false, true, 40.25f, 155.65f)
                close()
                moveTo(132.0f, 219.91f)
                verticalLineToRelative(-48.1f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -87.63f)
                lineTo(132.0f, 36.09f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 0.0f, 183.82f)
                close()
            }
        }
        .build()
        return _chartdonut!!
    }

private var _chartdonut: ImageVector? = null
