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

public val FillGroup.Chartdonut: ImageVector
    get() {
        if (_chartdonut != null) {
            return _chartdonut!!
        }
        _chartdonut = Builder(name = "Chartdonut", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 161.94f)
                verticalLineToRelative(65.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.46f, 4.0f)
                arcToRelative(104.28f, 104.28f, 0.0f, false, true, -84.0f, -64.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.69f, -5.34f)
                lineTo(97.32f, 144.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.35f, 1.66f)
                arcToRelative(32.25f, 32.25f, 0.0f, false, false, 15.59f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 120.0f, 161.94f)
                close()
                moveTo(128.06f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 32.0f)
                lineTo(120.0f, 88.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, false, 7.87f, 8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 10.86f, 62.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.73f, 3.79f)
                verticalLineToRelative(65.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.45f, 4.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 128.06f, 24.0f)
                close()
                moveTo(96.06f, 125.49f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 4.15f, -13.42f)
                lineToRelative(0.0f, -0.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.57f, -8.87f)
                arcTo(8.36f, 8.36f, 0.0f, false, false, 97.18f, 101.0f)
                lineTo(48.85f, 73.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 37.92f, 76.0f)
                arcTo(104.12f, 104.12f, 0.0f, false, false, 25.0f, 142.68f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 30.0f, 146.0f)
                lineTo(93.22f, 129.0f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 96.1f, 125.49f)
                close()
            }
        }
        .build()
        return _chartdonut!!
    }

private var _chartdonut: ImageVector? = null
