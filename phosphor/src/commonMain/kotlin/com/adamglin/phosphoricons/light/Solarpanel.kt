package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) {
            return _solarPanel!!
        }
        _solarPanel = Builder(name = "SolarPanel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(56.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(40.0f, 110.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 34.0f, 104.0f)
                close()
                moveTo(72.84f, 57.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, -8.48f)
                lineTo(70.0f, 37.53f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 61.53f, 46.0f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(134.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 38.0f)
                close()
                moveTo(178.91f, 59.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.25f, -1.76f)
                lineTo(194.47f, 46.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 186.0f, 37.53f)
                lineTo(174.67f, 48.85f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, 10.24f)
                close()
                moveTo(194.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(200.0f, 98.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 194.0f, 104.0f)
                close()
                moveTo(88.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 88.0f, 110.0f)
                close()
                moveTo(237.18f, 219.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.18f, 3.0f)
                lineTo(24.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.22f, -8.95f)
                lineToRelative(40.69f, -72.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 64.7f, 138.0f)
                lineTo(191.3f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.23f, 3.05f)
                lineToRelative(40.69f, 72.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 237.18f, 219.0f)
                close()
                moveTo(187.8f, 150.0f)
                horizontalLineToRelative(-28.0f)
                lineToRelative(4.35f, 20.0f)
                horizontalLineToRelative(35.0f)
                close()
                moveTo(151.86f, 170.0f)
                lineTo(147.51f, 150.0f)
                horizontalLineToRelative(-39.0f)
                lineToRelative(-4.35f, 20.0f)
                close()
                moveTo(101.53f, 182.0f)
                lineTo(95.44f, 210.0f)
                horizontalLineToRelative(65.12f)
                lineToRelative(-6.09f, -28.0f)
                close()
                moveTo(56.89f, 170.0f)
                horizontalLineToRelative(35.0f)
                lineToRelative(4.35f, -20.0f)
                horizontalLineToRelative(-28.0f)
                close()
                moveTo(34.28f, 210.0f)
                lineTo(83.16f, 210.0f)
                lineToRelative(6.09f, -28.0f)
                lineTo(50.11f, 182.0f)
                close()
                moveTo(221.72f, 210.0f)
                lineTo(205.89f, 182.0f)
                lineTo(166.75f, 182.0f)
                lineToRelative(6.09f, 28.0f)
                close()
            }
        }
        .build()
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
